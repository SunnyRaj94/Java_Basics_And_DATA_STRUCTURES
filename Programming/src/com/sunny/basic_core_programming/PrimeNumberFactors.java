package com.sunny.basic_core_programming;

import com.sunny.utility.BasicUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: for finding factors of a number which is a prime number
**/
public class PrimeNumberFactors 
{
	

		public static void main(String[] args) 
		{ 
			// taking the number from the user
			System.out.println("Enter the no. to find PrimeFactors:");
			int n=BasicUtility.inputInteger();
			System.out.println();
			System.out.println("The prime factors for the "+n+" is:");
			System.out.println();
			   // looping to check its factors
			for(int i=2;i*2<=n;i++)
			{  
				// checking if that factpor is prime 
				if(BasicUtility.isPrime(i)&&n%i==0)
				{
					System.out.print(i+" ");
				}
			}
	        System.out.println();
		}
	}

