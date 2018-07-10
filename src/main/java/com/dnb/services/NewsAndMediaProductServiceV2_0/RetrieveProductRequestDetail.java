/**
 * RetrieveProductRequestDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class RetrieveProductRequestDetail  implements java.io.Serializable {
    /* Records data that allows the customer to specify details about
     * the archival of the product being requested. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductArchiveDetail archiveDetail;

    public RetrieveProductRequestDetail() {
    }

    public RetrieveProductRequestDetail(
           com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductArchiveDetail archiveDetail) {
           this.archiveDetail = archiveDetail;
    }


    /**
     * Gets the archiveDetail value for this RetrieveProductRequestDetail.
     * 
     * @return archiveDetail   * Records data that allows the customer to specify details about
     * the archival of the product being requested.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }


    /**
     * Sets the archiveDetail value for this RetrieveProductRequestDetail.
     * 
     * @param archiveDetail   * Records data that allows the customer to specify details about
     * the archival of the product being requested.
     */
    public void setArchiveDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductArchiveDetail archiveDetail) {
        this.archiveDetail = archiveDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveProductRequestDetail)) return false;
        RetrieveProductRequestDetail other = (RetrieveProductRequestDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.archiveDetail==null && other.getArchiveDetail()==null) || 
             (this.archiveDetail!=null &&
              this.archiveDetail.equals(other.getArchiveDetail())));
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
        if (getArchiveDetail() != null) {
            _hashCode += getArchiveDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveProductRequestDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductRequestDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchiveDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductArchiveDetail"));
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
