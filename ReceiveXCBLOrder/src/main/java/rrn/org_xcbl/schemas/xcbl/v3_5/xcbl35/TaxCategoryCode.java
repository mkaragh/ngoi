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
 * <p>Java class for TaxCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Agriculture"/>
 *     &lt;enumeration value="DirectPayID"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="DisabledVeteran"/>
 *     &lt;enumeration value="DutyPaidBySupplier"/>
 *     &lt;enumeration value="ExemptForExport"/>
 *     &lt;enumeration value="ExemptForResale"/>
 *     &lt;enumeration value="ExemptfromCountyPropertyTax"/>
 *     &lt;enumeration value="ExemptfromLocalPropertyTax"/>
 *     &lt;enumeration value="ExemptfromSchoolPropertyTax"/>
 *     &lt;enumeration value="ExemptfromStatePropertyTax"/>
 *     &lt;enumeration value="ExemptFromTax"/>
 *     &lt;enumeration value="ExemptGoodsandServicesTax"/>
 *     &lt;enumeration value="ExemptLetterOnFile"/>
 *     &lt;enumeration value="ExemptLocalService"/>
 *     &lt;enumeration value="ExemptNotForResale"/>
 *     &lt;enumeration value="Exempt-PerStateLaw"/>
 *     &lt;enumeration value="ExemptProvincialSalesTax"/>
 *     &lt;enumeration value="ExemptSaleToUSGovernment"/>
 *     &lt;enumeration value="ExemptTollService"/>
 *     &lt;enumeration value="FreeExportItemTaxNotCharged"/>
 *     &lt;enumeration value="HigherRate"/>
 *     &lt;enumeration value="Homestead"/>
 *     &lt;enumeration value="LaborTaxableMaterialExempt"/>
 *     &lt;enumeration value="LowerRate"/>
 *     &lt;enumeration value="MaterialTaxableLaborExempt"/>
 *     &lt;enumeration value="MixedTaxRate"/>
 *     &lt;enumeration value="Non-Homestead"/>
 *     &lt;enumeration value="No-NotTaxExempt"/>
 *     &lt;enumeration value="NotExemptForResale"/>
 *     &lt;enumeration value="NotExemptNotForResale"/>
 *     &lt;enumeration value="NotTaxable"/>
 *     &lt;enumeration value="OpenSpace"/>
 *     &lt;enumeration value="OtherPropertyTaxExemption"/>
 *     &lt;enumeration value="Over65"/>
 *     &lt;enumeration value="RecurringExempt"/>
 *     &lt;enumeration value="ServicesOutsideScopeOfTax"/>
 *     &lt;enumeration value="StandardRate"/>
 *     &lt;enumeration value="TotallyExempt"/>
 *     &lt;enumeration value="Transferred"/>
 *     &lt;enumeration value="UsageExempt"/>
 *     &lt;enumeration value="ValueAddedTaxDueFromAPreviousInvoice"/>
 *     &lt;enumeration value="ValueAddedTaxNotNowDueForPayment"/>
 *     &lt;enumeration value="WorkingFarm"/>
 *     &lt;enumeration value="Yes-TaxExempt"/>
 *     &lt;enumeration value="ZeroRatedGoods"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxCategoryCode")
