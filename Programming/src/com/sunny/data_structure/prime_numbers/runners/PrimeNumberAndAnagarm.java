package com.sunny.data_structure.prime_numbers.runners;

import com.sunny.data_structure.prime_numbers.utility.List;
import com.sunny.data_structure.prime_numbers.utility.Utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List and Print the Anagrams in the Reverse Order. Note no Collection Library can be used.

**/
public class PrimeNumberAndAnagarm
{
	// to store anagrams into list
	static List[] anagramlist = new List[10];
	// to store that dont have any anagram
	List[] notinanagramlist = new List[10];
	static int[] primes = new int[1000];
	// public constructor
	public PrimeNumberAndAnagarm()
	{
		for (int i = 0; i < anagramlist.length; i++) 
		{
			anagramlist[i] = new List();
		}
		for (int i = 0; i < notinanagramlist.length; i++) 
		{
			notinanagramlist[i] = new List();	
		}
	}
	// to add primes 
	public void primes()
	{
		int k=0;
		for(int i =1;i<=1000;i++)
		{
			if(Utility.isPrime(i))
			{
				primes[k++]=i;
			}
		}
	}
	// to display primes
	public void displayPrimes()
	{
		for(int i=0;i<primes.length&&primes[i]!=0;i++)
		{
			System.out.print(" "+primes[i]);
		}
	}
	//to add into anagaram ;list
	public void haveAnagrams()
	{
		for(int i=5;i<primes.length&&primes[i]!=0;i++)
		{
			for(int j=6;j<primes.length&&primes[i]!=0;j++)
			{
				if(Utility.areAnagrams(primes[i],primes[j]))
				{
					if(anagramlist[primes[i]/100].isPresent(primes[i])==false)
						{
						anagramlist[primes[i]/100].add(primes[i]);
						}
				}
			}
		}
		//anagramlist[0].display();
	}
	// to add into dontb have anagram list
	public void dontHaveAnagrams()
	{
		for(int i=1;i<1000;i++)
		{
			if(anagramlist[i/100].isPresent(i))
			{
				notinanagramlist[i/100].add(i);
			}
		}
		notinanagramlist[0].display();
	}
	public static void main(String[] args) 
	{
		PrimeNumberAndAnagarm p = new PrimeNumberAndAnagarm();
		p.primes();p.displayPrimes();
		p.haveAnagrams();
		p.dontHaveAnagrams();
	}

}
