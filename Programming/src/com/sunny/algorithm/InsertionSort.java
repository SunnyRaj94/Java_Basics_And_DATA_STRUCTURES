package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to sort a string type array through insertion sort
**/
public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("Enter the size of string array");
		
		//taking a string type array as input from the user
		String[] arr = AlgorithmUtility.inputStringArr();
		
		//returning the sorted array
		String[] sorted = AlgorithmUtility.insertionSort(arr,arr.length);
		
		// displaying that sorted array
		AlgorithmUtility.display(sorted);
	}
}
