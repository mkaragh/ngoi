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
 * <p>Java class for PercentQualifierCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PercentQualifierCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ItemListCost"/>
 *     &lt;enumeration value="ItemNetCost"/>
 *     &lt;enumeration value="Discount-Gross"/>
 *     &lt;enumeration value="Discount-Net"/>
 *     &lt;enumeration value="BasePriceperUnit"/>
 *     &lt;enumeration value="BasePriceAmount"/>
 *     &lt;enumeration value="BasePriceAmountLessPreviousDiscount"/>
 *     &lt;enumeration value="NetMonthlyOnAllInvoicesPastDue"/>
 *     &lt;enumeration value="LatePaymentChargeBaseAmount"/>
 *     &lt;enumeration value="FuelRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PercentQualifierCode")
@XmlEnum
public enum PercentQualifierCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ItemListCost")
    ITEM_LIST_COST("ItemListCost"),
    @XmlEnumValue("ItemNetCost")
    ITEM_NET_COST("ItemNetCost"),
    @XmlEnumValue("Discount-Gross")
    DISCOUNT_GROSS("Discount-Gross"),
    @XmlEnumValue("Discount-Net")
    DISCOUNT_NET("Discount-Net"),
    @XmlEnumValue("BasePriceperUnit")
    BASE_PRICEPER_UNIT("BasePriceperUnit"),
    @XmlEnumValue("BasePriceAmount")
    BASE_PRICE_AMOUNT("BasePriceAmount"),
    @XmlEnumValue("BasePriceAmountLessPreviousDiscount")
    BASE_PRICE_AMOUNT_LESS_PREVIOUS_DISCOUNT("BasePriceAmountLessPreviousDiscount"),
    @XmlEnumValue("NetMonthlyOnAllInvoicesPastDue")
    NET_MONTHLY_ON_ALL_INVOICES_PAST_DUE("NetMonthlyOnAllInvoicesPastDue"),
    @XmlEnumValue("LatePaymentChargeBaseAmount")
    LATE_PAYMENT_CHARGE_BASE_AMOUNT("LatePaymentChargeBaseAmount"),
    @XmlEnumValue("FuelRate")
    FUEL_RATE("FuelRate");
    private final String value;

    PercentQualifierCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PercentQualifierCode fromValue(String v) {
        for (PercentQualifierCode c: PercentQualifierCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
