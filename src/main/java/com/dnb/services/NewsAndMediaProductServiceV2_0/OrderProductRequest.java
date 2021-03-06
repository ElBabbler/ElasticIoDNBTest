/**
 * OrderProductRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class OrderProductRequest  extends com.dnb.services.NewsAndMediaProductServiceV2_0.Request  implements java.io.Serializable {
    private com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequestDetail orderProductRequestDetail;

    public OrderProductRequest() {
    }

    public OrderProductRequest(
           java.lang.String serviceVersionNumber,
           com.dnb.services.NewsAndMediaProductServiceV2_0.RequestTransactionDetail transactionDetail,
           com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequestDetail orderProductRequestDetail) {
        super(transactionDetail,
            serviceVersionNumber
            );
        this.orderProductRequestDetail = orderProductRequestDetail;
    }


    /**
     * Gets the orderProductRequestDetail value for this OrderProductRequest.
     * 
     * @return orderProductRequestDetail
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequestDetail getOrderProductRequestDetail() {
        return orderProductRequestDetail;
    }


    /**
     * Sets the orderProductRequestDetail value for this OrderProductRequest.
     * 
     * @param orderProductRequestDetail
     */
    public void setOrderProductRequestDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequestDetail orderProductRequestDetail) {
        this.orderProductRequestDetail = orderProductRequestDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderProductRequest)) return false;
        OrderProductRequest other = (OrderProductRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderProductRequestDetail==null && other.getOrderProductRequestDetail()==null) || 
             (this.orderProductRequestDetail!=null &&
              this.orderProductRequestDetail.equals(other.getOrderProductRequestDetail())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOrderProductRequestDetail() != null) {
            _hashCode += getOrderProductRequestDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderProductRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderProductRequestDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderProductRequestDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductRequestDetail"));
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
