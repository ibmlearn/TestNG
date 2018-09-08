package com.ibm.testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ProgrammaticallyRunningTestNG {
	
	public static void main(String[] args) {
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.ibm.testng.AnnotationWithDataProviderExecutionOrder"));
		
		XmlTest test = new XmlTest();
		test.setName("test");
		test.setXmlClasses(classes);
		
		XmlSuite suite = new XmlSuite();
		suite.setName("suite");
		suite.addTest(test);
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		
		TestNG testNG = new TestNG();
		testNG.setXmlSuites(suites);
		
		testNG.run();
		
	}
	
}
