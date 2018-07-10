/**
 * InquiryReferenceDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class InquiryReferenceDetail  implements java.io.Serializable {
    /* A freeform reference string provided by the customer to be
     * linked to the product in order to support subsequent order reconciliation. */
    private java.lang.String[] customerReferenceText;

    /* Text that is filled in by customer and commonly contains requesting
     * individual or department name, or customer's own account/reference
     * number and/or name for the case on which the product was provided.This
     * text is a reference used during the billing process. */
    private java.lang.String customerBillingEndorsementText;

    public InquiryReferenceDetail() {
    }

    public InquiryReferenceDetail(
           java.lang.String[] customerReferenceText,
           java.lang.String customerBillingEndorsementText) {
           this.customerReferenceText = customerReferenceText;
           this.customerBillingEndorsementText = customerBillingEndorsementText;
    }


    /**
     * Gets the customerReferenceText value for this InquiryReferenceDetail.
     * 
     * @return customerReferenceText   * A freeform reference string provided by the customer to be
     * linked to the product in order to support subsequent order reconciliation.
     */
    public java.lang.String[] getCustomerReferenceText() {
        return customerReferenceText;
    }


    /**
     * Sets the customerReferenceText value for this InquiryReferenceDetail.
     * 
     * @param customerReferenceText   * A freeform reference string provided by the customer to be
     * linked to the product in order to support subsequent order reconciliation.
     */
    public void setCustomerReferenceText(java.lang.String[] customerReferenceText) {
        this.customerReferenceText = customerReferenceText;
    }

    public java.lang.String getCustomerReferenceText(int i) {
        return this.customerReferenceText[i];
    }

    public void setCustomerReferenceText(int i, java.lang.String _value) {
        this.customerReferenceText[i] = _value;
    }


    /**
     * Gets the customerBillingEndorsementText value for this InquiryReferenceDetail.
     * 
     * @return customerBillingEndorsementText   * Text that is filled in by customer and commonly contains requesting
     * individual or department name, or customer's own account/reference
     * number and/or name for the case on which the product was provided.This
     * text is a reference used during the billing process.
     */
    public java.lang.String getCustomerBillingEndorsementText() {
        return customerBillingEndorsementText;
    }


    /**
     * Sets the customerBillingEndorsementText value for this InquiryReferenceDetail.
     * 
     * @param customerBillingEndorsementText   * Text that is filled in by customer and commonly contains requesting
     * individual or department name, or customer's own account/reference
     * number and/or name for the case on which the product was provided.This
     * text is a reference used during the billing process.
     */
    public void setCustomerBillingEndorsementText(java.lang.String customerBillingEndorsementText) {
        this.customerBillingEndorsementText = customerBillingEndorsementText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquiryReferenceDetail)) return false;
        InquiryReferenceDetail other = (InquiryReferenceDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerReferenceText==null && other.getCustomerReferenceText()==null) || 
             (this.customerReferenceText!=null &&
              java.util.Arrays.equals(this.customerReferenceText, other.getCustomerReferenceText()))) &&
            ((this.customerBillingEndorsementText==null && other.getCustomerBillingEndorsementText()==null) || 
             (this.customerBillingEndorsementText!=null &&
              this.customerBillingEndorsementText.equals(other.getCustomerBillingEndorsementText())));
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
        if (getCustomerReferenceText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerReferenceText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerReferenceText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerBillingEndorsementText() != null) {
            _hashCode += getCustomerBillingEndorsementText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquiryReferenceDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "InquiryReferenceDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferenceText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerReferenceText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">InquiryReferenceDetail>CustomerReferenceText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerBillingEndorsementText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerBillingEndorsementText"));
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
