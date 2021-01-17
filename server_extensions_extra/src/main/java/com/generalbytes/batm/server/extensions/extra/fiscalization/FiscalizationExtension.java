package com.generalbytes.batm.server.extensions.extra.fiscalization;

import com.generalbytes.batm.server.extensions.*;
import com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.services.fiskalizacijaservice.FiskalizacijaService;
import com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73.*;
import com.generalbytes.batm.server.extensions.extra.fiscalization.cis.org.w3._2000._09.xmldsig_.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.transform.dom.DOMResult;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Potrebno je postaviti sljedeće environment varijable:
 * FISC_OIB - oib firme
 * FISC_OPP - oznaka poslovnog prostora
 * FISC_ONU - oznaka naplatnog uređaja
 * FISC_JKS_PATH - putanja do FINA digitalnog certifikata (npr. /root/key.jks)
 * FISC_JKS_PASSWORD - lozinka certifikata
 */
public class FiscalizationExtension extends AbstractExtension implements ITransactionListener {
    Logger log = LoggerFactory.getLogger(FiscalizationExtension.class);

    private final Map<String, Long> ticketCounters = new HashMap<>();
    private FiskalizacijaService _service;

    @Override
    public void init(IExtensionContext ctx) {
        super.init(ctx);
        ctx.addTransactionListener(this);
        _service = new FiskalizacijaService();
        // System.setProperty("javax.net.ssl.keyStore", System.getenv("FISC_JKS_PATH"));
        // System.setProperty("javax.net.ssl.keyStorePassword", System.getenv("FISC_JKS_PASSWORD"));
    }

    @Override
    public String getName() {
        return "Fiscalization Extension";
    }

    @Override
    public boolean isTransactionPreparationApproved(ITransactionPreparation preparation) {
        return true;
    }

    @Override
    public boolean isTransactionApproved(ITransactionRequest transactionRequest) {
        return true;
    }

    @Override
    public OutputQueueInsertConfig overrideOutputQueueInsertConfig(ITransactionQueueRequest transactionQueueRequest, OutputQueueInsertConfig outputQueueInsertConfig) {
        return null;
    }

    @Override
    public Map<String, String> onTransactionCreated(ITransactionDetails transactionDetails) {
        log.info("onTransactionCreated");
        String terminalSerialNumber = transactionDetails.getTerminalSerialNumber();
        Long previousValue = ticketCounters.get(terminalSerialNumber);
        Map<String, String> result = new HashMap<>();
        Long value = (previousValue == null) ? 1 : (previousValue + 1);
        ticketCounters.put(terminalSerialNumber, value);
        result.put("ticket.counter", "" + value);
        result.put("ticket.previous.counter", ((previousValue == null) ? "N/A" : "" + previousValue));

        try {
            RacunType invoice = new RacunType();
            invoice.setBrRac(new BrojRacunaType() {{
                brOznRac = String.valueOf(value);
                oznPosPr = System.getenv("FISC_OPP");
                oznNapUr = System.getenv("FISC_ONU");
            }});
            invoice.setDatVrijeme(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date()));
            invoice.setIznosUkupno(transactionDetails.getCashAmount().setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());
            invoice.setNacinPlac(NacinPlacanjaType.G);
            invoice.setNakDost(false);
            invoice.setOib(System.getenv("FISC_OIB"));
            invoice.setOibOper("124567"); // TODO: change to valid data
            invoice.setOznSlijed(OznakaSlijednostiType.N);
            invoice.setUSustPdv(false);

            String keyPath = System.getenv("FISC_JKS_PATH");
            char[] password = System.getenv("FISC_JKS_PASSWORD").toCharArray();

            KeyStore keyStore = getKeyStore(keyPath, password);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry)keyStore.getEntry("alias", new KeyStore.PasswordProtection(password));
            String zki = generateZki(invoice, privateKeyEntry.getPrivateKey());
            invoice.setZastKod(zki);

            RacunZahtjev request = new RacunZahtjev() {{
                racun = invoice;
                zaglavlje = new ZaglavljeType() {{
                    idPoruke = UUID.randomUUID().toString();
                    datumVrijeme = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
                }};
            }};

