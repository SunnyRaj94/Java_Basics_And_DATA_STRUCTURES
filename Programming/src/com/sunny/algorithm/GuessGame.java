package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;

public class GuessGame {

	public static void main(String[] args) {

		System.out.println("guess a no between 0 to 127 ");
		try {
			System.out.println("guessed no is " + AlgorithmUtility.findGuessedNumber());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
}
