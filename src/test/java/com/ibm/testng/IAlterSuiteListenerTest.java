package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class IAlterSuiteListenerTest {

	@Test
	public void test1(ITestContext context, Method method){
		System.out.println(context.getSuite().getName());
		System.out.println(method.getName());
	}
	
	@Test
	public void test2(ITestContext context, Method method){
		System.out.println(context.getSuite().getName());
		System.out.println(method.getName());
	}

}
