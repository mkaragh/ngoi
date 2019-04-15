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
 * <p>Java class for BaseItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseItemDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}LineItemNum"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}LineItemType" minOccurs="0"/>
 *         &lt;element name="ParentItemNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}LineItemNumberReference"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ItemIdentifiers" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDimension" minOccurs="0"/>
 *         &lt;element name="TotalQuantity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaxBackOrderQuantity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfQuantityCoded" minOccurs="0"/>
 *         &lt;element name="OffCatalogFlag" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblBoolean" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}CatalogReference" minOccurs="0"/>
 *         &lt;element name="ItemContractReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfContractItem"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ListOfItemReferences" minOccurs="0">
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
 *         &lt;element name="CountryOfOrigin" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Country"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountryOfDestination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Country"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FinalRecipient" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Party"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfPartyCoded" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ConditionsOfSale" minOccurs="0"/>
 *         &lt;element name="HazardousMaterials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Hazardous"/>
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
@XmlType(name = "BaseItemDetail", propOrder = {
    "lineItemNum",
    "lineItemType",
    "parentItemNumber",
    "itemIdentifiers",
    "listOfDimension",
    "totalQuantity",
    "maxBackOrderQuantity",
    "listOfQuantityCoded",
    "offCatalogFlag",
    "catalogReference",
    "itemContractReferences",
    "listOfItemReferences",
    "countryOfOrigin",
    "countryOfDestination",
    "finalRecipient",
    "listOfPartyCoded",
    "conditionsOfSale",
    "hazardousMaterials"
})
public class BaseItemDetail {

    @XmlElement(name = "LineItemNum", required = true)
    protected LineItemNum lineItemNum;
    @XmlElement(name = "LineItemType")
    protected LineItemType lineItemType;
    @XmlElement(name = "ParentItemNumber")
    protected BaseItemDetail.ParentItemNumber parentItemNumber;
    @XmlElement(name = "ItemIdentifiers")
    protected ItemIdentifiers itemIdentifiers;
    @XmlElement(name = "ListOfDimension")
    protected ListOfDimension listOfDimension;
    @XmlElement(name = "TotalQuantity")
    protected BaseItemDetail.TotalQuantity totalQuantity;
    @XmlElement(name = "MaxBackOrderQuantity")
    protected BaseItemDetail.MaxBackOrderQuantity maxBackOrderQuantity;
    @XmlElement(name = "ListOfQuantityCoded")
    protected ListOfQuantityCoded listOfQuantityCoded;
    @XmlElement(name = "OffCatalogFlag")
    protected Boolean offCatalogFlag;
    @XmlElement(name = "CatalogReference")
    protected CatalogReference catalogReference;
    @XmlElement(name = "ItemContractReferences")
    protected BaseItemDetail.ItemContractReferences itemContractReferences;
    @XmlElement(name = "ListOfItemReferences")
    protected BaseItemDetail.ListOfItemReferences listOfItemReferences;
    @XmlElement(name = "CountryOfOrigin")
    protected BaseItemDetail.CountryOfOrigin countryOfOrigin;
    @XmlElement(name = "CountryOfDestination")
    protected BaseItemDetail.CountryOfDestination countryOfDestination;
    @XmlElement(name = "FinalRecipient")
    protected BaseItemDetail.FinalRecipient finalRecipient;
    @XmlElement(name = "ListOfPartyCoded")
    protected ListOfPartyCoded listOfPartyCoded;
    @XmlElement(name = "ConditionsOfSale")
    protected ConditionsOfSale conditionsOfSale;
    @XmlElement(name = "HazardousMaterials")
    protected BaseItemDetail.HazardousMaterials hazardousMaterials;

    /**
     * Gets the value of the lineItemNum property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemNum }
     *     
     */
    public LineItemNum getLineItemNum() {
        return lineItemNum;
    }

    /**
     * Sets the value of the lineItemNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemNum }
     *     
     */
    public void setLineItemNum(LineItemNum value) {
        this.lineItemNum = value;
    }

    /**
     * Gets the value of the lineItemType property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType }
     *     
     */
    public LineItemType getLineItemType() {
        return lineItemType;
    }

    /**
     * Sets the value of the lineItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType }
     *     
     */
    public void setLineItemType(LineItemType value) {
        this.lineItemType = value;
    }

    /**
     * Gets the value of the parentItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.ParentItemNumber }
     *     
     */
    public BaseItemDetail.ParentItemNumber getParentItemNumber() {
        return parentItemNumber;
    }

