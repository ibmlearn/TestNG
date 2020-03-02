package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class FactoriesWeb {

	private int numberOfTimes;

	public FactoriesWeb(int numberOfTimes) {
		this.numberOfTimes = numberOfTimes;
	}

	@Test
	public void testMethod(Method method) {
		System.out.println(method.getName()+" For "+numberOfTimes);
	}
	
	@Test
	public void testMethod2(Method method) {
		System.out.println(method.getName()+" For "+numberOfTimes);
	}

}
