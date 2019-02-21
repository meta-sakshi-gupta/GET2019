/**
 * AreaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacube.soap.service;

public class AreaServiceServiceLocator extends org.apache.axis.client.Service implements com.metacube.soap.service.AreaServiceService {

    public AreaServiceServiceLocator() {
    }


    public AreaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AreaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AreaService
    private java.lang.String AreaService_address = "http://localhost:8080/DemoSoap002/services/AreaService";

    public java.lang.String getAreaServiceAddress() {
        return AreaService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AreaServiceWSDDServiceName = "AreaService";

    public java.lang.String getAreaServiceWSDDServiceName() {
        return AreaServiceWSDDServiceName;
    }

    public void setAreaServiceWSDDServiceName(java.lang.String name) {
        AreaServiceWSDDServiceName = name;
    }

    public com.metacube.soap.service.AreaService getAreaService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AreaService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAreaService(endpoint);
    }

    public com.metacube.soap.service.AreaService getAreaService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.metacube.soap.service.AreaServiceSoapBindingStub _stub = new com.metacube.soap.service.AreaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAreaServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAreaServiceEndpointAddress(java.lang.String address) {
        AreaService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.metacube.soap.service.AreaService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.metacube.soap.service.AreaServiceSoapBindingStub _stub = new com.metacube.soap.service.AreaServiceSoapBindingStub(new java.net.URL(AreaService_address), this);
                _stub.setPortName(getAreaServiceWSDDServiceName());
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
        if ("AreaService".equals(inputPortName)) {
            return getAreaService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soap.metacube.com", "AreaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soap.metacube.com", "AreaService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AreaService".equals(portName)) {
            setAreaServiceEndpointAddress(address);
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
