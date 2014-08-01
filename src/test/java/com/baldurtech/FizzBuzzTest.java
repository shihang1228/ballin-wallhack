package com.baldurtech;


public class FizzBuzzTest
{
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
		fizzBuzzTest.test_7();
		
		fizzBuzzTest.outputTestReport();
		
	}
	
	public void test_1()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.say(1));
	}
	
	
	public void test_2()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("2", fizzBuzz.say(2));	
	}
	
	public void test_3()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.say(3));	
	}
	
	public void test_4()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.say(5));	
	}
	
	public void test_5()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz",fizzBuzz.say(10));
	}
	
	public void test_6()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz",fizzBuzz.say(6));
	}
	public void test_7()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz",fizzBuzz.say(15));
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