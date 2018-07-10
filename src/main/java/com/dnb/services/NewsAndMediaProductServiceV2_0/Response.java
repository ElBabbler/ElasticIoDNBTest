/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class Response  implements java.io.Serializable {
    /* Records information necessary to process a particular request.
     * Examples of a request is the ordering of a product. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseTransactionDetail transactionDetail;

    /* An aggregate that can repeat multiple times to record the different
     * outcomes of the transaction. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.TransactionResult transactionResult;

    private java.lang.String serviceVersionNumber;  // attribute

    public Response() {
    }

    public Response(
           com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseTransactionDetail transactionDetail,
           com.dnb.services.NewsAndMediaProductServiceV2_0.TransactionResult transactionResult,
           java.lang.String serviceVersionNumber) {
           this.transactionDetail = transactionDetail;
           this.transactionResult = transactionResult;
           this.serviceVersionNumber = serviceVersionNumber;
    }


    /**
     * Gets the transactionDetail value for this Response.
     * 
     * @return transactionDetail   * Records information necessary to process a particular request.
     * Examples of a request is the ordering of a product.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseTransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this Response.
     * 
     * @param transactionDetail   * Records information necessary to process a particular request.
     * Examples of a request is the ordering of a product.
     */
    public void setTransactionDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseTransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the transactionResult value for this Response.
     * 
     * @return transactionResult   * An aggregate that can repeat multiple times to record the different
     * outcomes of the transaction.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.TransactionResult getTransactionResult() {
        return transactionResult;
    }


    /**
     * Sets the transactionResult value for this Response.
     * 
     * @param transactionResult   * An aggregate that can repeat multiple times to record the different
     * outcomes of the transaction.
     */
    public void setTransactionResult(com.dnb.services.NewsAndMediaProductServiceV2_0.TransactionResult transactionResult) {
        this.transactionResult = transactionResult;
    }


    /**
     * Gets the serviceVersionNumber value for this Response.
     * 
     * @return serviceVersionNumber
     */
    public java.lang.String getServiceVersionNumber() {
        return serviceVersionNumber;
    }


    /**
     * Sets the serviceVersionNumber value for this Response.
     * 
     * @param serviceVersionNumber
     */
    public void setServiceVersionNumber(java.lang.String serviceVersionNumber) {
        this.serviceVersionNumber = serviceVersionNumber;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.transactionResult==null && other.getTransactionResult()==null) || 
             (this.transactionResult!=null &&
              this.transactionResult.equals(other.getTransactionResult()))) &&
            ((this.serviceVersionNumber==null && other.getServiceVersionNumber()==null) || 
             (this.serviceVersionNumber!=null &&
              this.serviceVersionNumber.equals(other.getServiceVersionNumber())));
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
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getTransactionResult() != null) {
            _hashCode += getTransactionResult().hashCode();
        }
        if (getServiceVersionNumber() != null) {
            _hashCode += getServiceVersionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Response"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("serviceVersionNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ServiceVersionNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ServiceVersionNumber"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResponseTransactionDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TransactionResult"));
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
