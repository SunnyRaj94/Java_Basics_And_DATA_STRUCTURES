package com.sunny.basic_core_programming;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find percentage of head and tail in any throw 
**/

public class Head_Tail 
{
	public static double[] perc(int n)
	{
		double [] result= new double[2];
		for(int i=0;i<n;i++) 
		{
			if (Math.random() < 0.5)
				{
				result[0]++;//tails
				System.out.println("tails=="+result[0]);
				}
			else
				{
				result[1]++;//heads
				System.out.println("heads=="+result[1]);
				}
		}
		return result;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of times you want to flip an coin");
		int n = Utility.inputInteger();
		double res[]=Head_Tail.perc(n);
		double head=res[1]/(n);
		double tail =res[0]/(n);
		System.out.println("percentage of heads is    "+head);
		System.out.println("percentage of tails is    "+tail);
		
	}

}
