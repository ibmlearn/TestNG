package com.ibm.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationTransformer2DataProviderAnnotationTest {

	@Test(dataProvider="dp")
	public void test(String param){
		System.out.println(param);
	}
	
	@DataProvider(name="dp")
	public Object[] getData(){
		return new Object[]{"firstParamFromDP","secondParamFromDP"};
	}

}
