package com.certimeter.learnsoap.utilities;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbUtility {

	@SuppressWarnings("unchecked")
	public static <T> T unmarshall(String s, Class<T> c) throws JAXBException {
		return (T) JAXBContext.newInstance(c).createUnmarshaller().unmarshal(new StringReader(s));
	}

	public static String marshall(Object obj) throws JAXBException {
		Marshaller ma = JAXBContext.newInstance(obj.getClass()).createMarshaller();
		ma.setProperty(Marshaller.JAXB_FRAGMENT, true);
		StringWriter sw = new StringWriter();
		ma.marshal(obj, sw);
		return sw.toString().trim();
	}
}
