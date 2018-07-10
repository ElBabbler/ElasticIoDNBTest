/**
 * RetrieveProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * Records the archived report/product being returned to the customer
 * as a result of a request, based on user's input criteria and transaction
 * information associated with it. If the system is unable to retrieve
 * the archived report, it should return the failure response along with
 * the cause for failure.
 */
public class RetrieveProductResponse  extends com.dnb.services.NewsAndMediaProductServiceV2_0.Response  implements java.io.Serializable {
    /* Records the data being returned to the customer as a result
     * of a request for retrieving the archived reports/products based on
     * user's input criteria. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponseDetail retrieveProductResponseDetail;

    public RetrieveProductResponse() {
    }

    public RetrieveProductResponse(
           java.lang.String serviceVersionNumber,
           com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseTransactionDetail transactionDetail,
           com.dnb.services.NewsAndMediaProductServiceV2_0.TransactionResult transactionResult,
           com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponseDetail retrieveProductResponseDetail) {
        super(

            transactionDetail,
                transactionResult,
                serviceVersionNumber
            );
        this.retrieveProductResponseDetail = retrieveProductResponseDetail;
    }


    /**
     * Gets the retrieveProductResponseDetail value for this RetrieveProductResponse.
     * 
     * @return retrieveProductResponseDetail   * Records the data being returned to the customer as a result
     * of a request for retrieving the archived reports/products based on
     * user's input criteria.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponseDetail getRetrieveProductResponseDetail() {
        return retrieveProductResponseDetail;
    }


    /**
     * Sets the retrieveProductResponseDetail value for this RetrieveProductResponse.
     * 
     * @param retrieveProductResponseDetail   * Records the data being returned to the customer as a result
     * of a request for retrieving the archived reports/products based on
     * user's input criteria.
     */
    public void setRetrieveProductResponseDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponseDetail retrieveProductResponseDetail) {
        this.retrieveProductResponseDetail = retrieveProductResponseDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveProductResponse)) return false;
        RetrieveProductResponse other = (RetrieveProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.retrieveProductResponseDetail==null && other.getRetrieveProductResponseDetail()==null) || 
             (this.retrieveProductResponseDetail!=null &&
              this.retrieveProductResponseDetail.equals(other.getRetrieveProductResponseDetail())));
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
        if (getRetrieveProductResponseDetail() != null) {
            _hashCode += getRetrieveProductResponseDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveProductResponseDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RetrieveProductResponseDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductResponseDetail"));
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
