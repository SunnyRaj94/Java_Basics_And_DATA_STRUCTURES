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
	public static String input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the username");
		String username = sc.next();
		if(username.length()<3)
		{
			System.out.println("Username must be of greater than 3 digits");
			return input();
		}
		else
			return username;	
		}

}