    /**
     * Sets the value of the parentItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.ParentItemNumber }
     *     
     */
    public void setParentItemNumber(BaseItemDetail.ParentItemNumber value) {
        this.parentItemNumber = value;
    }

    /**
     * Gets the value of the itemIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentifiers }
     *     
     */
    public ItemIdentifiers getItemIdentifiers() {
        return itemIdentifiers;
    }

    /**
     * Sets the value of the itemIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentifiers }
     *     
     */
    public void setItemIdentifiers(ItemIdentifiers value) {
        this.itemIdentifiers = value;
    }

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

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.TotalQuantity }
     *     
     */
    public BaseItemDetail.TotalQuantity getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.TotalQuantity }
     *     
     */
    public void setTotalQuantity(BaseItemDetail.TotalQuantity value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the maxBackOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.MaxBackOrderQuantity }
     *     
     */
    public BaseItemDetail.MaxBackOrderQuantity getMaxBackOrderQuantity() {
        return maxBackOrderQuantity;
    }

    /**
     * Sets the value of the maxBackOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.MaxBackOrderQuantity }
     *     
     */
    public void setMaxBackOrderQuantity(BaseItemDetail.MaxBackOrderQuantity value) {
        this.maxBackOrderQuantity = value;
    }

    /**
     * Gets the value of the listOfQuantityCoded property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuantityCoded }
     *     
     */
    public ListOfQuantityCoded getListOfQuantityCoded() {
        return listOfQuantityCoded;
    }

    /**
     * Sets the value of the listOfQuantityCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuantityCoded }
     *     
     */
    public void setListOfQuantityCoded(ListOfQuantityCoded value) {
        this.listOfQuantityCoded = value;
    }

    /**
     * Gets the value of the offCatalogFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffCatalogFlag() {
        return offCatalogFlag;
    }

    /**
     * Sets the value of the offCatalogFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffCatalogFlag(Boolean value) {
        this.offCatalogFlag = value;
    }

    /**
     * Gets the value of the catalogReference property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogReference }
     *     
     */
    public CatalogReference getCatalogReference() {
        return catalogReference;
    }

    /**
     * Sets the value of the catalogReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogReference }
     *     
     */
    public void setCatalogReference(CatalogReference value) {
        this.catalogReference = value;
    }

    /**
     * Gets the value of the itemContractReferences property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.ItemContractReferences }
     *     
     */
    public BaseItemDetail.ItemContractReferences getItemContractReferences() {
        return itemContractReferences;
    }

    /**
     * Sets the value of the itemContractReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.ItemContractReferences }
     *     
     */
    public void setItemContractReferences(BaseItemDetail.ItemContractReferences value) {
        this.itemContractReferences = value;
    }

    /**
     * Gets the value of the listOfItemReferences property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.ListOfItemReferences }
     *     
     */
    public BaseItemDetail.ListOfItemReferences getListOfItemReferences() {
        return listOfItemReferences;
    }

    /**
     * Sets the value of the listOfItemReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.ListOfItemReferences }
     *     
     */
    public void setListOfItemReferences(BaseItemDetail.ListOfItemReferences value) {
        this.listOfItemReferences = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.CountryOfOrigin }
     *     
     */
    public BaseItemDetail.CountryOfOrigin getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.CountryOfOrigin }
     *     
     */
    public void setCountryOfOrigin(BaseItemDetail.CountryOfOrigin value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the countryOfDestination property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.CountryOfDestination }
     *     
     */
    public BaseItemDetail.CountryOfDestination getCountryOfDestination() {
        return countryOfDestination;
    }

    /**
     * Sets the value of the countryOfDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.CountryOfDestination }
     *     
     */
    public void setCountryOfDestination(BaseItemDetail.CountryOfDestination value) {
        this.countryOfDestination = value;
    }

    /**
     * Gets the value of the finalRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.FinalRecipient }
     *     
     */
    public BaseItemDetail.FinalRecipient getFinalRecipient() {
        return finalRecipient;
    }

    /**
     * Sets the value of the finalRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.FinalRecipient }
     *     
     */
    public void setFinalRecipient(BaseItemDetail.FinalRecipient value) {
        this.finalRecipient = value;
    }

    /**
     * Gets the value of the listOfPartyCoded property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPartyCoded }
     *     
     */
    public ListOfPartyCoded getListOfPartyCoded() {
        return listOfPartyCoded;
    }

    /**
     * Sets the value of the listOfPartyCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPartyCoded }
     *     
     */
    public void setListOfPartyCoded(ListOfPartyCoded value) {
        this.listOfPartyCoded = value;
    }

    /**
     * Gets the value of the conditionsOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsOfSale }
     *     
     */
    public ConditionsOfSale getConditionsOfSale() {
        return conditionsOfSale;
    }

    /**
     * Sets the value of the conditionsOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsOfSale }
     *     
     */
    public void setConditionsOfSale(ConditionsOfSale value) {
        this.conditionsOfSale = value;
    }

    /**
     * Gets the value of the hazardousMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link BaseItemDetail.HazardousMaterials }
     *     
     */
    public BaseItemDetail.HazardousMaterials getHazardousMaterials() {
        return hazardousMaterials;
    }

    /**
     * Sets the value of the hazardousMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseItemDetail.HazardousMaterials }
     *     
     */
    public void setHazardousMaterials(BaseItemDetail.HazardousMaterials value) {
        this.hazardousMaterials = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Country"/>
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
        "country"
    })
    public static class CountryOfDestination {

        @XmlElement(name = "Country", required = true)
        protected Country country;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link Country }
         *     
         */
        public Country getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link Country }
         *     
         */
        public void setCountry(Country value) {
            this.country = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Country"/>
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
        "country"
    })
    public static class CountryOfOrigin {

        @XmlElement(name = "Country", required = true)
        protected Country country;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link Country }
         *     
         */
        public Country getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link Country }
         *     
         */
        public void setCountry(Country value) {
            this.country = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Party"/>
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
        "party"
    })
    public static class FinalRecipient {

        @XmlElement(name = "Party", required = true)
        protected Party party;

        /**
         * Gets the value of the party property.
         * 
         * @return
         *     possible object is
         *     {@link Party }
         *     
         */
        public Party getParty() {
            return party;
        }

        /**
         * Sets the value of the party property.
         * 
         * @param value
         *     allowed object is
         *     {@link Party }
         *     
         */
        public void setParty(Party value) {
            this.party = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Hazardous"/>
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
        "hazardous"
    })
    public static class HazardousMaterials {

        @XmlElement(name = "Hazardous", required = true)
        protected Hazardous hazardous;

        /**
         * Gets the value of the hazardous property.
         * 
         * @return
         *     possible object is
         *     {@link Hazardous }
         *     
         */
        public Hazardous getHazardous() {
            return hazardous;
        }

        /**
         * Sets the value of the hazardous property.
         * 
         * @param value
         *     allowed object is
         *     {@link Hazardous }
         *     
         */
        public void setHazardous(Hazardous value) {
            this.hazardous = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfContractItem"/>
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
        "listOfContractItem"
    })
    public static class ItemContractReferences {

        @XmlElement(name = "ListOfContractItem", required = true)
        protected ListOfContractItem listOfContractItem;

        /**
         * Gets the value of the listOfContractItem property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfContractItem }
         *     
         */
        public ListOfContractItem getListOfContractItem() {
            return listOfContractItem;
        }

        /**
         * Sets the value of the listOfContractItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfContractItem }
         *     
         */
        public void setListOfContractItem(ListOfContractItem value) {
            this.listOfContractItem = value;
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
    public static class ListOfItemReferences {

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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
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
        "quantity"
    })
    public static class MaxBackOrderQuantity {

        @XmlElement(name = "Quantity", required = true)
        protected Quantity quantity;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Quantity }
         *     
         */
        public Quantity getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Quantity }
         *     
         */
        public void setQuantity(Quantity value) {
            this.quantity = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}LineItemNumberReference"/>
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
        "lineItemNumberReference"
    })
    public static class ParentItemNumber {

        @XmlElement(name = "LineItemNumberReference", required = true)
        protected LineItemNumberReference lineItemNumberReference;

        /**
         * Gets the value of the lineItemNumberReference property.
         * 
         * @return
         *     possible object is
         *     {@link LineItemNumberReference }
         *     
         */
        public LineItemNumberReference getLineItemNumberReference() {
            return lineItemNumberReference;
        }

        /**
         * Sets the value of the lineItemNumberReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link LineItemNumberReference }
         *     
         */
        public void setLineItemNumberReference(LineItemNumberReference value) {
            this.lineItemNumberReference = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
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
        "quantity"
    })
    public static class TotalQuantity {

        @XmlElement(name = "Quantity", required = true)
        protected Quantity quantity;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Quantity }
         *     
         */
        public Quantity getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Quantity }
         *     
         */
        public void setQuantity(Quantity value) {
            this.quantity = value;
        }

    }

}
