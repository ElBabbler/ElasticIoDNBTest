/**
 * ResultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class ResultMessage  implements java.io.Serializable {
    /* Text that describes the additional information regarding the
     * outcome of the transaction. */
    private java.lang.String resultDescription;

    public ResultMessage() {
    }

    public ResultMessage(
           java.lang.String resultDescription) {
           this.resultDescription = resultDescription;
    }


    /**
     * Gets the resultDescription value for this ResultMessage.
     * 
     * @return resultDescription   * Text that describes the additional information regarding the
     * outcome of the transaction.
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this ResultMessage.
     * 
     * @param resultDescription   * Text that describes the additional information regarding the
     * outcome of the transaction.
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultMessage)) return false;
        ResultMessage other = (ResultMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultDescription==null && other.getResultDescription()==null) || 
             (this.resultDescription!=null &&
              this.resultDescription.equals(other.getResultDescription())));
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
        if (getResultDescription() != null) {
            _hashCode += getResultDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResultMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
