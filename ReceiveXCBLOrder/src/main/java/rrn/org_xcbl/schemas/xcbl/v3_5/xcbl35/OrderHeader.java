//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderNumber"/>
 *         &lt;element name="OrderIssueDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderReferences" minOccurs="0"/>
 *         &lt;element name="ReleaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Purpose"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}RequestedResponse" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderType" minOccurs="0"/>
 *         &lt;element name="OrderCurrency">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Currency"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxAccountingCurrency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Currency"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderLanguage">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Language"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderTaxReference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TaxReference"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderInvoiceMediumTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderInvoiceMediumTypeCode" minOccurs="0"/>
 *         &lt;element name="OrderInvoiceMediumTypeCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderDates" minOccurs="0"/>
 *         &lt;element name="PartialShipmentAllowed" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblBoolean" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}OrderParty"/>
 *         &lt;element name="PartLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfTransport" minOccurs="0"/>
 *         &lt;element name="OrderTermsOfDelivery" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TermsOfDelivery"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderHeaderPrice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfPrice"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderPaymentInstructions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PaymentInstructions"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderAllowancesOrCharges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfAllowOrCharge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}RoundTripInformation" minOccurs="0"/>
 *         &lt;element name="OrderHeaderNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfStructuredNote" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfNameValueSet" minOccurs="0"/>
 *         &lt;element name="OrderHeaderAttachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfAttachment"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHeader", propOrder = {
    "orderNumber",
    "orderIssueDate",
    "orderReferences",
    "releaseNumber",
    "purpose",
    "requestedResponse",
    "orderType",
    "orderCurrency",
    "taxAccountingCurrency",
    "orderLanguage",
    "orderTaxReference",
    "orderInvoiceMediumTypeCoded",
    "orderInvoiceMediumTypeCodedOther",
    "orderDates",
    "partialShipmentAllowed",
    "orderParty",
    "partLocation",
    "listOfTransport",
    "orderTermsOfDelivery",
    "orderHeaderPrice",
    "orderPaymentInstructions",
    "orderAllowancesOrCharges",
    "roundTripInformation",
    "orderHeaderNote",
    "listOfStructuredNote",
    "listOfNameValueSet",
    "orderHeaderAttachments"
})
public class OrderHeader {

