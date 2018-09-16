package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllowReturnValuesTest {

	@BeforeMethod
	public void beforeMethod(Method method){
		System.out.println("***BEFORE METHOD***");
		System.out.println(method.getName());
	}
	
	@Test
	public void testMethodWithoutReturnValues(){
		
	}
	
	@Test
	public String testMethodWithReturnValues(){
		return "This string is returned by test method";
	}
	
	@AfterMethod
	public void afterMethod(Method method){
		System.out.println("***AFTER METHOD***");
		System.out.println(method.getName());
	}
}
