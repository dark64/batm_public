
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BrojRacunaType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="BrojRacunaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="BrOznRac"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;maxLength value="20"/&amp;gt;
 *               &amp;lt;pattern value="\d*"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OznPosPr" type="{http://www.apis-it.hr/fin/2012/types/f73}OznPoslProstoraType"/&amp;gt;
 *         &amp;lt;element name="OznNapUr" type="{http://www.apis-it.hr/fin/2012/types/f73}OznNaplUredjajaType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrojRacunaType", propOrder = {
    "brOznRac",
    "oznPosPr",
    "oznNapUr"
})
public class BrojRacunaType {

    @XmlElement(name = "BrOznRac", required = true)
    protected String brOznRac;
    @XmlElement(name = "OznPosPr", required = true)
    protected String oznPosPr;
    @XmlElement(name = "OznNapUr", required = true)
    protected String oznNapUr;

    /**
     * Gets the value of the brOznRac property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBrOznRac() {
        return brOznRac;
    }

    /**
     * Sets the value of the brOznRac property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBrOznRac(String value) {
        this.brOznRac = value;
    }

    /**
     * Gets the value of the oznPosPr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOznPosPr() {
        return oznPosPr;
    }

    /**
     * Sets the value of the oznPosPr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOznPosPr(String value) {
        this.oznPosPr = value;
    }

    /**
     * Gets the value of the oznNapUr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOznNapUr() {
        return oznNapUr;
    }

    /**
     * Sets the value of the oznNapUr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOznNapUr(String value) {
        this.oznNapUr = value;
    }

}
