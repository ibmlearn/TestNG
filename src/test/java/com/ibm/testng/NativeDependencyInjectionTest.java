package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestResult;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class NativeDependencyInjectionTest {

	@BeforeSuite
	public void beforeSuite(ITestContext context){
		System.out.println("***BEFORE SUITE***");
		System.out.println(context.getName());
	}
	
	@BeforeTest
	public void beforeTest(ITestContext context, XmlTest xmlTest){
		System.out.println("***BEFORE TEST***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
	}
	
	@BeforeClass
	public void beforeClass(ITestContext context, XmlTest xmlTest){
		System.out.println("***BEFORE CLASS***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
	}
	
	@BeforeGroups({"group"})
	public void beforeGroup(ITestContext context, XmlTest xmlTest){
		System.out.println("***BEFORE GROUP***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context, XmlTest xmlTest,Method method, Object[] objectArray, ITestResult result){
		System.out.println("***BEFORE METHOD***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
		System.out.println(method.getName());
		System.out.println(objectArray);
		System.out.println(result.getName());
	}
	
	@Test(groups={"group"}, dataProvider="dp")
	public void testForGroup(ITestContext context, String data){
		System.out.println("***TEST FOR GROUP***");
		System.out.println(context.getName());
		System.out.println(data);
	}
	
	@Test(dataProvider="dp")
	public void firstTest(ITestContext context, String data){
		System.out.println("***TEST WITHOUT GROUP***");
		System.out.println(context.getName());
		System.out.println(data);
	}
	
	@AfterMethod
	public void afterMethod(ITestContext context, XmlTest xmlTest,Method method, Object[] objectArray, ITestResult result){
		System.out.println("***AFTER METHOD***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
		System.out.println(method.getName());
		System.out.println(objectArray);
		System.out.println(result.getName());
	}
	
	@AfterGroups({"group"})
	public void afterGroup(ITestContext context, XmlTest xmlTest){
		System.out.println("***AFTER GROUP***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
	}
	
	@AfterClass
	public void afterClass(ITestContext context, XmlTest xmlTest){
		System.out.println("***AFTER CLASS***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
	}
	
	@AfterTest
	public void afterTest(ITestContext context, XmlTest xmlTest){
		System.out.println("***AFTER TEST***");
		System.out.println(context.getName());
		System.out.println(xmlTest.getName());
	}
	
	@AfterSuite
	public void afterSuite(ITestContext context){
		System.out.println("***AFTER SUITE***");
		System.out.println(context.getName());
	}
	
	@DataProvider(name="dp")
	public Object[][] getData(ITestContext context, Method method){
		System.out.println("***DATA PROVIDER***");
		System.out.println(context.getName());
		System.out.println(method.getName());
		return new Object[][]{{"A"}, {"B"}};
	}

}
