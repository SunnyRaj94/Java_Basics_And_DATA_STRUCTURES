package com.sunny.data_structure.prime_numbers;

public class PrimeNumberAndAnagarm
{
	static List[] anagramlist = new List[10];
	static List[] notinanagramlist = new List[10];
	static int[] primes = new int[1000];

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
	public void displayPrimes()
	{
		for(int i=0;i<primes.length&&primes[i]!=0;i++)
		{
			System.out.print(" "+primes[i]);
		}
	}
	public void haveAnagrams()
	{
		for(int i=5;i<primes.length&&primes[i]!=0;i++)
		{
			for(int j=6;j<primes.length&&primes[i]!=0;j++)
			{
				if(Utility.areAnagrams(primes[i],primes[j]))
				{
					if(anagramlist[i/100].isPresent(primes[i]))
						{
						anagramlist[primes[i]/100].add(primes[i]);
						}
				}
			}
		}
	}
	public void dontHaveAnagrams()
	{
		for(int i=1;i<1000;i++)
		{
			if(anagramlist[i/100].isPresent(i)==false)
			{
				notinanagramlist[i/100].add(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		PrimeNumberAndAnagarm p = new PrimeNumberAndAnagarm();
		p.primes();
		p.haveAnagrams();
		p.dontHaveAnagrams();
		notinanagramlist[0].display();
		
	}

}
