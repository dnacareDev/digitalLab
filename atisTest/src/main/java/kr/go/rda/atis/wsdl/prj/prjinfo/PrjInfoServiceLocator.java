/**
 * PrjInfoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.go.rda.atis.wsdl.prj.prjinfo;

public class PrjInfoServiceLocator extends org.apache.axis.client.Service implements kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoService {

    public PrjInfoServiceLocator() {
    }


    public PrjInfoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PrjInfoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PrjInfo
    private java.lang.String PrjInfo_address = "http://atis.rda.go.kr/rdais/services/PrjInfo";

    public java.lang.String getPrjInfoAddress() {
        return PrjInfo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PrjInfoWSDDServiceName = "PrjInfo";

    public java.lang.String getPrjInfoWSDDServiceName() {
        return PrjInfoWSDDServiceName;
    }

    public void setPrjInfoWSDDServiceName(java.lang.String name) {
        PrjInfoWSDDServiceName = name;
    }

    public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo getPrjInfo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PrjInfo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPrjInfo(endpoint);
    }

    public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo getPrjInfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoSoapBindingStub _stub = new kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoSoapBindingStub(portAddress, this);
            _stub.setPortName(getPrjInfoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPrjInfoEndpointAddress(java.lang.String address) {
        PrjInfo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo.class.isAssignableFrom(serviceEndpointInterface)) {
                kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoSoapBindingStub _stub = new kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoSoapBindingStub(new java.net.URL(PrjInfo_address), this);
                _stub.setPortName(getPrjInfoWSDDServiceName());
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
        if ("PrjInfo".equals(inputPortName)) {
            return getPrjInfo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "PrjInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://prjinfo.prj.wsdl.atis.rda.go.kr", "PrjInfo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PrjInfo".equals(portName)) {
            setPrjInfoEndpointAddress(address);
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
