package com.sunny.junit_testing;

import com.sunny.utility.TestingUtility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to convert celcius into farhenhite and farhenhite into celcius
**/

public class TempratureConversion {
	public static void main(String[] args) 
	{
		char c=TestingUtility.c_f_Input();
		int t = TestingUtility.inputInteger();
		int temp = TestingUtility.temperaturConversion(t, c);
		
	}
}