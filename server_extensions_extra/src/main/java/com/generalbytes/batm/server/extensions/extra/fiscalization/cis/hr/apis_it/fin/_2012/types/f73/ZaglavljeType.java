
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ZaglavljeType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ZaglavljeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="IdPoruke" type="{http://www.apis-it.hr/fin/2012/types/f73}UUIDType"/&amp;gt;
 *         &amp;lt;element name="DatumVrijeme" type="{http://www.apis-it.hr/fin/2012/types/f73}DatumVrijemeType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZaglavljeType", propOrder = {
    "idPoruke",
    "datumVrijeme"
})
public class ZaglavljeType {

    @XmlElement(name = "IdPoruke", required = true)
    protected String idPoruke;
    @XmlElement(name = "DatumVrijeme", required = true)
    protected String datumVrijeme;

    /**
     * Gets the value of the idPoruke property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the datumVrijeme property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatumVrijeme() {
        return datumVrijeme;
    }

    /**
     * Sets the value of the datumVrijeme property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatumVrijeme(String value) {
        this.datumVrijeme = value;
    }

}
