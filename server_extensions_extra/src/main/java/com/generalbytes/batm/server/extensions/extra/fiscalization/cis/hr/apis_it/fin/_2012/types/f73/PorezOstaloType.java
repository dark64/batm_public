
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PorezOstaloType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="PorezOstaloType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Naziv"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Stopa" type="{http://www.apis-it.hr/fin/2012/types/f73}StopaType"/&amp;gt;
 *         &amp;lt;element name="Osnovica" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/&amp;gt;
 *         &amp;lt;element name="Iznos" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorezOstaloType", propOrder = {
    "naziv",
    "stopa",
    "osnovica",
    "iznos"
})
public class PorezOstaloType {

    @XmlElement(name = "Naziv", required = true)
    protected String naziv;
    @XmlElement(name = "Stopa", required = true)
    protected String stopa;
    @XmlElement(name = "Osnovica", required = true)
    protected String osnovica;
    @XmlElement(name = "Iznos", required = true)
    protected String iznos;

    /**
     * Gets the value of the naziv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the stopa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStopa() {
        return stopa;
    }

    /**
     * Sets the value of the stopa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStopa(String value) {
        this.stopa = value;
    }

    /**
     * Gets the value of the osnovica property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOsnovica() {
        return osnovica;
    }

    /**
     * Sets the value of the osnovica property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOsnovica(String value) {
        this.osnovica = value;
    }

    /**
     * Gets the value of the iznos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIznos(String value) {
        this.iznos = value;
    }

}
