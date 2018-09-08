package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({com.ibm.testng.IInvokedMethodListenerImp.class})
public class IInvokedMethodListenerTest{
	
	@BeforeMethod
	public void beforeMethod(Method method, ITestResult result){
		System.out.println("BEFORE METHOD of "+method.getName());
	}

	@Test(enabled = true,expectedExceptions=RuntimeException.class, priority=1)
	public void testWithEnabledTrueWithExpectedException(){
		System.out.println("TEST testWithEnabledTrueWithExpectedException");
		throw new RuntimeException();
	}
	
	@Test(enabled = false,expectedExceptions=RuntimeException.class, priority=2)
	public void testWithEnabledFalseWithExpectedException(){
		System.out.println("TEST testWithEnabledFalseWithExpectedException");
		throw new RuntimeException();
	}
	
	@Test(expectedExceptions=RuntimeException.class, priority=3)
	public void testWithoutEnabledWithExpectedException(){
		System.out.println("TEST testWithoutEnabledWithExpectedException");
		throw new RuntimeException();
	}
	
	@Test(priority=4)
	public void testWithoutEnabledWithoutExpectedException() throws RuntimeException{
		System.out.println("TEST testWithoutEnabledWithoutExpectedException");
		throw new RuntimeException();
	}
	
	@Test(priority=5)
	public void testWithoutEnabledWithoutExpectedExceptionAndNoThrow() throws RuntimeException{
		System.out.println("TEST testWithoutEnabledWithoutExpectedExceptionAndNoThrow");
	}
	
	@AfterMethod
	public void afterMethod(Method method, ITestResult result){
		System.out.println("AFTER METHOD of "+result.getMethod().getMethodName());
		Throwable throwable;
		boolean isTest = result.getMethod().isTest();
		boolean enabled = result.getMethod().getEnabled();
		if(isTest && enabled){
			System.out.println("isTest - "+isTest+", Enabled - "+enabled);
			throwable = result.getThrowable();
			//throwable.printStackTrace();
			if(throwable != null)
				result.setThrowable(null);
		}
	}

}
