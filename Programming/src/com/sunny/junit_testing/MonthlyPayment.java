package com.sunny.junit_testing;

import com.sunny.utility.TestingUtility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find the monthly payment of an empployee by using given formulae
**/
public class MonthlyPayment {

	public static void main(String[] args) 
	{
		System.out.println("enter principal ,year and rate");
		double p = TestingUtility.inputDouble();
		double y = TestingUtility.inputDouble();
		double r = TestingUtility.inputDouble();
		System.out.println("mothly payment is " + TestingUtility.monthlyPayment(p, y, r));

	}

}
