package com.sunny.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.sunny.utility.AlgorithmUtility;

public class BubbleSortListOfInt {

	public static void main(String[] args) 
	{
		List<Integer> listIntArr=AlgorithmUtility.inputListOfInt();
		ArrayList<Integer> sortedIntList =AlgorithmUtility.bubbleSortListOfInt((ArrayList<Integer>) listIntArr);
		AlgorithmUtility.displayListOfInt(sortedIntList);
	}

}
