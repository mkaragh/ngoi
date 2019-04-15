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
 * <p>Java class for PriceTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="CancellationPrice"/>
 *     &lt;enumeration value="PerTon"/>
 *     &lt;enumeration value="MinimumOrderPrice"/>
 *     &lt;enumeration value="ExportPrice"/>
 *     &lt;enumeration value="RangeDependentPrice"/>
 *     &lt;enumeration value="ActiveIngredient"/>
 *     &lt;enumeration value="AsIsQuantity"/>
 *     &lt;enumeration value="CalculationNet"/>
 *     &lt;enumeration value="CalculationGross"/>
 *     &lt;enumeration value="TaxIncludedAllowancesAndChargesNotIncluded"/>
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="AverageSellingPrice"/>
 *     &lt;enumeration value="InformationPriceTaxIncludedExcludingAllowancesOrCharges"/>
 *     &lt;enumeration value="InformationPriceExcludingAllowancesOrChargesAndTaxes"/>
 *     &lt;enumeration value="AdditiveUnitPriceComponent"/>
 *     &lt;enumeration value="AverageGenericProductPrice"/>
 *     &lt;enumeration value="AlternatePrice"/>
 *     &lt;enumeration value="AverageWholesalePrice"/>
 *     &lt;enumeration value="BaseCharge"/>
 *     &lt;enumeration value="ContractTier1"/>
 *     &lt;enumeration value="ContractTier2"/>
 *     &lt;enumeration value="ContractTier3"/>
 *     &lt;enumeration value="ContractTier4"/>
 *     &lt;enumeration value="ContractTier5"/>
 *     &lt;enumeration value="ContractTier6"/>
 *     &lt;enumeration value="ContractTier7"/>
 *     &lt;enumeration value="ContractTier8"/>
 *     &lt;enumeration value="ContractTier9"/>
 *     &lt;enumeration value="ContractTier10"/>
 *     &lt;enumeration value="ContractTier11"/>
 *     &lt;enumeration value="ContractTier12"/>
 *     &lt;enumeration value="ContractTier13"/>
 *     &lt;enumeration value="ContractTier14"/>
 *     &lt;enumeration value="ContractTier15"/>
 *     &lt;enumeration value="ContractTier16"/>
 *     &lt;enumeration value="ContractTier17"/>
 *     &lt;enumeration value="ContractTier18"/>
 *     &lt;enumeration value="ContractTier19"/>
 *     &lt;enumeration value="ContractTier20"/>
 *     &lt;enumeration value="ContractTier21"/>
 *     &lt;enumeration value="ContractTier22"/>
 *     &lt;enumeration value="ContractTier23"/>
 *     &lt;enumeration value="ContractTier24"/>
 *     &lt;enumeration value="ContractTier25"/>
 *     &lt;enumeration value="ContractTier26"/>
 *     &lt;enumeration value="ContractTier27"/>
 *     &lt;enumeration value="ContractTier28"/>
 *     &lt;enumeration value="ContractTier29"/>
 *     &lt;enumeration value="ContractTier30"/>
 *     &lt;enumeration value="CalculationPrice"/>
 *     &lt;enumeration value="CatalogPrice"/>
 *     &lt;enumeration value="CentralDistributionFacility"/>
 *     &lt;enumeration value="CurrentDomesticValue"/>
 *     &lt;enumeration value="ChangedPrice"/>
 *     &lt;enumeration value="ContractPrice"/>
 *     &lt;enumeration value="ConsumerUnit"/>
 *     &lt;enumeration value="ConfirmedUnitPrice"/>
 *     &lt;enumeration value="DeclaredCustomsUnitValue"/>
 *     &lt;enumeration value="DealerAdjustedPrice"/>
 *     &lt;enumeration value="DistributorsPrice"/>
 *     &lt;enumeration value="DiscountPrice"/>
 *     &lt;enumeration value="DiscountAmountAllowed"/>
 *     &lt;enumeration value="DirectStoreDelivery"/>
 *     &lt;enumeration value="DirectShipProgramPrice"/>
 *     &lt;enumeration value="EcscPrice"/>
 *     &lt;enumeration value="EmergencyDirectShipPriceOriginalEquipmentManufacturer"/>
 *     &lt;enumeration value="EmergencyDirectShipPrice"/>
 *     &lt;enumeration value="EmergencyDirectShipPriceSupplier"/>
 *     &lt;enumeration value="EmergencyDirectShipPriceWarehouse"/>
 *     &lt;enumeration value="EstimatedPrice"/>
 *     &lt;enumeration value="ExpectedUnitPrice"/>
 *     &lt;enumeration value="FlatCharge"/>
 *     &lt;enumeration value="FrequentDeliveryService"/>
 *     &lt;enumeration value="FederalExciseTax"/>
 *     &lt;enumeration value="FreeGoodsPrice"/>
 *     &lt;enumeration value="FederalUpperLimitPriceMaximumAllowableCostPricingForDrugs"/>
 *     &lt;enumeration value="FirmPriceDoNotAdvise"/>
 *     &lt;enumeration value="GovernmentPrice"/>
 *     &lt;enumeration value="UnitPriceThroughQuantity"/>
 *     &lt;enumeration value="IndustrialPrice"/>
 *     &lt;enumeration value="InformationPrice"/>
 *     &lt;enumeration value="InstitutionalPrice"/>
 *     &lt;enumeration value="InvoiceBillingPrice"/>
 *     &lt;enumeration value="ListPrice"/>
 *     &lt;enumeration value="MandatoryToAdviseUnitPrice"/>
 *     &lt;enumeration value="MinimumActivitySurcharge"/>
 *     &lt;enumeration value="MaximumOrderQuantityPrice"/>
 *     &lt;enumeration value="MinimumOrderQuantityPrice"/>
 *     &lt;enumeration value="MinimumCharge"/>
 *     &lt;enumeration value="MinimumReleaseQuantityPrice"/>
 *     &lt;enumeration value="MaximumPriceReduction"/>
 *     &lt;enumeration value="ManufacturersSuggestedRetail"/>
 *     &lt;enumeration value="MaximumReleaseQuantityPrice"/>
 *     &lt;enumeration value="NoncontractTier1"/>
 *     &lt;enumeration value="NoncontractTier2"/>
 *     &lt;enumeration value="NoncontractTier3"/>
 *     &lt;enumeration value="NoncontractTier4"/>
 *     &lt;enumeration value="NoncontractTier5"/>
 *     &lt;enumeration value="NoncontractTier6"/>
 *     &lt;enumeration value="NoncontractTier7"/>
 *     &lt;enumeration value="NoncontractTier8"/>
 *     &lt;enumeration value="NoncontractTier9"/>
 *     &lt;enumeration value="NoncontractTier10"/>
 *     &lt;enumeration value="NoncontractTier11"/>
 *     &lt;enumeration value="NoncontractTier12"/>
 *     &lt;enumeration value="NoncontractTier13"/>
 *     &lt;enumeration value="NoncontractTier14"/>
 *     &lt;enumeration value="NoncontractTier15"/>
 *     &lt;enumeration value="NoncontractTier16"/>
 *     &lt;enumeration value="NoncontractTier17"/>
 *     &lt;enumeration value="NoncontractTier18"/>
 *     &lt;enumeration value="NoncontractTier19"/>
 *     &lt;enumeration value="NoncontractTier20"/>
 *     &lt;enumeration value="NoncontractTier21"/>
 *     &lt;enumeration value="NoncontractTier22"/>
 *     &lt;enumeration value="NoncontractTier23"/>
 *     &lt;enumeration value="NoncontractTier24"/>
 *     &lt;enumeration value="NoncontractTier25"/>
 *     &lt;enumeration value="NoncontractTier26"/>
 *     &lt;enumeration value="NoncontractTier27"/>
 *     &lt;enumeration value="NoncontractTier28"/>
 *     &lt;enumeration value="NoncontractTier29"/>
 *     &lt;enumeration value="NoncontractTier30"/>
 *     &lt;enumeration value="NetItemPrice"/>
 *     &lt;enumeration value="NetWeight"/>
 *     &lt;enumeration value="OptionalToAdviseUnitPrice"/>
 *     &lt;enumeration value="OriginalPurchaseOrderPrice"/>
 *     &lt;enumeration value="PriceBreakQuantity"/>
 *     &lt;enumeration value="UnitPriceBeginningQuantity"/>
 *     &lt;enumeration value="PriceBreakPurchaseOrderCount"/>
 *     &lt;enumeration value="PriceCatalogue"/>
 *     &lt;enumeration value="PerEach"/>
 *     &lt;enumeration value="PriceInEffectAtTimeOfShipment"/>
 *     &lt;enumeration value="PerKilogram"/>
 *     &lt;enumeration value="PerLiter"/>
 *     &lt;enumeration value="PrepaidFreightCharges"/>
 *     &lt;enumeration value="ProfessionalPrice"/>
 *     &lt;enumeration value="ProducersPrice"/>
 *     &lt;enumeration value="PromotionalPrice"/>
 *     &lt;enumeration value="PerTonne"/>
 *     &lt;enumeration value="SpecifiedUnit"/>
 *     &lt;enumeration value="ProvisionalPrice"/>
 *     &lt;enumeration value="GrossWeight"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="QuotePrice"/>
 *     &lt;enumeration value="Resale"/>
 *     &lt;enumeration value="Retail"/>
 *     &lt;enumeration value="SuggestedDealerNetPrice"/>
 *     &lt;enumeration value="SuggestedFleetPrice"/>
 *     &lt;enumeration value="ShipAndDebit"/>
 *     &lt;enumeration value="SuggestedListPrice"/>
 *     &lt;enumeration value="SpecialPrice"/>
 *     &lt;enumeration value="SinglePriceFactorsEqualized"/>
 *     &lt;enumeration value="SuggestedRetail"/>
 *     &lt;enumeration value="StandardPrice"/>
 *     &lt;enumeration value="SumOfLineItems"/>
 *     &lt;enumeration value="SuggestedWholesalePrice"/>
 *     &lt;enumeration value="ToBeNegotiated"/>
 *     &lt;enumeration value="ThresholdPrice"/>
 *     &lt;enumeration value="TotalInvoiceAmountDue"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="TradedUnit"/>
 *     &lt;enumeration value="TheoreticalWeight"/>
 *     &lt;enumeration value="UnitCostPrice"/>
 *     &lt;enumeration value="Wholesale"/>
 *     &lt;enumeration value="ZonePrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceTypeCode")
