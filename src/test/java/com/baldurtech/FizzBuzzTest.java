package com.baldurtech;


public class FizzBuzzTest
{
	public static Boolean result = true;
	
	public static void main(String[] args)
	{
		FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
		FizzBuzzTestCase fizzBuzzTestCase = new FizzBuzzTestCase();
		fizzBuzzTestCase.test_1_should_be_1();
		fizzBuzzTestCase.test_2_should_be_2();
		fizzBuzzTestCase.test_3_should_be_Fizz();
		fizzBuzzTestCase.test_5_should_be_Buzz();
		fizzBuzzTestCase.test_6_should_be_Fizz();
		fizzBuzzTestCase.test_10_should_be_Buzz();
		fizzBuzzTestCase.test_15_should_be_FizzBuzz();
		
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