@XmlEnum
public enum TaxCategoryCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Agriculture")
    AGRICULTURE("Agriculture"),
    @XmlEnumValue("DirectPayID")
    DIRECT_PAY_ID("DirectPayID"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("DisabledVeteran")
    DISABLED_VETERAN("DisabledVeteran"),
    @XmlEnumValue("DutyPaidBySupplier")
    DUTY_PAID_BY_SUPPLIER("DutyPaidBySupplier"),
    @XmlEnumValue("ExemptForExport")
    EXEMPT_FOR_EXPORT("ExemptForExport"),
    @XmlEnumValue("ExemptForResale")
    EXEMPT_FOR_RESALE("ExemptForResale"),
    @XmlEnumValue("ExemptfromCountyPropertyTax")
    EXEMPTFROM_COUNTY_PROPERTY_TAX("ExemptfromCountyPropertyTax"),
    @XmlEnumValue("ExemptfromLocalPropertyTax")
    EXEMPTFROM_LOCAL_PROPERTY_TAX("ExemptfromLocalPropertyTax"),
    @XmlEnumValue("ExemptfromSchoolPropertyTax")
    EXEMPTFROM_SCHOOL_PROPERTY_TAX("ExemptfromSchoolPropertyTax"),
    @XmlEnumValue("ExemptfromStatePropertyTax")
    EXEMPTFROM_STATE_PROPERTY_TAX("ExemptfromStatePropertyTax"),
    @XmlEnumValue("ExemptFromTax")
    EXEMPT_FROM_TAX("ExemptFromTax"),
    @XmlEnumValue("ExemptGoodsandServicesTax")
    EXEMPT_GOODSAND_SERVICES_TAX("ExemptGoodsandServicesTax"),
    @XmlEnumValue("ExemptLetterOnFile")
    EXEMPT_LETTER_ON_FILE("ExemptLetterOnFile"),
    @XmlEnumValue("ExemptLocalService")
    EXEMPT_LOCAL_SERVICE("ExemptLocalService"),
    @XmlEnumValue("ExemptNotForResale")
    EXEMPT_NOT_FOR_RESALE("ExemptNotForResale"),
    @XmlEnumValue("Exempt-PerStateLaw")
    EXEMPT_PER_STATE_LAW("Exempt-PerStateLaw"),
    @XmlEnumValue("ExemptProvincialSalesTax")
    EXEMPT_PROVINCIAL_SALES_TAX("ExemptProvincialSalesTax"),
    @XmlEnumValue("ExemptSaleToUSGovernment")
    EXEMPT_SALE_TO_US_GOVERNMENT("ExemptSaleToUSGovernment"),
    @XmlEnumValue("ExemptTollService")
    EXEMPT_TOLL_SERVICE("ExemptTollService"),
    @XmlEnumValue("FreeExportItemTaxNotCharged")
    FREE_EXPORT_ITEM_TAX_NOT_CHARGED("FreeExportItemTaxNotCharged"),
    @XmlEnumValue("HigherRate")
    HIGHER_RATE("HigherRate"),
    @XmlEnumValue("Homestead")
    HOMESTEAD("Homestead"),
    @XmlEnumValue("LaborTaxableMaterialExempt")
    LABOR_TAXABLE_MATERIAL_EXEMPT("LaborTaxableMaterialExempt"),
    @XmlEnumValue("LowerRate")
    LOWER_RATE("LowerRate"),
    @XmlEnumValue("MaterialTaxableLaborExempt")
    MATERIAL_TAXABLE_LABOR_EXEMPT("MaterialTaxableLaborExempt"),
    @XmlEnumValue("MixedTaxRate")
    MIXED_TAX_RATE("MixedTaxRate"),
    @XmlEnumValue("Non-Homestead")
    NON_HOMESTEAD("Non-Homestead"),
    @XmlEnumValue("No-NotTaxExempt")
    NO_NOT_TAX_EXEMPT("No-NotTaxExempt"),
    @XmlEnumValue("NotExemptForResale")
    NOT_EXEMPT_FOR_RESALE("NotExemptForResale"),
    @XmlEnumValue("NotExemptNotForResale")
    NOT_EXEMPT_NOT_FOR_RESALE("NotExemptNotForResale"),
    @XmlEnumValue("NotTaxable")
    NOT_TAXABLE("NotTaxable"),
    @XmlEnumValue("OpenSpace")
    OPEN_SPACE("OpenSpace"),
    @XmlEnumValue("OtherPropertyTaxExemption")
    OTHER_PROPERTY_TAX_EXEMPTION("OtherPropertyTaxExemption"),
    @XmlEnumValue("Over65")
    OVER_65("Over65"),
    @XmlEnumValue("RecurringExempt")
    RECURRING_EXEMPT("RecurringExempt"),
    @XmlEnumValue("ServicesOutsideScopeOfTax")
    SERVICES_OUTSIDE_SCOPE_OF_TAX("ServicesOutsideScopeOfTax"),
    @XmlEnumValue("StandardRate")
    STANDARD_RATE("StandardRate"),
    @XmlEnumValue("TotallyExempt")
    TOTALLY_EXEMPT("TotallyExempt"),
    @XmlEnumValue("Transferred")
    TRANSFERRED("Transferred"),
    @XmlEnumValue("UsageExempt")
    USAGE_EXEMPT("UsageExempt"),
    @XmlEnumValue("ValueAddedTaxDueFromAPreviousInvoice")
    VALUE_ADDED_TAX_DUE_FROM_A_PREVIOUS_INVOICE("ValueAddedTaxDueFromAPreviousInvoice"),
    @XmlEnumValue("ValueAddedTaxNotNowDueForPayment")
    VALUE_ADDED_TAX_NOT_NOW_DUE_FOR_PAYMENT("ValueAddedTaxNotNowDueForPayment"),
    @XmlEnumValue("WorkingFarm")
    WORKING_FARM("WorkingFarm"),
    @XmlEnumValue("Yes-TaxExempt")
    YES_TAX_EXEMPT("Yes-TaxExempt"),
    @XmlEnumValue("ZeroRatedGoods")
    ZERO_RATED_GOODS("ZeroRatedGoods");
    private final String value;

    TaxCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxCategoryCode fromValue(String v) {
        for (TaxCategoryCode c: TaxCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
