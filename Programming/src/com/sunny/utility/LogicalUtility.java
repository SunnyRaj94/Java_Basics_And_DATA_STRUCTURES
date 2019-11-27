package com.sunny.utility;
/*
* created by:SunnyRaj
* Date 23/11/2019
* Purpose: this is a utilty class i made for common ocurring things programms
**/
import java.util.Scanner;

public class LogicalUtility 
{
	// this function is to take input from the user
	public static int inputInteger()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number = sc.nextInt();
		return number;
	}
	// this function is starting timer 
	public static long start()
	{
		System.out.println("Enter 1 to start timer");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number==1)
		{
			long startTimer = System.currentTimeMillis();
			return startTimer;
		}
		else
		{
			System.out.println("Please enter your choice correctly");
			return start();
		}
	}
	// this function is stooping the timer 
	public static long stop()
	{
		System.out.println("Enter 0 to stop timer");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number==0)
		{
			long stopTimer = System.currentTimeMillis();
			return stopTimer;
		}
		else
		{
			System.out.println("Please enter your choice correctly");
			return stop();
		}
	}
}
