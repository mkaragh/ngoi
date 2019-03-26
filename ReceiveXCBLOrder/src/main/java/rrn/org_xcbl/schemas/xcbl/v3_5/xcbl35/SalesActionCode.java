//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesActionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="CancelBalanceThatExceedsSalesActionValues"/>
 *     &lt;enumeration value="CancelEntire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesActionCode")
@XmlEnum
public enum SalesActionCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("CancelBalanceThatExceedsSalesActionValues")
    CANCEL_BALANCE_THAT_EXCEEDS_SALES_ACTION_VALUES("CancelBalanceThatExceedsSalesActionValues"),
    @XmlEnumValue("CancelEntire")
    CANCEL_ENTIRE("CancelEntire");
    private final String value;

    SalesActionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesActionCode fromValue(String v) {
        for (SalesActionCode c: SalesActionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
