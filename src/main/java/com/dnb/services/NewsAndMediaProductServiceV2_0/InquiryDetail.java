/**
 * InquiryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * Records data that allows the customer to specify identifying information
 * about the subject being inquired, e.g., the DUNS Number, the CountryCode
 * etc.
 */
public class InquiryDetail  implements java.io.Serializable {
    /* The D-U-N-S Number is D&B's identification number, which provides
     * unique identification of this organization, in accordance with the
     * Data Universal Numbering System (D-U-N-S). */
    private java.lang.String DUNSNumber;

    private java.lang.String countryISOAlpha2Code;

    public InquiryDetail() {
    }

    public InquiryDetail(
           java.lang.String DUNSNumber,
           java.lang.String countryISOAlpha2Code) {
           this.DUNSNumber = DUNSNumber;
           this.countryISOAlpha2Code = countryISOAlpha2Code;
    }


    /**
     * Gets the DUNSNumber value for this InquiryDetail.
     * 
     * @return DUNSNumber   * The D-U-N-S Number is D&B's identification number, which provides
     * unique identification of this organization, in accordance with the
     * Data Universal Numbering System (D-U-N-S).
     */
    public java.lang.String getDUNSNumber() {
        return DUNSNumber;
    }


    /**
     * Sets the DUNSNumber value for this InquiryDetail.
     * 
     * @param DUNSNumber   * The D-U-N-S Number is D&B's identification number, which provides
     * unique identification of this organization, in accordance with the
     * Data Universal Numbering System (D-U-N-S).
     */
    public void setDUNSNumber(java.lang.String DUNSNumber) {
        this.DUNSNumber = DUNSNumber;
    }


    /**
     * Gets the countryISOAlpha2Code value for this InquiryDetail.
     * 
     * @return countryISOAlpha2Code
     */
    public java.lang.String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }


    /**
     * Sets the countryISOAlpha2Code value for this InquiryDetail.
     * 
     * @param countryISOAlpha2Code
     */
    public void setCountryISOAlpha2Code(java.lang.String countryISOAlpha2Code) {
        this.countryISOAlpha2Code = countryISOAlpha2Code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquiryDetail)) return false;
        InquiryDetail other = (InquiryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DUNSNumber==null && other.getDUNSNumber()==null) || 
             (this.DUNSNumber!=null &&
              this.DUNSNumber.equals(other.getDUNSNumber()))) &&
            ((this.countryISOAlpha2Code==null && other.getCountryISOAlpha2Code()==null) || 
             (this.countryISOAlpha2Code!=null &&
              this.countryISOAlpha2Code.equals(other.getCountryISOAlpha2Code())));
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
        if (getDUNSNumber() != null) {
            _hashCode += getDUNSNumber().hashCode();
        }
        if (getCountryISOAlpha2Code() != null) {
            _hashCode += getCountryISOAlpha2Code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquiryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "InquiryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUNSNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUNSNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryISOAlpha2Code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountryISOAlpha2Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
