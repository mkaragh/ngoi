//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:06:19 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}BaseItemDetail"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PricingDetail" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}DeliveryDetail" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}RoundTripInformation" minOccurs="0"/>
 *         &lt;element name="LineItemNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfStructuredNote" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfNameValueSet" minOccurs="0"/>
 *         &lt;element name="LineItemAttachments" minOccurs="0">
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
@XmlType(name = "ItemDetail", propOrder = {
    "baseItemDetail",
    "pricingDetail",
    "deliveryDetail",
    "roundTripInformation",
    "lineItemNote",
    "listOfStructuredNote",
    "listOfNameValueSet",
    "lineItemAttachments"
})
public class ItemDetail {

    @XmlElement(name = "BaseItemDetail", required = true)
    protected BaseItemDetail baseItemDetail;
    @XmlElement(name = "PricingDetail")
    protected PricingDetail pricingDetail;
    @XmlElement(name = "DeliveryDetail")
    protected DeliveryDetail deliveryDetail;
    @XmlElement(name = "RoundTripInformation")
    protected RoundTripInformation roundTripInformation;
    @XmlElement(name = "LineItemNote")
    protected String lineItemNote;
    @XmlElement(name = "ListOfStructuredNote")
    protected ListOfStructuredNote listOfStructuredNote;
    @XmlElement(name = "ListOfNameValueSet")
    protected ListOfNameValueSet listOfNameValueSet;
    @XmlElement(name = "LineItemAttachments")
    protected ItemDetail.LineItemAttachments lineItemAttachments;

    /**
     * Gets the value of the baseItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail }
     *     
     */
    public BaseItemDetail getBaseItemDetail() {
        return baseItemDetail;
    }

    /**
     * Sets the value of the baseItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail }
     *     
     */
    public void setBaseItemDetail(BaseItemDetail value) {
        this.baseItemDetail = value;
    }

    /**
     * Gets the value of the pricingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PricingDetail }
     *     
     */
    public PricingDetail getPricingDetail() {
        return pricingDetail;
    }

    /**
     * Sets the value of the pricingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingDetail }
     *     
     */
    public void setPricingDetail(PricingDetail value) {
        this.pricingDetail = value;
    }

    /**
     * Gets the value of the deliveryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetail }
     *     
     */
    public DeliveryDetail getDeliveryDetail() {
        return deliveryDetail;
    }

    /**
     * Sets the value of the deliveryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetail }
     *     
     */
    public void setDeliveryDetail(DeliveryDetail value) {
        this.deliveryDetail = value;
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
     * Gets the value of the lineItemNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemNote() {
        return lineItemNote;
    }

    /**
     * Sets the value of the lineItemNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemNote(String value) {
        this.lineItemNote = value;
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
     * Gets the value of the lineItemAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDetail.LineItemAttachments }
     *     
     */
    public ItemDetail.LineItemAttachments getLineItemAttachments() {
        return lineItemAttachments;
    }

    /**
     * Sets the value of the lineItemAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDetail.LineItemAttachments }
     *     
     */
    public void setLineItemAttachments(ItemDetail.LineItemAttachments value) {
        this.lineItemAttachments = value;
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
    public static class LineItemAttachments {

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

}
