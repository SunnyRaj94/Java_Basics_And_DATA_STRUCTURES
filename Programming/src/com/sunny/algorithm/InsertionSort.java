package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;

public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("Enter the size of string array");
		String[] arr = AlgorithmUtility.inputStringArr();

		String[] sorted = AlgorithmUtility.insertionSort(arr,arr.length);

		AlgorithmUtility.display(sorted);
	}
}
