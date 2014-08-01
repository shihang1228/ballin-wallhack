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
		fizzBuzzTest.runAllTest();
		
		fizzBuzzTest.outputTestReport();
		
	}
	
	public void runAllTest()
	{
		for(Method testMethod: getAllMethods())
			{
				try
				{
					Object obj = FizzBuzzTestCase.class.newInstance();
					testMethod.invoke(obj);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
	}
	
	public List<Method> getAllMethods()
	{
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
		
		return testMethods;
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