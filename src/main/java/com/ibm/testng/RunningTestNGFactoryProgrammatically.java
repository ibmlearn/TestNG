package com.ibm.testng;

import org.testng.TestNG;


public class RunningTestNGFactoryProgrammatically {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testNG = new TestNG();
		@SuppressWarnings("rawtypes")
		Class[] arrayOfClasses = new Class[1];
		arrayOfClasses[0] = FactoriesWithDataProvidersTest.class;
		testNG.setTestClasses( arrayOfClasses );
		testNG.run();
	}

}
