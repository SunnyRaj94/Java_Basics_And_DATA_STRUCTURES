package com.sunny.data_structure.prime_numbers.runners;

import com.sunny.data_structure.prime_numbers.utility.Queue;
import com.sunny.data_structure.prime_numbers.utility.Utility;

public class PrimeAndAnagramByQueue 
{
	static Queue primes ;
	static Queue anagramQueue;
	public PrimeAndAnagramByQueue()
	{
		primes = new Queue();
		anagramQueue= new Queue();
	}
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
