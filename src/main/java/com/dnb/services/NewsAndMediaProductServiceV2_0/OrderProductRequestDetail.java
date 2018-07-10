/**
 * OrderProductRequestDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class OrderProductRequestDetail  implements java.io.Serializable {
    /* Records data that allows the customer to specify identifying
     * information about the subject being inquired, e.g., the DUNS Number,
     * the CountryCode etc. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryDetail inquiryDetail;

    /* Records data that allows the customer to specify the details
     * of the requested product. This may include details such as the identifier
     * of the product, the language in which the product needs to be rendered,
     * the format in which the product needs to be rendered. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ProductSpecification productSpecification;

    /* Records data that allows the customer to specify details about
     * the archival of the product being requested. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ArchiveDetail archiveDetail;

    /* Records data that allows the customer to specify information
     * to be linked to this request in order to support subsequent order
     * reconciliation. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail;

    public OrderProductRequestDetail() {
    }

    public OrderProductRequestDetail(
           com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryDetail inquiryDetail,
           com.dnb.services.NewsAndMediaProductServiceV2_0.ProductSpecification productSpecification,
           com.dnb.services.NewsAndMediaProductServiceV2_0.ArchiveDetail archiveDetail,
           com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail) {
           this.inquiryDetail = inquiryDetail;
           this.productSpecification = productSpecification;
           this.archiveDetail = archiveDetail;
           this.inquiryReferenceDetail = inquiryReferenceDetail;
    }


    /**
     * Gets the inquiryDetail value for this OrderProductRequestDetail.
     * 
     * @return inquiryDetail   * Records data that allows the customer to specify identifying
     * information about the subject being inquired, e.g., the DUNS Number,
     * the CountryCode etc.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }


    /**
     * Sets the inquiryDetail value for this OrderProductRequestDetail.
     * 
     * @param inquiryDetail   * Records data that allows the customer to specify identifying
     * information about the subject being inquired, e.g., the DUNS Number,
     * the CountryCode etc.
     */
    public void setInquiryDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryDetail inquiryDetail) {
        this.inquiryDetail = inquiryDetail;
    }


    /**
     * Gets the productSpecification value for this OrderProductRequestDetail.
     * 
     * @return productSpecification   * Records data that allows the customer to specify the details
     * of the requested product. This may include details such as the identifier
     * of the product, the language in which the product needs to be rendered,
     * the format in which the product needs to be rendered.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.ProductSpecification getProductSpecification() {
        return productSpecification;
    }


    /**
     * Sets the productSpecification value for this OrderProductRequestDetail.
     * 
     * @param productSpecification   * Records data that allows the customer to specify the details
     * of the requested product. This may include details such as the identifier
     * of the product, the language in which the product needs to be rendered,
     * the format in which the product needs to be rendered.
     */
    public void setProductSpecification(com.dnb.services.NewsAndMediaProductServiceV2_0.ProductSpecification productSpecification) {
        this.productSpecification = productSpecification;
    }


    /**
     * Gets the archiveDetail value for this OrderProductRequestDetail.
     * 
     * @return archiveDetail   * Records data that allows the customer to specify details about
     * the archival of the product being requested.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.ArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }


    /**
     * Sets the archiveDetail value for this OrderProductRequestDetail.
     * 
     * @param archiveDetail   * Records data that allows the customer to specify details about
     * the archival of the product being requested.
     */
    public void setArchiveDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.ArchiveDetail archiveDetail) {
        this.archiveDetail = archiveDetail;
    }


    /**
     * Gets the inquiryReferenceDetail value for this OrderProductRequestDetail.
     * 
     * @return inquiryReferenceDetail   * Records data that allows the customer to specify information
     * to be linked to this request in order to support subsequent order
     * reconciliation.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }


    /**
     * Sets the inquiryReferenceDetail value for this OrderProductRequestDetail.
     * 
     * @param inquiryReferenceDetail   * Records data that allows the customer to specify information
     * to be linked to this request in order to support subsequent order
     * reconciliation.
     */
    public void setInquiryReferenceDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail) {
        this.inquiryReferenceDetail = inquiryReferenceDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderProductRequestDetail)) return false;
        OrderProductRequestDetail other = (OrderProductRequestDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inquiryDetail==null && other.getInquiryDetail()==null) || 
             (this.inquiryDetail!=null &&
              this.inquiryDetail.equals(other.getInquiryDetail()))) &&
            ((this.productSpecification==null && other.getProductSpecification()==null) || 
             (this.productSpecification!=null &&
              this.productSpecification.equals(other.getProductSpecification()))) &&
            ((this.archiveDetail==null && other.getArchiveDetail()==null) || 
             (this.archiveDetail!=null &&
              this.archiveDetail.equals(other.getArchiveDetail()))) &&
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
        if (getInquiryDetail() != null) {
            _hashCode += getInquiryDetail().hashCode();
        }
        if (getProductSpecification() != null) {
            _hashCode += getProductSpecification().hashCode();
        }
        if (getArchiveDetail() != null) {
            _hashCode += getArchiveDetail().hashCode();
        }
        if (getInquiryReferenceDetail() != null) {
            _hashCode += getInquiryReferenceDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderProductRequestDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductRequestDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InquiryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "InquiryDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ProductSpecification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchiveDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ArchiveDetail"));
        elemField.setMinOccurs(0);
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
