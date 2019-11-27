package com.sunny.utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this is a utilty class i made for common ocurring things programms
**/
import java.util.Scanner;

public class BasicUtility
{
	//for taking sting input from user..
	public static String inputString() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the username");
		String username = sc.next();
		try
		{
			if(username.length()<3)
			{
					System.out.println("Username must be of greater than 3 digits");
					return inputString();
			}
			else
				return username;
		}
		finally {
			sc.close();
		}
	}
	// genereted to find and return head and tail percentage for given flips
	public static double[] headTailPerc(int n)
	{
		double [] result= new double[2];
		for(int i=0;i<n;i++) 
		{
			if (Math.random() < 0.5)
				{
				result[0]++;//tails
				System.out.println("tails=="+result[0]);
				}
			else
				{
				result[1]++;//heads
				System.out.println("heads=="+result[1]);
				}
		}
		return result;
		
	}
	//for taking int input from user..
	public static int inputInt() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Year");
		int year = sc.nextInt();
		try {
		if(year<0 || year>9999)
		{
			System.out.println("Please enter in correct format");
			return inputInt();
		}
		else
			return year;
		}
		finally {sc.close();}
	}
	
	//for taking int input from user..
	public static int inputInteger() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number = sc.nextInt();
		if(number>0)
		return number;
		else 
			{
				System.out.println("Please Enter a positive value");
				return inputInteger();
			}
		
	}
	
	//for taking double input from user..
	public static double inputDouble() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		double number = sc.nextDouble();
		sc.close();
		return number;
	}
	//for finding out it is leap year or not
	public static void isLeapYear(int year) {
		if(year%400==0||(year%4==0&&year%100==0))
		{
			System.out.println(year+"--is a LEAP YEAR");	
		}
		else
			System.out.println(year+"--is not a LEAP YEAR");
	}
	// generated to find the harmonic value of a given number
	public static double harmonicValue(double n)
	{
		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		//sum += 1.0 / i;
		val = val + (1.0/i);
		}
	return val;
	}
	//checking if factor is prime or not
		public static boolean isPrime(int i)
			{
				for(int j=2;j*j<i;j++)
				{
					if(i%j==0)
					{
			     		return false;
			    	}
			  	}
			 	return true;
			 }

}
