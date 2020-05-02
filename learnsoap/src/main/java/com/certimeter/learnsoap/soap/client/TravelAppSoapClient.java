package com.certimeter.learnsoap.soap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.certimeter.learnsoap.soap.wsdl.travelapp.model.request.TravelDetailsRq;
import com.certimeter.learnsoap.soap.wsdl.travelapp.model.response.TravelDetailsRs;
import com.certimeter.learnsoap.soap.wsdl.travelapp.webservice.TravelAppSoapWebService;

@Component
public class TravelAppSoapClient implements TravelAppSoapWebService {

	@Autowired
	private TravelAppSoapWebService travelAppSoap;

	@Override
	public TravelDetailsRs getTravelDetails(TravelDetailsRq travelDetailsRequest) {
		TravelDetailsRs detatilsObj = travelAppSoap.getTravelDetails(travelDetailsRequest); 
		return detatilsObj;
	}
	
}
