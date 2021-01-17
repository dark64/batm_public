
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
 *         &amp;lt;element name="Zaglavlje" type="{http://www.apis-it.hr/fin/2012/types/f73}ZaglavljeType"/&amp;gt;
 *         &amp;lt;element name="Racun" type="{http://www.apis-it.hr/fin/2012/types/f73}RacunType"/&amp;gt;
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
    "racun",
    "signature"
})
@XmlRootElement(name = "RacunZahtjev")
public class RacunZahtjev {

    @XmlElement(name = "Zaglavlje", required = true)
    protected ZaglavljeType zaglavlje;
    @XmlElement(name = "Racun", required = true)
    protected RacunType racun;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the zaglavlje property.
     *
     * @return
     *     possible object is
     *     {@link ZaglavljeType }
     *
     */
    public ZaglavljeType getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     *
     * @param value
     *     allowed object is
     *     {@link ZaglavljeType }
     *
     */
    public void setZaglavlje(ZaglavljeType value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the racun property.
     *
     * @return
     *     possible object is
     *     {@link RacunType }
     *
     */
    public RacunType getRacun() {
        return racun;
    }

    /**
     * Sets the value of the racun property.
     *
     * @param value
     *     allowed object is
     *     {@link RacunType }
     *
     */
    public void setRacun(RacunType value) {
        this.racun = value;
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
