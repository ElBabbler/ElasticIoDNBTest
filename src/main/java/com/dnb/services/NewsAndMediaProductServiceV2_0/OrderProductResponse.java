/**
 * OrderProductResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderProductResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderProductResponse extends com.dnb.services.NewsAndMediaProductServiceV2_0.Response implements java.io.Serializable {
    @XmlElement(name = "OrderProductResponseDetail")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponseDetail orderProductResponseDetail;

    public OrderProductResponse() {
    }

    public OrderProductResponse(
            java.lang.String serviceVersionNumber,
            com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseTransactionDetail transactionDetail,
            com.dnb.services.NewsAndMediaProductServiceV2_0.TransactionResult transactionResult,
            com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponseDetail orderProductResponseDetail) {
        super(

                transactionDetail,
                transactionResult,
                serviceVersionNumber);
        this.orderProductResponseDetail = orderProductResponseDetail;
    }


    /**
     * Gets the orderProductResponseDetail value for this OrderProductResponse.
     *
     * @return orderProductResponseDetail
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponseDetail getOrderProductResponseDetail() {
        return orderProductResponseDetail;
    }


    /**
     * Sets the orderProductResponseDetail value for this OrderProductResponse.
     *
     * @param orderProductResponseDetail
     */
    public void setOrderProductResponseDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponseDetail orderProductResponseDetail) {
        this.orderProductResponseDetail = orderProductResponseDetail;
    }

    private transient java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderProductResponse)) return false;
        OrderProductResponse other = (OrderProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.orderProductResponseDetail == null && other.getOrderProductResponseDetail() == null) ||
                        (this.orderProductResponseDetail != null &&
                                this.orderProductResponseDetail.equals(other.getOrderProductResponseDetail())));
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
        if (getOrderProductResponseDetail() != null) {
            _hashCode += getOrderProductResponseDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(OrderProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderProductResponseDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderProductResponseDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductResponseDetail"));
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
