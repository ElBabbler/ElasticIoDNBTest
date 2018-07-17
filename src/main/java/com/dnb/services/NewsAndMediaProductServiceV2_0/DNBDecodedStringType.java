/**
 * DNBDecodedStringType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="DNBDecodedStringType")
@XmlAccessorType(XmlAccessType.FIELD)
public class DNBDecodedStringType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    @XmlAttribute(name = "DNBCodeValue")
    private java.math.BigInteger DNBCodeValue;  // attribute

    @XmlAttribute(name = "DNBCodeTableNumber")
    private int DNBCodeTableNumber;  // attribute

    public DNBDecodedStringType() {
    }

    // Simple Types must have a String constructor
    public DNBDecodedStringType(java.math.BigInteger _value) {
        this.DNBCodeValue = _value;
    }
    public DNBDecodedStringType(java.lang.String _value) {
        this.DNBCodeValue = new java.math.BigInteger(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return DNBCodeValue == null ? null : DNBCodeValue.toString();
    }


    /**
     * Gets the DNBCodeValue value for this DNBDecodedStringType.
     * 
     * @return DNBCodeValue
     */
    public java.math.BigInteger getDNBCodeValue() {
        return DNBCodeValue;
    }


    /**
     * Sets the DNBCodeValue value for this DNBDecodedStringType.
     * 
     * @param DNBCodeValue
     */
    public void setDNBCodeValue(java.math.BigInteger DNBCodeValue) {
        this.DNBCodeValue = DNBCodeValue;
    }


    /**
     * Gets the DNBCodeTableNumber value for this DNBDecodedStringType.
     * 
     * @return DNBCodeTableNumber
     */
    public int getDNBCodeTableNumber() {
        return DNBCodeTableNumber;
    }


    /**
     * Sets the DNBCodeTableNumber value for this DNBDecodedStringType.
     * 
     * @param DNBCodeTableNumber
     */
    public void setDNBCodeTableNumber(int DNBCodeTableNumber) {
        this.DNBCodeTableNumber = DNBCodeTableNumber;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBDecodedStringType)) return false;
        DNBDecodedStringType other = (DNBDecodedStringType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DNBCodeValue==null && other.getDNBCodeValue()==null) || 
             (this.DNBCodeValue!=null &&
              this.DNBCodeValue.equals(other.getDNBCodeValue()))) &&
            this.DNBCodeTableNumber == other.getDNBCodeTableNumber();
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
        if (getDNBCodeValue() != null) {
            _hashCode += getDNBCodeValue().hashCode();
        }
        _hashCode += getDNBCodeTableNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBDecodedStringType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDecodedStringType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DNBCodeValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DNBCodeValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBCodeValueType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DNBCodeTableNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DNBCodeTableNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
