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
		assertEquals("1", 1);
	}
	
	public void test_2()
	{
		assertEquals("2", 2);	
	}
	
	public void test_3()
	{
		assertEquals("Fizz", 3);	
	}
	
	public void test_4()
	{
		assertEquals("Buzz", 5);	
	}
	
	public void test_5()
	{
		assertEquals("Buzz",10);
	}
	
	public void test_6()
	{
		assertEquals("Fizz",6);
	}
	
	public void assertEquals(String expectedResult, int param)
	{
		String actualResult = fizzBuzz.say(param);
		if(false == actualResult.equals(expectedResult))
		{
			result = false;
			System.out.println("Expected Fizz, But " + fizzBuzz.say(6));
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