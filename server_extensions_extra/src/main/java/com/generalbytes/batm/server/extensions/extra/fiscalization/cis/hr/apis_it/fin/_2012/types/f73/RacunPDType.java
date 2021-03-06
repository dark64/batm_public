
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RacunPDType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="RacunPDType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Oib" type="{http://www.apis-it.hr/fin/2012/types/f73}OibType"/&amp;gt;
 *         &amp;lt;element name="USustPdv" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DatVrijeme" type="{http://www.apis-it.hr/fin/2012/types/f73}DatumVrijemeType"/&amp;gt;
 *         &amp;lt;element name="OznSlijed" type="{http://www.apis-it.hr/fin/2012/types/f73}OznakaSlijednostiType"/&amp;gt;
 *         &amp;lt;element name="BrRac" type="{http://www.apis-it.hr/fin/2012/types/f73}BrojRacunaType"/&amp;gt;
 *         &amp;lt;element name="Pdv" type="{http://www.apis-it.hr/fin/2012/types/f73}PdvType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Pnp" type="{http://www.apis-it.hr/fin/2012/types/f73}PorezNaPotrosnjuType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OstaliPor" type="{http://www.apis-it.hr/fin/2012/types/f73}OstaliPoreziType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IznosOslobPdv" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IznosMarza" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IznosNePodlOpor" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Naknade" type="{http://www.apis-it.hr/fin/2012/types/f73}NaknadeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IznosUkupno" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/&amp;gt;
 *         &amp;lt;element name="NacinPlac" type="{http://www.apis-it.hr/fin/2012/types/f73}NacinPlacanjaType"/&amp;gt;
 *         &amp;lt;element name="OibOper" type="{http://www.apis-it.hr/fin/2012/types/f73}OibType"/&amp;gt;
 *         &amp;lt;element name="ZastKod"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;pattern value="[a-f0-9]{32}"/&amp;gt;
 *               &amp;lt;length value="32"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="NakDost" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="ParagonBrRac" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="SpecNamj" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;maxLength value="1000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PrateciDokument"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;choice maxOccurs="2"&amp;gt;
 *                     &amp;lt;element name="JirPD" type="{http://www.apis-it.hr/fin/2012/types/f73}UUIDType"/&amp;gt;
 *                     &amp;lt;element name="ZastKodPD"&amp;gt;
 *                       &amp;lt;simpleType&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                           &amp;lt;pattern value="[a-f0-9]{32}"/&amp;gt;
 *                           &amp;lt;length value="32"/&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/simpleType&amp;gt;
 *                     &amp;lt;/element&amp;gt;
 *                   &amp;lt;/choice&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RacunPDType", propOrder = {
    "oib",
    "uSustPdv",
    "datVrijeme",
    "oznSlijed",
    "brRac",
    "pdv",
    "pnp",
    "ostaliPor",
    "iznosOslobPdv",
    "iznosMarza",
    "iznosNePodlOpor",
    "naknade",
    "iznosUkupno",
    "nacinPlac",
    "oibOper",
    "zastKod",
    "nakDost",
    "paragonBrRac",
    "specNamj",
    "prateciDokument"
})
public class RacunPDType {

    @XmlElement(name = "Oib", required = true)
    protected String oib;
    @XmlElement(name = "USustPdv")
    protected boolean uSustPdv;
    @XmlElement(name = "DatVrijeme", required = true)
    protected String datVrijeme;
    @XmlElement(name = "OznSlijed", required = true)
    @XmlSchemaType(name = "string")
    protected OznakaSlijednostiType oznSlijed;
    @XmlElement(name = "BrRac", required = true)
    protected BrojRacunaType brRac;
    @XmlElement(name = "Pdv")
    protected PdvType pdv;
    @XmlElement(name = "Pnp")
    protected PorezNaPotrosnjuType pnp;
    @XmlElement(name = "OstaliPor")
    protected OstaliPoreziType ostaliPor;
    @XmlElement(name = "IznosOslobPdv")
    protected String iznosOslobPdv;
    @XmlElement(name = "IznosMarza")
    protected String iznosMarza;
    @XmlElement(name = "IznosNePodlOpor")
    protected String iznosNePodlOpor;
    @XmlElement(name = "Naknade")
    protected NaknadeType naknade;
    @XmlElement(name = "IznosUkupno", required = true)
    protected String iznosUkupno;
    @XmlElement(name = "NacinPlac", required = true)
    @XmlSchemaType(name = "string")
    protected NacinPlacanjaType nacinPlac;
    @XmlElement(name = "OibOper", required = true)
    protected String oibOper;
    @XmlElement(name = "ZastKod", required = true)
    protected String zastKod;
    @XmlElement(name = "NakDost")
    protected boolean nakDost;
    @XmlElement(name = "ParagonBrRac")
    protected String paragonBrRac;
    @XmlElement(name = "SpecNamj")
    protected String specNamj;
    @XmlElement(name = "PrateciDokument", required = true)
    protected PrateciDokument prateciDokument;

