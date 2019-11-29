package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to search if a particular word is present in a particular file or not
**/
public class BinaryWordSearch {

	public static void main(String[] args) throws Exception
	{
		System.out.println("enter word you want to search in the file");
		// taking the input from user for the word which we want to search for
		
		String  word=AlgorithmUtility.inputS();
		
		//checking if that word is present or not
		if(AlgorithmUtility.findWord(word))
			System.out.println("Word is present in the file");
		else
			System.out.println("Word is not present in the file");
	}

}
