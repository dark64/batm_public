
package com.generalbytes.batm.server.extensions.extra.fiscalization.cis.hr.apis_it.fin._2012.types.f73;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NacinPlacanjaType.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="NacinPlacanjaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="G"/&amp;gt;
 *     &amp;lt;enumeration value="K"/&amp;gt;
 *     &amp;lt;enumeration value="C"/&amp;gt;
 *     &amp;lt;enumeration value="T"/&amp;gt;
 *     &amp;lt;enumeration value="O"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 *
 */
@XmlType(name = "NacinPlacanjaType")
@XmlEnum
public enum NacinPlacanjaType {

    G,
    K,
    C,
    T,
    O;

    public String value() {
        return name();
    }

    public static NacinPlacanjaType fromValue(String v) {
        return valueOf(v);
    }

}
