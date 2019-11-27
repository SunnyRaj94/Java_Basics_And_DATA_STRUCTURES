package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;

public class AnagramString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String one");
		String str1=AlgorithmUtility.inputS();
		System.out.println("Enter secont string");
		String str2 =AlgorithmUtility.inputS();
		if(str1.length()!=str2.length())
		{
			System.out.println("These are not anagram strings");
		}
		else
		{
			if(AlgorithmUtility.isAnagramString(str1, str2))
			{
				System.out.println("These are  anagram strings");
			}
			else
				System.out.println("These are not anagram strings");
		}
	}
}
