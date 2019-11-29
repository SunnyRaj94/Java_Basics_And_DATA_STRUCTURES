package com.sunny.junit_testing;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find sthat what is te weekdays on which the particular date is occuring
**/
import com.sunny.utility.TestingUtility;

public class DayOfweek 
{	
	// static variable to store number of days that occurs in a month in a non leap year
	public static int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	// static variable to store number of days that occur in a month in a leap year
	public static int monthLeap[]= {31,29,31,30,31,30,31,31,30,31,30,31};
	// stores name of days in a sequential order
	public static String week[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	// it is used to take and validating year input
	public int inputYear()
	{
		System.out.println("pLEASE eNTER yEAR");
		int year=TestingUtility.inputInteger();
		if(year>0&&year<10000)
			return year;
		else
		{
			System.out.println("Enter year between 0 to 9999");
			return inputYear();
		}
	}
	// used to take and validating month input
	public int inputMonth()
	{
		System.out.println("pLEASE eNTER MONTH");
		int month=TestingUtility.inputInteger();
		if(month>=0&&month<12)
			return month;
		else
		{
			System.out.println("Enter month between 0 to 12");
			return inputMonth();
		}
	}
	// used to take and validate date input with respect to month and year
	public int inputDate(int mth ,int year)
	{
		System.out.println("pLEASE eNTER Date");
		int date =TestingUtility.inputInteger();
		int mdays=0;
		if((year%4==0||year%400==0)&&year%100!=0)
			mdays=monthLeap[mth];
		else
			mdays=month[mth];
		if(date<=mdays)
			return date;
		else
		{
			System.out.println("this month doesnt have these much days");
			return inputDate(mth, year);
		}
	}
	public static void main(String[] args) 
	{
		DayOfweek d = new DayOfweek();
		//year input
		int year = d.inputYear();
		// taking month input
		int month= d.inputMonth();
		// taking date input
		int date= d.inputDate(month, year);
		// returning the index on which we will obtain the name of day
		int res=TestingUtility.dayOfWeek(date, month, year);
		String day =week[res];
		// printing the output
		System.out.println("the day on given date is:   "+day);
		
	}
}
