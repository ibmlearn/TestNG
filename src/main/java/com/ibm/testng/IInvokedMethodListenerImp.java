package com.ibm.testng;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImp implements IInvokedMethodListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("BEFORE INVOCATION of "+result.getMethod().getMethodName());
		boolean testMethod = method.isTestMethod();
		boolean enabled = method.getTestMethod().getEnabled();
		if(testMethod && enabled){
			System.out.println("testMethod - "+testMethod+", Enabled - "+enabled);
		}
	}
	
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("AFTER INVOCATION of "+result.getMethod().getMethodName());
		Throwable throwable;
		boolean testMethod = method.isTestMethod();
		boolean enabled = method.getTestMethod().getEnabled();
		if(testMethod && enabled){
			System.out.println("testMethod - "+testMethod+", Enabled - "+enabled);
			throwable = result.getThrowable();
			//throwable.printStackTrace();
			if(throwable != null)
				result.setThrowable(null);
		}
	}
	
}