    /**
     * Gets the value of the oib property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOib() {
        return oib;
    }

    /**
     * Sets the value of the oib property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOib(String value) {
        this.oib = value;
    }

    /**
     * Gets the value of the uSustPdv property.
     *
     */
    public boolean isUSustPdv() {
        return uSustPdv;
    }

    /**
     * Sets the value of the uSustPdv property.
     *
     */
    public void setUSustPdv(boolean value) {
        this.uSustPdv = value;
    }

    /**
     * Gets the value of the datVrijeme property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatVrijeme() {
        return datVrijeme;
    }

    /**
     * Sets the value of the datVrijeme property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatVrijeme(String value) {
        this.datVrijeme = value;
    }

    /**
     * Gets the value of the oznSlijed property.
     *
     * @return
     *     possible object is
     *     {@link OznakaSlijednostiType }
     *
     */
    public OznakaSlijednostiType getOznSlijed() {
        return oznSlijed;
    }

    /**
     * Sets the value of the oznSlijed property.
     *
     * @param value
     *     allowed object is
     *     {@link OznakaSlijednostiType }
     *
     */
    public void setOznSlijed(OznakaSlijednostiType value) {
        this.oznSlijed = value;
    }

    /**
     * Gets the value of the brRac property.
     *
     * @return
     *     possible object is
     *     {@link BrojRacunaType }
     *
     */
    public BrojRacunaType getBrRac() {
        return brRac;
    }

    /**
     * Sets the value of the brRac property.
     *
     * @param value
     *     allowed object is
     *     {@link BrojRacunaType }
     *
     */
    public void setBrRac(BrojRacunaType value) {
        this.brRac = value;
    }

    /**
     * Gets the value of the pdv property.
     *
     * @return
     *     possible object is
     *     {@link PdvType }
     *
     */
    public PdvType getPdv() {
        return pdv;
    }

    /**
     * Sets the value of the pdv property.
     *
     * @param value
     *     allowed object is
     *     {@link PdvType }
     *
     */
    public void setPdv(PdvType value) {
        this.pdv = value;
    }

    /**
     * Gets the value of the pnp property.
     *
     * @return
     *     possible object is
     *     {@link PorezNaPotrosnjuType }
     *
     */
    public PorezNaPotrosnjuType getPnp() {
        return pnp;
    }

    /**
     * Sets the value of the pnp property.
     *
     * @param value
     *     allowed object is
     *     {@link PorezNaPotrosnjuType }
     *
     */
    public void setPnp(PorezNaPotrosnjuType value) {
        this.pnp = value;
    }

    /**
     * Gets the value of the ostaliPor property.
     *
     * @return
     *     possible object is
     *     {@link OstaliPoreziType }
     *
     */
    public OstaliPoreziType getOstaliPor() {
        return ostaliPor;
    }

    /**
     * Sets the value of the ostaliPor property.
     *
     * @param value
     *     allowed object is
     *     {@link OstaliPoreziType }
     *
     */
    public void setOstaliPor(OstaliPoreziType value) {
        this.ostaliPor = value;
    }

    /**
     * Gets the value of the iznosOslobPdv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIznosOslobPdv() {
        return iznosOslobPdv;
    }

    /**
     * Sets the value of the iznosOslobPdv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIznosOslobPdv(String value) {
        this.iznosOslobPdv = value;
    }

    /**
     * Gets the value of the iznosMarza property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIznosMarza() {
        return iznosMarza;
    }

    /**
     * Sets the value of the iznosMarza property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIznosMarza(String value) {
        this.iznosMarza = value;
    }

    /**
     * Gets the value of the iznosNePodlOpor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIznosNePodlOpor() {
        return iznosNePodlOpor;
    }

    /**
     * Sets the value of the iznosNePodlOpor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIznosNePodlOpor(String value) {
        this.iznosNePodlOpor = value;
    }

    /**
     * Gets the value of the naknade property.
     *
     * @return
     *     possible object is
     *     {@link NaknadeType }
     *
     */
    public NaknadeType getNaknade() {
        return naknade;
    }

