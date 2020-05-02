package com.certimeter.learnsoap.travelapp;

import static org.junit.Assert.assertEquals;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.certimeter.learnsoap.soap.client.TravelAppSoapClient;
import com.certimeter.learnsoap.soap.wsdl.travelapp.model.request.TravelDetailsRq;
import com.certimeter.learnsoap.soap.wsdl.travelapp.model.response.TravelDetailsRs;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringCxfTravelAppApplicationTests {

	@Autowired
	private TravelAppSoapClient travelAppSoapClient;
	
	@Test
	public void testGetTravelDetails() throws JAXBException {
		TravelDetailsRq request = new TravelDetailsRq();
		request.setBrand("BR");
		request.setNumPratica("2578254");
		request.setDepartureDate("2019-04-22");
		
		TravelDetailsRs response = travelAppSoapClient.getTravelDetails(request);
		assertEquals(response.getNumPratica(), "2578254");

		//---------------------------------------------------------------------------
		
		System.out.println("response.getXmlPreventivo().getContent() = > " + response.getXmlPreventivo().getContent());
		
		/** XmlPreventivoContentXXX => classe generata dal file xsd fornito per oggettificare la stringa xml in response.getXmlPreventivo().getContent() **/
		//XmlPreventivoContentXXX xmlPreventivo = JaxbUtils.unmarshall(response.getXmlPreventivo().getContent(), XmlPreventivoContentXXX.class);
		//System.out.println("xmlPreventivo => " + );
		
	}
}
