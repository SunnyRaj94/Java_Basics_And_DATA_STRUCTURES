package com.sunny.algorithm;

import java.io.IOException;

import com.sunny.utility.AlgorithmUtility;

public class BinaryWordSearch {

	public static void main(String[] args) throws Exception
	{
		System.out.println("enter word you want to search in the file");
		String  word=AlgorithmUtility.inputS();
		if(AlgorithmUtility.findWord(word))
			System.out.println("Word is present in the file");
		else
			System.out.println("Word is not present in the file");
	}

}
