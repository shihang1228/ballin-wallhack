package com.baldurtech;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest
{
	public static Boolean result = true;
	
	public static void main(String[] args) throws Exception
	{
		FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
		Method[] methods = FizzBuzzTest.class.getDeclaredMethods();
		List<Method> testMethods = new ArrayList<Method>();
		for(Method method: methods)
		{
			if(method.getName().startsWith("test"))
			{
				System.out.println("testing: " + method.getName());
				testMethods.add(method);
			}		
		}
		for(Method testMethod: testMethods)
		{
			FizzBuzzTestCase fizzBuzzTestCase = (FizzBuzzTestCase)FizzBuzzTestCase.class.newInstance();
			testMethod.invoke(fizzBuzzTestCase);
		}
		
		fizzBuzzTest.outputTestReport();
		
	}
	
	public void assertEquals(String expectedResult, String actualResult)
	{
		if(false == expectedResult.equals(actualResult))
		{
			result = false;
			System.out.println("Expected: " + expectedResult + " ,but: " + actualResult);
		}
	}
	public void outputTestReport()
	{
		if(result)
		{
			System.out.println("Test Success!");
		}
		else
		{
			System.out.println("Test Failed!");
		}
	}
}