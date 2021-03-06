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
 * <p>Java class for HazardPackingCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HazardPackingCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="GreatDanger"/>
 *     &lt;enumeration value="MediumDanger"/>
 *     &lt;enumeration value="MinorDanger"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardPackingCode")
@XmlEnum
public enum HazardPackingCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("GreatDanger")
    GREAT_DANGER("GreatDanger"),
    @XmlEnumValue("MediumDanger")
    MEDIUM_DANGER("MediumDanger"),
    @XmlEnumValue("MinorDanger")
    MINOR_DANGER("MinorDanger");
    private final String value;

    HazardPackingCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HazardPackingCode fromValue(String v) {
        for (HazardPackingCode c: HazardPackingCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
