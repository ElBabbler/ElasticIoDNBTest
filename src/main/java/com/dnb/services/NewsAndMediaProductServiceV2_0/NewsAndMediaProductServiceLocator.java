/**
 * NewsAndMediaProductServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class NewsAndMediaProductServiceLocator extends org.apache.axis.client.Service implements com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProductService {

    public NewsAndMediaProductServiceLocator() {
    }


    public NewsAndMediaProductServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NewsAndMediaProductServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NewsAndMediaProductServiceEndPoint
    private java.lang.String NewsAndMediaProductServiceEndPoint_address = "https://direct.dnb.com/NewsAndMediaProduct/V3.0";

    public java.lang.String getNewsAndMediaProductServiceEndPointAddress() {
        return NewsAndMediaProductServiceEndPoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NewsAndMediaProductServiceEndPointWSDDServiceName = "NewsAndMediaProductServiceEndPoint";

    public java.lang.String getNewsAndMediaProductServiceEndPointWSDDServiceName() {
        return NewsAndMediaProductServiceEndPointWSDDServiceName;
    }

    public void setNewsAndMediaProductServiceEndPointWSDDServiceName(java.lang.String name) {
        NewsAndMediaProductServiceEndPointWSDDServiceName = name;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProduct getNewsAndMediaProductServiceEndPoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NewsAndMediaProductServiceEndPoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNewsAndMediaProductServiceEndPoint(endpoint);
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProduct getNewsAndMediaProductServiceEndPoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProductSoapBindingStub _stub = new com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProductSoapBindingStub(portAddress, this);
            _stub.setPortName(getNewsAndMediaProductServiceEndPointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNewsAndMediaProductServiceEndPointEndpointAddress(java.lang.String address) {
        NewsAndMediaProductServiceEndPoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProduct.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProductSoapBindingStub _stub = new com.dnb.services.NewsAndMediaProductServiceV2_0.NewsAndMediaProductSoapBindingStub(new java.net.URL(NewsAndMediaProductServiceEndPoint_address), this);
                _stub.setPortName(getNewsAndMediaProductServiceEndPointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NewsAndMediaProductServiceEndPoint".equals(inputPortName)) {
            return getNewsAndMediaProductServiceEndPoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsAndMediaProductService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsAndMediaProductServiceEndPoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NewsAndMediaProductServiceEndPoint".equals(portName)) {
            setNewsAndMediaProductServiceEndPointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
