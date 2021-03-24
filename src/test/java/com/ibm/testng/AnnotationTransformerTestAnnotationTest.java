package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class AnnotationTransformerTestAnnotationTest {

	@Test(description="description")
	public void test(ITestContext testContext, Method testMethod){
		System.out.println(testMethod.getName()+" "+testMethod.getAnnotation(Test.class).invocationCount());
	}

}
