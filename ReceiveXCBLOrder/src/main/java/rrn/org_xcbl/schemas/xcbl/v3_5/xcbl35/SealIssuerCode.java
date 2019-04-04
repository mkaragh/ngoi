//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SealIssuerCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SealIssuerCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Consolidator"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="QuarantineAgency"/>
 *     &lt;enumeration value="Carrier"/>
 *     &lt;enumeration value="Customs"/>
 *     &lt;enumeration value="Shipper"/>
 *     &lt;enumeration value="TerminalOperator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SealIssuerCode")
@XmlEnum
public enum SealIssuerCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Consolidator")
    CONSOLIDATOR("Consolidator"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("QuarantineAgency")
    QUARANTINE_AGENCY("QuarantineAgency"),
    @XmlEnumValue("Carrier")
    CARRIER("Carrier"),
    @XmlEnumValue("Customs")
    CUSTOMS("Customs"),
    @XmlEnumValue("Shipper")
    SHIPPER("Shipper"),
    @XmlEnumValue("TerminalOperator")
    TERMINAL_OPERATOR("TerminalOperator");
    private final String value;

    SealIssuerCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SealIssuerCode fromValue(String v) {
        for (SealIssuerCode c: SealIssuerCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}