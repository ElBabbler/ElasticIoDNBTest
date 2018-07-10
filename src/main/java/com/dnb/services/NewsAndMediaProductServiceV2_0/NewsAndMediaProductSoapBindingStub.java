/**
 * NewsAndMediaProductSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class NewsAndMediaProductSoapBindingStub extends org.apache.axis.client.Stub implements com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProduct {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OrderProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductRequest"), com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductResponse"));
        oper.setReturnClass(com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", "TransactionResult"),
                      "com.dnb.services.TransactionFaultV2_0.TransactionResult",
                      new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", "TransactionResult"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductRequest"), com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductResponse"));
        oper.setReturnClass(com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", "TransactionResult"),
                      "com.dnb.services.TransactionFaultV2_0.TransactionResult",
                      new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", "TransactionResult"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public NewsAndMediaProductSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NewsAndMediaProductSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NewsAndMediaProductSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">BaseAddressType>CountyOfficialName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">BaseAddressType>PostalCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">BaseAddressType>TerritoryAbbreviatedName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">BaseAddressType>TerritoryOfficialName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">DNBDateType>DatePrecisionText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">DNBStringType256>WritingScriptISOAlpha4Code");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">InquiryReferenceDetail>CustomerReferenceText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">NewsDetails>ContentText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">NewsDetails>TitleText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">ProductSpecification>DNBProductID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">RequestTransactionDetail>ApplicationTransactionID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">RequestTransactionDetail>SubmittingOfficeID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">ResponseTransactionDetail>ApplicationTransactionID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">ResponseTransactionDetail>ServiceTransactionID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">ResultMessage>ResultDescription");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">SimpleAddress>PrimaryTownName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">StreetAddressLine>LineText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">TelecommunicationNumberSimpleType>InternationalDialingCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">TelecommunicationNumberSimpleType>TelecommunicationNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">TransactionResult>ResultID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", ">TransactionResult>ResultText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ArchiveDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.ArchiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "BaseAddressType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.BaseAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "CountryISOAlpha2Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "CustomerReferenceText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DateTimestamp");
            cachedSerQNames.add(qName);
            cls = java.util.Calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBCodeValueType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDateSimpleType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDateSimpleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDateType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDecodedStringType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBStringType256");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.DNBStringType256.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DUNSNumberType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "FamilyTreeMemberRole");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.FamilyTreeMemberRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "InquiryDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "InquiryReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Location");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "MailAddressType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.MailAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "News");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.NewsDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsDetails");
            qName2 = new javax.xml.namespace.QName("", "NewsDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsCategoryTextEnum");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.NewsCategoryTextEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsDetails");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.NewsDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsSpecification");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.NewsSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductRequest");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductRequestDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductResponse");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrderProductResponseDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponseDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Organization");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Organization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationName");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationNameBaseType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationNameBaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationPrimaryNameType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationPrimaryNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "PortfolioAssetContainerIDType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "PortfolioAssetIDType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "PrimaryAddressType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.PrimaryAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Product");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ProductCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ProductResponseInquiryDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.ProductResponseInquiryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ProductSpecification");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.ProductSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Request");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RequestTransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.RequestTransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Response");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResponseArchiveDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseArchiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResponseTransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseTransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResultMessage");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.ResultMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductArchiveDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductArchiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductRequest");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductRequestDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductRequestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductResponse");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductResponseDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponseDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Role");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Role.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ServiceVersionNumber");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SeverityType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.SeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SimpleAddress");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.SimpleAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaDetail");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaNameEnum");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaNameEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaSpecification");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaNameEnum[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaNameEnum");
            qName2 = new javax.xml.namespace.QName("", "SocialMediaPlatformName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "StreetAddressLine");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "StringBaseType128");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "StringBaseType256");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Subject");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Subject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SubjectHeader");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SubjectName");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Telecommunication");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.Telecommunication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TelecommunicationNumberSimpleType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberSimpleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TelecommunicationNumberType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TransactionResult");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.NewsAndMediaProductServiceV2_0.TransactionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", ">ResultMessage>ResultDescription");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", ">TransactionResult>ResultCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", ">TransactionResult>ResultText");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", "ResultMessage");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.TransactionFaultV2_0.ResultMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", "SeverityType");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.TransactionFaultV2_0.SeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.dnb.com/TransactionFaultV2.0", "TransactionResult");
            cachedSerQNames.add(qName);
            cls = com.dnb.services.TransactionFaultV2_0.TransactionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse orderProduct(com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest parameter) throws java.rmi.RemoteException, com.dnb.services.TransactionFaultV2_0.TransactionResult {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OrderProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.dnb.services.TransactionFaultV2_0.TransactionResult) {
              throw (com.dnb.services.TransactionFaultV2_0.TransactionResult) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponse retrieveProduct(com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductRequest parameter) throws java.rmi.RemoteException, com.dnb.services.TransactionFaultV2_0.TransactionResult {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.dnb.com/NewsAndMediaProductService/V3.0/RetrieveProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrieveProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.dnb.services.TransactionFaultV2_0.TransactionResult) {
              throw (com.dnb.services.TransactionFaultV2_0.TransactionResult) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
