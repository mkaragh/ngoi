//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="AFA"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="ADF"/>
 *     &lt;enumeration value="ADP"/>
 *     &lt;enumeration value="ARP"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="ARA"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="AWF"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="ATS"/>
 *     &lt;enumeration value="AZM"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BYB"/>
 *     &lt;enumeration value="BEF"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BAK"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BGL"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DEM"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="ECS"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="XEU"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="ZAL"/>
 *     &lt;enumeration value="FIM"/>
 *     &lt;enumeration value="FRF"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GHC"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="XAU"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GWP"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="IRA"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="IEP"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="ITL"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="AOR"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="LUF"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MGF"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MTL"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MZM"/>
 *     &lt;enumeration value="BOV"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="NLG"/>
 *     &lt;enumeration value="AON"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="ZRN"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PLZ"/>
 *     &lt;enumeration value="PTE"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="ROL"/>
 *     &lt;enumeration value="RUR"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SBL"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SKK"/>
 *     &lt;enumeration value="SIT"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SDA"/>
 *     &lt;enumeration value="SDD"/>
 *     &lt;enumeration value="SDP"/>
 *     &lt;enumeration value="SRG"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="TJR"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TPE"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TRL"/>
 *     &lt;enumeration value="TMM"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="ECV"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="USN"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="VEB"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="YUN"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCode")
@XmlEnum
public enum CurrencyCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    AFA("AFA"),
    DZD("DZD"),
    ADF("ADF"),
    ADP("ADP"),
    ARP("ARP"),
    ARS("ARS"),
    ARA("ARA"),
    AMD("AMD"),
    AWF("AWF"),
    AUD("AUD"),
    ATS("ATS"),
    AZM("AZM"),
    BSD("BSD"),
    BHD("BHD"),
    BDT("BDT"),
    BBD("BBD"),
    BYB("BYB"),
    BEF("BEF"),
    BZD("BZD"),
    BMD("BMD"),
    BTN("BTN"),
    BOB("BOB"),
    BAK("BAK"),
    BWP("BWP"),
    BRL("BRL"),
    BND("BND"),
    BGL("BGL"),
    BIF("BIF"),
    KHR("KHR"),
    CAD("CAD"),
    CVE("CVE"),
    KYD("KYD"),
    XOF("XOF"),
    XAF("XAF"),
    XPF("XPF"),
    CLP("CLP"),
    CLF("CLF"),
    CNY("CNY"),
    COP("COP"),
    KMF("KMF"),
    CRC("CRC"),
    HRK("HRK"),
    CUP("CUP"),
    CYP("CYP"),
    CZK("CZK"),
    DKK("DKK"),
    DEM("DEM"),
    BAD("BAD"),
    DJF("DJF"),
    DOP("DOP"),
    XCD("XCD"),
    ECS("ECS"),
    EGP("EGP"),
    SVC("SVC"),
    ERN("ERN"),
    EEK("EEK"),
    ETB("ETB"),
    EUR("EUR"),
    XEU("XEU"),
    FKP("FKP"),
    FJD("FJD"),
    ZAL("ZAL"),
    FIM("FIM"),
    FRF("FRF"),
    GMD("GMD"),
    GEL("GEL"),
    GHC("GHC"),
    GIP("GIP"),
    XAU("XAU"),
    GRD("GRD"),
    GTQ("GTQ"),
    GNF("GNF"),
    GWP("GWP"),
    GYD("GYD"),
    HTG("HTG"),
    HNL("HNL"),
    HKD("HKD"),
    HUF("HUF"),
    ISK("ISK"),
    INR("INR"),
    IDR("IDR"),
    IRA("IRA"),
    IRR("IRR"),
    IQD("IQD"),
    IEP("IEP"),
    ILS("ILS"),
    ITL("ITL"),
    JMD("JMD"),
    JPY("JPY"),
    JOD("JOD"),
    KZT("KZT"),
    KES("KES"),
    KWD("KWD"),
    AOR("AOR"),
    KGS("KGS"),
    LAK("LAK"),
    LVL("LVL"),
    LBP("LBP"),
    ALL("ALL"),
    LSL("LSL"),
    LRD("LRD"),
    LYD("LYD"),
    LTL("LTL"),
    LUF("LUF"),
    MOP("MOP"),
    MKD("MKD"),
    MGF("MGF"),
    MWK("MWK"),
    MYR("MYR"),
    MVR("MVR"),
    MTL("MTL"),
    MRO("MRO"),
    MUR("MUR"),
    MXN("MXN"),
    MDL("MDL"),
    MNT("MNT"),
    MAD("MAD"),
    MZM("MZM"),
    BOV("BOV"),
    MMK("MMK"),
    NAD("NAD"),
    NPR("NPR"),
    ANG("ANG"),
    AWG("AWG"),
    NLG("NLG"),
    AON("AON"),
    TWD("TWD"),
    ZRN("ZRN"),
    NZD("NZD"),
    NIO("NIO"),
    NGN("NGN"),
    KPW("KPW"),
    NOK("NOK"),
    PKR("PKR"),
    PAB("PAB"),
    PGK("PGK"),
    PYG("PYG"),
    PEN("PEN"),
    PHP("PHP"),
    PLN("PLN"),
    PLZ("PLZ"),
    PTE("PTE"),
    GBP("GBP"),
    QAR("QAR"),
    OMR("OMR"),
    ROL("ROL"),
    RUR("RUR"),
    RWF("RWF"),
    WST("WST"),
    STD("STD"),
    SAR("SAR"),
    SBL("SBL"),
    SCR("SCR"),
    SLL("SLL"),
    SGD("SGD"),
    SKK("SKK"),
    SIT("SIT"),
    SBD("SBD"),
    SOS("SOS"),
    ZAR("ZAR"),
    KRW("KRW"),
    ESP("ESP"),
    LKR("LKR"),
    SHP("SHP"),
    SDA("SDA"),
    SDD("SDD"),
    SDP("SDP"),
    SRG("SRG"),
    SZL("SZL"),
    SEK("SEK"),
    CHF("CHF"),
    SYP("SYP"),
    TJR("TJR"),
    TZS("TZS"),
    THB("THB"),
    TPE("TPE"),
    TOP("TOP"),
    TTD("TTD"),
    TND("TND"),
    TRL("TRL"),
    TMM("TMM"),
    USD("USD"),
    AED("AED"),
    UGX("UGX"),
    UAH("UAH"),
    ECV("ECV"),
    UYU("UYU"),
    USN("USN"),
    UZS("UZS"),
    VUV("VUV"),
    VEB("VEB"),
    VND("VND"),
    YER("YER"),
    YUN("YUN"),
    ZMK("ZMK"),
    ZWD("ZWD");
    private final String value;

    CurrencyCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyCode fromValue(String v) {
        for (CurrencyCode c: CurrencyCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
