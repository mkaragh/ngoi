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
 * <p>Java class for ShipmentStatusEventCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentStatusEventCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="NotYetShipped"/>
 *     &lt;enumeration value="BackOrdered"/>
 *     &lt;enumeration value="BackOrderShipped"/>
 *     &lt;enumeration value="ReadyForPickup"/>
 *     &lt;enumeration value="InTransit"/>
 *     &lt;enumeration value="PartiallyShipped"/>
 *     &lt;enumeration value="PartiallyDelivered"/>
 *     &lt;enumeration value="ShipmentComplete"/>
 *     &lt;enumeration value="Delivered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentStatusEventCode")
@XmlEnum
public enum ShipmentStatusEventCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("NotYetShipped")
    NOT_YET_SHIPPED("NotYetShipped"),
    @XmlEnumValue("BackOrdered")
    BACK_ORDERED("BackOrdered"),
    @XmlEnumValue("BackOrderShipped")
    BACK_ORDER_SHIPPED("BackOrderShipped"),
    @XmlEnumValue("ReadyForPickup")
    READY_FOR_PICKUP("ReadyForPickup"),
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),
    @XmlEnumValue("PartiallyShipped")
    PARTIALLY_SHIPPED("PartiallyShipped"),
    @XmlEnumValue("PartiallyDelivered")
    PARTIALLY_DELIVERED("PartiallyDelivered"),
    @XmlEnumValue("ShipmentComplete")
    SHIPMENT_COMPLETE("ShipmentComplete"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered");
    private final String value;

    ShipmentStatusEventCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShipmentStatusEventCode fromValue(String v) {
        for (ShipmentStatusEventCode c: ShipmentStatusEventCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
