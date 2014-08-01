package com.baldurtech;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;

public class UtilTestCase
{
	public static Boolean result = true;
	
	public static void main(String[] args) throws Exception
	{
		if(args.length > 0)
		{
			String testPackage = args[0];
			Reflections reflections = new Reflections(testPackage);
			
			Set<Class<? extends UtilTestCase>> allTestCase = reflections.getSubTypesOf(UtilTestCase.class);
			for(Class clazz : allTestCase)
			{
				System.out.println("Testing:" + clazz.getName());
				runAllTest(clazz);	
			}
			outputTestReport();		
		}
	}
	
	public static void runAllTest(Class clazz)
	{
		for(Method testMethod: getAllMethods(clazz))
			{
				try
				{
					Object obj = clazz.newInstance();
					testMethod.invoke(obj);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
	}
	
	public static List<Method> getAllMethods(Class clazz)
	{
		Method[] methods = clazz.getDeclaredMethods();
		List<Method> testMethods = new ArrayList<Method>();
		for(Method method: methods)
		{
			if(method.getName().startsWith("test"))
			{
				System.out.println("	testing: " + method.getName());
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
	public static void outputTestReport()
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