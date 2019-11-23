package com.sunny.utility;
/*
* created by:SunnyRaj
* Date 23/11/2019
* Purpose: this is a utilty class i made for common ocurring things programms
**/
import java.util.Scanner;

public class LogicalUtility 
{
	public static int inputInteger()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number = sc.nextInt();
		return number;
	}

}
