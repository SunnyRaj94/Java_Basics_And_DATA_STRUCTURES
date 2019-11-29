package com.sunny.logical;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find time elapsed between start and stop any method
**/
import com.sunny.utility.LogicalUtility;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		// storing the start time
		long startTimer=LogicalUtility.start();
		// storing the stop time
		long stopTimer =LogicalUtility.stop();
		// printing the difference between those times
		System.out.println("Time Elapsed : "+(stopTimer-startTimer)+"  milliseconds");
		
	}
}
