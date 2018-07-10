/**
 * SubjectHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class SubjectHeader  implements java.io.Serializable {
    /* The D-U-N-S Number is D&B's identification number, which provides
     * unique identification of this organization, in accordance with the
     * Data Universal Numbering System (D-U-N-S). */
    private java.lang.String DUNSNumber;

    /* The date when the data recorded in the D&B Database on this
     * subject was last updated. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDateType lastUpdateDate;

    /* When turned ON (set to TRUE) this indicates that the record
     * satisfies D&B marketability rules.
     * When turned OFF (set to FALSE) this indicates that the record does
     * not satisfy D&B marketability rules; however, there is no requirement
     * to create this tag to represent this fact. */
    private java.lang.Boolean marketabilityIndicator;

    /* Text specifying the reason why the subject's data is not considered
     * marketable by D&B. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] nonMarketableReasonText;

    public SubjectHeader() {
    }

    public SubjectHeader(
           java.lang.String DUNSNumber,
           com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDateType lastUpdateDate,
           java.lang.Boolean marketabilityIndicator,
           com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] nonMarketableReasonText) {
           this.DUNSNumber = DUNSNumber;
           this.lastUpdateDate = lastUpdateDate;
           this.marketabilityIndicator = marketabilityIndicator;
           this.nonMarketableReasonText = nonMarketableReasonText;
    }


    /**
     * Gets the DUNSNumber value for this SubjectHeader.
     * 
     * @return DUNSNumber   * The D-U-N-S Number is D&B's identification number, which provides
     * unique identification of this organization, in accordance with the
     * Data Universal Numbering System (D-U-N-S).
     */
    public java.lang.String getDUNSNumber() {
        return DUNSNumber;
    }


    /**
     * Sets the DUNSNumber value for this SubjectHeader.
     * 
     * @param DUNSNumber   * The D-U-N-S Number is D&B's identification number, which provides
     * unique identification of this organization, in accordance with the
     * Data Universal Numbering System (D-U-N-S).
     */
    public void setDUNSNumber(java.lang.String DUNSNumber) {
        this.DUNSNumber = DUNSNumber;
    }


    /**
     * Gets the lastUpdateDate value for this SubjectHeader.
     * 
     * @return lastUpdateDate   * The date when the data recorded in the D&B Database on this
     * subject was last updated.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDateType getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this SubjectHeader.
     * 
     * @param lastUpdateDate   * The date when the data recorded in the D&B Database on this
     * subject was last updated.
     */
    public void setLastUpdateDate(com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDateType lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the marketabilityIndicator value for this SubjectHeader.
     * 
     * @return marketabilityIndicator   * When turned ON (set to TRUE) this indicates that the record
     * satisfies D&B marketability rules.
     * When turned OFF (set to FALSE) this indicates that the record does
     * not satisfy D&B marketability rules; however, there is no requirement
     * to create this tag to represent this fact.
     */
    public java.lang.Boolean getMarketabilityIndicator() {
        return marketabilityIndicator;
    }


    /**
     * Sets the marketabilityIndicator value for this SubjectHeader.
     * 
     * @param marketabilityIndicator   * When turned ON (set to TRUE) this indicates that the record
     * satisfies D&B marketability rules.
     * When turned OFF (set to FALSE) this indicates that the record does
     * not satisfy D&B marketability rules; however, there is no requirement
     * to create this tag to represent this fact.
     */
    public void setMarketabilityIndicator(java.lang.Boolean marketabilityIndicator) {
        this.marketabilityIndicator = marketabilityIndicator;
    }


    /**
     * Gets the nonMarketableReasonText value for this SubjectHeader.
     * 
     * @return nonMarketableReasonText   * Text specifying the reason why the subject's data is not considered
     * marketable by D&B.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] getNonMarketableReasonText() {
        return nonMarketableReasonText;
    }


    /**
     * Sets the nonMarketableReasonText value for this SubjectHeader.
     * 
     * @param nonMarketableReasonText   * Text specifying the reason why the subject's data is not considered
     * marketable by D&B.
     */
    public void setNonMarketableReasonText(com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] nonMarketableReasonText) {
        this.nonMarketableReasonText = nonMarketableReasonText;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType getNonMarketableReasonText(int i) {
        return this.nonMarketableReasonText[i];
    }

    public void setNonMarketableReasonText(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType _value) {
        this.nonMarketableReasonText[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubjectHeader)) return false;
        SubjectHeader other = (SubjectHeader) obj;
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
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.marketabilityIndicator==null && other.getMarketabilityIndicator()==null) || 
             (this.marketabilityIndicator!=null &&
              this.marketabilityIndicator.equals(other.getMarketabilityIndicator()))) &&
            ((this.nonMarketableReasonText==null && other.getNonMarketableReasonText()==null) || 
             (this.nonMarketableReasonText!=null &&
              java.util.Arrays.equals(this.nonMarketableReasonText, other.getNonMarketableReasonText())));
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
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getMarketabilityIndicator() != null) {
            _hashCode += getMarketabilityIndicator().hashCode();
        }
        if (getNonMarketableReasonText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonMarketableReasonText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonMarketableReasonText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubjectHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SubjectHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUNSNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DUNSNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketabilityIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MarketabilityIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMarketableReasonText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NonMarketableReasonText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDecodedStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
