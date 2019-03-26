//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnableContainerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnableContainerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnableContainerPartNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PartNum"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentResponsibilityCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PaymentResponsibilityCode" minOccurs="0"/>
 *         &lt;element name="PaymentResponsibilityCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnLoadCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ReturnLoadCode" minOccurs="0"/>
 *         &lt;element name="ReturnLoadCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnableContainerInfo", propOrder = {
    "returnableContainerPartNumber",
    "paymentResponsibilityCoded",
    "paymentResponsibilityCodedOther",
    "returnLoadCoded",
    "returnLoadCodedOther",
    "returnNote"
})
public class ReturnableContainerInfo {

    @XmlElement(name = "ReturnableContainerPartNumber")
    protected ReturnableContainerInfo.ReturnableContainerPartNumber returnableContainerPartNumber;
    @XmlElement(name = "PaymentResponsibilityCoded")
    protected PaymentResponsibilityCode paymentResponsibilityCoded;
    @XmlElement(name = "PaymentResponsibilityCodedOther")
    protected String paymentResponsibilityCodedOther;
    @XmlElement(name = "ReturnLoadCoded")
    protected ReturnLoadCode returnLoadCoded;
    @XmlElement(name = "ReturnLoadCodedOther")
    protected String returnLoadCodedOther;
    @XmlElement(name = "ReturnNote")
    protected String returnNote;

    /**
     * Gets the value of the returnableContainerPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnableContainerInfo.ReturnableContainerPartNumber }
     *     
     */
    public ReturnableContainerInfo.ReturnableContainerPartNumber getReturnableContainerPartNumber() {
        return returnableContainerPartNumber;
    }

    /**
     * Sets the value of the returnableContainerPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnableContainerInfo.ReturnableContainerPartNumber }
     *     
     */
    public void setReturnableContainerPartNumber(ReturnableContainerInfo.ReturnableContainerPartNumber value) {
        this.returnableContainerPartNumber = value;
    }

    /**
     * Gets the value of the paymentResponsibilityCoded property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponsibilityCode }
     *     
     */
    public PaymentResponsibilityCode getPaymentResponsibilityCoded() {
        return paymentResponsibilityCoded;
    }

    /**
     * Sets the value of the paymentResponsibilityCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponsibilityCode }
     *     
     */
    public void setPaymentResponsibilityCoded(PaymentResponsibilityCode value) {
        this.paymentResponsibilityCoded = value;
    }

    /**
     * Gets the value of the paymentResponsibilityCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentResponsibilityCodedOther() {
        return paymentResponsibilityCodedOther;
    }

    /**
     * Sets the value of the paymentResponsibilityCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentResponsibilityCodedOther(String value) {
        this.paymentResponsibilityCodedOther = value;
    }

    /**
     * Gets the value of the returnLoadCoded property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLoadCode }
     *     
     */
    public ReturnLoadCode getReturnLoadCoded() {
        return returnLoadCoded;
    }

    /**
     * Sets the value of the returnLoadCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLoadCode }
     *     
     */
    public void setReturnLoadCoded(ReturnLoadCode value) {
        this.returnLoadCoded = value;
    }

    /**
     * Gets the value of the returnLoadCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLoadCodedOther() {
        return returnLoadCodedOther;
    }

    /**
     * Sets the value of the returnLoadCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLoadCodedOther(String value) {
        this.returnLoadCodedOther = value;
    }

    /**
     * Gets the value of the returnNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnNote() {
        return returnNote;
    }

    /**
     * Sets the value of the returnNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnNote(String value) {
        this.returnNote = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PartNum"/>
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
        "partNum"
    })
    public static class ReturnableContainerPartNumber {

        @XmlElement(name = "PartNum", required = true)
        protected PartNum partNum;

        /**
         * Gets the value of the partNum property.
         * 
         * @return
         *     possible object is
         *     {@link PartNum }
         *     
         */
        public PartNum getPartNum() {
            return partNum;
        }

        /**
         * Sets the value of the partNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartNum }
         *     
         */
        public void setPartNum(PartNum value) {
            this.partNum = value;
        }

    }

}
