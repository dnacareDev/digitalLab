package kr.go.rda.atis.wsdl.prj.prjinfo;

public class PrjInfoProxy implements kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo {
  private String _endpoint = null;
  private kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo prjInfo = null;
  
  public PrjInfoProxy() {
    _initPrjInfoProxy();
  }
  
  public PrjInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrjInfoProxy();
  }
  
  private void _initPrjInfoProxy() {
    try {
      prjInfo = (new kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoServiceLocator()).getPrjInfo();
      if (prjInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)prjInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)prjInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (prjInfo != null)
      ((javax.xml.rpc.Stub)prjInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfo getPrjInfo() {
    if (prjInfo == null)
      _initPrjInfoProxy();
    return prjInfo;
  }
  
  public kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo getPrjInfo(kr.go.rda.atis.wsdl.prj.prjinfo.PrjInfoVo vo) throws java.rmi.RemoteException{
    if (prjInfo == null)
      _initPrjInfoProxy();
    return prjInfo.getPrjInfo(vo);
  }
  
  
}