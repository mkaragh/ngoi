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
 * <p>Java class for AddressTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="AcceptanceLocation"/>
 *     &lt;enumeration value="AccountsPayableOffice"/>
 *     &lt;enumeration value="AcknowledgementRecipient"/>
 *     &lt;enumeration value="AdditionalAddress"/>
 *     &lt;enumeration value="AdditionalDeliveryAddress"/>
 *     &lt;enumeration value="AdditionalPickUpAddress"/>
 *     &lt;enumeration value="AlcoholBeverageDepartment"/>
 *     &lt;enumeration value="AlternateReturnAddress"/>
 *     &lt;enumeration value="AlternativeAddressee"/>
 *     &lt;enumeration value="AuditOffice"/>
 *     &lt;enumeration value="BailmentWarehouse"/>
 *     &lt;enumeration value="BidOpeningLocation"/>
 *     &lt;enumeration value="BillAndShipTo"/>
 *     &lt;enumeration value="BilledFrom"/>
 *     &lt;enumeration value="BillOfLadingRecipient"/>
 *     &lt;enumeration value="BillTo"/>
 *     &lt;enumeration value="BookingOffice"/>
 *     &lt;enumeration value="CandyAndConfectionsDepartment"/>
 *     &lt;enumeration value="ChangedAddress"/>
 *     &lt;enumeration value="CompanyAssignedWell"/>
 *     &lt;enumeration value="Company-OwnedOilField"/>
 *     &lt;enumeration value="ConsigneeCourierTransferStation"/>
 *     &lt;enumeration value="ConsignorCourierTransferStation"/>
 *     &lt;enumeration value="ConsultantsOffice"/>
 *     &lt;enumeration value="ContactOffice"/>
 *     &lt;enumeration value="ContainerLocation"/>
 *     &lt;enumeration value="CopyMessageTo"/>
 *     &lt;enumeration value="CorporateOffice"/>
 *     &lt;enumeration value="CorrectedAddress"/>
 *     &lt;enumeration value="DeliveryAddress"/>
 *     &lt;enumeration value="DestinationMailFacility"/>
 *     &lt;enumeration value="DifferentPremiseAddress"/>
 *     &lt;enumeration value="DistributionRecipient"/>
 *     &lt;enumeration value="DocumentOrMessageIssuerOrSender"/>
 *     &lt;enumeration value="DocumentRecipient"/>
 *     &lt;enumeration value="DomesticFinancialInstitution"/>
 *     &lt;enumeration value="DownstreamMeterLocation"/>
 *     &lt;enumeration value="Drop-OffLocation"/>
 *     &lt;enumeration value="EmergencyDepartment"/>
 *     &lt;enumeration value="EstablishedLocation"/>
 *     &lt;enumeration value="EventLocation"/>
 *     &lt;enumeration value="FilingAddress"/>
 *     &lt;enumeration value="FilingLocation"/>
 *     &lt;enumeration value="FilingOffice"/>
 *     &lt;enumeration value="FinalMessageRecipient"/>
 *     &lt;enumeration value="FinalRecipient"/>
 *     &lt;enumeration value="FinalScheduledDestination"/>
 *     &lt;enumeration value="FinancialInstitution"/>
 *     &lt;enumeration value="FirstContact"/>
 *     &lt;enumeration value="FloralDepartment"/>
 *     &lt;enumeration value="ForeignDisclosureInformationOffice"/>
 *     &lt;enumeration value="ForeignOffice"/>
 *     &lt;enumeration value="ForeignRegistrationLocation"/>
 *     &lt;enumeration value="FormerAddress"/>
 *     &lt;enumeration value="FreeonBoardPoint"/>
 *     &lt;enumeration value="FrozenDepartment"/>
 *     &lt;enumeration value="GaragedLocation"/>
 *     &lt;enumeration value="GasPlant"/>
 *     &lt;enumeration value="GasTransactionEndingPoint"/>
 *     &lt;enumeration value="GasTransactionPoint1"/>
 *     &lt;enumeration value="GasTransactionPoint2"/>
 *     &lt;enumeration value="GasTransactionStartingPoint"/>
 *     &lt;enumeration value="HazardousMaterialOffice"/>
 *     &lt;enumeration value="HeadOffice"/>
 *     &lt;enumeration value="HomeOffice"/>
 *     &lt;enumeration value="ImportedFromLocation"/>
 *     &lt;enumeration value="IncorporatedLocation"/>
 *     &lt;enumeration value="IncorporationStatePlaceOfBusiness"/>
 *     &lt;enumeration value="IncorporationStatePrincipalOffice"/>
 *     &lt;enumeration value="InquiryAddress"/>
 *     &lt;enumeration value="InspectionAddress"/>
 *     &lt;enumeration value="InspectionAndAcceptanceLocation"/>
 *     &lt;enumeration value="InspectionLocation"/>
 *     &lt;enumeration value="InstalledAt"/>
 *     &lt;enumeration value="In-StoreBakeryDepartment"/>
 *     &lt;enumeration value="InsuredLocation"/>
 *     &lt;enumeration value="Laboratory"/>
 *     &lt;enumeration value="LastBreakTerminal"/>
 *     &lt;enumeration value="LeaseLocation"/>
 *     &lt;enumeration value="ListingOffice"/>
 *     &lt;enumeration value="LocalChain"/>
 *     &lt;enumeration value="LocationOfGoods"/>
 *     &lt;enumeration value="LocationOfGoodsForCustomsExaminationBeforeClearance"/>
 *     &lt;enumeration value="LocationOfLoadExchange"/>
 *     &lt;enumeration value="LocationOfSpotForStorage"/>
 *     &lt;enumeration value="Lot"/>
 *     &lt;enumeration value="MailAddress"/>
 *     &lt;enumeration value="MailTo"/>
 *     &lt;enumeration value="ManufacturingPlant"/>
 *     &lt;enumeration value="MasterProperty"/>
 *     &lt;enumeration value="MaterialChangeNoticeAddress"/>
 *     &lt;enumeration value="MaterialDispositionAuthorizationLocation"/>
 *     &lt;enumeration value="MeatDepartment"/>
 *     &lt;enumeration value="MeetingLocation"/>
 *     &lt;enumeration value="MessageFrom"/>
 *     &lt;enumeration value="MessageRecipient"/>
 *     &lt;enumeration value="MessageTo"/>
 *     &lt;enumeration value="Neighborhood"/>
 *     &lt;enumeration value="NewAddress"/>
 *     &lt;enumeration value="NewSupplySource"/>
 *     &lt;enumeration value="NextDestination"/>
 *     &lt;enumeration value="NextScheduledDestination"/>
 *     &lt;enumeration value="Non-TemporaryStorageFacility"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="OperatorOfTheTransferPoint"/>
 *     &lt;enumeration value="OriginalLocation"/>
 *     &lt;enumeration value="OriginMailFacility"/>
 *     &lt;enumeration value="OriginSublocation"/>
 *     &lt;enumeration value="OriginTerminal"/>
 *     &lt;enumeration value="OtherDepartments"/>
 *     &lt;enumeration value="OuterContinentalShelfAreaLocation"/>
 *     &lt;enumeration value="Out-Of-StatePrincipalOffice"/>
 *     &lt;enumeration value="OwningInventoryControlPoint"/>
 *     &lt;enumeration value="PartSource"/>
 *     &lt;enumeration value="PaymentAddress"/>
 *     &lt;enumeration value="PersonnelOffice"/>
 *     &lt;enumeration value="PharmacyDepartment"/>
 *     &lt;enumeration value="PhysicalAddress"/>
 *     &lt;enumeration value="PickUpAddress"/>
 *     &lt;enumeration value="Pipeline"/>
 *     &lt;enumeration value="PipelineSegment"/>
 *     &lt;enumeration value="PipelineSegmentBoundary"/>
 *     &lt;enumeration value="PlaceOfBottling"/>
 *     &lt;enumeration value="PlaceOfBusiness"/>
 *     &lt;enumeration value="PostalMailingAddress"/>
 *     &lt;enumeration value="PreliminaryInspectionLocation"/>
 *     &lt;enumeration value="Premises"/>
 *     &lt;enumeration value="PresentAddress"/>
 *     &lt;enumeration value="PrimaryControlPointLocation"/>
 *     &lt;enumeration value="ProduceDepartment"/>
 *     &lt;enumeration value="ProductServicesAndRepairsCentre"/>
 *     &lt;enumeration value="ProjectCoordinationOffice"/>
 *     &lt;enumeration value="ProjectManagementOffice"/>
 *     &lt;enumeration value="ProjectProperty"/>
 *     &lt;enumeration value="Property"/>
 *     &lt;enumeration value="QualityControl"/>
 *     &lt;enumeration value="RadioControlStationLocation"/>
 *     &lt;enumeration value="Railroad"/>
 *     &lt;enumeration value="ReceiptMeterLocation"/>
 *     &lt;enumeration value="ReceiptZone"/>
 *     &lt;enumeration value="ReceivedFrom"/>
 *     &lt;enumeration value="ReceiverSite"/>
 *     &lt;enumeration value="ReceivingLocation"/>
 *     &lt;enumeration value="ReceivingPointForCustomerSamples"/>
 *     &lt;enumeration value="ReceivingSub-Location"/>
 *     &lt;enumeration value="ReclamationCenter"/>
 *     &lt;enumeration value="Record-KeepingAddress"/>
 *     &lt;enumeration value="Refinery"/>
 *     &lt;enumeration value="RegionalOffice"/>
 *     &lt;enumeration value="RegisteredOffice"/>
 *     &lt;enumeration value="ReleaseTo"/>
 *     &lt;enumeration value="RemitTo"/>
 *     &lt;enumeration value="RepairingOutlet"/>
 *     &lt;enumeration value="RepairOrRefurbishLocation"/>
 *     &lt;enumeration value="ReportingLocation"/>
 *     &lt;enumeration value="ResearchInstitute"/>
 *     &lt;enumeration value="ResidenceOrDomicile"/>
 *     &lt;enumeration value="ReturnedTo"/>
 *     &lt;enumeration value="RoutingPoint"/>
 *     &lt;enumeration value="SalesOffice"/>
 *     &lt;enumeration value="SamplesToBeReturnedTo"/>
 *     &lt;enumeration value="SamplingLocation"/>
 *     &lt;enumeration value="SecondaryLocationAddress"/>
 *     &lt;enumeration value="SecondHome"/>
 *     &lt;enumeration value="SellingOffice"/>
 *     &lt;enumeration value="ServiceBureau"/>
 *     &lt;enumeration value="ServiceLocation"/>
 *     &lt;enumeration value="ShelteredWorkshop"/>
 *     &lt;enumeration value="ShipFrom"/>
 *     &lt;enumeration value="ShipTo"/>
 *     &lt;enumeration value="SmallBaseStationLocation"/>
 *     &lt;enumeration value="SmallControlStationLocation"/>
 *     &lt;enumeration value="SoldToAndShipTo"/>
 *     &lt;enumeration value="SoldToIfDifferentFromBillTo"/>
 *     &lt;enumeration value="StorageArea"/>
 *     &lt;enumeration value="StorageFacilityatDestination"/>
 *     &lt;enumeration value="StorageFacilityAtOrigin"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="SoldTo"/>
 *     &lt;enumeration value="SubcontractOrCognizantSecurityOffice"/>
 *     &lt;enumeration value="SubjectProperty"/>
 *     &lt;enumeration value="Sub-Office"/>
 *     &lt;enumeration value="Subsidiary"/>
 *     &lt;enumeration value="SubsidiaryDivision"/>
 *     &lt;enumeration value="SupplierOrManufacturer"/>
 *     &lt;enumeration value="SuppliersCorporateOffice"/>
 *     &lt;enumeration value="SupplySource"/>
 *     &lt;enumeration value="TankFarm"/>
 *     &lt;enumeration value="TaxAddress"/>
 *     &lt;enumeration value="TaxCollectorsOffice"/>
 *     &lt;enumeration value="TechnicalOffice"/>
 *     &lt;enumeration value="Terminal"/>
 *     &lt;enumeration value="TerminalLocation"/>
 *     &lt;enumeration value="TestingLaboratory"/>
 *     &lt;enumeration value="ToolSource"/>
 *     &lt;enumeration value="TransferPoint"/>
 *     &lt;enumeration value="TransferTo"/>
 *     &lt;enumeration value="TransportationOffice"/>
 *     &lt;enumeration value="UltimateConsignee"/>
 *     &lt;enumeration value="UltimateCustomer"/>
 *     &lt;enumeration value="UltimateParentCompany"/>
 *     &lt;enumeration value="UnitProperty"/>
 *     &lt;enumeration value="UpstreamMeterLocation"/>
 *     &lt;enumeration value="VacationHome"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="VideoDepartment"/>
 *     &lt;enumeration value="Warehouse"/>
 *     &lt;enumeration value="Wholesaler"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressTypeCode")
