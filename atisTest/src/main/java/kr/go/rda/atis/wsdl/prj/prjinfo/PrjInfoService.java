/**
 * PrjInfoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.go.rda.atis.wsdl.prj.prjinfo;

public interface PrjInfoService extends javax.xml.rpc.Service {
    public java.lang.String getPrjInfoAddress();

    public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo getPrjInfo() throws javax.xml.rpc.ServiceException;

    public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo getPrjInfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
