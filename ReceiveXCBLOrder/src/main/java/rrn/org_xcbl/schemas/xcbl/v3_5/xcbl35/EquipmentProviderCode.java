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
 * <p>Java class for EquipmentProviderCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentProviderCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ShipperSupplied"/>
 *     &lt;enumeration value="CarrierSupplied"/>
 *     &lt;enumeration value="ConsolidatorSupplied"/>
 *     &lt;enumeration value="DeconsolidatorSupplied"/>
 *     &lt;enumeration value="ThirdPartySupplied"/>
 *     &lt;enumeration value="ForwarderSuppliedFromALeasingCompany"/>
 *     &lt;enumeration value="ForwarderSuppliedFromTheRailwaysPool"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentProviderCode")
@XmlEnum
public enum EquipmentProviderCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ShipperSupplied")
    SHIPPER_SUPPLIED("ShipperSupplied"),
    @XmlEnumValue("CarrierSupplied")
    CARRIER_SUPPLIED("CarrierSupplied"),
    @XmlEnumValue("ConsolidatorSupplied")
    CONSOLIDATOR_SUPPLIED("ConsolidatorSupplied"),
    @XmlEnumValue("DeconsolidatorSupplied")
    DECONSOLIDATOR_SUPPLIED("DeconsolidatorSupplied"),
    @XmlEnumValue("ThirdPartySupplied")
    THIRD_PARTY_SUPPLIED("ThirdPartySupplied"),
    @XmlEnumValue("ForwarderSuppliedFromALeasingCompany")
    FORWARDER_SUPPLIED_FROM_A_LEASING_COMPANY("ForwarderSuppliedFromALeasingCompany"),
    @XmlEnumValue("ForwarderSuppliedFromTheRailwaysPool")
    FORWARDER_SUPPLIED_FROM_THE_RAILWAYS_POOL("ForwarderSuppliedFromTheRailwaysPool");
    private final String value;

    EquipmentProviderCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentProviderCode fromValue(String v) {
        for (EquipmentProviderCode c: EquipmentProviderCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
