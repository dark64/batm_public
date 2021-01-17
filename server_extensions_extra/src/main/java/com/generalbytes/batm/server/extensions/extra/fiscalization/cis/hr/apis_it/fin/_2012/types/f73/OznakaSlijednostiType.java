
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OznakaSlijednostiType.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="OznakaSlijednostiType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="N"/&amp;gt;
 *     &amp;lt;enumeration value="P"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 *
 */
@XmlType(name = "OznakaSlijednostiType")
@XmlEnum
public enum OznakaSlijednostiType {

    N,
    P;

    public String value() {
        return name();
    }

    public static OznakaSlijednostiType fromValue(String v) {
        return valueOf(v);
    }

}
