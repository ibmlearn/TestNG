package com.ibm.testng;

import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

public class ParametersForFactoriesTest {

	@Parameters({"factParam"})
	@Factory
	public Object[] createInstances(int factParam) {
		System.out.println("Parameters for Factory method");
		Object[] result = new Object[factParam];
		for (int i = 0; i < factParam; i++) {
			result[i] = new FactoriesWeb(i * 10);
		}
		return result;
	}
}
