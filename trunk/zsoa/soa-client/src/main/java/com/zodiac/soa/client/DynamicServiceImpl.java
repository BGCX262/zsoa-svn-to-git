
package com.zodiac.soa.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DynamicService", targetNamespace = "http://server.soa.zodiac.com/")
public class DynamicServiceImpl
    extends Service
{
    
    private final static URL DYNAMICSERVICE_WSDL_LOCATION;
    private final static WebServiceException DYNAMICSERVICE_EXCEPTION;
    private final static QName DYNAMICSERVICE_QNAME = new QName("http://server.soa.zodiac.com/", "DynamicService");

    static {
        URL url = null;
        WebServiceException e = null;
        
        DYNAMICSERVICE_WSDL_LOCATION = url;
        DYNAMICSERVICE_EXCEPTION = e;
    }

    public DynamicServiceImpl() {
        super(__getWsdlLocation(), DYNAMICSERVICE_QNAME);
    }

    public DynamicServiceImpl(WebServiceFeature... features) {
        super(__getWsdlLocation(), DYNAMICSERVICE_QNAME, features);
    }

    public DynamicServiceImpl(URL wsdlLocation) {
        super(wsdlLocation, DYNAMICSERVICE_QNAME);
    }

    public DynamicServiceImpl(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DYNAMICSERVICE_QNAME, features);
    }

    public DynamicServiceImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DynamicServiceImpl(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DynamicService
     */
    @WebEndpoint(name = "DynamicPort")
    public DynamicService getDynamicPort() {
        return super.getPort(new QName("http://server.soa.zodiac.com/", "DynamicPort"), DynamicService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DynamicService
     */
    @WebEndpoint(name = "DynamicPort")
    public DynamicService getDynamicPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.soa.zodiac.com/", "DynamicPort"), DynamicService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DYNAMICSERVICE_EXCEPTION!= null) {
            throw DYNAMICSERVICE_EXCEPTION;
        }
        return DYNAMICSERVICE_WSDL_LOCATION;
    }

}
