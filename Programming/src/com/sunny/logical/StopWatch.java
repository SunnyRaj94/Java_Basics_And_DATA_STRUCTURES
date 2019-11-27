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
		long startTimer=LogicalUtility.start();
		long stopTimer =LogicalUtility.stop();
		System.out.println("Time Elapsed : "+(stopTimer-startTimer)+"  milliseconds");
		
	}
}
