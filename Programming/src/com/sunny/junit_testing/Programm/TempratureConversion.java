package com.sunny.junit_testing.Programm;

import java.util.Scanner;

import com.sunny.utility.TestingUtility;

public class TempratureConversion {
	public static char c_f_Input() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter temp in c or f");
		char t = s.next().charAt(0);
		if (t != 'f' && t != 'F' && t != 'c' && t != 'C')
		{
			System.out.println("enter correct input");
			return c_f_Input();
		}
		else return t;
	}
	
	public static void main(String[] args) 
	{
		char c=TempratureConversion.c_f_Input();
		int t = TestingUtility.inputInteger();
		int temp = TestingUtility.temperaturConversion(t, c);
		
	}
}