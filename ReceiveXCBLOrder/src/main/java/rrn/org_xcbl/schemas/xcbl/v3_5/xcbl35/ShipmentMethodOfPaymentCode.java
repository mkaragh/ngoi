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
 * <p>Java class for ShipmentMethodOfPaymentCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentMethodOfPaymentCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="AdvanceCollect"/>
 *     &lt;enumeration value="AdvancePrepaid"/>
 *     &lt;enumeration value="CashOnDeliveryServiceChargePaidByConsignee"/>
 *     &lt;enumeration value="CashOnDeliveryServiceChargePaidByConsignor"/>
 *     &lt;enumeration value="Collect"/>
 *     &lt;enumeration value="CollectFreightCreditedToPaymentCustomer"/>
 *     &lt;enumeration value="CollectOnDelivery"/>
 *     &lt;enumeration value="CustomerPick-UpOrBackhaul"/>
 *     &lt;enumeration value="DefinedByBuyerAndSeller"/>
 *     &lt;enumeration value="FobPortOfCall"/>
 *     &lt;enumeration value="HalfPrepaid"/>
 *     &lt;enumeration value="InformationCopy-NoPaymentDue"/>
 *     &lt;enumeration value="InsuranceCostsPaidByConsignee"/>
 *     &lt;enumeration value="InsuranceCostsPaidByConsignor"/>
 *     &lt;enumeration value="Mixed"/>
 *     &lt;enumeration value="NonRevenue"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="PaidByBuyer"/>
 *     &lt;enumeration value="PaidBySupplierOrSeller"/>
 *     &lt;enumeration value="PayableElsewhere"/>
 *     &lt;enumeration value="PerContract"/>
 *     &lt;enumeration value="Pickup"/>
 *     &lt;enumeration value="PrepaidAndSummaryBill"/>
 *     &lt;enumeration value="PrepaidButChargedToCustomer"/>
 *     &lt;enumeration value="PrepaidByProcessor"/>
 *     &lt;enumeration value="Prepaid-BySeller"/>
 *     &lt;enumeration value="PrepaidLocalCollectOutstate"/>
 *     &lt;enumeration value="PrepaidOnly"/>
 *     &lt;enumeration value="ReturnContainerFreightFree"/>
 *     &lt;enumeration value="ReturnContainerFreightPaidByCustomer"/>
 *     &lt;enumeration value="ReturnContainerFreightPaidBySupplier"/>
 *     &lt;enumeration value="Rule11Shipment"/>
 *     &lt;enumeration value="ServiceFreight-NoCharge"/>
 *     &lt;enumeration value="ThirdPartyPay"/>
 *     &lt;enumeration value="WeightCondition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentMethodOfPaymentCode")
