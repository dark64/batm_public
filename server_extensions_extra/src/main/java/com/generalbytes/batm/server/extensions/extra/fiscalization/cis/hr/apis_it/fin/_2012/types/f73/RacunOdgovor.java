
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.generalbytes.batm.server.extensions.extra.fiscalization.cis.org.w3._2000._09.xmldsig_.SignatureType;


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
 *         &amp;lt;element name="Zaglavlje" type="{http://www.apis-it.hr/fin/2012/types/f73}ZaglavljeOdgovorType"/&amp;gt;
 *         &amp;lt;element name="Jir" type="{http://www.apis-it.hr/fin/2012/types/f73}UUIDType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Greske" type="{http://www.apis-it.hr/fin/2012/types/f73}GreskeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zaglavlje",
    "jir",
    "greske",
    "signature"
})
@XmlRootElement(name = "RacunOdgovor")
public class RacunOdgovor {

    @XmlElement(name = "Zaglavlje", required = true)
    protected ZaglavljeOdgovorType zaglavlje;
    @XmlElement(name = "Jir")
    protected String jir;
    @XmlElement(name = "Greske")
    protected GreskeType greske;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the zaglavlje property.
     *
     * @return
     *     possible object is
     *     {@link ZaglavljeOdgovorType }
     *
     */
    public ZaglavljeOdgovorType getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     *
     * @param value
     *     allowed object is
     *     {@link ZaglavljeOdgovorType }
     *
     */
    public void setZaglavlje(ZaglavljeOdgovorType value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the jir property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJir() {
        return jir;
    }

    /**
     * Sets the value of the jir property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJir(String value) {
        this.jir = value;
    }

    /**
     * Gets the value of the greske property.
     *
     * @return
     *     possible object is
     *     {@link GreskeType }
     *
     */
    public GreskeType getGreske() {
        return greske;
    }

    /**
     * Sets the value of the greske property.
     *
     * @param value
     *     allowed object is
     *     {@link GreskeType }
     *
     */
    public void setGreske(GreskeType value) {
        this.greske = value;
    }

    /**
     * Gets the value of the signature property.
     *
     * @return
     *     possible object is
     *     {@link SignatureType }
     *
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     *
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

}
