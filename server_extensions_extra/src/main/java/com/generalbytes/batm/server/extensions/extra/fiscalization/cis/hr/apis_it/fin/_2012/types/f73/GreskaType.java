
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GreskaType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="GreskaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SifraGreske" type="{http://www.apis-it.hr/fin/2012/types/f73}SifraGreskeType"/&amp;gt;
 *         &amp;lt;element name="PorukaGreske" type="{http://www.apis-it.hr/fin/2012/types/f73}PorukaGreskeType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GreskaType", propOrder = {
    "sifraGreske",
    "porukaGreske"
})
public class GreskaType {

    @XmlElement(name = "SifraGreske", required = true)
    protected String sifraGreske;
    @XmlElement(name = "PorukaGreske", required = true)
    protected String porukaGreske;

    /**
     * Gets the value of the sifraGreske property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSifraGreske() {
        return sifraGreske;
    }

    /**
     * Sets the value of the sifraGreske property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSifraGreske(String value) {
        this.sifraGreske = value;
    }

    /**
     * Gets the value of the porukaGreske property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPorukaGreske() {
        return porukaGreske;
    }

    /**
     * Sets the value of the porukaGreske property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPorukaGreske(String value) {
        this.porukaGreske = value;
    }

}