@XmlEnum
public enum AddressTypeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("AcceptanceLocation")
    ACCEPTANCE_LOCATION("AcceptanceLocation"),
    @XmlEnumValue("AccountsPayableOffice")
    ACCOUNTS_PAYABLE_OFFICE("AccountsPayableOffice"),
    @XmlEnumValue("AcknowledgementRecipient")
    ACKNOWLEDGEMENT_RECIPIENT("AcknowledgementRecipient"),
    @XmlEnumValue("AdditionalAddress")
    ADDITIONAL_ADDRESS("AdditionalAddress"),
    @XmlEnumValue("AdditionalDeliveryAddress")
    ADDITIONAL_DELIVERY_ADDRESS("AdditionalDeliveryAddress"),
    @XmlEnumValue("AdditionalPickUpAddress")
    ADDITIONAL_PICK_UP_ADDRESS("AdditionalPickUpAddress"),
    @XmlEnumValue("AlcoholBeverageDepartment")
    ALCOHOL_BEVERAGE_DEPARTMENT("AlcoholBeverageDepartment"),
    @XmlEnumValue("AlternateReturnAddress")
    ALTERNATE_RETURN_ADDRESS("AlternateReturnAddress"),
    @XmlEnumValue("AlternativeAddressee")
    ALTERNATIVE_ADDRESSEE("AlternativeAddressee"),
    @XmlEnumValue("AuditOffice")
    AUDIT_OFFICE("AuditOffice"),
    @XmlEnumValue("BailmentWarehouse")
    BAILMENT_WAREHOUSE("BailmentWarehouse"),
    @XmlEnumValue("BidOpeningLocation")
    BID_OPENING_LOCATION("BidOpeningLocation"),
    @XmlEnumValue("BillAndShipTo")
    BILL_AND_SHIP_TO("BillAndShipTo"),
    @XmlEnumValue("BilledFrom")
    BILLED_FROM("BilledFrom"),
    @XmlEnumValue("BillOfLadingRecipient")
    BILL_OF_LADING_RECIPIENT("BillOfLadingRecipient"),
    @XmlEnumValue("BillTo")
    BILL_TO("BillTo"),
    @XmlEnumValue("BookingOffice")
    BOOKING_OFFICE("BookingOffice"),
    @XmlEnumValue("CandyAndConfectionsDepartment")
    CANDY_AND_CONFECTIONS_DEPARTMENT("CandyAndConfectionsDepartment"),
    @XmlEnumValue("ChangedAddress")
    CHANGED_ADDRESS("ChangedAddress"),
    @XmlEnumValue("CompanyAssignedWell")
    COMPANY_ASSIGNED_WELL("CompanyAssignedWell"),
    @XmlEnumValue("Company-OwnedOilField")
    COMPANY_OWNED_OIL_FIELD("Company-OwnedOilField"),
    @XmlEnumValue("ConsigneeCourierTransferStation")
    CONSIGNEE_COURIER_TRANSFER_STATION("ConsigneeCourierTransferStation"),
    @XmlEnumValue("ConsignorCourierTransferStation")
    CONSIGNOR_COURIER_TRANSFER_STATION("ConsignorCourierTransferStation"),
    @XmlEnumValue("ConsultantsOffice")
    CONSULTANTS_OFFICE("ConsultantsOffice"),
    @XmlEnumValue("ContactOffice")
    CONTACT_OFFICE("ContactOffice"),
    @XmlEnumValue("ContainerLocation")
    CONTAINER_LOCATION("ContainerLocation"),
    @XmlEnumValue("CopyMessageTo")
    COPY_MESSAGE_TO("CopyMessageTo"),
    @XmlEnumValue("CorporateOffice")
    CORPORATE_OFFICE("CorporateOffice"),
    @XmlEnumValue("CorrectedAddress")
    CORRECTED_ADDRESS("CorrectedAddress"),
    @XmlEnumValue("DeliveryAddress")
    DELIVERY_ADDRESS("DeliveryAddress"),
    @XmlEnumValue("DestinationMailFacility")
    DESTINATION_MAIL_FACILITY("DestinationMailFacility"),
    @XmlEnumValue("DifferentPremiseAddress")
    DIFFERENT_PREMISE_ADDRESS("DifferentPremiseAddress"),
    @XmlEnumValue("DistributionRecipient")
    DISTRIBUTION_RECIPIENT("DistributionRecipient"),
    @XmlEnumValue("DocumentOrMessageIssuerOrSender")
    DOCUMENT_OR_MESSAGE_ISSUER_OR_SENDER("DocumentOrMessageIssuerOrSender"),
    @XmlEnumValue("DocumentRecipient")
    DOCUMENT_RECIPIENT("DocumentRecipient"),
    @XmlEnumValue("DomesticFinancialInstitution")
    DOMESTIC_FINANCIAL_INSTITUTION("DomesticFinancialInstitution"),
    @XmlEnumValue("DownstreamMeterLocation")
    DOWNSTREAM_METER_LOCATION("DownstreamMeterLocation"),
    @XmlEnumValue("Drop-OffLocation")
    DROP_OFF_LOCATION("Drop-OffLocation"),
    @XmlEnumValue("EmergencyDepartment")
    EMERGENCY_DEPARTMENT("EmergencyDepartment"),
    @XmlEnumValue("EstablishedLocation")
    ESTABLISHED_LOCATION("EstablishedLocation"),
    @XmlEnumValue("EventLocation")
    EVENT_LOCATION("EventLocation"),
    @XmlEnumValue("FilingAddress")
    FILING_ADDRESS("FilingAddress"),
    @XmlEnumValue("FilingLocation")
    FILING_LOCATION("FilingLocation"),
    @XmlEnumValue("FilingOffice")
    FILING_OFFICE("FilingOffice"),
    @XmlEnumValue("FinalMessageRecipient")
    FINAL_MESSAGE_RECIPIENT("FinalMessageRecipient"),
    @XmlEnumValue("FinalRecipient")
    FINAL_RECIPIENT("FinalRecipient"),
    @XmlEnumValue("FinalScheduledDestination")
    FINAL_SCHEDULED_DESTINATION("FinalScheduledDestination"),
    @XmlEnumValue("FinancialInstitution")
    FINANCIAL_INSTITUTION("FinancialInstitution"),
    @XmlEnumValue("FirstContact")
    FIRST_CONTACT("FirstContact"),
    @XmlEnumValue("FloralDepartment")
    FLORAL_DEPARTMENT("FloralDepartment"),
    @XmlEnumValue("ForeignDisclosureInformationOffice")
    FOREIGN_DISCLOSURE_INFORMATION_OFFICE("ForeignDisclosureInformationOffice"),
    @XmlEnumValue("ForeignOffice")
    FOREIGN_OFFICE("ForeignOffice"),
    @XmlEnumValue("ForeignRegistrationLocation")
    FOREIGN_REGISTRATION_LOCATION("ForeignRegistrationLocation"),
    @XmlEnumValue("FormerAddress")
    FORMER_ADDRESS("FormerAddress"),
    @XmlEnumValue("FreeonBoardPoint")
    FREEON_BOARD_POINT("FreeonBoardPoint"),
    @XmlEnumValue("FrozenDepartment")
    FROZEN_DEPARTMENT("FrozenDepartment"),
    @XmlEnumValue("GaragedLocation")
    GARAGED_LOCATION("GaragedLocation"),
    @XmlEnumValue("GasPlant")
    GAS_PLANT("GasPlant"),
    @XmlEnumValue("GasTransactionEndingPoint")
    GAS_TRANSACTION_ENDING_POINT("GasTransactionEndingPoint"),
    @XmlEnumValue("GasTransactionPoint1")
    GAS_TRANSACTION_POINT_1("GasTransactionPoint1"),
    @XmlEnumValue("GasTransactionPoint2")
    GAS_TRANSACTION_POINT_2("GasTransactionPoint2"),
    @XmlEnumValue("GasTransactionStartingPoint")
    GAS_TRANSACTION_STARTING_POINT("GasTransactionStartingPoint"),
    @XmlEnumValue("HazardousMaterialOffice")
    HAZARDOUS_MATERIAL_OFFICE("HazardousMaterialOffice"),
    @XmlEnumValue("HeadOffice")
    HEAD_OFFICE("HeadOffice"),
    @XmlEnumValue("HomeOffice")
    HOME_OFFICE("HomeOffice"),
    @XmlEnumValue("ImportedFromLocation")
    IMPORTED_FROM_LOCATION("ImportedFromLocation"),
    @XmlEnumValue("IncorporatedLocation")
    INCORPORATED_LOCATION("IncorporatedLocation"),
    @XmlEnumValue("IncorporationStatePlaceOfBusiness")
    INCORPORATION_STATE_PLACE_OF_BUSINESS("IncorporationStatePlaceOfBusiness"),
    @XmlEnumValue("IncorporationStatePrincipalOffice")
    INCORPORATION_STATE_PRINCIPAL_OFFICE("IncorporationStatePrincipalOffice"),
    @XmlEnumValue("InquiryAddress")
    INQUIRY_ADDRESS("InquiryAddress"),
    @XmlEnumValue("InspectionAddress")
    INSPECTION_ADDRESS("InspectionAddress"),
    @XmlEnumValue("InspectionAndAcceptanceLocation")
    INSPECTION_AND_ACCEPTANCE_LOCATION("InspectionAndAcceptanceLocation"),
    @XmlEnumValue("InspectionLocation")
    INSPECTION_LOCATION("InspectionLocation"),
    @XmlEnumValue("InstalledAt")
    INSTALLED_AT("InstalledAt"),
    @XmlEnumValue("In-StoreBakeryDepartment")
    IN_STORE_BAKERY_DEPARTMENT("In-StoreBakeryDepartment"),
    @XmlEnumValue("InsuredLocation")
    INSURED_LOCATION("InsuredLocation"),
    @XmlEnumValue("Laboratory")
    LABORATORY("Laboratory"),
    @XmlEnumValue("LastBreakTerminal")
    LAST_BREAK_TERMINAL("LastBreakTerminal"),
    @XmlEnumValue("LeaseLocation")
    LEASE_LOCATION("LeaseLocation"),
    @XmlEnumValue("ListingOffice")
    LISTING_OFFICE("ListingOffice"),
    @XmlEnumValue("LocalChain")
    LOCAL_CHAIN("LocalChain"),
    @XmlEnumValue("LocationOfGoods")
    LOCATION_OF_GOODS("LocationOfGoods"),
    @XmlEnumValue("LocationOfGoodsForCustomsExaminationBeforeClearance")
    LOCATION_OF_GOODS_FOR_CUSTOMS_EXAMINATION_BEFORE_CLEARANCE("LocationOfGoodsForCustomsExaminationBeforeClearance"),
    @XmlEnumValue("LocationOfLoadExchange")
    LOCATION_OF_LOAD_EXCHANGE("LocationOfLoadExchange"),
    @XmlEnumValue("LocationOfSpotForStorage")
    LOCATION_OF_SPOT_FOR_STORAGE("LocationOfSpotForStorage"),
    @XmlEnumValue("Lot")
    LOT("Lot"),
    @XmlEnumValue("MailAddress")
    MAIL_ADDRESS("MailAddress"),
    @XmlEnumValue("MailTo")
    MAIL_TO("MailTo"),
    @XmlEnumValue("ManufacturingPlant")
    MANUFACTURING_PLANT("ManufacturingPlant"),
    @XmlEnumValue("MasterProperty")
    MASTER_PROPERTY("MasterProperty"),
    @XmlEnumValue("MaterialChangeNoticeAddress")
    MATERIAL_CHANGE_NOTICE_ADDRESS("MaterialChangeNoticeAddress"),
    @XmlEnumValue("MaterialDispositionAuthorizationLocation")
    MATERIAL_DISPOSITION_AUTHORIZATION_LOCATION("MaterialDispositionAuthorizationLocation"),
    @XmlEnumValue("MeatDepartment")
    MEAT_DEPARTMENT("MeatDepartment"),
    @XmlEnumValue("MeetingLocation")
    MEETING_LOCATION("MeetingLocation"),
    @XmlEnumValue("MessageFrom")
    MESSAGE_FROM("MessageFrom"),
    @XmlEnumValue("MessageRecipient")
    MESSAGE_RECIPIENT("MessageRecipient"),
    @XmlEnumValue("MessageTo")
    MESSAGE_TO("MessageTo"),
    @XmlEnumValue("Neighborhood")
    NEIGHBORHOOD("Neighborhood"),
    @XmlEnumValue("NewAddress")
    NEW_ADDRESS("NewAddress"),
    @XmlEnumValue("NewSupplySource")
    NEW_SUPPLY_SOURCE("NewSupplySource"),
    @XmlEnumValue("NextDestination")
    NEXT_DESTINATION("NextDestination"),
    @XmlEnumValue("NextScheduledDestination")
    NEXT_SCHEDULED_DESTINATION("NextScheduledDestination"),
    @XmlEnumValue("Non-TemporaryStorageFacility")
    NON_TEMPORARY_STORAGE_FACILITY("Non-TemporaryStorageFacility"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("OperatorOfTheTransferPoint")
    OPERATOR_OF_THE_TRANSFER_POINT("OperatorOfTheTransferPoint"),
    @XmlEnumValue("OriginalLocation")
    ORIGINAL_LOCATION("OriginalLocation"),
    @XmlEnumValue("OriginMailFacility")
    ORIGIN_MAIL_FACILITY("OriginMailFacility"),
    @XmlEnumValue("OriginSublocation")
    ORIGIN_SUBLOCATION("OriginSublocation"),
    @XmlEnumValue("OriginTerminal")
    ORIGIN_TERMINAL("OriginTerminal"),
    @XmlEnumValue("OtherDepartments")
    OTHER_DEPARTMENTS("OtherDepartments"),
    @XmlEnumValue("OuterContinentalShelfAreaLocation")
    OUTER_CONTINENTAL_SHELF_AREA_LOCATION("OuterContinentalShelfAreaLocation"),
    @XmlEnumValue("Out-Of-StatePrincipalOffice")
    OUT_OF_STATE_PRINCIPAL_OFFICE("Out-Of-StatePrincipalOffice"),
    @XmlEnumValue("OwningInventoryControlPoint")
    OWNING_INVENTORY_CONTROL_POINT("OwningInventoryControlPoint"),
    @XmlEnumValue("PartSource")
    PART_SOURCE("PartSource"),
    @XmlEnumValue("PaymentAddress")
    PAYMENT_ADDRESS("PaymentAddress"),
    @XmlEnumValue("PersonnelOffice")
    PERSONNEL_OFFICE("PersonnelOffice"),
    @XmlEnumValue("PharmacyDepartment")
    PHARMACY_DEPARTMENT("PharmacyDepartment"),
    @XmlEnumValue("PhysicalAddress")
    PHYSICAL_ADDRESS("PhysicalAddress"),
    @XmlEnumValue("PickUpAddress")
    PICK_UP_ADDRESS("PickUpAddress"),
    @XmlEnumValue("Pipeline")
    PIPELINE("Pipeline"),
    @XmlEnumValue("PipelineSegment")
    PIPELINE_SEGMENT("PipelineSegment"),
    @XmlEnumValue("PipelineSegmentBoundary")
    PIPELINE_SEGMENT_BOUNDARY("PipelineSegmentBoundary"),
    @XmlEnumValue("PlaceOfBottling")
    PLACE_OF_BOTTLING("PlaceOfBottling"),
    @XmlEnumValue("PlaceOfBusiness")
    PLACE_OF_BUSINESS("PlaceOfBusiness"),
    @XmlEnumValue("PostalMailingAddress")
    POSTAL_MAILING_ADDRESS("PostalMailingAddress"),
    @XmlEnumValue("PreliminaryInspectionLocation")
    PRELIMINARY_INSPECTION_LOCATION("PreliminaryInspectionLocation"),
    @XmlEnumValue("Premises")
    PREMISES("Premises"),
    @XmlEnumValue("PresentAddress")
    PRESENT_ADDRESS("PresentAddress"),
    @XmlEnumValue("PrimaryControlPointLocation")
    PRIMARY_CONTROL_POINT_LOCATION("PrimaryControlPointLocation"),
    @XmlEnumValue("ProduceDepartment")
    PRODUCE_DEPARTMENT("ProduceDepartment"),
    @XmlEnumValue("ProductServicesAndRepairsCentre")
    PRODUCT_SERVICES_AND_REPAIRS_CENTRE("ProductServicesAndRepairsCentre"),
    @XmlEnumValue("ProjectCoordinationOffice")
    PROJECT_COORDINATION_OFFICE("ProjectCoordinationOffice"),
    @XmlEnumValue("ProjectManagementOffice")
    PROJECT_MANAGEMENT_OFFICE("ProjectManagementOffice"),
    @XmlEnumValue("ProjectProperty")
    PROJECT_PROPERTY("ProjectProperty"),
    @XmlEnumValue("Property")
    PROPERTY("Property"),
    @XmlEnumValue("QualityControl")
    QUALITY_CONTROL("QualityControl"),
    @XmlEnumValue("RadioControlStationLocation")
    RADIO_CONTROL_STATION_LOCATION("RadioControlStationLocation"),
    @XmlEnumValue("Railroad")
    RAILROAD("Railroad"),
    @XmlEnumValue("ReceiptMeterLocation")
    RECEIPT_METER_LOCATION("ReceiptMeterLocation"),
    @XmlEnumValue("ReceiptZone")
    RECEIPT_ZONE("ReceiptZone"),
    @XmlEnumValue("ReceivedFrom")
    RECEIVED_FROM("ReceivedFrom"),
    @XmlEnumValue("ReceiverSite")
    RECEIVER_SITE("ReceiverSite"),
    @XmlEnumValue("ReceivingLocation")
    RECEIVING_LOCATION("ReceivingLocation"),
    @XmlEnumValue("ReceivingPointForCustomerSamples")
    RECEIVING_POINT_FOR_CUSTOMER_SAMPLES("ReceivingPointForCustomerSamples"),
    @XmlEnumValue("ReceivingSub-Location")
    RECEIVING_SUB_LOCATION("ReceivingSub-Location"),
    @XmlEnumValue("ReclamationCenter")
    RECLAMATION_CENTER("ReclamationCenter"),
    @XmlEnumValue("Record-KeepingAddress")
    RECORD_KEEPING_ADDRESS("Record-KeepingAddress"),
    @XmlEnumValue("Refinery")
    REFINERY("Refinery"),
    @XmlEnumValue("RegionalOffice")
    REGIONAL_OFFICE("RegionalOffice"),
    @XmlEnumValue("RegisteredOffice")
    REGISTERED_OFFICE("RegisteredOffice"),
    @XmlEnumValue("ReleaseTo")
    RELEASE_TO("ReleaseTo"),
    @XmlEnumValue("RemitTo")
    REMIT_TO("RemitTo"),
    @XmlEnumValue("RepairingOutlet")
    REPAIRING_OUTLET("RepairingOutlet"),
    @XmlEnumValue("RepairOrRefurbishLocation")
    REPAIR_OR_REFURBISH_LOCATION("RepairOrRefurbishLocation"),
    @XmlEnumValue("ReportingLocation")
    REPORTING_LOCATION("ReportingLocation"),
    @XmlEnumValue("ResearchInstitute")
    RESEARCH_INSTITUTE("ResearchInstitute"),
    @XmlEnumValue("ResidenceOrDomicile")
    RESIDENCE_OR_DOMICILE("ResidenceOrDomicile"),
    @XmlEnumValue("ReturnedTo")
    RETURNED_TO("ReturnedTo"),
    @XmlEnumValue("RoutingPoint")
    ROUTING_POINT("RoutingPoint"),
    @XmlEnumValue("SalesOffice")
    SALES_OFFICE("SalesOffice"),
    @XmlEnumValue("SamplesToBeReturnedTo")
    SAMPLES_TO_BE_RETURNED_TO("SamplesToBeReturnedTo"),
    @XmlEnumValue("SamplingLocation")
    SAMPLING_LOCATION("SamplingLocation"),
    @XmlEnumValue("SecondaryLocationAddress")
    SECONDARY_LOCATION_ADDRESS("SecondaryLocationAddress"),
    @XmlEnumValue("SecondHome")
    SECOND_HOME("SecondHome"),
    @XmlEnumValue("SellingOffice")
    SELLING_OFFICE("SellingOffice"),
    @XmlEnumValue("ServiceBureau")
    SERVICE_BUREAU("ServiceBureau"),
    @XmlEnumValue("ServiceLocation")
    SERVICE_LOCATION("ServiceLocation"),
    @XmlEnumValue("ShelteredWorkshop")
    SHELTERED_WORKSHOP("ShelteredWorkshop"),
    @XmlEnumValue("ShipFrom")
    SHIP_FROM("ShipFrom"),
    @XmlEnumValue("ShipTo")
    SHIP_TO("ShipTo"),
    @XmlEnumValue("SmallBaseStationLocation")
    SMALL_BASE_STATION_LOCATION("SmallBaseStationLocation"),
    @XmlEnumValue("SmallControlStationLocation")
    SMALL_CONTROL_STATION_LOCATION("SmallControlStationLocation"),
    @XmlEnumValue("SoldToAndShipTo")
    SOLD_TO_AND_SHIP_TO("SoldToAndShipTo"),
    @XmlEnumValue("SoldToIfDifferentFromBillTo")
    SOLD_TO_IF_DIFFERENT_FROM_BILL_TO("SoldToIfDifferentFromBillTo"),
    @XmlEnumValue("StorageArea")
    STORAGE_AREA("StorageArea"),
    @XmlEnumValue("StorageFacilityatDestination")
    STORAGE_FACILITYAT_DESTINATION("StorageFacilityatDestination"),
    @XmlEnumValue("StorageFacilityAtOrigin")
    STORAGE_FACILITY_AT_ORIGIN("StorageFacilityAtOrigin"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("SoldTo")
    SOLD_TO("SoldTo"),
    @XmlEnumValue("SubcontractOrCognizantSecurityOffice")
    SUBCONTRACT_OR_COGNIZANT_SECURITY_OFFICE("SubcontractOrCognizantSecurityOffice"),
    @XmlEnumValue("SubjectProperty")
    SUBJECT_PROPERTY("SubjectProperty"),
    @XmlEnumValue("Sub-Office")
    SUB_OFFICE("Sub-Office"),
    @XmlEnumValue("Subsidiary")
    SUBSIDIARY("Subsidiary"),
    @XmlEnumValue("SubsidiaryDivision")
    SUBSIDIARY_DIVISION("SubsidiaryDivision"),
    @XmlEnumValue("SupplierOrManufacturer")
    SUPPLIER_OR_MANUFACTURER("SupplierOrManufacturer"),
    @XmlEnumValue("SuppliersCorporateOffice")
    SUPPLIERS_CORPORATE_OFFICE("SuppliersCorporateOffice"),
    @XmlEnumValue("SupplySource")
    SUPPLY_SOURCE("SupplySource"),
    @XmlEnumValue("TankFarm")
    TANK_FARM("TankFarm"),
    @XmlEnumValue("TaxAddress")
    TAX_ADDRESS("TaxAddress"),
    @XmlEnumValue("TaxCollectorsOffice")
    TAX_COLLECTORS_OFFICE("TaxCollectorsOffice"),
    @XmlEnumValue("TechnicalOffice")
    TECHNICAL_OFFICE("TechnicalOffice"),
    @XmlEnumValue("Terminal")
    TERMINAL("Terminal"),
    @XmlEnumValue("TerminalLocation")
    TERMINAL_LOCATION("TerminalLocation"),
    @XmlEnumValue("TestingLaboratory")
    TESTING_LABORATORY("TestingLaboratory"),
    @XmlEnumValue("ToolSource")
    TOOL_SOURCE("ToolSource"),
    @XmlEnumValue("TransferPoint")
    TRANSFER_POINT("TransferPoint"),
    @XmlEnumValue("TransferTo")
    TRANSFER_TO("TransferTo"),
    @XmlEnumValue("TransportationOffice")
    TRANSPORTATION_OFFICE("TransportationOffice"),
    @XmlEnumValue("UltimateConsignee")
    ULTIMATE_CONSIGNEE("UltimateConsignee"),
    @XmlEnumValue("UltimateCustomer")
    ULTIMATE_CUSTOMER("UltimateCustomer"),
    @XmlEnumValue("UltimateParentCompany")
    ULTIMATE_PARENT_COMPANY("UltimateParentCompany"),
    @XmlEnumValue("UnitProperty")
    UNIT_PROPERTY("UnitProperty"),
    @XmlEnumValue("UpstreamMeterLocation")
    UPSTREAM_METER_LOCATION("UpstreamMeterLocation"),
    @XmlEnumValue("VacationHome")
    VACATION_HOME("VacationHome"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("VideoDepartment")
    VIDEO_DEPARTMENT("VideoDepartment"),
    @XmlEnumValue("Warehouse")
    WAREHOUSE("Warehouse"),
    @XmlEnumValue("Wholesaler")
    WHOLESALER("Wholesaler");
    private final String value;

    AddressTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressTypeCode fromValue(String v) {
        for (AddressTypeCode c: AddressTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
