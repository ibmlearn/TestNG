package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class AnnotationTransformer2FactoryAnnotationTest {

private int number;
	
	public AnnotationTransformer2FactoryAnnotationTest(){
		
	}
	
	public AnnotationTransformer2FactoryAnnotationTest(Integer number){
		this.number = number;
	}
	
	@BeforeTest
	public void beforeTest(ITestContext context){
		System.out.println(context.getName()+" START");
	}
	
	@Test
	public void test1(Method method){
		System.out.println(method.getName()+": "+number);
	}
	
	@Test
	public void test2(Method method){
		System.out.println(method.getName()+": "+number);
	}
	
	@Factory(dataProvider="dp")
	public Object[] createInstances(Integer number) {
		Object[] result = new Object[1];
		AnnotationTransformer2FactoryAnnotationTest test1 = new AnnotationTransformer2FactoryAnnotationTest(number);
		result[0] = test1;
		return result;
	}
	
	@DataProvider(name="dp")
	public Object[][] createData(){
		return new Object[][] {
			{ new Integer(11) },
			{ new Integer(22) },
			{ new Integer(33) },
			{ new Integer(44)}
		};
	}
	
	@AfterTest
	public void afterTest(ITestContext context){
		System.out.println(context.getName()+" END");
	}

}
