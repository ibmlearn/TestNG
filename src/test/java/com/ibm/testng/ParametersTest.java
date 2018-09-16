package com.ibm.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	String firstParam;
	String secondParam;
	
	@Parameters({"firstParam","secondParam"})
	ParametersTest(String firstParam, String secondParam){
		this.firstParam = firstParam;
		this.secondParam = secondParam;
	}

	@Parameters({"firstParam","secondParam"})
	@BeforeMethod
	public void beforeMethod(String firstParam, String secondParam){
		System.out.println("PARAMETERS FOR @BEFOREMETHOD");
		System.out.println(firstParam);
		System.out.println(secondParam);
	}
	
	@Parameters({"firstParam","secondParam","thirdParam"})
	@Test
	public void parameters(String firstParam, String secondParam, @Optional("optional param value") String thirdParam){
		System.out.println("PARAMETERS FOR @TEST method parameters");
		System.out.println(firstParam);
		System.out.println(secondParam);
		System.out.println(thirdParam);
	}
	
	@Test
	public void parametersFromConstructor(){
		System.out.println("PARAMETERS FOR @TEST method parametersFromConstructor");
		System.out.println(this.firstParam);
		System.out.println(this.secondParam);
	}
	
	@Factory
	public Object[] createInstances() {
		Object[] result = new Object[5];
		for (int i = 0; i < 5; i++) {
			result[i] = new FactoriesWeb(i * 10);
		}
		return result;
	}
	
}
