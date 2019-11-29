package com.sunny.algorithm;

import java.util.ArrayList;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to find anagrams and palindrome of prime numbers
**/
public class PrimeNumbersAnagramPalindrome {

	public static void main(String[] args) 
	{
		//making an array list to store prime numbers
		ArrayList<String> list=new ArrayList();
		int range = 1000;//setting up the range
		
		//looping through the range
		for(int i=0;i<=range;i++)
		{
			//checking if number is prime
			if(AlgorithmUtility.isPrime(i))
			{
				String num=""+i;
				list.add(num);//adding prime numbers into the list
			}
		}
		// printing prime numbers
		System.out.println("Prime numbers are:");
		AlgorithmUtility.displayListOfInt(list);
		System.out.println();
		//displaying pallindromes of those integers
		System.out.println("palindrome numbers are ;");
		//looping through the list of prime numbers
		for(int i=0;i<list.size();i++)
		{
			int num = Integer.parseInt(list.get(i));
			//checking the pallindrome condition 
			boolean isPali =AlgorithmUtility.isPalindromeInteger(num);
			if(isPali)
				{
					System.out.print(list.get(i)+" , ");
				}
		}
		System.out.println();
		//printing the anagrams in between those prime numbers
		for(int i=0;i<list.size();i++) 
		{
			for(int j=0;j<list.size();j++)
			{
				String one = list.get(i);
				String two = list.get(j);
				//checking the anagram condition
				if(AlgorithmUtility.isAnagramString(one, two))
					System.out.println(one+" and "+two+ " are anagrams");
			}
		}
	}

}
