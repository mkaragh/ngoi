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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ReferenceCoded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceCoded">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ReferenceTypeCode"/>
 *         &lt;element name="ReferenceTypeCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryReference">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Reference"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupportingReference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Reference"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupportingSubReference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Reference"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReferenceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceCoded", propOrder = {
    "referenceTypeCoded",
    "referenceTypeCodedOther",
    "primaryReference",
    "supportingReference",
    "supportingSubReference",
    "referenceDescription"
})
public class ReferenceCoded {

    @XmlElement(name = "ReferenceTypeCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referenceTypeCoded;
    @XmlElement(name = "ReferenceTypeCodedOther")
    protected String referenceTypeCodedOther;
    @XmlElement(name = "PrimaryReference", required = true)
    protected ReferenceCoded.PrimaryReference primaryReference;
    @XmlElement(name = "SupportingReference")
    protected ReferenceCoded.SupportingReference supportingReference;
    @XmlElement(name = "SupportingSubReference")
    protected ReferenceCoded.SupportingSubReference supportingSubReference;
    @XmlElement(name = "ReferenceDescription")
    protected String referenceDescription;

    /**
     * Gets the value of the referenceTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTypeCoded() {
        return referenceTypeCoded;
    }

    /**
     * Sets the value of the referenceTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTypeCoded(String value) {
        this.referenceTypeCoded = value;
    }

    /**
     * Gets the value of the referenceTypeCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTypeCodedOther() {
        return referenceTypeCodedOther;
    }

    /**
     * Sets the value of the referenceTypeCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTypeCodedOther(String value) {
        this.referenceTypeCodedOther = value;
    }

    /**
     * Gets the value of the primaryReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceCoded.PrimaryReference }
     *     
     */
    public ReferenceCoded.PrimaryReference getPrimaryReference() {
        return primaryReference;
    }

    /**
     * Sets the value of the primaryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceCoded.PrimaryReference }
     *     
     */
    public void setPrimaryReference(ReferenceCoded.PrimaryReference value) {
        this.primaryReference = value;
    }

    /**
     * Gets the value of the supportingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceCoded.SupportingReference }
     *     
     */
    public ReferenceCoded.SupportingReference getSupportingReference() {
        return supportingReference;
    }

    /**
     * Sets the value of the supportingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceCoded.SupportingReference }
     *     
     */
    public void setSupportingReference(ReferenceCoded.SupportingReference value) {
        this.supportingReference = value;
    }

    /**
     * Gets the value of the supportingSubReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceCoded.SupportingSubReference }
     *     
     */
    public ReferenceCoded.SupportingSubReference getSupportingSubReference() {
        return supportingSubReference;
    }

    /**
     * Sets the value of the supportingSubReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceCoded.SupportingSubReference }
     *     
     */
    public void setSupportingSubReference(ReferenceCoded.SupportingSubReference value) {
        this.supportingSubReference = value;
    }

    /**
     * Gets the value of the referenceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDescription() {
        return referenceDescription;
    }

    /**
     * Sets the value of the referenceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDescription(String value) {
        this.referenceDescription = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Reference"/>
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
        "reference"
    })
    public static class PrimaryReference {

        @XmlElement(name = "Reference", required = true)
        protected Reference reference;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link Reference }
         *     
         */
        public Reference getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reference }
         *     
         */
        public void setReference(Reference value) {
            this.reference = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Reference"/>
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
        "reference"
    })
    public static class SupportingReference {

        @XmlElement(name = "Reference", required = true)
        protected Reference reference;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link Reference }
         *     
         */
        public Reference getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reference }
         *     
         */
        public void setReference(Reference value) {
            this.reference = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Reference"/>
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
        "reference"
    })
    public static class SupportingSubReference {

        @XmlElement(name = "Reference", required = true)
        protected Reference reference;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link Reference }
         *     
         */
        public Reference getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reference }
         *     
         */
        public void setReference(Reference value) {
            this.reference = value;
        }

    }

}
