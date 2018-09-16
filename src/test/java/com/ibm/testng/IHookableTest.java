package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class IHookableTest {

	@Test(description="firstTest", invocationCount=1)
	public void test1(Method method){
		System.out.println(method.getName());
	}
	
	@Test(description="secondTest", invocationCount=1)
	public void test2(Method method){
		System.out.println(method.getName());
	}

}
