package com.ibm.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationWithDataProviderExecutionOrder {
	
	public void beforeSuite(){
		System.out.println("***BEFORE SUITE***");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("***BEFORE TEST***");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("***BEFORE CLASS***");
	}
	
	@BeforeGroups({"group"})
	public void beforeGroup(){
		System.out.println("***BEFORE GROUP***");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("***BEFORE METHOD***");
	}
	
	@Test(groups={"group"}, dataProvider="dp")
	public void testForGroup(String data){
		System.out.println("***TEST FOR GROUP***");
		System.out.println(data);
	}
	
	@Test(dataProvider="dp")
	public void firstTest(String data){
		System.out.println("***TEST WITHOUT GROUP***");
		System.out.println(data);
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("***AFTER METHOD***");
	}
	
	@AfterGroups({"group"})
	public void afterGroup(){
		System.out.println("***AFTER GROUP***");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("***AFTER CLASS***");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("***AFTER TEST***");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("***AFTER SUITE***");
	}
	
	@DataProvider(name="dp")
	public Object[][] getData(){
		System.out.println("***DATA PROVIDER***");
		return new Object[][]{{"A"}, {"B"}};
	}

}
