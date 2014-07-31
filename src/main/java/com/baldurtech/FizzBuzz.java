package com.baldurtech;

public class FizzBuzz
{
	public String say(int num)
	{
		if(num == 3)
		{
			return "Fizz";
		}
		if(num == 5)
		{
			return "Buzz";
		}
		return String.valueOf(num);
	}
}