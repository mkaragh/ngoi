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
 * <p>Java class for TransportEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentProviderCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}EquipmentProviderCode" minOccurs="0"/>
 *         &lt;element name="EquipmentProviderCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentOwnerCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}EquipmentOwnerCode" minOccurs="0"/>
 *         &lt;element name="EquipmentOwnerCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EquipmentSizeTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}EquipmentSizeTypeCode" minOccurs="0"/>
 *         &lt;element name="EquipementSizeTypeCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipmentStatusCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}EquipmentStatusCode" minOccurs="0"/>
 *         &lt;element name="EquipmentStatusCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullIndicatorCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}FullIndicatorCode" minOccurs="0"/>
 *         &lt;element name="FullIndicatorCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Conditions" minOccurs="0"/>
 *         &lt;element name="EquipmentNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfSealInfo" minOccurs="0"/>
 *         &lt;element name="ListOfEquipmentMeasurements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDimension"/>
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
@XmlType(name = "TransportEquipment", propOrder = {
    "equipmentProviderCoded",
    "equipmentProviderCodedOther",
    "equipmentOwnerCoded",
    "equipmentOwnerCodedOther",
    "equipmentID",
    "equipmentSizeTypeCoded",
    "equipementSizeTypeCodedOther",
    "equipmentStatusCoded",
    "equipmentStatusCodedOther",
    "fullIndicatorCoded",
    "fullIndicatorCodedOther",
    "conditions",
    "equipmentNote",
    "listOfSealInfo",
    "listOfEquipmentMeasurements"
})
public class TransportEquipment {

