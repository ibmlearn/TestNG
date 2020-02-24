package com.ibm.testng;

import org.testng.TestNG;

public class RunningTestNGFactoryProgrammatically {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		TestNG testNG = new TestNG();
		@SuppressWarnings("rawtypes")
		Class[] arrayOfClasses = new Class[1];
		arrayOfClasses[0] = Class.forName("com.ibm.testng.FactoriesWithDataProvidersTest");
		testNG.setTestClasses( arrayOfClasses );
		testNG.run();
	}

}
