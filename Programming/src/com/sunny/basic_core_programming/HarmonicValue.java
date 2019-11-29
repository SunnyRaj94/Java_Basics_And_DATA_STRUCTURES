package com.sunny.basic_core_programming;

import com.sunny.utility.BasicUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find sum upto 1/n values of a number
**/
public class HarmonicValue
{
	public static void main(String[] args) 
	{
		// taking souble input from the user
	   	System.out.println("Enter a number: ");
		double n=BasicUtility.inputDouble();
		//obtaing the harmonic value
		if(n>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+BasicUtility.harmonicValue(n));
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	}
}
