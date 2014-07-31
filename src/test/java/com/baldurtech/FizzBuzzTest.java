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
		System.out.println("1".equals(fizzBuzz.say(1)));
	}
	
	public void test_2()
	{
		System.out.println("2".equals(fizzBuzz.say(2)));
	}
	
	public void test_3()
	{
		System.out.println("Fizz".equals(fizzBuzz.say(3)));
	}
	
	public void test_4()
	{
		System.out.println("Buzz".equals(fizzBuzz.say(5)));
	}
}