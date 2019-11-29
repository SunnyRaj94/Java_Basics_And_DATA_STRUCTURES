package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to let user guess a number and guessing the number with the help of the program
**/
public class GuessGame {

	public static void main(String[] args) {
		
		//asking user to guess anumber
		System.out.println("guess a no between 0 to 127 ");
		try {
			//executing the function to guess for the number
			System.out.println("guessed no is " + AlgorithmUtility.findGuessedNumber());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
}
