/**
 * MailAddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MailAddressType")
@XmlAccessorType(XmlAccessType.FIELD)
public class MailAddressType  extends com.dnb.services.NewsAndMediaProductServiceV2_0.BaseAddressType  implements java.io.Serializable {
    public MailAddressType() {
    }

    public MailAddressType(
           com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine[] streetAddressLine,
           java.lang.String primaryTownName,
           java.lang.String countryISOAlpha2Code,
           java.math.BigInteger languageCode,
           java.math.BigInteger writingScriptCode,
           java.lang.String territoryAbbreviatedName,
           java.lang.String postalCode,
           java.lang.String countyOfficialName,
           java.lang.String territoryOfficialName) {
        super(
            streetAddressLine,
            primaryTownName,
            countryISOAlpha2Code,
            languageCode,
            writingScriptCode,
            territoryAbbreviatedName,
            postalCode,
            countyOfficialName,
            territoryOfficialName);
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MailAddressType)) return false;
        MailAddressType other = (MailAddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private transient boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MailAddressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "MailAddressType"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
