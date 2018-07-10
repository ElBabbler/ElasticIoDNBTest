/**
 * BaseAddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class BaseAddressType  extends com.dnb.services.NewsAndMediaProductServiceV2_0.SimpleAddress  implements java.io.Serializable {
    /* The shortened name of the locally governed area which forms
     * part of a centrally governed nation. For example 'NJ' for the US State
     * New Jersey within Country United States of America. */
    private java.lang.String territoryAbbreviatedName;

    /* An identifier used by the local country Postal Authority to
     * identify a particular geographic location. For example, in Belgium,
     * Postal Code 9000 identifies the town of GHENT. */
    private java.lang.String postalCode;

    private java.lang.String countyOfficialName;

    private java.lang.String territoryOfficialName;

    private java.math.BigInteger languageCode;  // attribute

    private java.math.BigInteger writingScriptCode;  // attribute

    public BaseAddressType() {
    }

    public BaseAddressType(
           com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine[] streetAddressLine,
           java.lang.String primaryTownName,
           java.lang.String countryISOAlpha2Code,
           java.math.BigInteger languageCode,
           java.math.BigInteger writingScriptCode,
           java.lang.String territoryAbbreviatedName,
           java.lang.String postalCode,
           java.lang.String countyOfficialName,
           java.lang.String territoryOfficialName) {
        super(
            streetAddressLine,
            primaryTownName,
            countryISOAlpha2Code);
        this.languageCode = languageCode;
        this.writingScriptCode = writingScriptCode;
        this.territoryAbbreviatedName = territoryAbbreviatedName;
        this.postalCode = postalCode;
        this.countyOfficialName = countyOfficialName;
        this.territoryOfficialName = territoryOfficialName;
    }


    /**
     * Gets the territoryAbbreviatedName value for this BaseAddressType.
     * 
     * @return territoryAbbreviatedName   * The shortened name of the locally governed area which forms
     * part of a centrally governed nation. For example 'NJ' for the US State
     * New Jersey within Country United States of America.
     */
    public java.lang.String getTerritoryAbbreviatedName() {
        return territoryAbbreviatedName;
    }


    /**
     * Sets the territoryAbbreviatedName value for this BaseAddressType.
     * 
     * @param territoryAbbreviatedName   * The shortened name of the locally governed area which forms
     * part of a centrally governed nation. For example 'NJ' for the US State
     * New Jersey within Country United States of America.
     */
    public void setTerritoryAbbreviatedName(java.lang.String territoryAbbreviatedName) {
        this.territoryAbbreviatedName = territoryAbbreviatedName;
    }


    /**
     * Gets the postalCode value for this BaseAddressType.
     * 
     * @return postalCode   * An identifier used by the local country Postal Authority to
     * identify a particular geographic location. For example, in Belgium,
     * Postal Code 9000 identifies the town of GHENT.
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this BaseAddressType.
     * 
     * @param postalCode   * An identifier used by the local country Postal Authority to
     * identify a particular geographic location. For example, in Belgium,
     * Postal Code 9000 identifies the town of GHENT.
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the countyOfficialName value for this BaseAddressType.
     * 
     * @return countyOfficialName
     */
    public java.lang.String getCountyOfficialName() {
        return countyOfficialName;
    }


    /**
     * Sets the countyOfficialName value for this BaseAddressType.
     * 
     * @param countyOfficialName
     */
    public void setCountyOfficialName(java.lang.String countyOfficialName) {
        this.countyOfficialName = countyOfficialName;
    }


    /**
     * Gets the territoryOfficialName value for this BaseAddressType.
     * 
     * @return territoryOfficialName
     */
    public java.lang.String getTerritoryOfficialName() {
        return territoryOfficialName;
    }


    /**
     * Sets the territoryOfficialName value for this BaseAddressType.
     * 
     * @param territoryOfficialName
     */
    public void setTerritoryOfficialName(java.lang.String territoryOfficialName) {
        this.territoryOfficialName = territoryOfficialName;
    }


    /**
     * Gets the languageCode value for this BaseAddressType.
     * 
     * @return languageCode
     */
    public java.math.BigInteger getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this BaseAddressType.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.math.BigInteger languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the writingScriptCode value for this BaseAddressType.
     * 
     * @return writingScriptCode
     */
    public java.math.BigInteger getWritingScriptCode() {
        return writingScriptCode;
    }


    /**
     * Sets the writingScriptCode value for this BaseAddressType.
     * 
     * @param writingScriptCode
     */
    public void setWritingScriptCode(java.math.BigInteger writingScriptCode) {
        this.writingScriptCode = writingScriptCode;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseAddressType)) return false;
        BaseAddressType other = (BaseAddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.territoryAbbreviatedName==null && other.getTerritoryAbbreviatedName()==null) || 
             (this.territoryAbbreviatedName!=null &&
              this.territoryAbbreviatedName.equals(other.getTerritoryAbbreviatedName()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.countyOfficialName==null && other.getCountyOfficialName()==null) || 
             (this.countyOfficialName!=null &&
              this.countyOfficialName.equals(other.getCountyOfficialName()))) &&
            ((this.territoryOfficialName==null && other.getTerritoryOfficialName()==null) || 
             (this.territoryOfficialName!=null &&
              this.territoryOfficialName.equals(other.getTerritoryOfficialName()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.writingScriptCode==null && other.getWritingScriptCode()==null) || 
             (this.writingScriptCode!=null &&
              this.writingScriptCode.equals(other.getWritingScriptCode())));
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
        if (getTerritoryAbbreviatedName() != null) {
            _hashCode += getTerritoryAbbreviatedName().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountyOfficialName() != null) {
            _hashCode += getCountyOfficialName().hashCode();
        }
        if (getTerritoryOfficialName() != null) {
            _hashCode += getTerritoryOfficialName().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getWritingScriptCode() != null) {
            _hashCode += getWritingScriptCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseAddressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "BaseAddressType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LanguageCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBCodeValueType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("writingScriptCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WritingScriptCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBCodeValueType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoryAbbreviatedName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TerritoryAbbreviatedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyOfficialName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountyOfficialName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoryOfficialName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TerritoryOfficialName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
