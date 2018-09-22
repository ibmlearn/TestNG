package com.ibm.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.ibm.testng.TestListenerAdapterImpl.class)
public class ListenerTestListenerAdapterTest {
	
	@Test(invocationCount = 20)
	public void firstTest(){
		Assert.assertEquals(true, true);
	}

}
