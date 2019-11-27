package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int range = 1000;
		System.out.println("Prime numbers are  :");
		for(int i=0;i<=range;i++)
		{
			if(AlgorithmUtility.isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
