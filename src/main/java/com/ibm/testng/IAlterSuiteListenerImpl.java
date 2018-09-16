package com.ibm.testng;

import java.util.List;
import java.util.Random;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

public class IAlterSuiteListenerImpl implements IAlterSuiteListener{

	public void alter(List<XmlSuite> suites) {
		XmlSuite suite = suites.get(0);
		List<String> listeners = suite.getListeners();
		for(String eachListener: listeners){
			System.out.println(eachListener);
		}
		suite.setName(suite.getName()+new Random().nextInt(100));
/*		List<XmlTest> tests = suite.getTests();
		XmlTest testContext = tests.get(0);
		List<XmlClass> testClasses = testContext.getClasses();
		XmlClass testClass = testClasses.get(0);*/
	}

}
