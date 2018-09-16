package com.ibm.testng;

import org.testng.annotations.Factory;

public class DependenciesGroupByInstancesTest {
	
	@Factory
	public Object[] createInstances() {
		Object[] result = new Object[5];
		for (int i = 0; i < 5; i++) {
			result[i] = new FactoriesWeb(i * 10);
		}
		return result;
	}

}
