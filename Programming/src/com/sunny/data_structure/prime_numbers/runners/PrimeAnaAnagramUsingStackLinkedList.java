package com.sunny.data_structure.prime_numbers.runners;

import com.sunny.data_structure.prime_numbers.utility.StackByLinkedList;
import com.sunny.data_structure.prime_numbers.utility.Utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List and Print the Anagrams in the Reverse Order. Note no Collection Library can be used.

**/
public class PrimeAnaAnagramUsingStackLinkedList {

	// an array of our coustom linked list
	StackByLinkedList[] list = new StackByLinkedList[10];
	// to store the prime numbers
	static StackByLinkedList primes;
	// to store the anagrams that are primes
	static StackByLinkedList anagramsPrime;
	// public constructor
	public PrimeAnaAnagramUsingStackLinkedList()
	{
		for(int i=0;i<10;i++)
		{
			list[i]=new StackByLinkedList();
		}
		primes = new StackByLinkedList();
		anagramsPrime = new StackByLinkedList();
	}
	// to add prime numbers into primes
	public void primes()
	{
		for(int i =1;i<=1000;i++)
		{
			if(Utility.isPrime(i))
			{
				primes.addFirst(i);
			}
		}
	}
	// to store anagrams into anagrams list
	public void haveAnagrams()
	{
		for(int i=0;i<primes.size();i++)
		{
			for (int j=0;j<primes.size();j++)
			{
				if(Utility.areAnagrams(primes.value(i), primes.value(j)))
				{
					if(anagramsPrime.isPresent(primes.value(i))==false)
					{
						anagramsPrime.addFirst(i);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		PrimeAnaAnagramUsingStackLinkedList p = new PrimeAnaAnagramUsingStackLinkedList();
		p.primes();
		primes.display();
		System.out.println();
		anagramsPrime.display();
	}

}
