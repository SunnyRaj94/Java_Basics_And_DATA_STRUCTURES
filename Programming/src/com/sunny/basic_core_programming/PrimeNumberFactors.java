package com.sunny.basic_core_programming;

import com.sunny.utility.BasicUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: for finding factors of a number which is a prime number
**/
public class PrimeNumberFactors 
{
	//checking if factor is prime or not
	public static boolean isPrime(int i)
		{
			for(int j=2;j*j<i;j++)
			{
				if(i%j==0)
				{
		     		return false;
		    	}
		  	}
		 	return true;
		 }

		public static void main(String[] args) 
		{ 
			System.out.println("Enter the no. to find PrimeFactors:");
			int n=BasicUtility.inputInteger();
			System.out.println();
			System.out.println("The prime factors for the "+n+" is:");
			System.out.println();
			   
			for(int i=2;i*2<=n;i++)
			{  
				if(isPrime(i)&&n%i==0)
				{
					System.out.print(i+" ");
				}
			}
	        System.out.println();
		}
	}

