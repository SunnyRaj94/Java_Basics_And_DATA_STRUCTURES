package com.sunny.junit_testing.Programm;

import com.sunny.utility.TestingUtility;

public class SquareRoot {

	public static void main(String[] args) 
	{
		double num = TestingUtility.inputDouble();
		double sqrt = TestingUtility.sqrt(num);
		System.out.println("Square Root of :  '"+num+ "' is "+sqrt);

	}

}