            RacunZahtjev signedRequest = signRequest(request, privateKeyEntry);
            RacunOdgovor response = _service.getFiskalizacijaPortType().racuni(signedRequest);
            result.put("ticket.jir", response.getJir());
            result.put("ticket.zki", zki);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        result.put("ticket.jir", "N/A");
        result.put("ticket.zki", "N/A");
        return result;
    }

    @Override
    public Map<String, String> onTransactionUpdated(ITransactionDetails transactionDetails) {
        log.info("onTransactionUpdated");
        Map<String, String> result = new HashMap<>();
        result.put("last.updated.at", "" + System.currentTimeMillis());
        return result;
    }

    @Override
    public void receiptSent(IReceiptDetails receiptDetails) {
        log.info("receiptSent");
    }

    private String generateZki(RacunType racunType, PrivateKey privateKey) {
        String oib = racunType.getOib();
        String date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
        BrojRacunaType brojRacunaType = racunType.getBrRac();
        String bor = brojRacunaType.getBrOznRac();
        String opp = brojRacunaType.getOznPosPr();
        String onu = brojRacunaType.getOznNapUr();
        String uir = racunType.getIznosUkupno();

        StringBuilder stringBuilder = new StringBuilder(oib);
        stringBuilder.append(date);
        stringBuilder.append(bor);
        stringBuilder.append(opp);
        stringBuilder.append(onu);
        stringBuilder.append(uir);

        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initSign(privateKey);
            signature.update(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
            byte[] signed = signature.sign();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(signed);
            return DatatypeConverter.printHexBinary(signed).toLowerCase();
        }
        catch (Exception e) {
            e.printStackTrace();
            return "N/A";
        }
    }

    @SuppressWarnings(value = "unchecked")
    private RacunZahtjev signRequest(RacunZahtjev request, KeyStore.PrivateKeyEntry privateKeyEntry) throws Exception {
        request.setId(RacunZahtjev.class.getSimpleName());

        DOMResult res = new DOMResult();
        JAXBContext context = JAXBContext.newInstance(request.getClass());
        context.createMarshaller().marshal(request, res);
        Document doc = (Document)res.getNode();

        XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
        CanonicalizationMethod canonicalizationMethod = fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE, (C14NMethodParameterSpec)null);
        SignatureMethod signatureMethod = fac.newSignatureMethod(SignatureMethod.RSA_SHA1,null);
        DigestMethod digestMethod = fac.newDigestMethod(DigestMethod.SHA1, null);

        ArrayList<Transform> transformList = new ArrayList<>();
        Transform envTransform = fac.newTransform("http://www.w3.org/2001/10/xml-exc-c14n#", (TransformParameterSpec)null);
        Transform exc14nTransform = fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec)null);
        transformList.add(envTransform);
        transformList.add(exc14nTransform);

        Reference ref = fac.newReference("#" + request.getId(), digestMethod, transformList,null,null);
        ArrayList<Reference> refList = new ArrayList<>();
        refList.add(ref);
        SignedInfo signedInfo = fac.newSignedInfo(canonicalizationMethod, signatureMethod, refList);

        X509Certificate certificate = (X509Certificate)privateKeyEntry.getCertificate();
        KeyInfoFactory keyInfoFactory = fac.getKeyInfoFactory();

        List<Object> x509Content = new ArrayList<>();
        X509IssuerSerial issuer = keyInfoFactory.newX509IssuerSerial(certificate.getIssuerX500Principal().getName(), certificate.getSerialNumber());
        x509Content.add(certificate);
        x509Content.add(issuer);

        X509Data data = keyInfoFactory.newX509Data(x509Content);
        KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(data));

        DOMSignContext signContext = new DOMSignContext(privateKeyEntry.getPrivateKey(), doc.getDocumentElement());
        XMLSignature signature = fac.newXMLSignature(signedInfo, keyInfo);
        signature.sign(signContext);

        SignedInfoType signedInfoType = new SignedInfoType();
        signedInfoType.setCanonicalizationMethod(new CanonicalizationMethodType() {{ algorithm = signedInfo.getCanonicalizationMethod().getAlgorithm(); }});
        signedInfoType.setSignatureMethod(new SignatureMethodType() {{ algorithm = signedInfo.getSignatureMethod().getAlgorithm(); }});

        List<ReferenceType> referenceTypes = (List<ReferenceType>)signedInfo.getReferences()
            .stream()
            .map(r -> {
                Reference reference = (Reference)r;
                ReferenceType referenceType = new ReferenceType();
                referenceType.setURI(reference.getURI());

                TransformsType transformsType = new TransformsType();
                transformsType.getTransform().addAll((Collection<? extends TransformType>)reference.getTransforms().stream().map(t -> {
                    Transform transform = (Transform)t;
                    return new TransformType() {{ algorithm = transform.getAlgorithm(); }};
                }).collect(Collectors.toList()));

                referenceType.setTransforms(transformsType);
                referenceType.setDigestMethod(new DigestMethodType() {{ algorithm = reference.getDigestMethod().getAlgorithm(); }});
                referenceType.setDigestValue(reference.getDigestValue());
                return referenceType;
            })
            .collect(Collectors.toList());
        signedInfoType.getReference().addAll(referenceTypes);

        SignatureType signatureType = new SignatureType();
        signatureType.setSignedInfo(signedInfoType);
        signatureType.setSignatureValue(new SignatureValueType() {{ value = signature.getSignatureValue().getValue(); }});

        X509DataType x509DataType = new X509DataType();
        X509IssuerSerialType x509IssuerSerialType = new X509IssuerSerialType();
        x509IssuerSerialType.setX509IssuerName(certificate.getIssuerX500Principal().getName());
        x509IssuerSerialType.setX509SerialNumber(certificate.getSerialNumber());

        x509DataType.getX509IssuerSerialOrX509SKIOrX509SubjectName().add(x509IssuerSerialType);
        x509DataType.getX509IssuerSerialOrX509SKIOrX509SubjectName().add(certificate.getSignature());

        KeyInfoType keyInfoType = new KeyInfoType();
        keyInfoType.getContent().add(x509DataType);
        signatureType.setKeyInfo(keyInfoType);

        request.setSignature(signatureType);
        return request;
    }

    private KeyStore getKeyStore(String path, char[] password) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(path);
        KeyStore keyStore = KeyStore.getInstance("JKS");
        keyStore.load(fileInputStream, password);
        return keyStore;
    }
}
