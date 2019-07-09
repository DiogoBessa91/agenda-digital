package com.everis.academia.java.agenda.digital.web.servlets.cidade.soap;


import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "CidadeSOAPService", targetNamespace = "http://soap.cidade.servlets.web.digital.agenda.java.academia.everis.com/", wsdlLocation = "http://localhost:8080/agenda-digital-web/soap/CidadeSOAP?wsdl")
public class CidadeSOAPService
    extends Service
{

    private final static URL CIDADESOAPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CIDADESOAPSERVICE_EXCEPTION;
    private final static QName CIDADESOAPSERVICE_QNAME = new QName("http://soap.cidade.servlets.web.digital.agenda.java.academia.everis.com/", "CidadeSOAPService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/agenda-digital-web/soap/CidadeSOAP?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CIDADESOAPSERVICE_WSDL_LOCATION = url;
        CIDADESOAPSERVICE_EXCEPTION = e;
    }

    public CidadeSOAPService() {
        super(__getWsdlLocation(), CIDADESOAPSERVICE_QNAME);
    }

    public CidadeSOAPService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CIDADESOAPSERVICE_QNAME, features);
    }

    public CidadeSOAPService(URL wsdlLocation) {
        super(wsdlLocation, CIDADESOAPSERVICE_QNAME);
    }

    public CidadeSOAPService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CIDADESOAPSERVICE_QNAME, features);
    }

    public CidadeSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CidadeSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "CidadeSOAPPort")
    public CidadeSOAP getCidadeSOAPPort() {
        return super.getPort(new QName("http://soap.web.digital.agenda.java.academia.everis.com/", "CidadeSOAPPort"), CidadeSOAP.class);
    }

    @WebEndpoint(name = "CidadeSOAPPort")
    public CidadeSOAP getCidadeSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.web.digital.agenda.java.academia.everis.com/", "CidadeSOAPPort"), CidadeSOAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CIDADESOAPSERVICE_EXCEPTION!= null) {
            throw CIDADESOAPSERVICE_EXCEPTION;
        }
        return CIDADESOAPSERVICE_WSDL_LOCATION;
    }

}