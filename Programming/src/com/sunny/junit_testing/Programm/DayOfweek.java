package com.sunny.junit_testing.Programm;

import com.sunny.utility.TestingUtility;

public class DayOfweek 
{	
	public static int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	public static int monthLeap[]= {31,29,31,30,31,30,31,31,30,31,30,31};
	public static String week[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	/*public static int dayOfWeek(int y,int m ,int d)
	{
		int year=y;int mdays[]= monthLeap;
		long numberDays=0;
		if((year%4==0||year%400==0)&&year%100!=0)
			mdays=mdays;
		else
			mdays=month;
		for(int i=0;i<year;i++)
		{
			if((i%4==0||i%400==0)&&i%100!=0)
				numberDays=numberDays+366;
			else
				numberDays=numberDays+365;
		}
		for(int j=0;j<m;j++)
		{
			numberDays=numberDays+mdays[j];
		}
		numberDays=numberDays+d-5;
		return (int) (numberDays%7);
	}
	*/
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
		int year = d.inputYear();
		int month= d.inputMonth();
		int date= d.inputDate(month, year);
		int res=TestingUtility.dayOfWeek(date, month, year);
		System.out.println(res);
		String day =week[res];
		System.out.println("the day on given date is:   "+day);
		
	}
}
