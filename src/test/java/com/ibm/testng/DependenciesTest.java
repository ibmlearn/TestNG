package com.ibm.testng;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {
	
	@Test
	public void testMethod(Method method){
		System.out.println(method.getName());
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnMethods={"testMethod"}, alwaysRun=true)
	public void testMethodWithAlwaysRunAsTrue(Method method){
		System.out.println(method.getName());
	}
	
	@Test(dependsOnMethods={"testMethod"})
	public void testMethodWithAlwaysRunAsDeaultFalse(Method method){
		System.out.println(method.getName());
	}
	
	@Test(groups={"groupOne"})
	public void testGroupMethod(Method method){
		System.out.println(method.getName());
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnGroups={"groupOne"}, alwaysRun=true)
	public void testGroupMethodWithAlwaysRunAsTrue(Method method){
		System.out.println(method.getName());
	}
	
	@Test(dependsOnGroups={"groupOne"})
	public void testGroupMethodWithAlwaysRunAsDefaultFalse(Method method){
		System.out.println(method.getName());
	}

}
