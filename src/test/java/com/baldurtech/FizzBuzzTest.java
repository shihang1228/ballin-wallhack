package com.baldurtech;


public class FizzBuzzTest
{
	
	public static void main(String[] args)
	{		
		test_1();
		test_2();
		test_3();
		test_4();	
	}
	
	public static void test_1()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		System.out.println("1".equals(fizzBuzz.say(1)));
	}
	
	public static void test_2()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		System.out.println("2".equals(fizzBuzz.say(2)));
	}
	
	public static void test_3()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		System.out.println("Fizz".equals(fizzBuzz.say(3)));
	}
	
	public static void test_4()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		System.out.println("Buzz".equals(fizzBuzz.say(5)));
	}
}