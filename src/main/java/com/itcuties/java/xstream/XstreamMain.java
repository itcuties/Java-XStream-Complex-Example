package com.itcuties.java.xstream;

import java.io.File;

import com.itcuties.java.xstream.data.ComplexExample;
import com.thoughtworks.xstream.XStream;

/**
 * This class shows how to use XStream library to parse xml files straight into
 * the java classes. It shows the most simple cases to give a quick kick start
 * into using the library.
 * 
 * It uses annotations to make the code most redable. But this is not the only
 * way. XStream allows to register xml-java mapping manually using methods in
 * XStream class. It allows to create custom converters for types. Converters
 * for basic types are of course available.
 * 
 * For further reading about advanced usage of XStream go to:
 * <b>http://xstream.codehaus.org/</b>
 * 
 * @author itcuties
 */
public class XstreamMain {

	public static void main(String[] args) {
		try {
			XstreamMain.presentComplexExample();
		} catch (Exception e) {
			System.err.println("This exception should not happen: "
					+ e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	/**
	 * This method is a summary of all previous presentations. It also points to
	 * several very important issues about xstream loading process. For full
	 * detail see the ComplexExample class javadoc.
	 */
	private static void presentComplexExample() throws Exception {
		XStream xStream = new XStream();
		xStream.processAnnotations(ComplexExample.class);
		Object readObject = xStream
				.fromXML(new File("xmls/complex-example.xml"));
		System.out.println("Object loaded by xstream: " + readObject);
	}
}
