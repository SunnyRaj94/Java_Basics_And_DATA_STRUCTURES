package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to find  if two string user inputs are anagrams or not 
**/

public class AnagramString
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String one");
		
		//taking input from user and describing it as 1st string
		String str1=AlgorithmUtility.inputS();
		System.out.println("Enter secont string");
		
		//taking input from user and describing it as 1st string
		String str2 =AlgorithmUtility.inputS();
		
		//checking the conditions for length of the strings
		if(str1.length()!=str2.length())
		{
			System.out.println("These are not anagram strings");
		}
		else
		{
			// IF LENGTHS OF BOth string are equal then cheking they are anagram or not
			if(AlgorithmUtility.isAnagramString(str1, str2))
			{
				System.out.println("These are  anagram strings");
			}
			else
				System.out.println("These are not anagram strings");
		}
	}
}
