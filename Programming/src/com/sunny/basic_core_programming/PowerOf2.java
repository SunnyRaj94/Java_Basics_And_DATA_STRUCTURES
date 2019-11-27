package com.sunny.basic_core_programming;

import com.sunny.utility.BasicUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find a table of 2^n
**/
public class PowerOf2 
{
	public static void main(String[] args) 
		{
			System.out.println("Enter a number:");
	        int num=BasicUtility.inputInteger();
		if (num < 31) {
			System.out.println("Power of 2^" + num + " is: " + (Math.pow(2, num)));
			System.out.println();
			System.out.println("Printing all till Power Value " + num);

			for (int i = 1; i <= num; i++) {
				System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
			}
		} else
			System.out.println("Please enter a number less than 31 otherwise it will " + "overflow int limit");
	}
}
