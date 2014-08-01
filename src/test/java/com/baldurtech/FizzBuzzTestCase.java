package com.baldurtech;

public class FizzBuzzTestCase extends FizzBuzzTest
{
	public void test_1_should_be_1()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.say(1));
	}
	
	public void test_2_should_be_2()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("2", fizzBuzz.say(2));	
	}
	
	public void test_3_should_be_Fizz()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.say(3));	
	}
	
	public void test_5_should_be_Buzz()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.say(5));	
	}
	
	public void test_6_should_be_Fizz()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz",fizzBuzz.say(6));
	}
	
	public void test_10_should_be_Buzz()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz",fizzBuzz.say(10));
	}
	
	public void test_15_should_be_FizzBuzz()
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz",fizzBuzz.say(15));
	}
}