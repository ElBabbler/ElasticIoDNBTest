/**
 * TransactionResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class TransactionResult  implements java.io.Serializable {
    /* Text that records the criticality of the outcome, e.g., Information,
     * Warning, Error, Fatal. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.SeverityType severityText;

    /* An alphanumeric string that uniquely identifies the outcome
     * of the transaction. */
    private java.lang.String resultID;

    /* Text that explains the outcome of the transaction. */
    private java.lang.String resultText;

    /* An aggregate that can repeat multiple times to record textual
     * data that expands on the ResultID and ResultText to provide additional
     * information to the user regarding the status of the transaction. If
     * the status implies that there is a problem this may also provide guidance
     * to the user on how to address it. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ResultMessage[] resultMessage;

    public TransactionResult() {
    }

    public TransactionResult(
           com.dnb.services.NewsAndMediaProductServiceV2_0.SeverityType severityText,
           java.lang.String resultID,
           java.lang.String resultText,
           com.dnb.services.NewsAndMediaProductServiceV2_0.ResultMessage[] resultMessage) {
           this.severityText = severityText;
           this.resultID = resultID;
           this.resultText = resultText;
           this.resultMessage = resultMessage;
    }


    /**
     * Gets the severityText value for this TransactionResult.
     * 
     * @return severityText   * Text that records the criticality of the outcome, e.g., Information,
     * Warning, Error, Fatal.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.SeverityType getSeverityText() {
        return severityText;
    }


    /**
     * Sets the severityText value for this TransactionResult.
     * 
     * @param severityText   * Text that records the criticality of the outcome, e.g., Information,
     * Warning, Error, Fatal.
     */
    public void setSeverityText(com.dnb.services.NewsAndMediaProductServiceV2_0.SeverityType severityText) {
        this.severityText = severityText;
    }


    /**
     * Gets the resultID value for this TransactionResult.
     * 
     * @return resultID   * An alphanumeric string that uniquely identifies the outcome
     * of the transaction.
     */
    public java.lang.String getResultID() {
        return resultID;
    }


    /**
     * Sets the resultID value for this TransactionResult.
     * 
     * @param resultID   * An alphanumeric string that uniquely identifies the outcome
     * of the transaction.
     */
    public void setResultID(java.lang.String resultID) {
        this.resultID = resultID;
    }


    /**
     * Gets the resultText value for this TransactionResult.
     * 
     * @return resultText   * Text that explains the outcome of the transaction.
     */
    public java.lang.String getResultText() {
        return resultText;
    }


    /**
     * Sets the resultText value for this TransactionResult.
     * 
     * @param resultText   * Text that explains the outcome of the transaction.
     */
    public void setResultText(java.lang.String resultText) {
        this.resultText = resultText;
    }


    /**
     * Gets the resultMessage value for this TransactionResult.
     * 
     * @return resultMessage   * An aggregate that can repeat multiple times to record textual
     * data that expands on the ResultID and ResultText to provide additional
     * information to the user regarding the status of the transaction. If
     * the status implies that there is a problem this may also provide guidance
     * to the user on how to address it.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.ResultMessage[] getResultMessage() {
        return resultMessage;
    }


    /**
     * Sets the resultMessage value for this TransactionResult.
     * 
     * @param resultMessage   * An aggregate that can repeat multiple times to record textual
     * data that expands on the ResultID and ResultText to provide additional
     * information to the user regarding the status of the transaction. If
     * the status implies that there is a problem this may also provide guidance
     * to the user on how to address it.
     */
    public void setResultMessage(com.dnb.services.NewsAndMediaProductServiceV2_0.ResultMessage[] resultMessage) {
        this.resultMessage = resultMessage;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.ResultMessage getResultMessage(int i) {
        return this.resultMessage[i];
    }

    public void setResultMessage(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.ResultMessage _value) {
        this.resultMessage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionResult)) return false;
        TransactionResult other = (TransactionResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.severityText==null && other.getSeverityText()==null) || 
             (this.severityText!=null &&
              this.severityText.equals(other.getSeverityText()))) &&
            ((this.resultID==null && other.getResultID()==null) || 
             (this.resultID!=null &&
              this.resultID.equals(other.getResultID()))) &&
            ((this.resultText==null && other.getResultText()==null) || 
             (this.resultText!=null &&
              this.resultText.equals(other.getResultText()))) &&
            ((this.resultMessage==null && other.getResultMessage()==null) || 
             (this.resultMessage!=null &&
              java.util.Arrays.equals(this.resultMessage, other.getResultMessage())));
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
        if (getSeverityText() != null) {
            _hashCode += getSeverityText().hashCode();
        }
        if (getResultID() != null) {
            _hashCode += getResultID().hashCode();
        }
        if (getResultText() != null) {
            _hashCode += getResultText().hashCode();
        }
        if (getResultMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TransactionResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SeverityText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResultMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
