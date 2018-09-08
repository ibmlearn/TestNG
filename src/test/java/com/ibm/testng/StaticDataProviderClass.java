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

public class StaticDataProviderClass {
	
	@DataProvider(name="dataProviderFromAnotherClass", parallel=true)
	public Iterator<Object[]> getDataFromAnotherClass(Method method, ITestContext context){
		System.out.println(method.getName());
		System.out.println(context.getName());
		List<Map<String,String>> completeData = new ArrayList();
		Map firstMap = new HashMap<String,String>();
		firstMap.put("name", "hello");
		firstMap.put("id", "1");
		Map secondMap = new HashMap<String,String>();
		secondMap.put("name", "hi");
		secondMap.put("id", "2");
		completeData.add(firstMap);
		completeData.add(secondMap);
		Collection collection = new ArrayList();
		for(Map<String,String> map: completeData){
			collection.add(new Object[]{map});
		}
		return collection.iterator();
	}

}
