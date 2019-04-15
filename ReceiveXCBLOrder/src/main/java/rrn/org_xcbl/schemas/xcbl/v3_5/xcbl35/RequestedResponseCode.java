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
 * <p>Java class for RequestedResponseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestedResponseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="DebitAdvice"/>
 *     &lt;enumeration value="AcknowledgeHoldStatus"/>
 *     &lt;enumeration value="AcknowledgementWhenError"/>
 *     &lt;enumeration value="AcknowledgeNoDetailOrChange"/>
 *     &lt;enumeration value="AcknowledgeOnlyChanges"/>
 *     &lt;enumeration value="AcknowledgeProductReplenishment"/>
 *     &lt;enumeration value="AcknowledgeWithDetailAndChange"/>
 *     &lt;enumeration value="AcknowledgeWithDetailNoChange"/>
 *     &lt;enumeration value="AdviceWithDetails"/>
 *     &lt;enumeration value="AdviceWithoutDetails"/>
 *     &lt;enumeration value="Authentication"/>
 *     &lt;enumeration value="CreditAdviceAndAcknowledgementForDirectDebit"/>
 *     &lt;enumeration value="CreditAdviceMessageAcknowledgement"/>
 *     &lt;enumeration value="CreditAdviceRequestedForDirectDebit"/>
 *     &lt;enumeration value="DebitAdviceForEachTransaction"/>
 *     &lt;enumeration value="DebitAdviceMessageAcknowledgement"/>
 *     &lt;enumeration value="DebitAdviceMessageAcknowledgementForEachTransaction"/>
 *     &lt;enumeration value="DebitAdviceRequested"/>
 *     &lt;enumeration value="MessageAcknowledgement"/>
 *     &lt;enumeration value="NoAcknowledgementNeeded"/>
 *     &lt;enumeration value="RequestAuthority"/>
 *     &lt;enumeration value="ResponseExpected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestedResponseCode")
@XmlEnum
public enum RequestedResponseCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("DebitAdvice")
    DEBIT_ADVICE("DebitAdvice"),
    @XmlEnumValue("AcknowledgeHoldStatus")
    ACKNOWLEDGE_HOLD_STATUS("AcknowledgeHoldStatus"),
    @XmlEnumValue("AcknowledgementWhenError")
    ACKNOWLEDGEMENT_WHEN_ERROR("AcknowledgementWhenError"),
    @XmlEnumValue("AcknowledgeNoDetailOrChange")
    ACKNOWLEDGE_NO_DETAIL_OR_CHANGE("AcknowledgeNoDetailOrChange"),
    @XmlEnumValue("AcknowledgeOnlyChanges")
    ACKNOWLEDGE_ONLY_CHANGES("AcknowledgeOnlyChanges"),
    @XmlEnumValue("AcknowledgeProductReplenishment")
    ACKNOWLEDGE_PRODUCT_REPLENISHMENT("AcknowledgeProductReplenishment"),
    @XmlEnumValue("AcknowledgeWithDetailAndChange")
    ACKNOWLEDGE_WITH_DETAIL_AND_CHANGE("AcknowledgeWithDetailAndChange"),
    @XmlEnumValue("AcknowledgeWithDetailNoChange")
    ACKNOWLEDGE_WITH_DETAIL_NO_CHANGE("AcknowledgeWithDetailNoChange"),
    @XmlEnumValue("AdviceWithDetails")
    ADVICE_WITH_DETAILS("AdviceWithDetails"),
    @XmlEnumValue("AdviceWithoutDetails")
    ADVICE_WITHOUT_DETAILS("AdviceWithoutDetails"),
    @XmlEnumValue("Authentication")
    AUTHENTICATION("Authentication"),
    @XmlEnumValue("CreditAdviceAndAcknowledgementForDirectDebit")
    CREDIT_ADVICE_AND_ACKNOWLEDGEMENT_FOR_DIRECT_DEBIT("CreditAdviceAndAcknowledgementForDirectDebit"),
    @XmlEnumValue("CreditAdviceMessageAcknowledgement")
    CREDIT_ADVICE_MESSAGE_ACKNOWLEDGEMENT("CreditAdviceMessageAcknowledgement"),
    @XmlEnumValue("CreditAdviceRequestedForDirectDebit")
    CREDIT_ADVICE_REQUESTED_FOR_DIRECT_DEBIT("CreditAdviceRequestedForDirectDebit"),
    @XmlEnumValue("DebitAdviceForEachTransaction")
    DEBIT_ADVICE_FOR_EACH_TRANSACTION("DebitAdviceForEachTransaction"),
    @XmlEnumValue("DebitAdviceMessageAcknowledgement")
    DEBIT_ADVICE_MESSAGE_ACKNOWLEDGEMENT("DebitAdviceMessageAcknowledgement"),
    @XmlEnumValue("DebitAdviceMessageAcknowledgementForEachTransaction")
    DEBIT_ADVICE_MESSAGE_ACKNOWLEDGEMENT_FOR_EACH_TRANSACTION("DebitAdviceMessageAcknowledgementForEachTransaction"),
    @XmlEnumValue("DebitAdviceRequested")
    DEBIT_ADVICE_REQUESTED("DebitAdviceRequested"),
    @XmlEnumValue("MessageAcknowledgement")
    MESSAGE_ACKNOWLEDGEMENT("MessageAcknowledgement"),
    @XmlEnumValue("NoAcknowledgementNeeded")
    NO_ACKNOWLEDGEMENT_NEEDED("NoAcknowledgementNeeded"),
    @XmlEnumValue("RequestAuthority")
    REQUEST_AUTHORITY("RequestAuthority"),
    @XmlEnumValue("ResponseExpected")
    RESPONSE_EXPECTED("ResponseExpected");
    private final String value;

    RequestedResponseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestedResponseCode fromValue(String v) {
        for (RequestedResponseCode c: RequestedResponseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
