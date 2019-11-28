package com.sunny.algorithm;

import java.util.ArrayList;

import com.sunny.utility.AlgorithmUtility;

public class PrimeNumbersAnagramPalindrome {

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList();
		int range = 1000;
		for(int i=0;i<=range;i++)
		{
			if(AlgorithmUtility.isPrime(i))
			{
				String num=""+i;
				list.add(num);
			}
		}
		System.out.println("Prime numbers are:");
		AlgorithmUtility.displayListOfInt(list);
		System.out.println();
		System.out.println("palindrome numbers are ;");
		for(int i=0;i<list.size();i++)
		{
			int num = Integer.parseInt(list.get(i));
			boolean isPali =AlgorithmUtility.isPalindromeInteger(num);
			if(isPali)
				{
					System.out.print(list.get(i)+" , ");
				}
		}
		//System.out.println(AlgorithmUtility.isAnagramString("54", "85"));
		System.out.println();
		for(int i=0;i<list.size();i++) 
		{
			for(int j=0;j<list.size();j++)
			{
				String one = list.get(i);
				String two = list.get(j);
				if(AlgorithmUtility.isAnagramString(one, two))
					System.out.println(one+" and "+two+ " are anagrams");
			}
		}
	}

}
