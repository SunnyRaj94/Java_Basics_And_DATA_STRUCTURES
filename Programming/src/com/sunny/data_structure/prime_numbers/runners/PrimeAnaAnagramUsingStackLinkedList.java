package com.sunny.data_structure.prime_numbers.runners;

import com.sunny.data_structure.prime_numbers.utility.StackByLinkedList;
import com.sunny.data_structure.prime_numbers.utility.Utility;

public class PrimeAnaAnagramUsingStackLinkedList {

	StackByLinkedList[] list = new StackByLinkedList[10];
	static StackByLinkedList primes;
	static StackByLinkedList anagramsPrime;
	public PrimeAnaAnagramUsingStackLinkedList()
	{
		for(int i=0;i<10;i++)
		{
			list[i]=new StackByLinkedList();
		}
		primes = new StackByLinkedList();
		anagramsPrime = new StackByLinkedList();
	}
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
