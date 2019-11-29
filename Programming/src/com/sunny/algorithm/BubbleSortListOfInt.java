package com.sunny.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to bubble sort a list of integer arrays
**/
public class BubbleSortListOfInt {

	public static void main(String[] args) 
	{	
		//taking integer inputs and addind it into integer type list
		List<Integer> listIntArr=AlgorithmUtility.inputListOfInt();
		
		//passing that list to the sorting function which is returning sorted array
		ArrayList<Integer> sortedIntList =AlgorithmUtility.bubbleSortListOfInt((ArrayList<Integer>) listIntArr);
		
		//printing that sorted list
		AlgorithmUtility.displayListOfInt(sortedIntList);
	}

}