@XmlEnum
public enum ShipmentMethodOfPaymentCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("AdvanceCollect")
    ADVANCE_COLLECT("AdvanceCollect"),
    @XmlEnumValue("AdvancePrepaid")
    ADVANCE_PREPAID("AdvancePrepaid"),
    @XmlEnumValue("CashOnDeliveryServiceChargePaidByConsignee")
    CASH_ON_DELIVERY_SERVICE_CHARGE_PAID_BY_CONSIGNEE("CashOnDeliveryServiceChargePaidByConsignee"),
    @XmlEnumValue("CashOnDeliveryServiceChargePaidByConsignor")
    CASH_ON_DELIVERY_SERVICE_CHARGE_PAID_BY_CONSIGNOR("CashOnDeliveryServiceChargePaidByConsignor"),
    @XmlEnumValue("Collect")
    COLLECT("Collect"),
    @XmlEnumValue("CollectFreightCreditedToPaymentCustomer")
    COLLECT_FREIGHT_CREDITED_TO_PAYMENT_CUSTOMER("CollectFreightCreditedToPaymentCustomer"),
    @XmlEnumValue("CollectOnDelivery")
    COLLECT_ON_DELIVERY("CollectOnDelivery"),
    @XmlEnumValue("CustomerPick-UpOrBackhaul")
    CUSTOMER_PICK_UP_OR_BACKHAUL("CustomerPick-UpOrBackhaul"),
    @XmlEnumValue("DefinedByBuyerAndSeller")
    DEFINED_BY_BUYER_AND_SELLER("DefinedByBuyerAndSeller"),
    @XmlEnumValue("FobPortOfCall")
    FOB_PORT_OF_CALL("FobPortOfCall"),
    @XmlEnumValue("HalfPrepaid")
    HALF_PREPAID("HalfPrepaid"),
    @XmlEnumValue("InformationCopy-NoPaymentDue")
    INFORMATION_COPY_NO_PAYMENT_DUE("InformationCopy-NoPaymentDue"),
    @XmlEnumValue("InsuranceCostsPaidByConsignee")
    INSURANCE_COSTS_PAID_BY_CONSIGNEE("InsuranceCostsPaidByConsignee"),
    @XmlEnumValue("InsuranceCostsPaidByConsignor")
    INSURANCE_COSTS_PAID_BY_CONSIGNOR("InsuranceCostsPaidByConsignor"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),
    @XmlEnumValue("NonRevenue")
    NON_REVENUE("NonRevenue"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("PaidByBuyer")
    PAID_BY_BUYER("PaidByBuyer"),
    @XmlEnumValue("PaidBySupplierOrSeller")
    PAID_BY_SUPPLIER_OR_SELLER("PaidBySupplierOrSeller"),
    @XmlEnumValue("PayableElsewhere")
    PAYABLE_ELSEWHERE("PayableElsewhere"),
    @XmlEnumValue("PerContract")
    PER_CONTRACT("PerContract"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("PrepaidAndSummaryBill")
    PREPAID_AND_SUMMARY_BILL("PrepaidAndSummaryBill"),
    @XmlEnumValue("PrepaidButChargedToCustomer")
    PREPAID_BUT_CHARGED_TO_CUSTOMER("PrepaidButChargedToCustomer"),
    @XmlEnumValue("PrepaidByProcessor")
    PREPAID_BY_PROCESSOR("PrepaidByProcessor"),
    @XmlEnumValue("Prepaid-BySeller")
    PREPAID_BY_SELLER("Prepaid-BySeller"),
    @XmlEnumValue("PrepaidLocalCollectOutstate")
    PREPAID_LOCAL_COLLECT_OUTSTATE("PrepaidLocalCollectOutstate"),
    @XmlEnumValue("PrepaidOnly")
    PREPAID_ONLY("PrepaidOnly"),
    @XmlEnumValue("ReturnContainerFreightFree")
    RETURN_CONTAINER_FREIGHT_FREE("ReturnContainerFreightFree"),
    @XmlEnumValue("ReturnContainerFreightPaidByCustomer")
    RETURN_CONTAINER_FREIGHT_PAID_BY_CUSTOMER("ReturnContainerFreightPaidByCustomer"),
    @XmlEnumValue("ReturnContainerFreightPaidBySupplier")
    RETURN_CONTAINER_FREIGHT_PAID_BY_SUPPLIER("ReturnContainerFreightPaidBySupplier"),
    @XmlEnumValue("Rule11Shipment")
    RULE_11_SHIPMENT("Rule11Shipment"),
    @XmlEnumValue("ServiceFreight-NoCharge")
    SERVICE_FREIGHT_NO_CHARGE("ServiceFreight-NoCharge"),
    @XmlEnumValue("ThirdPartyPay")
    THIRD_PARTY_PAY("ThirdPartyPay"),
    @XmlEnumValue("WeightCondition")
    WEIGHT_CONDITION("WeightCondition");
    private final String value;

    ShipmentMethodOfPaymentCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShipmentMethodOfPaymentCode fromValue(String v) {
        for (ShipmentMethodOfPaymentCode c: ShipmentMethodOfPaymentCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
