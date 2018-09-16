package com.ibm.testng;

import org.testng.annotations.Test;

@Test
public class ClassLevelAnnotationsTest {

	public void firstTest(){
		System.out.println("*** FIRST TEST ***");
	}
	
	public void secondTest(){
		System.out.println("*** SECOND TEST ***");
	}
	
	@Test(groups="group")
	public void testWithGroup(){
		System.out.println("*** TEST WITH GROUP ***");
	}
	
}
