package com.ibm.testng;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class IHookableImpl implements IHookable{

	public void run(IHookCallBack hookCallBack, ITestResult testResult) {
		Object[] parameters = hookCallBack.getParameters();
		for(Object eachParameter: parameters){
			System.out.println(eachParameter);
			hookCallBack.runTestMethod(testResult);
		}
	}

}
