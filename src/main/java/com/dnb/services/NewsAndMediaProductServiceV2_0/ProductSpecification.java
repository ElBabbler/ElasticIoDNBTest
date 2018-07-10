/**
 * ProductSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class ProductSpecification  implements java.io.Serializable {
    /* An alphanumeric string that uniquely identifies the product
     * being requested. */
    private java.lang.String DNBProductID;

    /* A D&B code value that defines the language in which the customer
     * wants this product to be rendered. */
    private java.math.BigInteger languagePreferenceCode;

    /* When turn ON (set to TRUE) this denotes that the customer has
     * requested that D&B return the data for the Headquarters when the requested
     * organization is a Branch.
     * When turn OFF (set to FALSE) this denotes that the customer has not
     * requested that D&B return the data for the Headquarters when the requested
     * organization is a Branch; however as this is the assumed condition
     * there is no requirement to create this tag to represent this fact.
     * Note: There are D&B WorldWide Network operations where the Headquarters
     * information will be returned automatically, regardless of the customer
     * request. */
    private java.lang.Boolean tradeUpIndicator;

    /* Records the parameters for refining the news information returned
     * in the product */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.NewsSpecification newsSpecification;

    /* Records the parameters for refining the social media information
     * returned in the product. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaNameEnum[] socialMediaSpecification;

    public ProductSpecification() {
    }

    public ProductSpecification(
           java.lang.String DNBProductID,
           java.math.BigInteger languagePreferenceCode,
           java.lang.Boolean tradeUpIndicator,
           com.dnb.services.NewsAndMediaProductServiceV2_0.NewsSpecification newsSpecification,
           com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaNameEnum[] socialMediaSpecification) {
           this.DNBProductID = DNBProductID;
           this.languagePreferenceCode = languagePreferenceCode;
           this.tradeUpIndicator = tradeUpIndicator;
           this.newsSpecification = newsSpecification;
           this.socialMediaSpecification = socialMediaSpecification;
    }


    /**
     * Gets the DNBProductID value for this ProductSpecification.
     * 
     * @return DNBProductID   * An alphanumeric string that uniquely identifies the product
     * being requested.
     */
    public java.lang.String getDNBProductID() {
        return DNBProductID;
    }


    /**
     * Sets the DNBProductID value for this ProductSpecification.
     * 
     * @param DNBProductID   * An alphanumeric string that uniquely identifies the product
     * being requested.
     */
    public void setDNBProductID(java.lang.String DNBProductID) {
        this.DNBProductID = DNBProductID;
    }


    /**
     * Gets the languagePreferenceCode value for this ProductSpecification.
     * 
     * @return languagePreferenceCode   * A D&B code value that defines the language in which the customer
     * wants this product to be rendered.
     */
    public java.math.BigInteger getLanguagePreferenceCode() {
        return languagePreferenceCode;
    }


    /**
     * Sets the languagePreferenceCode value for this ProductSpecification.
     * 
     * @param languagePreferenceCode   * A D&B code value that defines the language in which the customer
     * wants this product to be rendered.
     */
    public void setLanguagePreferenceCode(java.math.BigInteger languagePreferenceCode) {
        this.languagePreferenceCode = languagePreferenceCode;
    }


    /**
     * Gets the tradeUpIndicator value for this ProductSpecification.
     * 
     * @return tradeUpIndicator   * When turn ON (set to TRUE) this denotes that the customer has
     * requested that D&B return the data for the Headquarters when the requested
     * organization is a Branch.
     * When turn OFF (set to FALSE) this denotes that the customer has not
     * requested that D&B return the data for the Headquarters when the requested
     * organization is a Branch; however as this is the assumed condition
     * there is no requirement to create this tag to represent this fact.
     * Note: There are D&B WorldWide Network operations where the Headquarters
     * information will be returned automatically, regardless of the customer
     * request.
     */
    public java.lang.Boolean getTradeUpIndicator() {
        return tradeUpIndicator;
    }


    /**
     * Sets the tradeUpIndicator value for this ProductSpecification.
     * 
     * @param tradeUpIndicator   * When turn ON (set to TRUE) this denotes that the customer has
     * requested that D&B return the data for the Headquarters when the requested
     * organization is a Branch.
     * When turn OFF (set to FALSE) this denotes that the customer has not
     * requested that D&B return the data for the Headquarters when the requested
     * organization is a Branch; however as this is the assumed condition
     * there is no requirement to create this tag to represent this fact.
     * Note: There are D&B WorldWide Network operations where the Headquarters
     * information will be returned automatically, regardless of the customer
     * request.
     */
    public void setTradeUpIndicator(java.lang.Boolean tradeUpIndicator) {
        this.tradeUpIndicator = tradeUpIndicator;
    }


    /**
     * Gets the newsSpecification value for this ProductSpecification.
     * 
     * @return newsSpecification   * Records the parameters for refining the news information returned
     * in the product
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.NewsSpecification getNewsSpecification() {
        return newsSpecification;
    }


    /**
     * Sets the newsSpecification value for this ProductSpecification.
     * 
     * @param newsSpecification   * Records the parameters for refining the news information returned
     * in the product
     */
    public void setNewsSpecification(com.dnb.services.NewsAndMediaProductServiceV2_0.NewsSpecification newsSpecification) {
        this.newsSpecification = newsSpecification;
    }


    /**
     * Gets the socialMediaSpecification value for this ProductSpecification.
     * 
     * @return socialMediaSpecification   * Records the parameters for refining the social media information
     * returned in the product.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaNameEnum[] getSocialMediaSpecification() {
        return socialMediaSpecification;
    }


    /**
     * Sets the socialMediaSpecification value for this ProductSpecification.
     * 
     * @param socialMediaSpecification   * Records the parameters for refining the social media information
     * returned in the product.
     */
    public void setSocialMediaSpecification(com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaNameEnum[] socialMediaSpecification) {
        this.socialMediaSpecification = socialMediaSpecification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSpecification)) return false;
        ProductSpecification other = (ProductSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DNBProductID==null && other.getDNBProductID()==null) || 
             (this.DNBProductID!=null &&
              this.DNBProductID.equals(other.getDNBProductID()))) &&
            ((this.languagePreferenceCode==null && other.getLanguagePreferenceCode()==null) || 
             (this.languagePreferenceCode!=null &&
              this.languagePreferenceCode.equals(other.getLanguagePreferenceCode()))) &&
            ((this.tradeUpIndicator==null && other.getTradeUpIndicator()==null) || 
             (this.tradeUpIndicator!=null &&
              this.tradeUpIndicator.equals(other.getTradeUpIndicator()))) &&
            ((this.newsSpecification==null && other.getNewsSpecification()==null) || 
             (this.newsSpecification!=null &&
              this.newsSpecification.equals(other.getNewsSpecification()))) &&
            ((this.socialMediaSpecification==null && other.getSocialMediaSpecification()==null) || 
             (this.socialMediaSpecification!=null &&
              java.util.Arrays.equals(this.socialMediaSpecification, other.getSocialMediaSpecification())));
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
        if (getDNBProductID() != null) {
            _hashCode += getDNBProductID().hashCode();
        }
        if (getLanguagePreferenceCode() != null) {
            _hashCode += getLanguagePreferenceCode().hashCode();
        }
        if (getTradeUpIndicator() != null) {
            _hashCode += getTradeUpIndicator().hashCode();
        }
        if (getNewsSpecification() != null) {
            _hashCode += getNewsSpecification().hashCode();
        }
        if (getSocialMediaSpecification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSocialMediaSpecification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSocialMediaSpecification(), i);
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
        new org.apache.axis.description.TypeDesc(ProductSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ProductSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNBProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DNBProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languagePreferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LanguagePreferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeUpIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TradeUpIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewsSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialMediaSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SocialMediaSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaNameEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SocialMediaPlatformName"));
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
