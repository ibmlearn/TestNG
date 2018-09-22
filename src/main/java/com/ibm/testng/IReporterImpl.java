package com.ibm.testng;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class IReporterImpl implements IReporter{

	public void generateReport(List<XmlSuite> xmlSuiteList, List<ISuite> iSuiteList, String string) {
		System.out.println("generateReport has been invoked");
		System.out.println(string);
		for(XmlSuite eachXmlSuite : xmlSuiteList){
			System.out.println(eachXmlSuite.getName());
		}
		for(ISuite eachISuite : iSuiteList){
			System.out.println(eachISuite.getName());
		}
	}


}
