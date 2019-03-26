//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MeasurementValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementValue">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="SignificanceCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SignificanceCode" />
 *       &lt;attribute name="SignificanceCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConditionsCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ConditionsCode" />
 *       &lt;attribute name="ConditionsCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementValue", propOrder = {
    "value"
})
public class MeasurementValue {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "SignificanceCoded")
    protected SignificanceCode significanceCoded;
    @XmlAttribute(name = "SignificanceCodedOther")
    protected String significanceCodedOther;
    @XmlAttribute(name = "ConditionsCoded")
    protected ConditionsCode conditionsCoded;
    @XmlAttribute(name = "ConditionsCodedOther")
    protected String conditionsCodedOther;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the significanceCoded property.
     * 
     * @return
     *     possible object is
     *     {@link SignificanceCode }
     *     
     */
    public SignificanceCode getSignificanceCoded() {
        return significanceCoded;
    }

    /**
     * Sets the value of the significanceCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificanceCode }
     *     
     */
    public void setSignificanceCoded(SignificanceCode value) {
        this.significanceCoded = value;
    }

    /**
     * Gets the value of the significanceCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificanceCodedOther() {
        return significanceCodedOther;
    }

    /**
     * Sets the value of the significanceCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificanceCodedOther(String value) {
        this.significanceCodedOther = value;
    }

    /**
     * Gets the value of the conditionsCoded property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsCode }
     *     
     */
    public ConditionsCode getConditionsCoded() {
        return conditionsCoded;
    }

    /**
     * Sets the value of the conditionsCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsCode }
     *     
     */
    public void setConditionsCoded(ConditionsCode value) {
        this.conditionsCoded = value;
    }

    /**
     * Gets the value of the conditionsCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionsCodedOther() {
        return conditionsCodedOther;
    }

    /**
     * Sets the value of the conditionsCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionsCodedOther(String value) {
        this.conditionsCodedOther = value;
    }

}
