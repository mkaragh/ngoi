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
 * <p>Java class for ContractTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="DiagnosisRelatedGroup"/>
 *     &lt;enumeration value="PerDiem"/>
 *     &lt;enumeration value="VariablePerDiem"/>
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Capitated"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="NegotiatedGrowingEquityMortgage"/>
 *     &lt;enumeration value="AnticipatedContract"/>
 *     &lt;enumeration value="FederalHousingAuthorityAdjustableRateMortgage"/>
 *     &lt;enumeration value="FederalHousingAuthorityVeteransAffairsFixedRateMortgage"/>
 *     &lt;enumeration value="ConventionalSecondMortgages"/>
 *     &lt;enumeration value="ConventionalFixedRateMortgages"/>
 *     &lt;enumeration value="FederalHousingAuthorityVeteransAffairsGraduatedPaymentMortgage"/>
 *     &lt;enumeration value="NegotiatedConventionalGraduatedPaymentOrStepRateMortgage"/>
 *     &lt;enumeration value="ConventionalAdjustableRateMortgage"/>
 *     &lt;enumeration value="CostPlusIncentiveFee"/>
 *     &lt;enumeration value="CostSharing"/>
 *     &lt;enumeration value="CostPlus"/>
 *     &lt;enumeration value="Cost"/>
 *     &lt;enumeration value="CostPlusAwardFee"/>
 *     &lt;enumeration value="CostPlusFixedFee"/>
 *     &lt;enumeration value="Distributor"/>
 *     &lt;enumeration value="ExclusiveAgency"/>
 *     &lt;enumeration value="ExclusiveRight"/>
 *     &lt;enumeration value="FirmorActualContract"/>
 *     &lt;enumeration value="FixedPriceIncentiveFirmTargetWithPerformanceIncentive"/>
 *     &lt;enumeration value="FixedPriceIncentiveFirmTargetWithoutPerformanceIncentive"/>
 *     &lt;enumeration value="FixedPriceRedetermination"/>
 *     &lt;enumeration value="FixedPricewithEscalation"/>
 *     &lt;enumeration value="FixedPriceIncentiveSuccessiveTargetWithPerformanceIncentive"/>
 *     &lt;enumeration value="FixedPriceIncentiveSuccessiveTargetWithoutPerformanceIncentive"/>
 *     &lt;enumeration value="FixedPriceAwardFee"/>
 *     &lt;enumeration value="FixedPriceIncentive"/>
 *     &lt;enumeration value="FixedPriceLevelofEffort"/>
 *     &lt;enumeration value="NoCost"/>
 *     &lt;enumeration value="FlatAmount"/>
 *     &lt;enumeration value="RetroactiveFixedPriceRedetermination"/>
 *     &lt;enumeration value="FirmFixedPrice"/>
 *     &lt;enumeration value="FixedPricewithEconomicPriceAdjustment"/>
 *     &lt;enumeration value="Labor"/>
 *     &lt;enumeration value="LevelofEffort"/>
 *     &lt;enumeration value="LaborHours"/>
 *     &lt;enumeration value="OtherContractType"/>
 *     &lt;enumeration value="ProspectReservation"/>
 *     &lt;enumeration value="SamePercentageasFilmRentalEarned"/>
 *     &lt;enumeration value="TimeandMaterials"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractTypeCode")
