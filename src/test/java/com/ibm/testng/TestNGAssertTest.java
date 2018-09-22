package com.ibm.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertTest {
	
	private SoftAssert softAssert;

	@Test(dataProvider="arrayOfArrayOfObjects")
	public void hardAssertTest(String name, Integer firstInt){
		Assert.assertEquals(name, "Cedric", "Name is incorrect");
		Assert.assertEquals("36", firstInt.toString(), "Integer is incorrect");
	}
	
	@Test(dataProvider="arrayOfArrayOfObjects")
	public void softAssertTest(String name, Integer firstInt){
		getSoftAssert().assertEquals(name, "Cedric", "Name is incorrect");
		getSoftAssert().assertEquals("36", firstInt.toString(), "Integer is incorrect");
		getSoftAssert().assertAll();
	}
	
	@DataProvider(name = "arrayOfArrayOfObjects")
	public Object[][] createData(){
		return new Object[][] {
			{ "Cedric", new Integer(36) },
			{ "Anne", new Integer(37)},
			};
	}
	
	private SoftAssert getSoftAssert(){
		if(softAssert == null)
		 softAssert = new SoftAssert();
		return softAssert;
	}
	
}
