package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class FactoriesWeb {

	private int m_numberOfTimes;

	public FactoriesWeb(int numberOfTimes) {
		m_numberOfTimes = numberOfTimes;
	}

	@Test
	public void testMethod(Method method) {
		/*for (int i = 0; i < m_numberOfTimes; i++) {
			System.out.println(method.getName()+" For "+m_numberOfTimes);
		}*/
		System.out.println(method.getName()+" For "+m_numberOfTimes);
	}
	
	@Test
	public void testMethod2(Method method) {
		/*for (int i = 0; i < m_numberOfTimes; i++) {
			System.out.println(method.getName()+" For "+m_numberOfTimes);
		}*/
		System.out.println(method.getName()+" For "+m_numberOfTimes);
	}

}
