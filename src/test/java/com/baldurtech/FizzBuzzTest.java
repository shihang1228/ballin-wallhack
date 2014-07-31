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
		System.out.println(assertEquals("1", 1));
	}
	
	public void test_2()
	{
		System.out.println(assertEquals("2", 2));
	}
	
	public void test_3()
	{
		System.out.println(assertEquals("Fizz", 3));
	}
	
	public void test_4()
	{
		System.out.println(assertEquals("Buzz", 5));
	}
	
	public Boolean assertEquals(String expectedResult, int param)
	{
		return expectedResult.equals(fizzBuzz.say(param));
	}
}