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
		fizzBuzzTest.test_5();
		fizzBuzzTest.test_6();
		
		fizzBuzzTest.outputTestReport();
	}
	
	public void test_1()
	{	
		if(false == assertEquals("1", 1))
		{
			result = false;
			System.out.println("Expected 1, But " + fizzBuzz.say(1));
		}	
	}
	
	public void test_2()
	{
		if(false == assertEquals("2", 2))
		{
			result = false;
			System.out.println("Expected 2, But " + fizzBuzz.say(2));
		}	
	}
	
	public void test_3()
	{
		if(false == assertEquals("Fizz", 3))
		{
			result = false;
			System.out.println("Expected Fizz, But " + fizzBuzz.say(3));
		}	
	}
	
	public void test_4()
	{
		if(false == assertEquals("Buzz", 5))
		{
			result = false;
			System.out.println("Expected Buzz, But " + fizzBuzz.say(5));
		}	
	}
	
	public void test_5()
	{
		if(false == assertEquals("Buzz",10))
		{
			result = false;
			System.out.println("Expected Buzz, But " + fizzBuzz.say(10));
		}
	}
	
	public void test_6()
	{
		if(false == assertEquals("Fizz",6))
		{
			result = false;
			System.out.println("Expected Fizz, But " + fizzBuzz.say(6));
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