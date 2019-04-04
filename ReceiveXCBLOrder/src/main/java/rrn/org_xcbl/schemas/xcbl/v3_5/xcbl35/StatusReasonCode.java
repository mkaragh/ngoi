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
 * <p>Java class for StatusReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusReasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ChangedSchedule"/>
 *     &lt;enumeration value="InstructionsAwaited"/>
 *     &lt;enumeration value="Damaged"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="CustomsRefusal"/>
 *     &lt;enumeration value="EmptyOnInspection"/>
 *     &lt;enumeration value="DestinationIncorrect"/>
 *     &lt;enumeration value="ExportRestrictions"/>
 *     &lt;enumeration value="ImportRestrictions"/>
 *     &lt;enumeration value="PaymentNotReceived"/>
 *     &lt;enumeration value="DeliveryDifferentDate"/>
 *     &lt;enumeration value="DeliveryTooLate"/>
 *     &lt;enumeration value="IncidentAttributedToSeller"/>
 *     &lt;enumeration value="IncidentAttributedToTheBuyer"/>
 *     &lt;enumeration value="IncidentAttributedToTheCarrier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusReasonCode")
@XmlEnum
public enum StatusReasonCode {

    @XmlEnumValue("ChangedSchedule")
    CHANGED_SCHEDULE("ChangedSchedule"),
    @XmlEnumValue("InstructionsAwaited")
    INSTRUCTIONS_AWAITED("InstructionsAwaited"),
    @XmlEnumValue("Damaged")
    DAMAGED("Damaged"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("CustomsRefusal")
    CUSTOMS_REFUSAL("CustomsRefusal"),
    @XmlEnumValue("EmptyOnInspection")
    EMPTY_ON_INSPECTION("EmptyOnInspection"),
    @XmlEnumValue("DestinationIncorrect")
    DESTINATION_INCORRECT("DestinationIncorrect"),
    @XmlEnumValue("ExportRestrictions")
    EXPORT_RESTRICTIONS("ExportRestrictions"),
    @XmlEnumValue("ImportRestrictions")
    IMPORT_RESTRICTIONS("ImportRestrictions"),
    @XmlEnumValue("PaymentNotReceived")
    PAYMENT_NOT_RECEIVED("PaymentNotReceived"),
    @XmlEnumValue("DeliveryDifferentDate")
    DELIVERY_DIFFERENT_DATE("DeliveryDifferentDate"),
    @XmlEnumValue("DeliveryTooLate")
    DELIVERY_TOO_LATE("DeliveryTooLate"),
    @XmlEnumValue("IncidentAttributedToSeller")
    INCIDENT_ATTRIBUTED_TO_SELLER("IncidentAttributedToSeller"),
    @XmlEnumValue("IncidentAttributedToTheBuyer")
    INCIDENT_ATTRIBUTED_TO_THE_BUYER("IncidentAttributedToTheBuyer"),
    @XmlEnumValue("IncidentAttributedToTheCarrier")
    INCIDENT_ATTRIBUTED_TO_THE_CARRIER("IncidentAttributedToTheCarrier");
    private final String value;

    StatusReasonCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusReasonCode fromValue(String v) {
        for (StatusReasonCode c: StatusReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
