package com.sunny.junit_testing;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to convert input binary to decimal and then finding reversal of that decimal into binary
**/
import java.util.Scanner;

import com.sunny.utility.TestingUtility;

public class Binary {
	public static void main(String[] args) {

		try {
			//taking decimal input from the user
			Scanner s = new Scanner(System.in);
			System.out.println("enter a no");
			// converting it to integer array of 0 and one which is the binary equivalent of that number
			int[] binary = TestingUtility.toBinary(s.nextInt());
			System.out.println("binary is ");
			// showing output as the binary representation of given number
			TestingUtility.showArr(binary);
			s.close();
			//Swapping the binary equivalent 
			TestingUtility.swapNibbles(binary);
			System.out.println("after swapping ");
			//converting that swapped eqivalent to decimal
			TestingUtility.showArr(binary);
			int swapDec = TestingUtility.toDecimal(binary);
			//printing the decimal value of swapped binary
			System.out.println("decimal of swapped binary is " + swapDec);
			// checking if the value is power of two
			if (TestingUtility.powerOf2(swapDec))
				System.out.println("its power of 2");
			else
				System.out.println("not power of 2");

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}
}