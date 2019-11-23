package com.sunny.basic_core_programming;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find given year is leap year or not
**/
public class LeapYear 
{
	public static void main(String[] args) 
	{
		int year = Utility.inputInt();
		if(year%400==0||(year%4==0&&year%100==0))
		{
			System.out.println(year+"--is a LEAP YEAR");	
		}
		else
			System.out.println(year+"--is not a LEAP YEAR");
	}


}
