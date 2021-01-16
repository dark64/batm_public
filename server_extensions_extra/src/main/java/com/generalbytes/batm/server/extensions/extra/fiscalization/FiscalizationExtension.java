package com.generalbytes.batm.server.extensions.extra.fiscalization;

import com.generalbytes.batm.server.extensions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

    @Override
    public void init(IExtensionContext ctx) {
        super.init(ctx);
        ctx.addTransactionListener(this);
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
        result.put("ticket.previous.counter", ((previousValue == null) ? "N/A" : "" + previousValue)); //result will be stored into database, linked to transdaction record and later be available in ticket template under key ticket.previous.counter

        // TODO: get jir from PU SOAP service

        result.put("ticket.jir", "JIR_TEST");
        result.put("ticket.security.code", getSecurityCode(value, transactionDetails)); // Zaštitni Kod
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

    public String getSecurityCode(Long ticketNumber, ITransactionDetails transactionDetails) {
        String oib = System.getenv("FISC_OIB");
        String date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
        String bor = String.valueOf(ticketNumber); // brojčana oznaka računa
        String opp = System.getenv("FISC_OPP"); // oznaka poslovnog prostora
        String onu = System.getenv("FISC_ONU"); // oznaka naplatnog uređaja
        String uir = transactionDetails.getCashAmount().setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString(); // ukupni iznos računa
        String tmp = oib + date + bor + opp + onu + uir;
        try {
            FileInputStream fileInputstream = new FileInputStream(System.getenv("FISC_JKS_PATH"));
            char[] password = System.getenv("FISC_JKS_PASSWORD").toCharArray();
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(fileInputstream, password);
            Key privateKey = keyStore.getKey("alias", password);
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initSign((PrivateKey)privateKey);
            signature.update(tmp.getBytes(StandardCharsets.UTF_8));
            byte[] signed = signature.sign();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(signed);
            return DatatypeConverter.printHexBinary(signed).toLowerCase();
        }
        catch (Exception e) {
            e.printStackTrace(); // došlo je do pogreške
            return "N/A";
        }
    }
}
