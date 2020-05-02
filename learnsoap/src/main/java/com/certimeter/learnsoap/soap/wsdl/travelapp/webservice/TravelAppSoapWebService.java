package com.certimeter.learnsoap.soap.wsdl.travelapp.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.certimeter.learnsoap.soap.wsdl.calculator.types.ObjectFactory;
import com.certimeter.learnsoap.soap.wsdl.travelapp.model.request.TravelDetailsRq;
import com.certimeter.learnsoap.soap.wsdl.travelapp.model.response.TravelDetailsRs;

@WebService(name = "TravelAppHandler", targetNamespace = "http://response.model.travelapp.wspublic.alpi")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TravelAppSoapWebService {

	@WebMethod(operationName = "getTravelDetails", action = "http://response.model.travelapp.wspublic.alpi/getTravelDetails")
    @WebResult(name = "getTravelDetailsReturn", targetNamespace = "")
    @RequestWrapper(localName = "getTravelDetails", targetNamespace = "http://response.model.travelapp.wspublic.alpi", className = "alpi.wspublic.travelapp.model.request.TravelDetailsRq")
	@ResponseWrapper(localName = "getTravelDetailsResponse", targetNamespace = "http://impl.services.travelapp.wspublic.alpi", className = "alpi.wspublic.travelapp.model.response.TravelDetailsRs")
    public TravelDetailsRs getTravelDetails(
        @WebParam(name = "travelsDetailsRequest", targetNamespace = "http://response.model.travelapp.wspublic.alpi")
        TravelDetailsRq travelDetailsRequest);
	
}
