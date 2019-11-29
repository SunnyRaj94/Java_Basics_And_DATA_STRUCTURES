package com.sunny.basic_core_programming;

import com.sunny.utility.BasicUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find given year is leap year or not
**/
public class LeapYear 
{
	public static void main(String[] args) 
	{
		// taking the value from user
		int year = BasicUtility.inputInt();
		//checking if it is leap year
		BasicUtility.isLeapYear(year);
	}
}
