package com.sunny.data_structure.prime_numbers;

public class PrimeNumbers 
{
	static List[] list = new List[10];

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
