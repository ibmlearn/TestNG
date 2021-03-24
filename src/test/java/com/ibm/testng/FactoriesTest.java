package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoriesTest {
	
	private int numberOfTimes;
	
	public FactoriesTest() {
		
	}

	public FactoriesTest(int numberOfTimes) {
		this.numberOfTimes = numberOfTimes;
	}
	
	@BeforeTest
	public void beforeTest(ITestContext context){
		System.out.println(context.getName()+" START");
	}

	@Test
	public void testMethod(Method method) {
		System.out.println(method.getName()+" For "+numberOfTimes);
	}
	
	@Test
	public void testMethod2(Method method) {
		System.out.println(method.getName()+" For "+numberOfTimes);
	}

	@Factory
	public Object[] createInstances() {
		Object[] result = new Object[5];
		for (int i = 0; i < 5; i++) {
			result[i] = new FactoriesTest(i * 10);
		}
		return result;
	}
	
	@AfterTest
	public void afterTest(ITestContext context){
		System.out.println(context.getName()+" END");
	}
}
