
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NaknadaType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="NaknadaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NazivN"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IznosN" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaknadaType", propOrder = {
    "nazivN",
    "iznosN"
})
public class NaknadaType {

    @XmlElement(name = "NazivN", required = true)
    protected String nazivN;
    @XmlElement(name = "IznosN", required = true)
    protected String iznosN;

    /**
     * Gets the value of the nazivN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNazivN() {
        return nazivN;
    }

    /**
     * Sets the value of the nazivN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNazivN(String value) {
        this.nazivN = value;
    }

    /**
     * Gets the value of the iznosN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIznosN() {
        return iznosN;
    }

    /**
     * Sets the value of the iznosN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIznosN(String value) {
        this.iznosN = value;
    }

}
