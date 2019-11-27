package com.sunny.junit_testing;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to convert input binary to decimal and then finding reversal of that decimal into binary
**/
import java.util.Scanner;

import com.sunny.utility.TestingUtility;

public class Binary {

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
			TestingUtility.showArr(binary);
			s.close();
			TestingUtility.swapNibbles(binary);
			System.out.println("after swapping ");
			TestingUtility.showArr(binary);
			int swapDec = TestingUtility.toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);

			if (TestingUtility.powerOf2(swapDec))
				System.out.println("its power of 2");
			else
				System.out.println("not power of 2");

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}
}