
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrateciDokumentType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="PrateciDokumentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Oib" type="{http://www.apis-it.hr/fin/2012/types/f73}OibType"/&amp;gt;
 *         &amp;lt;element name="DatVrijeme" type="{http://www.apis-it.hr/fin/2012/types/f73}DatumVrijemeType"/&amp;gt;
 *         &amp;lt;element name="BrPratecegDokumenta" type="{http://www.apis-it.hr/fin/2012/types/f73}BrojPDType"/&amp;gt;
 *         &amp;lt;element name="IznosUkupno" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/&amp;gt;
 *         &amp;lt;element name="ZastKodPD"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;pattern value="[a-f0-9]{32}"/&amp;gt;
 *               &amp;lt;length value="32"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="NakDost" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrateciDokumentType", propOrder = {
    "oib",
    "datVrijeme",
    "brPratecegDokumenta",
    "iznosUkupno",
    "zastKodPD",
    "nakDost"
})
public class PrateciDokumentType {

    @XmlElement(name = "Oib", required = true)
    protected String oib;
    @XmlElement(name = "DatVrijeme", required = true)
    protected String datVrijeme;
    @XmlElement(name = "BrPratecegDokumenta", required = true)
    protected BrojPDType brPratecegDokumenta;
    @XmlElement(name = "IznosUkupno", required = true)
    protected String iznosUkupno;
    @XmlElement(name = "ZastKodPD", required = true)
    protected String zastKodPD;
    @XmlElement(name = "NakDost")
    protected boolean nakDost;

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
     * Gets the value of the brPratecegDokumenta property.
     *
     * @return
     *     possible object is
     *     {@link BrojPDType }
     *
     */
    public BrojPDType getBrPratecegDokumenta() {
        return brPratecegDokumenta;
    }

    /**
     * Sets the value of the brPratecegDokumenta property.
     *
     * @param value
     *     allowed object is
     *     {@link BrojPDType }
     *
     */
    public void setBrPratecegDokumenta(BrojPDType value) {
        this.brPratecegDokumenta = value;
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
     * Gets the value of the zastKodPD property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZastKodPD() {
        return zastKodPD;
    }

    /**
     * Sets the value of the zastKodPD property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZastKodPD(String value) {
        this.zastKodPD = value;
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

}
