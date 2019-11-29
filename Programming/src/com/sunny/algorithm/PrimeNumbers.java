package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to find  prime numbers between the range 0 to 1000
**/
public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int range = 1000;
		System.out.println("Prime numbers are  :");
		
		//looping throung the range
		for(int i=0;i<=range;i++)
		{
			// checking if the number is prime or not
			if(AlgorithmUtility.isPrime(i))
			{
				System.out.print(i+" ");//printing the prime number
			}
		}
	}

}
