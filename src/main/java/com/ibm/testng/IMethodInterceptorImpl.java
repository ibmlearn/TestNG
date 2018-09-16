package com.ibm.testng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class IMethodInterceptorImpl implements IMethodInterceptor {

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		Collections.reverse(methods);
		result = methods;
		return result;
	}

}
