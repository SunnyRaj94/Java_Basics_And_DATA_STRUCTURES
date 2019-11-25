package com.sunny.junit_testing.Programm;

import java.util.Scanner;

import com.sunny.utility.TestingUtility;

public class Binary {

	/**
	 * Function to print array
	 *
	 * @param array the array to print integer on console
	 */
	static void showArr(int[] arr) {
		// System.out.println("array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * Function to check if no is power of 2
	 *
	 * @param number to check the for power of 2
	 * @return boolean for prime no
	 */
	static boolean powerOf2(int n) {
		// calculate power of 2 using math.pow
		// check if is equal to given no
		// stops if pow is greater than given number
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	/**
	 * Function to swap nibbles in array
	 *
	 * @param int array to swap nibbles in array
	 * @return return swapped array
	 */
	static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) 
		{ // loop runs 4 times and swap first four element to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	/**
	 * main function/method to test Binary class
	 *
	 * @param int array to swap nibbles in array
	 * @return return swapped array
	 */
	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter a no");
			int[] binary = TestingUtility.toBinary(s.nextInt());
			System.out.println("binary is ");
			showArr(binary);
			s.close();
			swapNibbles(binary);
			System.out.println("after swapping ");
			showArr(binary);
			int swapDec = TestingUtility.toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);

			if (powerOf2(swapDec))
				System.out.println("its power of 2");
			else
				System.out.println("not power of 2");

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}
}