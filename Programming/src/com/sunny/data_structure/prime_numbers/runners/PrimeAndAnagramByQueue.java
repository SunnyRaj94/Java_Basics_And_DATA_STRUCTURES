package com.sunny.data_structure.prime_numbers.runners;

import com.sunny.data_structure.prime_numbers.utility.Queue;
import com.sunny.data_structure.prime_numbers.utility.Utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List and Print the Anagrams in the Reverse Order. Note no Collection Library can be used.

**/
public class PrimeAndAnagramByQueue 
{
	// queue of prime numbers
	static Queue primes ;
	// queue of anagram && prime
	static Queue anagramQueue;
	// public constructor
	public PrimeAndAnagramByQueue()
	{
		primes = new Queue();
		anagramQueue= new Queue();
	}
	// to add elements into primes
	public void primes()
	{
		for(int i =1;i<=1000;i++)
		{
			if(Utility.isPrime(i))
			{
				primes.enqueue(i);
			}
		}
	}
	// to add elements into anagram that are primes
	public void haveAnagrams()
	{
		for(int i=0;i<primes.index;i++)
		{
			for (int j=1;j<primes.index;j++)
			{
				if(Utility.areAnagrams(primes.value(i), primes.value(j)))
				{
					if(anagramQueue.isPresent(primes.value(i))==false)
					{
						anagramQueue.enqueue(primes.value(i));
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		PrimeAndAnagramByQueue p = new PrimeAndAnagramByQueue();
		p.primes();
		p.haveAnagrams();
		primes.display();
		System.out.println();
		anagramQueue.display();
	}

}
