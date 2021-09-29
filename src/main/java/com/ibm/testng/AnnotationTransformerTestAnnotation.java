package com.ibm.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformerTestAnnotation implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if(testMethod.getName().equalsIgnoreCase("testAnnotationTransformer")) {
			testAnnotation.setInvocationCount(5);
			System.out.println(testMethod.getName()); 
		}
	}
	
}
