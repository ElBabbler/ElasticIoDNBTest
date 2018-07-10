/**
 * DNBDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class DNBDateType  extends com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDateSimpleType  implements java.io.Serializable {
    private java.lang.String datePrecisionText;  // attribute

    private java.math.BigInteger datePrecisionDNBCodeValue;  // attribute

    private int datePrecisionDNBCodeTableNumber;  // attribute

    public DNBDateType() {
    }

    // Simple Types must have a String constructor
    public DNBDateType(java.math.BigInteger _value) {
        this.datePrecisionDNBCodeValue = _value;
    }
    public DNBDateType(java.lang.String _value) {
        this.datePrecisionDNBCodeValue = new java.math.BigInteger(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return datePrecisionDNBCodeValue == null ? null : datePrecisionDNBCodeValue.toString();
    }


    /**
     * Gets the datePrecisionText value for this DNBDateType.
     * 
     * @return datePrecisionText
     */
    public java.lang.String getDatePrecisionText() {
        return datePrecisionText;
    }


    /**
     * Sets the datePrecisionText value for this DNBDateType.
     * 
     * @param datePrecisionText
     */
    public void setDatePrecisionText(java.lang.String datePrecisionText) {
        this.datePrecisionText = datePrecisionText;
    }


    /**
     * Gets the datePrecisionDNBCodeValue value for this DNBDateType.
     * 
     * @return datePrecisionDNBCodeValue
     */
    public java.math.BigInteger getDatePrecisionDNBCodeValue() {
        return datePrecisionDNBCodeValue;
    }


    /**
     * Sets the datePrecisionDNBCodeValue value for this DNBDateType.
     * 
     * @param datePrecisionDNBCodeValue
     */
    public void setDatePrecisionDNBCodeValue(java.math.BigInteger datePrecisionDNBCodeValue) {
        this.datePrecisionDNBCodeValue = datePrecisionDNBCodeValue;
    }


    /**
     * Gets the datePrecisionDNBCodeTableNumber value for this DNBDateType.
     * 
     * @return datePrecisionDNBCodeTableNumber
     */
    public int getDatePrecisionDNBCodeTableNumber() {
        return datePrecisionDNBCodeTableNumber;
    }


    /**
     * Sets the datePrecisionDNBCodeTableNumber value for this DNBDateType.
     * 
     * @param datePrecisionDNBCodeTableNumber
     */
    public void setDatePrecisionDNBCodeTableNumber(int datePrecisionDNBCodeTableNumber) {
        this.datePrecisionDNBCodeTableNumber = datePrecisionDNBCodeTableNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBDateType)) return false;
        DNBDateType other = (DNBDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datePrecisionText==null && other.getDatePrecisionText()==null) || 
             (this.datePrecisionText!=null &&
              this.datePrecisionText.equals(other.getDatePrecisionText()))) &&
            ((this.datePrecisionDNBCodeValue==null && other.getDatePrecisionDNBCodeValue()==null) || 
             (this.datePrecisionDNBCodeValue!=null &&
              this.datePrecisionDNBCodeValue.equals(other.getDatePrecisionDNBCodeValue()))) &&
            this.datePrecisionDNBCodeTableNumber == other.getDatePrecisionDNBCodeTableNumber();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDatePrecisionText() != null) {
            _hashCode += getDatePrecisionText().hashCode();
        }
        if (getDatePrecisionDNBCodeValue() != null) {
            _hashCode += getDatePrecisionDNBCodeValue().hashCode();
        }
        _hashCode += getDatePrecisionDNBCodeTableNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDateType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("datePrecisionText");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DatePrecisionText"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">DNBDateType>DatePrecisionText"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("datePrecisionDNBCodeValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DatePrecisionDNBCodeValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBCodeValueType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("datePrecisionDNBCodeTableNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DatePrecisionDNBCodeTableNumber"));
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
