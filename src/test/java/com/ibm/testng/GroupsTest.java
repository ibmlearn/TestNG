package com.ibm.testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GroupsTest {

	@BeforeSuite
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
	
	@BeforeGroups({"first"})
	public void beforeGroupFirst(){
		System.out.println("***BEFORE GROUP FIRST***");
	}
	
	@BeforeGroups({"second"})
	public void beforeGroupSecond(){
		System.out.println("***BEFORE GROUP SECOND***");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("***BEFORE METHOD***");
	}
	
	@Test(groups={"first"})
	public void testForGroupFirst(){
		System.out.println("***TEST FOR GROUP FIRST***");
	}
	
	@Test(groups={"second"})
	public void testForGroupSecond(){
		System.out.println("***TEST FOR GROUP SECOND***");
	}
	
	@Test
	public void firstTest(){
		System.out.println("***FIRST TEST WITHOUT GROUP***");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("***AFTER METHOD***");
	}
	
	@AfterGroups({"first"})
	public void afterGroupFirst(){
		System.out.println("***AFTER GROUP FIRST***");
	}
	
	@AfterGroups({"second"})
	public void afterGroupSecond(){
		System.out.println("***AFTER GROUP SECOND***");
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
	
}
