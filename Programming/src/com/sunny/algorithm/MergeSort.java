package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;

public class MergeSort {
	public static void main(String[] args) {
		String[] str=  AlgorithmUtility.inputStringArr();
		int n1 = str.length - 1;
		AlgorithmUtility.sort(str, 0, n1);
		AlgorithmUtility.display(str);
	}
}
