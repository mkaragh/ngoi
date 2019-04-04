//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondaryAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountControlKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}AccountTypeCode"/>
 *         &lt;element name="AccountTypeCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Currency" minOccurs="0"/>
 *         &lt;element name="AccountReferences" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetail", propOrder = {
    "accountID",
    "secondaryAccountID",
    "iban",
    "accountControlKey",
    "accountTypeCoded",
    "accountTypeCodedOther",
    "accountName1",
    "accountName2",
    "currency",
    "accountReferences"
})
public class AccountDetail {

    @XmlElement(name = "AccountID", required = true)
    protected String accountID;
    @XmlElement(name = "SecondaryAccountID")
    protected String secondaryAccountID;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "AccountControlKey")
    protected String accountControlKey;
    @XmlElement(name = "AccountTypeCoded", required = true)
    protected AccountTypeCode accountTypeCoded;
    @XmlElement(name = "AccountTypeCodedOther")
    protected String accountTypeCodedOther;
    @XmlElement(name = "AccountName1", required = true)
    protected String accountName1;
    @XmlElement(name = "AccountName2")
    protected String accountName2;
    @XmlElement(name = "Currency")
    protected Currency currency;
    @XmlElement(name = "AccountReferences")
    protected AccountDetail.AccountReferences accountReferences;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the secondaryAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryAccountID() {
        return secondaryAccountID;
    }

    /**
     * Sets the value of the secondaryAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryAccountID(String value) {
        this.secondaryAccountID = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the accountControlKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountControlKey() {
        return accountControlKey;
    }

    /**
     * Sets the value of the accountControlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountControlKey(String value) {
        this.accountControlKey = value;
    }

    /**
     * Gets the value of the accountTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeCode }
     *     
     */
    public AccountTypeCode getAccountTypeCoded() {
        return accountTypeCoded;
    }

    /**
     * Sets the value of the accountTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeCode }
     *     
     */
    public void setAccountTypeCoded(AccountTypeCode value) {
        this.accountTypeCoded = value;
    }

    /**
     * Gets the value of the accountTypeCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeCodedOther() {
        return accountTypeCodedOther;
    }

    /**
     * Sets the value of the accountTypeCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeCodedOther(String value) {
        this.accountTypeCodedOther = value;
    }

    /**
     * Gets the value of the accountName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName1() {
        return accountName1;
    }

    /**
     * Sets the value of the accountName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName1(String value) {
        this.accountName1 = value;
    }

    /**
     * Gets the value of the accountName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName2() {
        return accountName2;
    }

    /**
     * Sets the value of the accountName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName2(String value) {
        this.accountName2 = value;
    }

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

    /**
     * Gets the value of the accountReferences property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetail.AccountReferences }
     *     
     */
    public AccountDetail.AccountReferences getAccountReferences() {
        return accountReferences;
    }

    /**
     * Sets the value of the accountReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetail.AccountReferences }
     *     
     */
    public void setAccountReferences(AccountDetail.AccountReferences value) {
        this.accountReferences = value;
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
    public static class AccountReferences {

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