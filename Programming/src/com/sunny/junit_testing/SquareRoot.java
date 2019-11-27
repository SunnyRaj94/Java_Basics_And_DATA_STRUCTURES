package com.sunny.junit_testing;

import com.sunny.utility.TestingUtility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find Suareroot of any given number
**/
public class SquareRoot {

	public static void main(String[] args) 
	{
		double num = TestingUtility.inputDouble();
		double sqrt = TestingUtility.sqrt(num);
		System.out.println("Square Root of :  '"+num+ "' is "+sqrt);

	}

}
