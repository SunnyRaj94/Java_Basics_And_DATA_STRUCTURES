package com.sunny.logical;

import java.util.Scanner;

public class StopWatch 
{
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
	public static void main(String[] args) 
	{
		long startTimer=StopWatch.start();
		long stopTimer = StopWatch.stop();
		System.out.println("Time Elapsed : "+(stopTimer-startTimer)+"  milliseconds");
		
	}
}
