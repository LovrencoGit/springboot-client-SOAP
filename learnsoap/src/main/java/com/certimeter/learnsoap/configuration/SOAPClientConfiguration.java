package com.certimeter.learnsoap.configuration;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.certimeter.learnsoap.soap.wsdl.calculator.webservice.CalculatorSoapWebService;
import com.certimeter.learnsoap.soap.wsdl.travelapp.webservice.TravelAppSoapWebService;

@Configuration
public class SOAPClientConfiguration {

	private String addressCalculator = "http://www.dneonline.com/calculator.asmx?wsdl";

	@Bean(name = "calculatorProxy")
	public CalculatorSoapWebService calculatorProxy() {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress(addressCalculator);
//	    jaxWsProxyFactoryBean.setInInterceptors(interceptors);
//	    jaxWsProxyFactoryBean.setOutInterceptors(interceptors);
		return jaxWsProxyFactoryBean.create(CalculatorSoapWebService.class);
	}
	
	/****************************************************************************************/
	
	private String addressTravelApp = "http://test.easybook.it/WSPublic/services/TravelAppHandler";//wsdl/TravelAppHandler.wsdl";

	@Bean(name = "travelAppProxy")
	public TravelAppSoapWebService travelAppProxy() {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress(addressTravelApp);
//	    jaxWsProxyFactoryBean.setInInterceptors(interceptors);
//	    jaxWsProxyFactoryBean.setOutInterceptors(interceptors);
		return jaxWsProxyFactoryBean.create(TravelAppSoapWebService.class);
	}

}
