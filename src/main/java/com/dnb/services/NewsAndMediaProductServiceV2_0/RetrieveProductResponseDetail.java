/**
 * RetrieveProductResponseDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class RetrieveProductResponseDetail  implements java.io.Serializable {
    /* Records data about the product ordered by the customer and
     * data about the organization on which the customer has placed this
     * order. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.Product product;

    /* Records data that allows the customer to specify information
     * to be linked to the request in order to support subsequent order reconciliation. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail;

    public RetrieveProductResponseDetail() {
    }

    public RetrieveProductResponseDetail(
           com.dnb.services.NewsAndMediaProductServiceV2_0.Product product,
           com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail) {
           this.product = product;
           this.inquiryReferenceDetail = inquiryReferenceDetail;
    }


    /**
     * Gets the product value for this RetrieveProductResponseDetail.
     * 
     * @return product   * Records data about the product ordered by the customer and
     * data about the organization on which the customer has placed this
     * order.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this RetrieveProductResponseDetail.
     * 
     * @param product   * Records data about the product ordered by the customer and
     * data about the organization on which the customer has placed this
     * order.
     */
    public void setProduct(com.dnb.services.NewsAndMediaProductServiceV2_0.Product product) {
        this.product = product;
    }


    /**
     * Gets the inquiryReferenceDetail value for this RetrieveProductResponseDetail.
     * 
     * @return inquiryReferenceDetail   * Records data that allows the customer to specify information
     * to be linked to the request in order to support subsequent order reconciliation.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }


    /**
     * Sets the inquiryReferenceDetail value for this RetrieveProductResponseDetail.
     * 
     * @param inquiryReferenceDetail   * Records data that allows the customer to specify information
     * to be linked to the request in order to support subsequent order reconciliation.
     */
    public void setInquiryReferenceDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail) {
        this.inquiryReferenceDetail = inquiryReferenceDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveProductResponseDetail)) return false;
        RetrieveProductResponseDetail other = (RetrieveProductResponseDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.inquiryReferenceDetail==null && other.getInquiryReferenceDetail()==null) || 
             (this.inquiryReferenceDetail!=null &&
              this.inquiryReferenceDetail.equals(other.getInquiryReferenceDetail())));
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getInquiryReferenceDetail() != null) {
            _hashCode += getInquiryReferenceDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveProductResponseDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductResponseDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Product"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryReferenceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InquiryReferenceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "InquiryReferenceDetail"));
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