@XmlEnum
public enum ContractTypeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("DiagnosisRelatedGroup")
    DIAGNOSIS_RELATED_GROUP("DiagnosisRelatedGroup"),
    @XmlEnumValue("PerDiem")
    PER_DIEM("PerDiem"),
    @XmlEnumValue("VariablePerDiem")
    VARIABLE_PER_DIEM("VariablePerDiem"),
    @XmlEnumValue("Flat")
    FLAT("Flat"),
    @XmlEnumValue("Capitated")
    CAPITATED("Capitated"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("NegotiatedGrowingEquityMortgage")
    NEGOTIATED_GROWING_EQUITY_MORTGAGE("NegotiatedGrowingEquityMortgage"),
    @XmlEnumValue("AnticipatedContract")
    ANTICIPATED_CONTRACT("AnticipatedContract"),
    @XmlEnumValue("FederalHousingAuthorityAdjustableRateMortgage")
    FEDERAL_HOUSING_AUTHORITY_ADJUSTABLE_RATE_MORTGAGE("FederalHousingAuthorityAdjustableRateMortgage"),
    @XmlEnumValue("FederalHousingAuthorityVeteransAffairsFixedRateMortgage")
    FEDERAL_HOUSING_AUTHORITY_VETERANS_AFFAIRS_FIXED_RATE_MORTGAGE("FederalHousingAuthorityVeteransAffairsFixedRateMortgage"),
    @XmlEnumValue("ConventionalSecondMortgages")
    CONVENTIONAL_SECOND_MORTGAGES("ConventionalSecondMortgages"),
    @XmlEnumValue("ConventionalFixedRateMortgages")
    CONVENTIONAL_FIXED_RATE_MORTGAGES("ConventionalFixedRateMortgages"),
    @XmlEnumValue("FederalHousingAuthorityVeteransAffairsGraduatedPaymentMortgage")
    FEDERAL_HOUSING_AUTHORITY_VETERANS_AFFAIRS_GRADUATED_PAYMENT_MORTGAGE("FederalHousingAuthorityVeteransAffairsGraduatedPaymentMortgage"),
    @XmlEnumValue("NegotiatedConventionalGraduatedPaymentOrStepRateMortgage")
    NEGOTIATED_CONVENTIONAL_GRADUATED_PAYMENT_OR_STEP_RATE_MORTGAGE("NegotiatedConventionalGraduatedPaymentOrStepRateMortgage"),
    @XmlEnumValue("ConventionalAdjustableRateMortgage")
    CONVENTIONAL_ADJUSTABLE_RATE_MORTGAGE("ConventionalAdjustableRateMortgage"),
    @XmlEnumValue("CostPlusIncentiveFee")
    COST_PLUS_INCENTIVE_FEE("CostPlusIncentiveFee"),
    @XmlEnumValue("CostSharing")
    COST_SHARING("CostSharing"),
    @XmlEnumValue("CostPlus")
    COST_PLUS("CostPlus"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("CostPlusAwardFee")
    COST_PLUS_AWARD_FEE("CostPlusAwardFee"),
    @XmlEnumValue("CostPlusFixedFee")
    COST_PLUS_FIXED_FEE("CostPlusFixedFee"),
    @XmlEnumValue("Distributor")
    DISTRIBUTOR("Distributor"),
    @XmlEnumValue("ExclusiveAgency")
    EXCLUSIVE_AGENCY("ExclusiveAgency"),
    @XmlEnumValue("ExclusiveRight")
    EXCLUSIVE_RIGHT("ExclusiveRight"),
    @XmlEnumValue("FirmorActualContract")
    FIRMOR_ACTUAL_CONTRACT("FirmorActualContract"),
    @XmlEnumValue("FixedPriceIncentiveFirmTargetWithPerformanceIncentive")
    FIXED_PRICE_INCENTIVE_FIRM_TARGET_WITH_PERFORMANCE_INCENTIVE("FixedPriceIncentiveFirmTargetWithPerformanceIncentive"),
    @XmlEnumValue("FixedPriceIncentiveFirmTargetWithoutPerformanceIncentive")
    FIXED_PRICE_INCENTIVE_FIRM_TARGET_WITHOUT_PERFORMANCE_INCENTIVE("FixedPriceIncentiveFirmTargetWithoutPerformanceIncentive"),
    @XmlEnumValue("FixedPriceRedetermination")
    FIXED_PRICE_REDETERMINATION("FixedPriceRedetermination"),
    @XmlEnumValue("FixedPricewithEscalation")
    FIXED_PRICEWITH_ESCALATION("FixedPricewithEscalation"),
    @XmlEnumValue("FixedPriceIncentiveSuccessiveTargetWithPerformanceIncentive")
    FIXED_PRICE_INCENTIVE_SUCCESSIVE_TARGET_WITH_PERFORMANCE_INCENTIVE("FixedPriceIncentiveSuccessiveTargetWithPerformanceIncentive"),
    @XmlEnumValue("FixedPriceIncentiveSuccessiveTargetWithoutPerformanceIncentive")
    FIXED_PRICE_INCENTIVE_SUCCESSIVE_TARGET_WITHOUT_PERFORMANCE_INCENTIVE("FixedPriceIncentiveSuccessiveTargetWithoutPerformanceIncentive"),
    @XmlEnumValue("FixedPriceAwardFee")
    FIXED_PRICE_AWARD_FEE("FixedPriceAwardFee"),
    @XmlEnumValue("FixedPriceIncentive")
    FIXED_PRICE_INCENTIVE("FixedPriceIncentive"),
    @XmlEnumValue("FixedPriceLevelofEffort")
    FIXED_PRICE_LEVELOF_EFFORT("FixedPriceLevelofEffort"),
    @XmlEnumValue("NoCost")
    NO_COST("NoCost"),
    @XmlEnumValue("FlatAmount")
    FLAT_AMOUNT("FlatAmount"),
    @XmlEnumValue("RetroactiveFixedPriceRedetermination")
    RETROACTIVE_FIXED_PRICE_REDETERMINATION("RetroactiveFixedPriceRedetermination"),
    @XmlEnumValue("FirmFixedPrice")
    FIRM_FIXED_PRICE("FirmFixedPrice"),
    @XmlEnumValue("FixedPricewithEconomicPriceAdjustment")
    FIXED_PRICEWITH_ECONOMIC_PRICE_ADJUSTMENT("FixedPricewithEconomicPriceAdjustment"),
    @XmlEnumValue("Labor")
    LABOR("Labor"),
    @XmlEnumValue("LevelofEffort")
    LEVELOF_EFFORT("LevelofEffort"),
    @XmlEnumValue("LaborHours")
    LABOR_HOURS("LaborHours"),
    @XmlEnumValue("OtherContractType")
    OTHER_CONTRACT_TYPE("OtherContractType"),
    @XmlEnumValue("ProspectReservation")
    PROSPECT_RESERVATION("ProspectReservation"),
    @XmlEnumValue("SamePercentageasFilmRentalEarned")
    SAME_PERCENTAGEAS_FILM_RENTAL_EARNED("SamePercentageasFilmRentalEarned"),
    @XmlEnumValue("TimeandMaterials")
    TIMEAND_MATERIALS("TimeandMaterials");
    private final String value;

    ContractTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractTypeCode fromValue(String v) {
        for (ContractTypeCode c: ContractTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