    @XmlElement(name = "EquipmentProviderCoded")
    protected EquipmentProviderCode equipmentProviderCoded;
    @XmlElement(name = "EquipmentProviderCodedOther")
    protected String equipmentProviderCodedOther;
    @XmlElement(name = "EquipmentOwnerCoded")
    protected EquipmentOwnerCode equipmentOwnerCoded;
    @XmlElement(name = "EquipmentOwnerCodedOther")
    protected String equipmentOwnerCodedOther;
    @XmlElement(name = "EquipmentID", required = true)
    protected String equipmentID;
    @XmlElement(name = "EquipmentSizeTypeCoded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentSizeTypeCoded;
    @XmlElement(name = "EquipementSizeTypeCodedOther")
    protected String equipementSizeTypeCodedOther;
    @XmlElement(name = "EquipmentStatusCoded")
    protected EquipmentStatusCode equipmentStatusCoded;
    @XmlElement(name = "EquipmentStatusCodedOther")
    protected String equipmentStatusCodedOther;
    @XmlElement(name = "FullIndicatorCoded")
    protected FullIndicatorCode fullIndicatorCoded;
    @XmlElement(name = "FullIndicatorCodedOther")
    protected String fullIndicatorCodedOther;
    @XmlElement(name = "Conditions")
    protected Conditions conditions;
    @XmlElement(name = "EquipmentNote")
    protected String equipmentNote;
    @XmlElement(name = "ListOfSealInfo")
    protected ListOfSealInfo listOfSealInfo;
    @XmlElement(name = "ListOfEquipmentMeasurements")
    protected TransportEquipment.ListOfEquipmentMeasurements listOfEquipmentMeasurements;

    /**
     * Gets the value of the equipmentProviderCoded property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentProviderCode }
     *     
     */
    public EquipmentProviderCode getEquipmentProviderCoded() {
        return equipmentProviderCoded;
    }

    /**
     * Sets the value of the equipmentProviderCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentProviderCode }
     *     
     */
    public void setEquipmentProviderCoded(EquipmentProviderCode value) {
        this.equipmentProviderCoded = value;
    }

    /**
     * Gets the value of the equipmentProviderCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentProviderCodedOther() {
        return equipmentProviderCodedOther;
    }

    /**
     * Sets the value of the equipmentProviderCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentProviderCodedOther(String value) {
        this.equipmentProviderCodedOther = value;
    }

    /**
     * Gets the value of the equipmentOwnerCoded property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOwnerCode }
     *     
     */
    public EquipmentOwnerCode getEquipmentOwnerCoded() {
        return equipmentOwnerCoded;
    }

    /**
     * Sets the value of the equipmentOwnerCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOwnerCode }
     *     
     */
    public void setEquipmentOwnerCoded(EquipmentOwnerCode value) {
        this.equipmentOwnerCoded = value;
    }

    /**
     * Gets the value of the equipmentOwnerCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentOwnerCodedOther() {
        return equipmentOwnerCodedOther;
    }

    /**
     * Sets the value of the equipmentOwnerCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentOwnerCodedOther(String value) {
        this.equipmentOwnerCodedOther = value;
    }

    /**
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentID(String value) {
        this.equipmentID = value;
    }

    /**
     * Gets the value of the equipmentSizeTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentSizeTypeCoded() {
        return equipmentSizeTypeCoded;
    }

    /**
     * Sets the value of the equipmentSizeTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentSizeTypeCoded(String value) {
        this.equipmentSizeTypeCoded = value;
    }

    /**
     * Gets the value of the equipementSizeTypeCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipementSizeTypeCodedOther() {
        return equipementSizeTypeCodedOther;
    }

    /**
     * Sets the value of the equipementSizeTypeCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipementSizeTypeCodedOther(String value) {
        this.equipementSizeTypeCodedOther = value;
    }

    /**
     * Gets the value of the equipmentStatusCoded property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentStatusCode }
     *     
     */
    public EquipmentStatusCode getEquipmentStatusCoded() {
        return equipmentStatusCoded;
    }

    /**
     * Sets the value of the equipmentStatusCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentStatusCode }
     *     
     */
    public void setEquipmentStatusCoded(EquipmentStatusCode value) {
        this.equipmentStatusCoded = value;
    }

    /**
     * Gets the value of the equipmentStatusCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentStatusCodedOther() {
        return equipmentStatusCodedOther;
    }

    /**
     * Sets the value of the equipmentStatusCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentStatusCodedOther(String value) {
        this.equipmentStatusCodedOther = value;
    }

    /**
     * Gets the value of the fullIndicatorCoded property.
     * 
     * @return
     *     possible object is
     *     {@link FullIndicatorCode }
     *     
     */
    public FullIndicatorCode getFullIndicatorCoded() {
        return fullIndicatorCoded;
    }

    /**
     * Sets the value of the fullIndicatorCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullIndicatorCode }
     *     
     */
    public void setFullIndicatorCoded(FullIndicatorCode value) {
        this.fullIndicatorCoded = value;
    }

    /**
     * Gets the value of the fullIndicatorCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullIndicatorCodedOther() {
        return fullIndicatorCodedOther;
    }

    /**
     * Sets the value of the fullIndicatorCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullIndicatorCodedOther(String value) {
        this.fullIndicatorCodedOther = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link Conditions }
     *     
     */
    public Conditions getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conditions }
     *     
     */
    public void setConditions(Conditions value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the equipmentNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentNote() {
        return equipmentNote;
    }

    /**
     * Sets the value of the equipmentNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentNote(String value) {
        this.equipmentNote = value;
    }

    /**
     * Gets the value of the listOfSealInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSealInfo }
     *     
     */
    public ListOfSealInfo getListOfSealInfo() {
        return listOfSealInfo;
    }

    /**
     * Sets the value of the listOfSealInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSealInfo }
     *     
     */
    public void setListOfSealInfo(ListOfSealInfo value) {
        this.listOfSealInfo = value;
    }

    /**
     * Gets the value of the listOfEquipmentMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEquipment.ListOfEquipmentMeasurements }
     *     
     */
    public TransportEquipment.ListOfEquipmentMeasurements getListOfEquipmentMeasurements() {
        return listOfEquipmentMeasurements;
    }

    /**
     * Sets the value of the listOfEquipmentMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEquipment.ListOfEquipmentMeasurements }
     *     
     */
    public void setListOfEquipmentMeasurements(TransportEquipment.ListOfEquipmentMeasurements value) {
        this.listOfEquipmentMeasurements = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDimension"/>
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
        "listOfDimension"
    })
    public static class ListOfEquipmentMeasurements {

        @XmlElement(name = "ListOfDimension", required = true)
        protected ListOfDimension listOfDimension;

        /**
         * Gets the value of the listOfDimension property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfDimension }
         *     
         */
        public ListOfDimension getListOfDimension() {
            return listOfDimension;
        }

        /**
         * Sets the value of the listOfDimension property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfDimension }
         *     
         */
        public void setListOfDimension(ListOfDimension value) {
            this.listOfDimension = value;
        }

    }

}
