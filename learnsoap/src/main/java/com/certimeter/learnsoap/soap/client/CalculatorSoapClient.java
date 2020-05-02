package com.certimeter.learnsoap.soap.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.certimeter.learnsoap.soap.wsdl.calculator.webservice.CalculatorSoapWebService;

@Component
public class CalculatorSoapClient implements CalculatorSoapWebService {

	@Autowired
	private CalculatorSoapWebService calculatorSoap;

	
	@Override
	public int add(int intA, int intB) {
		int sum = calculatorSoap.add(intA, intB);
		return sum;
	}

	@Override
	public int subtract(int intA, int intB) {
		int sub = calculatorSoap.subtract(intA, intB);
		return sub;
	}

	@Override
	public int multiply(int intA, int intB) {
		int mul = calculatorSoap.multiply(intA, intB);
		return mul;
	}

	@Override
	public int divide(int intA, int intB) {
		int div = calculatorSoap.divide(intA, intB);
		return div;
	}

}
