package com.ibm.testng.packagesample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPackageSampleTest {
	
	@BeforeMethod
	public void before() {
		System.out.println("***BEFORE METHOD***");
	}
	
	@Test
	public void firstTest() {
		System.out.println("***FIRST TEST***");
	}
	
	@Test
	public void secondTest() {
		System.out.println("***SECOND TEST***");
	}

	@AfterMethod
	public void after() {
		System.out.println("***AFTER METHOD***");
	}
}
