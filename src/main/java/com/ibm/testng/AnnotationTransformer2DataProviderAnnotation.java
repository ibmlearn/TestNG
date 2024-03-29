package com.ibm.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer2;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer2DataProviderAnnotation implements IAnnotationTransformer2 {
	
	private String dataProviderName = "dataProvider";

	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
	}

	public void transform(IDataProviderAnnotation testDataProviderAnnotation, Method testMethod) {
		testDataProviderAnnotation.setName(dataProviderName);
		//testDataProviderAnnotation.setName("AnyRandomName");
		System.out.println(dataProviderName);
	}

	public void transform(IFactoryAnnotation testFactoryAnnotation, Method testMethod) {
	}

	public void transform(IConfigurationAnnotation testConfigurationAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
	}
	
}