@XmlEnum
public enum PriceTypeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("CancellationPrice")
    CANCELLATION_PRICE("CancellationPrice"),
    @XmlEnumValue("PerTon")
    PER_TON("PerTon"),
    @XmlEnumValue("MinimumOrderPrice")
    MINIMUM_ORDER_PRICE("MinimumOrderPrice"),
    @XmlEnumValue("ExportPrice")
    EXPORT_PRICE("ExportPrice"),
    @XmlEnumValue("RangeDependentPrice")
    RANGE_DEPENDENT_PRICE("RangeDependentPrice"),
    @XmlEnumValue("ActiveIngredient")
    ACTIVE_INGREDIENT("ActiveIngredient"),
    @XmlEnumValue("AsIsQuantity")
    AS_IS_QUANTITY("AsIsQuantity"),
    @XmlEnumValue("CalculationNet")
    CALCULATION_NET("CalculationNet"),
    @XmlEnumValue("CalculationGross")
    CALCULATION_GROSS("CalculationGross"),
    @XmlEnumValue("TaxIncludedAllowancesAndChargesNotIncluded")
    TAX_INCLUDED_ALLOWANCES_AND_CHARGES_NOT_INCLUDED("TaxIncludedAllowancesAndChargesNotIncluded"),
    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("AverageSellingPrice")
    AVERAGE_SELLING_PRICE("AverageSellingPrice"),
    @XmlEnumValue("InformationPriceTaxIncludedExcludingAllowancesOrCharges")
    INFORMATION_PRICE_TAX_INCLUDED_EXCLUDING_ALLOWANCES_OR_CHARGES("InformationPriceTaxIncludedExcludingAllowancesOrCharges"),
    @XmlEnumValue("InformationPriceExcludingAllowancesOrChargesAndTaxes")
    INFORMATION_PRICE_EXCLUDING_ALLOWANCES_OR_CHARGES_AND_TAXES("InformationPriceExcludingAllowancesOrChargesAndTaxes"),
    @XmlEnumValue("AdditiveUnitPriceComponent")
    ADDITIVE_UNIT_PRICE_COMPONENT("AdditiveUnitPriceComponent"),
    @XmlEnumValue("AverageGenericProductPrice")
    AVERAGE_GENERIC_PRODUCT_PRICE("AverageGenericProductPrice"),
    @XmlEnumValue("AlternatePrice")
    ALTERNATE_PRICE("AlternatePrice"),
    @XmlEnumValue("AverageWholesalePrice")
    AVERAGE_WHOLESALE_PRICE("AverageWholesalePrice"),
    @XmlEnumValue("BaseCharge")
    BASE_CHARGE("BaseCharge"),
    @XmlEnumValue("ContractTier1")
    CONTRACT_TIER_1("ContractTier1"),
    @XmlEnumValue("ContractTier2")
    CONTRACT_TIER_2("ContractTier2"),
    @XmlEnumValue("ContractTier3")
    CONTRACT_TIER_3("ContractTier3"),
    @XmlEnumValue("ContractTier4")
    CONTRACT_TIER_4("ContractTier4"),
    @XmlEnumValue("ContractTier5")
    CONTRACT_TIER_5("ContractTier5"),
    @XmlEnumValue("ContractTier6")
    CONTRACT_TIER_6("ContractTier6"),
    @XmlEnumValue("ContractTier7")
    CONTRACT_TIER_7("ContractTier7"),
    @XmlEnumValue("ContractTier8")
    CONTRACT_TIER_8("ContractTier8"),
    @XmlEnumValue("ContractTier9")
    CONTRACT_TIER_9("ContractTier9"),
    @XmlEnumValue("ContractTier10")
    CONTRACT_TIER_10("ContractTier10"),
    @XmlEnumValue("ContractTier11")
    CONTRACT_TIER_11("ContractTier11"),
    @XmlEnumValue("ContractTier12")
    CONTRACT_TIER_12("ContractTier12"),
    @XmlEnumValue("ContractTier13")
    CONTRACT_TIER_13("ContractTier13"),
    @XmlEnumValue("ContractTier14")
    CONTRACT_TIER_14("ContractTier14"),
    @XmlEnumValue("ContractTier15")
    CONTRACT_TIER_15("ContractTier15"),
    @XmlEnumValue("ContractTier16")
    CONTRACT_TIER_16("ContractTier16"),
    @XmlEnumValue("ContractTier17")
    CONTRACT_TIER_17("ContractTier17"),
    @XmlEnumValue("ContractTier18")
    CONTRACT_TIER_18("ContractTier18"),
    @XmlEnumValue("ContractTier19")
    CONTRACT_TIER_19("ContractTier19"),
    @XmlEnumValue("ContractTier20")
    CONTRACT_TIER_20("ContractTier20"),
    @XmlEnumValue("ContractTier21")
    CONTRACT_TIER_21("ContractTier21"),
    @XmlEnumValue("ContractTier22")
    CONTRACT_TIER_22("ContractTier22"),
    @XmlEnumValue("ContractTier23")
    CONTRACT_TIER_23("ContractTier23"),
    @XmlEnumValue("ContractTier24")
    CONTRACT_TIER_24("ContractTier24"),
    @XmlEnumValue("ContractTier25")
    CONTRACT_TIER_25("ContractTier25"),
    @XmlEnumValue("ContractTier26")
    CONTRACT_TIER_26("ContractTier26"),
    @XmlEnumValue("ContractTier27")
    CONTRACT_TIER_27("ContractTier27"),
    @XmlEnumValue("ContractTier28")
    CONTRACT_TIER_28("ContractTier28"),
    @XmlEnumValue("ContractTier29")
    CONTRACT_TIER_29("ContractTier29"),
    @XmlEnumValue("ContractTier30")
    CONTRACT_TIER_30("ContractTier30"),
    @XmlEnumValue("CalculationPrice")
    CALCULATION_PRICE("CalculationPrice"),
    @XmlEnumValue("CatalogPrice")
    CATALOG_PRICE("CatalogPrice"),
    @XmlEnumValue("CentralDistributionFacility")
    CENTRAL_DISTRIBUTION_FACILITY("CentralDistributionFacility"),
    @XmlEnumValue("CurrentDomesticValue")
    CURRENT_DOMESTIC_VALUE("CurrentDomesticValue"),
    @XmlEnumValue("ChangedPrice")
    CHANGED_PRICE("ChangedPrice"),
    @XmlEnumValue("ContractPrice")
    CONTRACT_PRICE("ContractPrice"),
    @XmlEnumValue("ConsumerUnit")
    CONSUMER_UNIT("ConsumerUnit"),
    @XmlEnumValue("ConfirmedUnitPrice")
    CONFIRMED_UNIT_PRICE("ConfirmedUnitPrice"),
    @XmlEnumValue("DeclaredCustomsUnitValue")
    DECLARED_CUSTOMS_UNIT_VALUE("DeclaredCustomsUnitValue"),
    @XmlEnumValue("DealerAdjustedPrice")
    DEALER_ADJUSTED_PRICE("DealerAdjustedPrice"),
    @XmlEnumValue("DistributorsPrice")
    DISTRIBUTORS_PRICE("DistributorsPrice"),
    @XmlEnumValue("DiscountPrice")
    DISCOUNT_PRICE("DiscountPrice"),
    @XmlEnumValue("DiscountAmountAllowed")
    DISCOUNT_AMOUNT_ALLOWED("DiscountAmountAllowed"),
    @XmlEnumValue("DirectStoreDelivery")
    DIRECT_STORE_DELIVERY("DirectStoreDelivery"),
    @XmlEnumValue("DirectShipProgramPrice")
    DIRECT_SHIP_PROGRAM_PRICE("DirectShipProgramPrice"),
    @XmlEnumValue("EcscPrice")
    ECSC_PRICE("EcscPrice"),
    @XmlEnumValue("EmergencyDirectShipPriceOriginalEquipmentManufacturer")
    EMERGENCY_DIRECT_SHIP_PRICE_ORIGINAL_EQUIPMENT_MANUFACTURER("EmergencyDirectShipPriceOriginalEquipmentManufacturer"),
    @XmlEnumValue("EmergencyDirectShipPrice")
    EMERGENCY_DIRECT_SHIP_PRICE("EmergencyDirectShipPrice"),
    @XmlEnumValue("EmergencyDirectShipPriceSupplier")
    EMERGENCY_DIRECT_SHIP_PRICE_SUPPLIER("EmergencyDirectShipPriceSupplier"),
    @XmlEnumValue("EmergencyDirectShipPriceWarehouse")
    EMERGENCY_DIRECT_SHIP_PRICE_WAREHOUSE("EmergencyDirectShipPriceWarehouse"),
    @XmlEnumValue("EstimatedPrice")
    ESTIMATED_PRICE("EstimatedPrice"),
    @XmlEnumValue("ExpectedUnitPrice")
    EXPECTED_UNIT_PRICE("ExpectedUnitPrice"),
    @XmlEnumValue("FlatCharge")
    FLAT_CHARGE("FlatCharge"),
    @XmlEnumValue("FrequentDeliveryService")
    FREQUENT_DELIVERY_SERVICE("FrequentDeliveryService"),
    @XmlEnumValue("FederalExciseTax")
    FEDERAL_EXCISE_TAX("FederalExciseTax"),
    @XmlEnumValue("FreeGoodsPrice")
    FREE_GOODS_PRICE("FreeGoodsPrice"),
    @XmlEnumValue("FederalUpperLimitPriceMaximumAllowableCostPricingForDrugs")
    FEDERAL_UPPER_LIMIT_PRICE_MAXIMUM_ALLOWABLE_COST_PRICING_FOR_DRUGS("FederalUpperLimitPriceMaximumAllowableCostPricingForDrugs"),
    @XmlEnumValue("FirmPriceDoNotAdvise")
    FIRM_PRICE_DO_NOT_ADVISE("FirmPriceDoNotAdvise"),
    @XmlEnumValue("GovernmentPrice")
    GOVERNMENT_PRICE("GovernmentPrice"),
    @XmlEnumValue("UnitPriceThroughQuantity")
    UNIT_PRICE_THROUGH_QUANTITY("UnitPriceThroughQuantity"),
    @XmlEnumValue("IndustrialPrice")
    INDUSTRIAL_PRICE("IndustrialPrice"),
    @XmlEnumValue("InformationPrice")
    INFORMATION_PRICE("InformationPrice"),
    @XmlEnumValue("InstitutionalPrice")
    INSTITUTIONAL_PRICE("InstitutionalPrice"),
    @XmlEnumValue("InvoiceBillingPrice")
    INVOICE_BILLING_PRICE("InvoiceBillingPrice"),
    @XmlEnumValue("ListPrice")
    LIST_PRICE("ListPrice"),
    @XmlEnumValue("MandatoryToAdviseUnitPrice")
    MANDATORY_TO_ADVISE_UNIT_PRICE("MandatoryToAdviseUnitPrice"),
    @XmlEnumValue("MinimumActivitySurcharge")
    MINIMUM_ACTIVITY_SURCHARGE("MinimumActivitySurcharge"),
    @XmlEnumValue("MaximumOrderQuantityPrice")
    MAXIMUM_ORDER_QUANTITY_PRICE("MaximumOrderQuantityPrice"),
    @XmlEnumValue("MinimumOrderQuantityPrice")
    MINIMUM_ORDER_QUANTITY_PRICE("MinimumOrderQuantityPrice"),
    @XmlEnumValue("MinimumCharge")
    MINIMUM_CHARGE("MinimumCharge"),
    @XmlEnumValue("MinimumReleaseQuantityPrice")
    MINIMUM_RELEASE_QUANTITY_PRICE("MinimumReleaseQuantityPrice"),
    @XmlEnumValue("MaximumPriceReduction")
    MAXIMUM_PRICE_REDUCTION("MaximumPriceReduction"),
    @XmlEnumValue("ManufacturersSuggestedRetail")
    MANUFACTURERS_SUGGESTED_RETAIL("ManufacturersSuggestedRetail"),
    @XmlEnumValue("MaximumReleaseQuantityPrice")
    MAXIMUM_RELEASE_QUANTITY_PRICE("MaximumReleaseQuantityPrice"),
    @XmlEnumValue("NoncontractTier1")
    NONCONTRACT_TIER_1("NoncontractTier1"),
    @XmlEnumValue("NoncontractTier2")
    NONCONTRACT_TIER_2("NoncontractTier2"),
    @XmlEnumValue("NoncontractTier3")
    NONCONTRACT_TIER_3("NoncontractTier3"),
    @XmlEnumValue("NoncontractTier4")
    NONCONTRACT_TIER_4("NoncontractTier4"),
    @XmlEnumValue("NoncontractTier5")
    NONCONTRACT_TIER_5("NoncontractTier5"),
    @XmlEnumValue("NoncontractTier6")
    NONCONTRACT_TIER_6("NoncontractTier6"),
    @XmlEnumValue("NoncontractTier7")
    NONCONTRACT_TIER_7("NoncontractTier7"),
    @XmlEnumValue("NoncontractTier8")
    NONCONTRACT_TIER_8("NoncontractTier8"),
    @XmlEnumValue("NoncontractTier9")
    NONCONTRACT_TIER_9("NoncontractTier9"),
    @XmlEnumValue("NoncontractTier10")
    NONCONTRACT_TIER_10("NoncontractTier10"),
    @XmlEnumValue("NoncontractTier11")
    NONCONTRACT_TIER_11("NoncontractTier11"),
    @XmlEnumValue("NoncontractTier12")
    NONCONTRACT_TIER_12("NoncontractTier12"),
    @XmlEnumValue("NoncontractTier13")
    NONCONTRACT_TIER_13("NoncontractTier13"),
    @XmlEnumValue("NoncontractTier14")
    NONCONTRACT_TIER_14("NoncontractTier14"),
    @XmlEnumValue("NoncontractTier15")
    NONCONTRACT_TIER_15("NoncontractTier15"),
    @XmlEnumValue("NoncontractTier16")
    NONCONTRACT_TIER_16("NoncontractTier16"),
    @XmlEnumValue("NoncontractTier17")
    NONCONTRACT_TIER_17("NoncontractTier17"),
    @XmlEnumValue("NoncontractTier18")
    NONCONTRACT_TIER_18("NoncontractTier18"),
    @XmlEnumValue("NoncontractTier19")
    NONCONTRACT_TIER_19("NoncontractTier19"),
    @XmlEnumValue("NoncontractTier20")
    NONCONTRACT_TIER_20("NoncontractTier20"),
    @XmlEnumValue("NoncontractTier21")
    NONCONTRACT_TIER_21("NoncontractTier21"),
    @XmlEnumValue("NoncontractTier22")
    NONCONTRACT_TIER_22("NoncontractTier22"),
    @XmlEnumValue("NoncontractTier23")
    NONCONTRACT_TIER_23("NoncontractTier23"),
    @XmlEnumValue("NoncontractTier24")
    NONCONTRACT_TIER_24("NoncontractTier24"),
    @XmlEnumValue("NoncontractTier25")
    NONCONTRACT_TIER_25("NoncontractTier25"),
    @XmlEnumValue("NoncontractTier26")
    NONCONTRACT_TIER_26("NoncontractTier26"),
    @XmlEnumValue("NoncontractTier27")
    NONCONTRACT_TIER_27("NoncontractTier27"),
    @XmlEnumValue("NoncontractTier28")
    NONCONTRACT_TIER_28("NoncontractTier28"),
    @XmlEnumValue("NoncontractTier29")
    NONCONTRACT_TIER_29("NoncontractTier29"),
    @XmlEnumValue("NoncontractTier30")
    NONCONTRACT_TIER_30("NoncontractTier30"),
    @XmlEnumValue("NetItemPrice")
    NET_ITEM_PRICE("NetItemPrice"),
    @XmlEnumValue("NetWeight")
    NET_WEIGHT("NetWeight"),
    @XmlEnumValue("OptionalToAdviseUnitPrice")
    OPTIONAL_TO_ADVISE_UNIT_PRICE("OptionalToAdviseUnitPrice"),
    @XmlEnumValue("OriginalPurchaseOrderPrice")
    ORIGINAL_PURCHASE_ORDER_PRICE("OriginalPurchaseOrderPrice"),
    @XmlEnumValue("PriceBreakQuantity")
    PRICE_BREAK_QUANTITY("PriceBreakQuantity"),
    @XmlEnumValue("UnitPriceBeginningQuantity")
    UNIT_PRICE_BEGINNING_QUANTITY("UnitPriceBeginningQuantity"),
    @XmlEnumValue("PriceBreakPurchaseOrderCount")
    PRICE_BREAK_PURCHASE_ORDER_COUNT("PriceBreakPurchaseOrderCount"),
    @XmlEnumValue("PriceCatalogue")
    PRICE_CATALOGUE("PriceCatalogue"),
    @XmlEnumValue("PerEach")
    PER_EACH("PerEach"),
    @XmlEnumValue("PriceInEffectAtTimeOfShipment")
    PRICE_IN_EFFECT_AT_TIME_OF_SHIPMENT("PriceInEffectAtTimeOfShipment"),
    @XmlEnumValue("PerKilogram")
    PER_KILOGRAM("PerKilogram"),
    @XmlEnumValue("PerLiter")
    PER_LITER("PerLiter"),
    @XmlEnumValue("PrepaidFreightCharges")
    PREPAID_FREIGHT_CHARGES("PrepaidFreightCharges"),
    @XmlEnumValue("ProfessionalPrice")
    PROFESSIONAL_PRICE("ProfessionalPrice"),
    @XmlEnumValue("ProducersPrice")
    PRODUCERS_PRICE("ProducersPrice"),
    @XmlEnumValue("PromotionalPrice")
    PROMOTIONAL_PRICE("PromotionalPrice"),
    @XmlEnumValue("PerTonne")
    PER_TONNE("PerTonne"),
    @XmlEnumValue("SpecifiedUnit")
    SPECIFIED_UNIT("SpecifiedUnit"),
    @XmlEnumValue("ProvisionalPrice")
    PROVISIONAL_PRICE("ProvisionalPrice"),
    @XmlEnumValue("GrossWeight")
    GROSS_WEIGHT("GrossWeight"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("QuotePrice")
    QUOTE_PRICE("QuotePrice"),
    @XmlEnumValue("Resale")
    RESALE("Resale"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    @XmlEnumValue("SuggestedDealerNetPrice")
    SUGGESTED_DEALER_NET_PRICE("SuggestedDealerNetPrice"),
    @XmlEnumValue("SuggestedFleetPrice")
    SUGGESTED_FLEET_PRICE("SuggestedFleetPrice"),
    @XmlEnumValue("ShipAndDebit")
    SHIP_AND_DEBIT("ShipAndDebit"),
    @XmlEnumValue("SuggestedListPrice")
    SUGGESTED_LIST_PRICE("SuggestedListPrice"),
    @XmlEnumValue("SpecialPrice")
    SPECIAL_PRICE("SpecialPrice"),
    @XmlEnumValue("SinglePriceFactorsEqualized")
    SINGLE_PRICE_FACTORS_EQUALIZED("SinglePriceFactorsEqualized"),
    @XmlEnumValue("SuggestedRetail")
    SUGGESTED_RETAIL("SuggestedRetail"),
    @XmlEnumValue("StandardPrice")
    STANDARD_PRICE("StandardPrice"),
    @XmlEnumValue("SumOfLineItems")
    SUM_OF_LINE_ITEMS("SumOfLineItems"),
    @XmlEnumValue("SuggestedWholesalePrice")
    SUGGESTED_WHOLESALE_PRICE("SuggestedWholesalePrice"),
    @XmlEnumValue("ToBeNegotiated")
    TO_BE_NEGOTIATED("ToBeNegotiated"),
    @XmlEnumValue("ThresholdPrice")
    THRESHOLD_PRICE("ThresholdPrice"),
    @XmlEnumValue("TotalInvoiceAmountDue")
    TOTAL_INVOICE_AMOUNT_DUE("TotalInvoiceAmountDue"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("TradedUnit")
    TRADED_UNIT("TradedUnit"),
    @XmlEnumValue("TheoreticalWeight")
    THEORETICAL_WEIGHT("TheoreticalWeight"),
    @XmlEnumValue("UnitCostPrice")
    UNIT_COST_PRICE("UnitCostPrice"),
    @XmlEnumValue("Wholesale")
    WHOLESALE("Wholesale"),
    @XmlEnumValue("ZonePrice")
    ZONE_PRICE("ZonePrice");
    private final String value;

    PriceTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceTypeCode fromValue(String v) {
        for (PriceTypeCode c: PriceTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
