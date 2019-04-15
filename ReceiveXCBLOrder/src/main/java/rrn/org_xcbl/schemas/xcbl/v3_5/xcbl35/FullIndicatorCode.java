//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:06:19 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullIndicatorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FullIndicatorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Empty"/>
 *     &lt;enumeration value="Partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FullIndicatorCode")
@XmlEnum
public enum FullIndicatorCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    FullIndicatorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FullIndicatorCode fromValue(String v) {
        for (FullIndicatorCode c: FullIndicatorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
