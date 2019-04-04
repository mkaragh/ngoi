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
 * <p>Java class for CardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardExpirationDate" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblDatetime" minOccurs="0"/>
 *         &lt;element name="CardType" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}CardTypeCode" minOccurs="0"/>
 *         &lt;element name="CardTypeOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfo", propOrder = {
    "cardNum",
    "cardAuthCode",
    "cardRefNum",
    "cardExpirationDate",
    "cardType",
    "cardTypeOther",
    "cardHolderName"
})
public class CardInfo {

    @XmlElement(name = "CardNum", required = true)
    protected String cardNum;
    @XmlElement(name = "CardAuthCode")
    protected String cardAuthCode;
    @XmlElement(name = "CardRefNum")
    protected String cardRefNum;
    @XmlElement(name = "CardExpirationDate")
    protected String cardExpirationDate;
    @XmlElement(name = "CardType")
    protected CardTypeCode cardType;
    @XmlElement(name = "CardTypeOther")
    protected String cardTypeOther;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the cardAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAuthCode() {
        return cardAuthCode;
    }

    /**
     * Sets the value of the cardAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAuthCode(String value) {
        this.cardAuthCode = value;
    }

    /**
     * Gets the value of the cardRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRefNum() {
        return cardRefNum;
    }

    /**
     * Sets the value of the cardRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRefNum(String value) {
        this.cardRefNum = value;
    }

    /**
     * Gets the value of the cardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    /**
     * Sets the value of the cardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpirationDate(String value) {
        this.cardExpirationDate = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeCode }
     *     
     */
    public CardTypeCode getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeCode }
     *     
     */
    public void setCardType(CardTypeCode value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardTypeOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeOther() {
        return cardTypeOther;
    }

    /**
     * Sets the value of the cardTypeOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeOther(String value) {
        this.cardTypeOther = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

}
