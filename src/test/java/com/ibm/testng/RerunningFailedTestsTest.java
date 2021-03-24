package com.ibm.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunningFailedTestsTest {

	@Test(retryAnalyzer = com.ibm.testng.MyRetryAnalyzer.class)
	public void testMethod1(){
		Assert.fail();
	}
	
}
