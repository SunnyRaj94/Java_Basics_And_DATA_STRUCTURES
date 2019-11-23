package com.sunny.basic_core_programming;

import com.sunny.utility.BasicUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find sum upto 1/n values of a number
**/
public class HarmonicValue
{
	public static double harmonicValue(double n)
	{
		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		//sum += 1.0 / i;
		val = val + (1.0/i);
		}
	return val;
	}

	public static void main(String[] args) 
	{
	   	System.out.println("Enter a number: ");
		double n=BasicUtility.inputDouble();
    	double result=harmonicValue(n);
		
		if(n>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	}
}