    @XmlElement(name = "OrderNumber", required = true)
    protected OrderNumber orderNumber;
    @XmlElement(name = "OrderIssueDate", required = true)
    protected String orderIssueDate;
    @XmlElement(name = "OrderReferences")
    protected OrderReferences orderReferences;
    @XmlElement(name = "ReleaseNumber")
    protected String releaseNumber;
    @XmlElement(name = "Purpose", required = true)
    protected Purpose purpose;
    @XmlElement(name = "RequestedResponse")
    protected RequestedResponse requestedResponse;
    @XmlElement(name = "OrderType")
    protected OrderType orderType;
    @XmlElement(name = "OrderCurrency", required = true)
    protected OrderHeader.OrderCurrency orderCurrency;
    @XmlElement(name = "TaxAccountingCurrency")
    protected OrderHeader.TaxAccountingCurrency taxAccountingCurrency;
    @XmlElement(name = "OrderLanguage", required = true)
    protected OrderHeader.OrderLanguage orderLanguage;
    @XmlElement(name = "OrderTaxReference")
    protected OrderHeader.OrderTaxReference orderTaxReference;
    @XmlElement(name = "OrderInvoiceMediumTypeCoded")
    protected OrderInvoiceMediumTypeCode orderInvoiceMediumTypeCoded;
    @XmlElement(name = "OrderInvoiceMediumTypeCodedOther")
    protected String orderInvoiceMediumTypeCodedOther;
    @XmlElement(name = "OrderDates")
    protected OrderDates orderDates;
    @XmlElement(name = "PartialShipmentAllowed")
    protected Boolean partialShipmentAllowed;
    @XmlElement(name = "OrderParty", required = true)
    protected OrderParty orderParty;
    @XmlElement(name = "PartLocation")
    protected String partLocation;
    @XmlElement(name = "ListOfTransport")
    protected ListOfTransport listOfTransport;
    @XmlElement(name = "OrderTermsOfDelivery")
    protected List<OrderHeader.OrderTermsOfDelivery> orderTermsOfDelivery;
    @XmlElement(name = "OrderHeaderPrice")
    protected OrderHeader.OrderHeaderPrice orderHeaderPrice;
    @XmlElement(name = "OrderPaymentInstructions")
    protected OrderHeader.OrderPaymentInstructions orderPaymentInstructions;
    @XmlElement(name = "OrderAllowancesOrCharges")
    protected OrderHeader.OrderAllowancesOrCharges orderAllowancesOrCharges;
    @XmlElement(name = "RoundTripInformation")
    protected RoundTripInformation roundTripInformation;
    @XmlElement(name = "OrderHeaderNote")
    protected String orderHeaderNote;
    @XmlElement(name = "ListOfStructuredNote")
    protected ListOfStructuredNote listOfStructuredNote;
    @XmlElement(name = "ListOfNameValueSet")
    protected ListOfNameValueSet listOfNameValueSet;
    @XmlElement(name = "OrderHeaderAttachments")
    protected OrderHeader.OrderHeaderAttachments orderHeaderAttachments;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OrderNumber }
     *     
     */
    public OrderNumber getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderNumber }
     *     
     */
    public void setOrderNumber(OrderNumber value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIssueDate() {
        return orderIssueDate;
    }

    /**
     * Sets the value of the orderIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIssueDate(String value) {
        this.orderIssueDate = value;
    }

    /**
     * Gets the value of the orderReferences property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReferences }
     *     
     */
    public OrderReferences getOrderReferences() {
        return orderReferences;
    }

    /**
     * Sets the value of the orderReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReferences }
     *     
     */
    public void setOrderReferences(OrderReferences value) {
        this.orderReferences = value;
    }

    /**
     * Gets the value of the releaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNumber() {
        return releaseNumber;
    }

    /**
     * Sets the value of the releaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNumber(String value) {
        this.releaseNumber = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose }
     *     
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose }
     *     
     */
    public void setPurpose(Purpose value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the requestedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedResponse }
     *     
     */
    public RequestedResponse getRequestedResponse() {
        return requestedResponse;
    }

    /**
     * Sets the value of the requestedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedResponse }
     *     
     */
    public void setRequestedResponse(RequestedResponse value) {
        this.requestedResponse = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderType(OrderType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderCurrency }
     *     
     */
    public OrderHeader.OrderCurrency getOrderCurrency() {
        return orderCurrency;
    }

    /**
     * Sets the value of the orderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderCurrency }
     *     
     */
    public void setOrderCurrency(OrderHeader.OrderCurrency value) {
        this.orderCurrency = value;
    }

    /**
     * Gets the value of the taxAccountingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.TaxAccountingCurrency }
     *     
     */
    public OrderHeader.TaxAccountingCurrency getTaxAccountingCurrency() {
        return taxAccountingCurrency;
    }

    /**
     * Sets the value of the taxAccountingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.TaxAccountingCurrency }
     *     
     */
    public void setTaxAccountingCurrency(OrderHeader.TaxAccountingCurrency value) {
        this.taxAccountingCurrency = value;
    }

    /**
     * Gets the value of the orderLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderLanguage }
     *     
     */
    public OrderHeader.OrderLanguage getOrderLanguage() {
        return orderLanguage;
    }

    /**
     * Sets the value of the orderLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderLanguage }
     *     
     */
    public void setOrderLanguage(OrderHeader.OrderLanguage value) {
        this.orderLanguage = value;
    }

    /**
     * Gets the value of the orderTaxReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderTaxReference }
     *     
     */
    public OrderHeader.OrderTaxReference getOrderTaxReference() {
        return orderTaxReference;
    }

    /**
     * Sets the value of the orderTaxReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderTaxReference }
     *     
     */
    public void setOrderTaxReference(OrderHeader.OrderTaxReference value) {
        this.orderTaxReference = value;
    }

    /**
     * Gets the value of the orderInvoiceMediumTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInvoiceMediumTypeCode }
     *     
     */
    public OrderInvoiceMediumTypeCode getOrderInvoiceMediumTypeCoded() {
        return orderInvoiceMediumTypeCoded;
    }

    /**
     * Sets the value of the orderInvoiceMediumTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInvoiceMediumTypeCode }
     *     
     */
    public void setOrderInvoiceMediumTypeCoded(OrderInvoiceMediumTypeCode value) {
        this.orderInvoiceMediumTypeCoded = value;
    }

    /**
     * Gets the value of the orderInvoiceMediumTypeCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInvoiceMediumTypeCodedOther() {
        return orderInvoiceMediumTypeCodedOther;
    }

    /**
     * Sets the value of the orderInvoiceMediumTypeCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInvoiceMediumTypeCodedOther(String value) {
        this.orderInvoiceMediumTypeCodedOther = value;
    }

    /**
     * Gets the value of the orderDates property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDates }
     *     
     */
    public OrderDates getOrderDates() {
        return orderDates;
    }

    /**
     * Sets the value of the orderDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDates }
     *     
     */
    public void setOrderDates(OrderDates value) {
        this.orderDates = value;
    }

    /**
     * Gets the value of the partialShipmentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialShipmentAllowed() {
        return partialShipmentAllowed;
    }

    /**
     * Sets the value of the partialShipmentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialShipmentAllowed(Boolean value) {
        this.partialShipmentAllowed = value;
    }

    /**
     * Gets the value of the orderParty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderParty }
     *     
     */
    public OrderParty getOrderParty() {
        return orderParty;
    }

    /**
     * Sets the value of the orderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderParty }
     *     
     */
    public void setOrderParty(OrderParty value) {
        this.orderParty = value;
    }

    /**
     * Gets the value of the partLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartLocation() {
        return partLocation;
    }

    /**
     * Sets the value of the partLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartLocation(String value) {
        this.partLocation = value;
    }

    /**
     * Gets the value of the listOfTransport property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfTransport }
     *     
     */
    public ListOfTransport getListOfTransport() {
        return listOfTransport;
    }

    /**
     * Sets the value of the listOfTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfTransport }
     *     
     */
    public void setListOfTransport(ListOfTransport value) {
        this.listOfTransport = value;
    }

    /**
     * Gets the value of the orderTermsOfDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderTermsOfDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderTermsOfDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderHeader.OrderTermsOfDelivery }
     * 
     * 
     */
    public List<OrderHeader.OrderTermsOfDelivery> getOrderTermsOfDelivery() {
        if (orderTermsOfDelivery == null) {
            orderTermsOfDelivery = new ArrayList<OrderHeader.OrderTermsOfDelivery>();
        }
        return this.orderTermsOfDelivery;
    }

    /**
     * Gets the value of the orderHeaderPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderHeaderPrice }
     *     
     */
    public OrderHeader.OrderHeaderPrice getOrderHeaderPrice() {
        return orderHeaderPrice;
    }

    /**
     * Sets the value of the orderHeaderPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderHeaderPrice }
     *     
     */
    public void setOrderHeaderPrice(OrderHeader.OrderHeaderPrice value) {
        this.orderHeaderPrice = value;
    }

    /**
     * Gets the value of the orderPaymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderPaymentInstructions }
     *     
     */
    public OrderHeader.OrderPaymentInstructions getOrderPaymentInstructions() {
        return orderPaymentInstructions;
    }

    /**
     * Sets the value of the orderPaymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderPaymentInstructions }
     *     
     */
    public void setOrderPaymentInstructions(OrderHeader.OrderPaymentInstructions value) {
        this.orderPaymentInstructions = value;
    }

    /**
     * Gets the value of the orderAllowancesOrCharges property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderAllowancesOrCharges }
     *     
     */
    public OrderHeader.OrderAllowancesOrCharges getOrderAllowancesOrCharges() {
        return orderAllowancesOrCharges;
    }

    /**
     * Sets the value of the orderAllowancesOrCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderAllowancesOrCharges }
     *     
     */
    public void setOrderAllowancesOrCharges(OrderHeader.OrderAllowancesOrCharges value) {
        this.orderAllowancesOrCharges = value;
    }

    /**
     * Gets the value of the roundTripInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RoundTripInformation }
     *     
     */
    public RoundTripInformation getRoundTripInformation() {
        return roundTripInformation;
    }

    /**
     * Sets the value of the roundTripInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundTripInformation }
     *     
     */
    public void setRoundTripInformation(RoundTripInformation value) {
        this.roundTripInformation = value;
    }

    /**
     * Gets the value of the orderHeaderNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderNote() {
        return orderHeaderNote;
    }

    /**
     * Sets the value of the orderHeaderNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderNote(String value) {
        this.orderHeaderNote = value;
    }

    /**
     * Gets the value of the listOfStructuredNote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfStructuredNote }
     *     
     */
    public ListOfStructuredNote getListOfStructuredNote() {
        return listOfStructuredNote;
    }

    /**
     * Sets the value of the listOfStructuredNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfStructuredNote }
     *     
     */
    public void setListOfStructuredNote(ListOfStructuredNote value) {
        this.listOfStructuredNote = value;
    }

    /**
     * Gets the value of the listOfNameValueSet property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfNameValueSet }
     *     
     */
    public ListOfNameValueSet getListOfNameValueSet() {
        return listOfNameValueSet;
    }

    /**
     * Sets the value of the listOfNameValueSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfNameValueSet }
     *     
     */
    public void setListOfNameValueSet(ListOfNameValueSet value) {
        this.listOfNameValueSet = value;
    }

    /**
     * Gets the value of the orderHeaderAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader.OrderHeaderAttachments }
     *     
     */
    public OrderHeader.OrderHeaderAttachments getOrderHeaderAttachments() {
        return orderHeaderAttachments;
    }

    /**
     * Sets the value of the orderHeaderAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader.OrderHeaderAttachments }
     *     
     */
    public void setOrderHeaderAttachments(OrderHeader.OrderHeaderAttachments value) {
        this.orderHeaderAttachments = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfAllowOrCharge"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listOfAllowOrCharge"
    })
    public static class OrderAllowancesOrCharges {

        @XmlElement(name = "ListOfAllowOrCharge", required = true)
        protected ListOfAllowOrCharge listOfAllowOrCharge;

        /**
         * Gets the value of the listOfAllowOrCharge property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAllowOrCharge }
         *     
         */
        public ListOfAllowOrCharge getListOfAllowOrCharge() {
            return listOfAllowOrCharge;
        }

        /**
         * Sets the value of the listOfAllowOrCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAllowOrCharge }
         *     
         */
        public void setListOfAllowOrCharge(ListOfAllowOrCharge value) {
            this.listOfAllowOrCharge = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Currency"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currency"
    })
    public static class OrderCurrency {

        @XmlElement(name = "Currency", required = true)
        protected Currency currency;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setCurrency(Currency value) {
            this.currency = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfAttachment"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listOfAttachment"
    })
    public static class OrderHeaderAttachments {

        @XmlElement(name = "ListOfAttachment", required = true)
        protected ListOfAttachment listOfAttachment;

        /**
         * Gets the value of the listOfAttachment property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfAttachment }
         *     
         */
        public ListOfAttachment getListOfAttachment() {
            return listOfAttachment;
        }

        /**
         * Sets the value of the listOfAttachment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfAttachment }
         *     
         */
        public void setListOfAttachment(ListOfAttachment value) {
            this.listOfAttachment = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfPrice"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listOfPrice"
    })
    public static class OrderHeaderPrice {

        @XmlElement(name = "ListOfPrice", required = true)
        protected ListOfPrice listOfPrice;

        /**
         * Gets the value of the listOfPrice property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfPrice }
         *     
         */
        public ListOfPrice getListOfPrice() {
            return listOfPrice;
        }

        /**
         * Sets the value of the listOfPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfPrice }
         *     
         */
        public void setListOfPrice(ListOfPrice value) {
            this.listOfPrice = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Language"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "language"
    })
    public static class OrderLanguage {

        @XmlElement(name = "Language", required = true)
        protected Language language;

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link Language }
         *     
         */
        public Language getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link Language }
         *     
         */
        public void setLanguage(Language value) {
            this.language = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PaymentInstructions"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentInstructions"
    })
    public static class OrderPaymentInstructions {

        @XmlElement(name = "PaymentInstructions", required = true)
        protected PaymentInstructions paymentInstructions;

        /**
         * Gets the value of the paymentInstructions property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentInstructions }
         *     
         */
        public PaymentInstructions getPaymentInstructions() {
            return paymentInstructions;
        }

        /**
         * Sets the value of the paymentInstructions property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentInstructions }
         *     
         */
        public void setPaymentInstructions(PaymentInstructions value) {
            this.paymentInstructions = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TaxReference"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxReference"
    })
    public static class OrderTaxReference {

        @XmlElement(name = "TaxReference", required = true)
        protected TaxReference taxReference;

        /**
         * Gets the value of the taxReference property.
         * 
         * @return
         *     possible object is
         *     {@link TaxReference }
         *     
         */
        public TaxReference getTaxReference() {
            return taxReference;
        }

        /**
         * Sets the value of the taxReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxReference }
         *     
         */
        public void setTaxReference(TaxReference value) {
            this.taxReference = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TermsOfDelivery"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "termsOfDelivery"
    })
    public static class OrderTermsOfDelivery {

        @XmlElement(name = "TermsOfDelivery", required = true)
        protected TermsOfDelivery termsOfDelivery;

        /**
         * Gets the value of the termsOfDelivery property.
         * 
         * @return
         *     possible object is
         *     {@link TermsOfDelivery }
         *     
         */
        public TermsOfDelivery getTermsOfDelivery() {
            return termsOfDelivery;
        }

        /**
         * Sets the value of the termsOfDelivery property.
         * 
         * @param value
         *     allowed object is
         *     {@link TermsOfDelivery }
         *     
         */
        public void setTermsOfDelivery(TermsOfDelivery value) {
            this.termsOfDelivery = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Currency"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currency"
    })
    public static class TaxAccountingCurrency {

        @XmlElement(name = "Currency", required = true)
        protected Currency currency;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setCurrency(Currency value) {
            this.currency = value;
        }

    }

}
