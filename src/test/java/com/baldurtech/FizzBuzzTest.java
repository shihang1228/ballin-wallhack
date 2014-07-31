package com.baldurtech;


public class FizzBuzzTest
{
	FizzBuzz fizzBuzz = new FizzBuzz();
	public static void main(String[] args)
	{
		FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
		
		fizzBuzzTest.test_1();
		fizzBuzzTest.test_2();
		fizzBuzzTest.test_3();
		fizzBuzzTest.test_4();	
	}
	
	public void test_1()
	{	
		if(assertEquals("1", 1))
		{
			outputTestReport(true);
		}
		else
		{
			outputTestReport(false);
		}	
	}
	
	public void test_2()
	{
		if(assertEquals("2", 2))
		{
			outputTestReport(true);
		}
		else
		{
			outputTestReport(false);
		}	
	}
	
	public void test_3()
	{
		if(assertEquals("Fizz", 3))
		{
			outputTestReport(true);
		}
		else
		{
			outputTestReport(false);
		}	
	}
	
	public void test_4()
	{
		if(assertEquals("Buzz", 5))
		{
			outputTestReport(true);
		}
		else
		{
			outputTestReport(false);
		}	
	}
	
	public Boolean assertEquals(String expectedResult, int param)
	{
		return expectedResult.equals(fizzBuzz.say(param));
	}
	public void outputTestReport(boolean report)
	{
		System.out.println(report);
	}
}