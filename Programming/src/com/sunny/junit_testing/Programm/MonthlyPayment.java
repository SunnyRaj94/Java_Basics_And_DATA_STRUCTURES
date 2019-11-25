package com.sunny.junit_testing.Programm;

import com.sunny.utility.TestingUtility;

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
