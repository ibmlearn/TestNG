package com.ibm.testng;

import org.testng.annotations.Test;

public class TestngPreserveOrder {
	
	@Test
	public void firstTest(){
		System.out.println("***FIRST TEST***");
	}
	
	@Test
	public void secondTest(){
		System.out.println("***SECOND TEST***");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("***THIRD TEST***");
	}
	
	@Test
	public void fourthTest() {
		System.out.println("***FOURTH TEST***");
	}
	
}
