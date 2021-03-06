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
 * <p>Java class for Hazardous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hazardous">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfHazardousIdentifiers" minOccurs="0"/>
 *         &lt;element name="HazardClassCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}HazardClassCode" minOccurs="0"/>
 *         &lt;element name="HazardClassCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}HazardousPlacardInformation" minOccurs="0"/>
 *         &lt;element name="HazardousReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfReferenceCoded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HazardousContact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Contact"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HazardNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNDGNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}HazardousTemperatures" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}HazardousShipmentInformation" minOccurs="0"/>
 *         &lt;element name="EMSNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mfag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hazardous", propOrder = {
    "listOfHazardousIdentifiers",
    "hazardClassCoded",
    "hazardClassCodedOther",
    "hazardousPlacardInformation",
    "hazardousReferences",
    "hazardousContact",
    "hazardNote",
    "undgNum",
    "hazardousTemperatures",
    "hazardousShipmentInformation",
    "emsNum",
    "mfag"
})
public class Hazardous {

    @XmlElement(name = "ListOfHazardousIdentifiers")
    protected ListOfHazardousIdentifiers listOfHazardousIdentifiers;
    @XmlElement(name = "HazardClassCoded")
    protected HazardClassCode hazardClassCoded;
    @XmlElement(name = "HazardClassCodedOther")
    protected String hazardClassCodedOther;
    @XmlElement(name = "HazardousPlacardInformation")
    protected HazardousPlacardInformation hazardousPlacardInformation;
    @XmlElement(name = "HazardousReferences")
    protected Hazardous.HazardousReferences hazardousReferences;
    @XmlElement(name = "HazardousContact")
    protected Hazardous.HazardousContact hazardousContact;
    @XmlElement(name = "HazardNote")
    protected String hazardNote;
    @XmlElement(name = "UNDGNum")
    protected Integer undgNum;
    @XmlElement(name = "HazardousTemperatures")
    protected HazardousTemperatures hazardousTemperatures;
    @XmlElement(name = "HazardousShipmentInformation")
    protected HazardousShipmentInformation hazardousShipmentInformation;
    @XmlElement(name = "EMSNum")
    protected String emsNum;
    @XmlElement(name = "Mfag")
    protected String mfag;

    /**
     * Gets the value of the listOfHazardousIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfHazardousIdentifiers }
     *     
     */
    public ListOfHazardousIdentifiers getListOfHazardousIdentifiers() {
        return listOfHazardousIdentifiers;
    }

    /**
     * Sets the value of the listOfHazardousIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfHazardousIdentifiers }
     *     
     */
    public void setListOfHazardousIdentifiers(ListOfHazardousIdentifiers value) {
        this.listOfHazardousIdentifiers = value;
    }

    /**
     * Gets the value of the hazardClassCoded property.
     * 
     * @return
     *     possible object is
     *     {@link HazardClassCode }
     *     
     */
    public HazardClassCode getHazardClassCoded() {
        return hazardClassCoded;
    }

    /**
     * Sets the value of the hazardClassCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardClassCode }
     *     
     */
    public void setHazardClassCoded(HazardClassCode value) {
        this.hazardClassCoded = value;
    }

    /**
     * Gets the value of the hazardClassCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardClassCodedOther() {
        return hazardClassCodedOther;
    }

    /**
     * Sets the value of the hazardClassCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardClassCodedOther(String value) {
        this.hazardClassCodedOther = value;
    }

    /**
     * Gets the value of the hazardousPlacardInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousPlacardInformation }
     *     
     */
    public HazardousPlacardInformation getHazardousPlacardInformation() {
        return hazardousPlacardInformation;
    }

    /**
     * Sets the value of the hazardousPlacardInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousPlacardInformation }
     *     
     */
    public void setHazardousPlacardInformation(HazardousPlacardInformation value) {
        this.hazardousPlacardInformation = value;
    }

    /**
     * Gets the value of the hazardousReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Hazardous.HazardousReferences }
     *     
     */
    public Hazardous.HazardousReferences getHazardousReferences() {
        return hazardousReferences;
    }

    /**
     * Sets the value of the hazardousReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hazardous.HazardousReferences }
     *     
     */
    public void setHazardousReferences(Hazardous.HazardousReferences value) {
        this.hazardousReferences = value;
    }

    /**
     * Gets the value of the hazardousContact property.
     * 
     * @return
     *     possible object is
     *     {@link Hazardous.HazardousContact }
     *     
     */
    public Hazardous.HazardousContact getHazardousContact() {
        return hazardousContact;
    }

    /**
     * Sets the value of the hazardousContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hazardous.HazardousContact }
     *     
     */
    public void setHazardousContact(Hazardous.HazardousContact value) {
        this.hazardousContact = value;
    }

    /**
     * Gets the value of the hazardNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardNote() {
        return hazardNote;
    }

    /**
     * Sets the value of the hazardNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardNote(String value) {
        this.hazardNote = value;
    }

    /**
     * Gets the value of the undgNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUNDGNum() {
        return undgNum;
    }

    /**
     * Sets the value of the undgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUNDGNum(Integer value) {
        this.undgNum = value;
    }

    /**
     * Gets the value of the hazardousTemperatures property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousTemperatures }
     *     
     */
    public HazardousTemperatures getHazardousTemperatures() {
        return hazardousTemperatures;
    }

    /**
     * Sets the value of the hazardousTemperatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousTemperatures }
     *     
     */
    public void setHazardousTemperatures(HazardousTemperatures value) {
        this.hazardousTemperatures = value;
    }

    /**
     * Gets the value of the hazardousShipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousShipmentInformation }
     *     
     */
    public HazardousShipmentInformation getHazardousShipmentInformation() {
        return hazardousShipmentInformation;
    }

    /**
     * Sets the value of the hazardousShipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousShipmentInformation }
     *     
     */
    public void setHazardousShipmentInformation(HazardousShipmentInformation value) {
        this.hazardousShipmentInformation = value;
    }

    /**
     * Gets the value of the emsNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMSNum() {
        return emsNum;
    }

    /**
     * Sets the value of the emsNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMSNum(String value) {
        this.emsNum = value;
    }

    /**
     * Gets the value of the mfag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfag() {
        return mfag;
    }

    /**
     * Sets the value of the mfag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfag(String value) {
        this.mfag = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Contact"/>
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
        "contact"
    })
    public static class HazardousContact {

        @XmlElement(name = "Contact", required = true)
        protected Contact contact;

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link Contact }
         *     
         */
        public Contact getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contact }
         *     
         */
        public void setContact(Contact value) {
            this.contact = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfReferenceCoded"/>
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
        "listOfReferenceCoded"
    })
    public static class HazardousReferences {

        @XmlElement(name = "ListOfReferenceCoded", required = true)
        protected ListOfReferenceCoded listOfReferenceCoded;

        /**
         * Gets the value of the listOfReferenceCoded property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfReferenceCoded }
         *     
         */
        public ListOfReferenceCoded getListOfReferenceCoded() {
            return listOfReferenceCoded;
        }

        /**
         * Sets the value of the listOfReferenceCoded property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfReferenceCoded }
         *     
         */
        public void setListOfReferenceCoded(ListOfReferenceCoded value) {
            this.listOfReferenceCoded = value;
        }

    }

}
