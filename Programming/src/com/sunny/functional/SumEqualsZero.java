package com.sunny.functional;

import com.sunny.utility.FunctionalUtility;

/*
* created by:SunnyRaj
* Date 23/11/2019
* Purpose: this programm is used to find triplets in an array whose sum equals to 0
**/
public class SumEqualsZero 
{

		public static void main(String[] args)
		{
			System.out.println();

			//enter the array size
			System.out.print("Enter Size of Array :");
			int size=FunctionalUtility.inputInteger();
			int arr[]=new int [size];//create array & read values one by one

			for(int i=0;i<arr.length;i++)
			{
				System.out.print("Enter "+(i+1)+" Value :");
				arr[i]=FunctionalUtility.inputInteger();
			}

			int sum=FunctionalUtility.findDistinctTriplets(arr,size);//pass the arguments to method 1
			System.out.println("No.of Tripltes :"+sum);
			System.out.println();
		}
}