    /**
     * Sets the value of the naknade property.
     *
     * @param value
     *     allowed object is
     *     {@link NaknadeType }
     *
     */
    public void setNaknade(NaknadeType value) {
        this.naknade = value;
    }

    /**
     * Gets the value of the iznosUkupno property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIznosUkupno() {
        return iznosUkupno;
    }

    /**
     * Sets the value of the iznosUkupno property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIznosUkupno(String value) {
        this.iznosUkupno = value;
    }

    /**
     * Gets the value of the nacinPlac property.
     *
     * @return
     *     possible object is
     *     {@link NacinPlacanjaType }
     *
     */
    public NacinPlacanjaType getNacinPlac() {
        return nacinPlac;
    }

    /**
     * Sets the value of the nacinPlac property.
     *
     * @param value
     *     allowed object is
     *     {@link NacinPlacanjaType }
     *
     */
    public void setNacinPlac(NacinPlacanjaType value) {
        this.nacinPlac = value;
    }

    /**
     * Gets the value of the oibOper property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOibOper() {
        return oibOper;
    }

    /**
     * Sets the value of the oibOper property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOibOper(String value) {
        this.oibOper = value;
    }

    /**
     * Gets the value of the zastKod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZastKod() {
        return zastKod;
    }

    /**
     * Sets the value of the zastKod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZastKod(String value) {
        this.zastKod = value;
    }

    /**
     * Gets the value of the nakDost property.
     *
     */
    public boolean isNakDost() {
        return nakDost;
    }

    /**
     * Sets the value of the nakDost property.
     *
     */
    public void setNakDost(boolean value) {
        this.nakDost = value;
    }

    /**
     * Gets the value of the paragonBrRac property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParagonBrRac() {
        return paragonBrRac;
    }

    /**
     * Sets the value of the paragonBrRac property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParagonBrRac(String value) {
        this.paragonBrRac = value;
    }

    /**
     * Gets the value of the specNamj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecNamj() {
        return specNamj;
    }

    /**
     * Sets the value of the specNamj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecNamj(String value) {
        this.specNamj = value;
    }

    /**
     * Gets the value of the prateciDokument property.
     *
     * @return
     *     possible object is
     *     {@link PrateciDokument }
     *
     */
    public PrateciDokument getPrateciDokument() {
        return prateciDokument;
    }

    /**
     * Sets the value of the prateciDokument property.
     *
     * @param value
     *     allowed object is
     *     {@link PrateciDokument }
     *
     */
    public void setPrateciDokument(PrateciDokument value) {
        this.prateciDokument = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     *
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     *
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;choice maxOccurs="2"&amp;gt;
     *           &amp;lt;element name="JirPD" type="{http://www.apis-it.hr/fin/2012/types/f73}UUIDType"/&amp;gt;
     *           &amp;lt;element name="ZastKodPD"&amp;gt;
     *             &amp;lt;simpleType&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                 &amp;lt;pattern value="[a-f0-9]{32}"/&amp;gt;
     *                 &amp;lt;length value="32"/&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/simpleType&amp;gt;
     *           &amp;lt;/element&amp;gt;
     *         &amp;lt;/choice&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jirPDOrZastKodPD"
    })
    public static class PrateciDokument {

        @XmlElementRefs({
            @XmlElementRef(name = "JirPD", namespace = "http://www.apis-it.hr/fin/2012/types/f73", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ZastKodPD", namespace = "http://www.apis-it.hr/fin/2012/types/f73", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> jirPDOrZastKodPD;

        /**
         * Gets the value of the jirPDOrZastKodPD property.
         *
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the jirPDOrZastKodPD property.
         *
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getJirPDOrZastKodPD().add(newItem);
         * &lt;/pre&gt;
         *
         *
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         *
         */
        public List<JAXBElement<String>> getJirPDOrZastKodPD() {
            if (jirPDOrZastKodPD == null) {
                jirPDOrZastKodPD = new ArrayList<JAXBElement<String>>();
            }
            return this.jirPDOrZastKodPD;
        }

    }

}
