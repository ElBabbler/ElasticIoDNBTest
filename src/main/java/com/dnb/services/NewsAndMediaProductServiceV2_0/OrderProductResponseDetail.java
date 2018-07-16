/**
 * OrderProductResponseDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="yourRootElementName")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderProductResponseDetail  implements java.io.Serializable {
    /* Records data that allows the customer to specify identifying
     * information about the subject being inquired, e.g., the DUNS Number,
     * the address, the telephone number. */
    @XmlElement
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ProductResponseInquiryDetail inquiryDetail;

    /* Records data about the product ordered by the customer and
     * data about the organization on which the customer has placed this
     * order. */
    @XmlElement
    private com.dnb.services.NewsAndMediaProductServiceV2_0.Product product;

    /* Records data that allows the customer to specify information
     * to be linked to the request in order to support subsequent order reconciliation. */
    @XmlElement
    private com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail;

    public OrderProductResponseDetail() {
    }

    public OrderProductResponseDetail(
           com.dnb.services.NewsAndMediaProductServiceV2_0.ProductResponseInquiryDetail inquiryDetail,
           com.dnb.services.NewsAndMediaProductServiceV2_0.Product product,
           com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail) {
           this.inquiryDetail = inquiryDetail;
           this.product = product;
           this.inquiryReferenceDetail = inquiryReferenceDetail;
    }


    /**
     * Gets the inquiryDetail value for this OrderProductResponseDetail.
     * 
     * @return inquiryDetail   * Records data that allows the customer to specify identifying
     * information about the subject being inquired, e.g., the DUNS Number,
     * the address, the telephone number.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.ProductResponseInquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }


    /**
     * Sets the inquiryDetail value for this OrderProductResponseDetail.
     * 
     * @param inquiryDetail   * Records data that allows the customer to specify identifying
     * information about the subject being inquired, e.g., the DUNS Number,
     * the address, the telephone number.
     */
    public void setInquiryDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.ProductResponseInquiryDetail inquiryDetail) {
        this.inquiryDetail = inquiryDetail;
    }


    /**
     * Gets the product value for this OrderProductResponseDetail.
     * 
     * @return product   * Records data about the product ordered by the customer and
     * data about the organization on which the customer has placed this
     * order.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this OrderProductResponseDetail.
     * 
     * @param product   * Records data about the product ordered by the customer and
     * data about the organization on which the customer has placed this
     * order.
     */
    public void setProduct(com.dnb.services.NewsAndMediaProductServiceV2_0.Product product) {
        this.product = product;
    }


    /**
     * Gets the inquiryReferenceDetail value for this OrderProductResponseDetail.
     * 
     * @return inquiryReferenceDetail   * Records data that allows the customer to specify information
     * to be linked to the request in order to support subsequent order reconciliation.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }


    /**
     * Sets the inquiryReferenceDetail value for this OrderProductResponseDetail.
     * 
     * @param inquiryReferenceDetail   * Records data that allows the customer to specify information
     * to be linked to the request in order to support subsequent order reconciliation.
     */
    public void setInquiryReferenceDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail inquiryReferenceDetail) {
        this.inquiryReferenceDetail = inquiryReferenceDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderProductResponseDetail)) return false;
        OrderProductResponseDetail other = (OrderProductResponseDetail) obj;
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
        if (getInquiryDetail() != null) {
            _hashCode += getInquiryDetail().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(OrderProductResponseDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductResponseDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InquiryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ProductResponseInquiryDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
