package com.sunny.data_structure.prime_numbers.runners;

import com.sunny.data_structure.prime_numbers.utility.List;
import com.sunny.data_structure.prime_numbers.utility.Utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List and Print the Anagrams in the Reverse Order. Note no Collection Library can be used.

**/
public class PrimeNumbers 
{
	// list to store prime numbers
	static List[] list = new List[10];
	// public constructors
	public PrimeNumbers()
	{
		for (int i = 0; i < list.length; i++) 
		{
			list[i] = new List();
		}
	}

	public static void main(String[] args)
	{
		PrimeNumbers p = new PrimeNumbers();
		for(int i =1;i<=1000;i++)
		{
			if(Utility.isPrime(i))
			{
				list[i/100].add(i);
			}
		}
		list[0].display();
	}

}
