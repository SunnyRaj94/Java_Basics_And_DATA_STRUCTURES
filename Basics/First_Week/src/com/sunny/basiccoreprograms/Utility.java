package com.sunny.basiccoreprograms;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this is a utilty class i made for common ocurring things programms
**/
import java.util.Scanner;

public class Utility
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
	

}
