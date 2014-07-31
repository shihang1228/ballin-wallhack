package com.baldurtech;


public class FizzBuzzTest
{
	FizzBuzz fizzBuzz = new FizzBuzz();
	public static Boolean result = true;
	
	public static void main(String[] args)
	{
		FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
		
		fizzBuzzTest.test_1();
		fizzBuzzTest.test_2();
		fizzBuzzTest.test_3();
		fizzBuzzTest.test_4();	
		
		fizzBuzzTest.outputTestReport();
	}
	
	public void test_1()
	{	
		if(assertEquals("1", 1))
		{
		
		}
		else
		{
			result = false;
			System.out.println("Expected 1, But " + fizzBuzz.say(1));
		}	
	}
	
	public void test_2()
	{
		if(assertEquals("2", 2))
		{

		}
		else
		{
			result = false;
			System.out.println("Expected 2, But " + fizzBuzz.say(2));
		}	
	}
	
	public void test_3()
	{
		if(assertEquals("Fizz", 3))
		{

		}
		else
		{
			result = false;
			System.out.println("Expected Fizz, But " + fizzBuzz.say(3));
		}	
	}
	
	public void test_4()
	{
		if(assertEquals("Buzz", 5))
		{
		
		}
		else
		{
			result = false;
			System.out.println("Expected Buzz, But " + fizzBuzz.say(5));
		}	
	}
	
	public Boolean assertEquals(String expectedResult, int param)
	{
		return expectedResult.equals(fizzBuzz.say(param));
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