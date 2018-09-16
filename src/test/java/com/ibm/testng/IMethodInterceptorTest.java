package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class IMethodInterceptorTest {

	@Test
	public void test1(Method method){
		System.out.println(method.getName());
	}
	
	@Test
	public void test2(Method method){
		System.out.println(method.getName());
	}
	
	@Test
	public void test3(Method method){
		System.out.println(method.getName());
	}
	
	@Test
	public void test4(Method method){
		System.out.println(method.getName());
	}

}
