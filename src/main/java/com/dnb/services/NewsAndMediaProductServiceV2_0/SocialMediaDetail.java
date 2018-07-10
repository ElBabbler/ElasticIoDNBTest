/**
 * SocialMediaDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * An entry loop which can repeat multiple times to allow the recording
 * of the details of the interactive platforms via which subject creates
 * and shares user-generated content; e.g., Internet forums, weblogs,
 * social blogs, wikis, social networks.
 */
public class SocialMediaDetail  implements java.io.Serializable {
    /* Name identifying the online service, platform, or site through
     * which the subject creates and shares user-generated content. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType socialMediaPlatformName;

    /* An identifier to locate the user generated content for the
     * subject in the social media platform. */
    private java.lang.String userContentKey;

    /* The name of the subject account as presented to other users
     * in the  social media platform. */
    private java.lang.String userDisplayName;

    /* Text identifying the internet URL of the subject's content
     * in the social media platform. */
    private java.lang.String webPageURL;

    /* The number of users following/subscribing the subject's content
     * in the social media platform. */
    private java.lang.Integer subscriberQuantity;

    public SocialMediaDetail() {
    }

    public SocialMediaDetail(
           com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType socialMediaPlatformName,
           java.lang.String userContentKey,
           java.lang.String userDisplayName,
           java.lang.String webPageURL,
           java.lang.Integer subscriberQuantity) {
           this.socialMediaPlatformName = socialMediaPlatformName;
           this.userContentKey = userContentKey;
           this.userDisplayName = userDisplayName;
           this.webPageURL = webPageURL;
           this.subscriberQuantity = subscriberQuantity;
    }


    /**
     * Gets the socialMediaPlatformName value for this SocialMediaDetail.
     * 
     * @return socialMediaPlatformName   * Name identifying the online service, platform, or site through
     * which the subject creates and shares user-generated content.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType getSocialMediaPlatformName() {
        return socialMediaPlatformName;
    }


    /**
     * Sets the socialMediaPlatformName value for this SocialMediaDetail.
     * 
     * @param socialMediaPlatformName   * Name identifying the online service, platform, or site through
     * which the subject creates and shares user-generated content.
     */
    public void setSocialMediaPlatformName(com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType socialMediaPlatformName) {
        this.socialMediaPlatformName = socialMediaPlatformName;
    }


    /**
     * Gets the userContentKey value for this SocialMediaDetail.
     * 
     * @return userContentKey   * An identifier to locate the user generated content for the
     * subject in the social media platform.
     */
    public java.lang.String getUserContentKey() {
        return userContentKey;
    }


    /**
     * Sets the userContentKey value for this SocialMediaDetail.
     * 
     * @param userContentKey   * An identifier to locate the user generated content for the
     * subject in the social media platform.
     */
    public void setUserContentKey(java.lang.String userContentKey) {
        this.userContentKey = userContentKey;
    }


    /**
     * Gets the userDisplayName value for this SocialMediaDetail.
     * 
     * @return userDisplayName   * The name of the subject account as presented to other users
     * in the  social media platform.
     */
    public java.lang.String getUserDisplayName() {
        return userDisplayName;
    }


    /**
     * Sets the userDisplayName value for this SocialMediaDetail.
     * 
     * @param userDisplayName   * The name of the subject account as presented to other users
     * in the  social media platform.
     */
    public void setUserDisplayName(java.lang.String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }


    /**
     * Gets the webPageURL value for this SocialMediaDetail.
     * 
     * @return webPageURL   * Text identifying the internet URL of the subject's content
     * in the social media platform.
     */
    public java.lang.String getWebPageURL() {
        return webPageURL;
    }


    /**
     * Sets the webPageURL value for this SocialMediaDetail.
     * 
     * @param webPageURL   * Text identifying the internet URL of the subject's content
     * in the social media platform.
     */
    public void setWebPageURL(java.lang.String webPageURL) {
        this.webPageURL = webPageURL;
    }


    /**
     * Gets the subscriberQuantity value for this SocialMediaDetail.
     * 
     * @return subscriberQuantity   * The number of users following/subscribing the subject's content
     * in the social media platform.
     */
    public java.lang.Integer getSubscriberQuantity() {
        return subscriberQuantity;
    }


    /**
     * Sets the subscriberQuantity value for this SocialMediaDetail.
     * 
     * @param subscriberQuantity   * The number of users following/subscribing the subject's content
     * in the social media platform.
     */
    public void setSubscriberQuantity(java.lang.Integer subscriberQuantity) {
        this.subscriberQuantity = subscriberQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SocialMediaDetail)) return false;
        SocialMediaDetail other = (SocialMediaDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.socialMediaPlatformName==null && other.getSocialMediaPlatformName()==null) || 
             (this.socialMediaPlatformName!=null &&
              this.socialMediaPlatformName.equals(other.getSocialMediaPlatformName()))) &&
            ((this.userContentKey==null && other.getUserContentKey()==null) || 
             (this.userContentKey!=null &&
              this.userContentKey.equals(other.getUserContentKey()))) &&
            ((this.userDisplayName==null && other.getUserDisplayName()==null) || 
             (this.userDisplayName!=null &&
              this.userDisplayName.equals(other.getUserDisplayName()))) &&
            ((this.webPageURL==null && other.getWebPageURL()==null) || 
             (this.webPageURL!=null &&
              this.webPageURL.equals(other.getWebPageURL()))) &&
            ((this.subscriberQuantity==null && other.getSubscriberQuantity()==null) || 
             (this.subscriberQuantity!=null &&
              this.subscriberQuantity.equals(other.getSubscriberQuantity())));
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
        if (getSocialMediaPlatformName() != null) {
            _hashCode += getSocialMediaPlatformName().hashCode();
        }
        if (getUserContentKey() != null) {
            _hashCode += getUserContentKey().hashCode();
        }
        if (getUserDisplayName() != null) {
            _hashCode += getUserDisplayName().hashCode();
        }
        if (getWebPageURL() != null) {
            _hashCode += getWebPageURL().hashCode();
        }
        if (getSubscriberQuantity() != null) {
            _hashCode += getSubscriberQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SocialMediaDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialMediaPlatformName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SocialMediaPlatformName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDecodedStringType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userContentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserContentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webPageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WebPageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
