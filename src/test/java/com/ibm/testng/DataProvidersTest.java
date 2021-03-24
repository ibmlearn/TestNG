package com.ibm.testng;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTest {

	@Test(dataProvider="arrayOfArrayOfObjects")
	public void arrayOfArrayOfObjectsDataProviderTest(String name, Integer firstInt){
		System.out.println(name+" "+firstInt);
	}
	
	@Test( dataProvider="arrayOfArrayOfObjectsParallel")
	public void arrayOfArrayOfObjectsParallelDataProviderTest(String name, Integer firstInt){
		System.out.println(name+" "+firstInt);
	}
	
	@Test( dataProvider="iteratorOfObjectsDataProvider")
	public void iteratorOfObjectsDataProviderTest(Map<String,String> data){
		System.out.println(data);
	}
	
	@Test( dataProvider="dataProviderFromAnotherClass", dataProviderClass=com.ibm.testng.StaticDataProviderClass.class)
	public void testDataFromAnotherClass(HashMap<String,String> data){
		System.out.println(data);
	}
	
	@DataProvider(name = "arrayOfArrayOfObjects")
	public Object[][] createData(Method method, ITestContext context){
		System.out.println(method.getName());
		System.out.println(context.getName());
		return new Object[][] {
			{ "Cedric", new Integer(36) },
			{ "Anne", new Integer(37)},
			};
	}
	
	@DataProvider(name = "arrayOfArrayOfObjectsParallel", parallel=true)
	public Object[][] createDataParallel(Method method, ITestContext context){
		System.out.println(method.getName());
		System.out.println(context.getName());
		return new Object[][] {
			{ "Parallel1", new Integer(36) },
			{ "Parallel2", new Integer(37)},
			};
	}
	
	@DataProvider(name = "iteratorOfObjectsDataProvider")
	public Iterator<Object[]> getIteratorObject(Method method, ITestContext context){
		System.out.println(method.getName());
		System.out.println(context.getName());
		List<Map<String,String>> completeData = new ArrayList<Map<String,String>>();
		Map<String,String> data = new HashMap<String,String>();
		data.put("1","one");
		data.put("2","two");
		completeData.add(data);
		Map<String,String> data2 = new HashMap<String,String>();
		data2.put("3","three");
		data2.put("4","four");
		completeData.add(data2);
		Collection<Object[]> collection = new ArrayList<Object[]>();
		for(Map<String,String> map: completeData){
			collection.add(new Object[]{map});
		}
		return collection.iterator();
	}
	
}
