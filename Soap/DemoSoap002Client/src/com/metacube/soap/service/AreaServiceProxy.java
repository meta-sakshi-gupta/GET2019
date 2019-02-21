package com.metacube.soap.service;

public class AreaServiceProxy implements com.metacube.soap.service.AreaService {
  private String _endpoint = null;
  private com.metacube.soap.service.AreaService areaService = null;
  
  public AreaServiceProxy() {
    _initAreaServiceProxy();
  }
  
  public AreaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAreaServiceProxy();
  }
  
  private void _initAreaServiceProxy() {
    try {
      areaService = (new com.metacube.soap.service.AreaServiceServiceLocator()).getAreaService();
      if (areaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)areaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)areaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (areaService != null)
      ((javax.xml.rpc.Stub)areaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.metacube.soap.service.AreaService getAreaService() {
    if (areaService == null)
      _initAreaServiceProxy();
    return areaService;
  }
  
  public double area(int a, int b, int c) throws java.rmi.RemoteException{
    if (areaService == null)
      _initAreaServiceProxy();
    return areaService.area(a, b, c);
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (areaService == null)
      _initAreaServiceProxy();
    return areaService.sayHello();
  }
  
  
}