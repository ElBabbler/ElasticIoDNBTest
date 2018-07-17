/**
 * DNBStringType256.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DNBStringType256")
@XmlAccessorType(XmlAccessType.FIELD)
public class DNBStringType256  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    @XmlAttribute(name = "LanguageCode")
    private java.math.BigInteger languageCode;  // attribute

    @XmlAttribute(name = "WritingScriptISOAlpha4Code")
    private java.lang.String writingScriptISOAlpha4Code;  // attribute

    public DNBStringType256() {
    }

    // Simple Types must have a String constructor
    public DNBStringType256(java.lang.String _value) {
        this.writingScriptISOAlpha4Code = _value;
    }


    /**
     * Gets the languageCode value for this DNBStringType256.
     * 
     * @return languageCode
     */
    public java.math.BigInteger getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this DNBStringType256.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.math.BigInteger languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the writingScriptISOAlpha4Code value for this DNBStringType256.
     * 
     * @return writingScriptISOAlpha4Code
     */
    public java.lang.String getWritingScriptISOAlpha4Code() {
        return writingScriptISOAlpha4Code;
    }


    /**
     * Sets the writingScriptISOAlpha4Code value for this DNBStringType256.
     * 
     * @param writingScriptISOAlpha4Code
     */
    public void setWritingScriptISOAlpha4Code(java.lang.String writingScriptISOAlpha4Code) {
        this.writingScriptISOAlpha4Code = writingScriptISOAlpha4Code;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBStringType256)) return false;
        DNBStringType256 other = (DNBStringType256) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.writingScriptISOAlpha4Code==null && other.getWritingScriptISOAlpha4Code()==null) || 
             (this.writingScriptISOAlpha4Code!=null &&
              this.writingScriptISOAlpha4Code.equals(other.getWritingScriptISOAlpha4Code())));
        __equalsCalc = null;
        return _equals;
    }

    private transient boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getWritingScriptISOAlpha4Code() != null) {
            _hashCode += getWritingScriptISOAlpha4Code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBStringType256.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBStringType256"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LanguageCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBCodeValueType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("writingScriptISOAlpha4Code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WritingScriptISOAlpha4Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">DNBStringType256>WritingScriptISOAlpha4Code"));
        typeDesc.addFieldDesc(attrField);
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
