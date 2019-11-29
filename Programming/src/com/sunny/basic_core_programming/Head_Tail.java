package com.sunny.basic_core_programming;

import com.sunny.utility.BasicUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find percentage of head and tail in any throw 
**/

public class Head_Tail 
{
	public static void main(String[] args) 
	{
		//  taking input from the user how many times he want to flip
		System.out.println("Enter the number of times you want to flip an coin");
		int n = BasicUtility.inputInteger();
		// taking the result and storing it
		double res[]=BasicUtility.headTailPerc(n);
		double head=res[1]/(n);
		double tail =res[0]/(n);
		// printing out the percentage in the console
		System.out.println("percentage of heads is    "+head);
		System.out.println("percentage of tails is    "+tail);
		
	}

}
