package com.sunny.utility;

import java.util.Scanner;
/*
* created by:SunnyRaj
* Date 25/11/2019
* Purpose: this programm is used to generate common occuring methods in junit_testing section
**/
public class TestingUtility
{	
	//common static scanner object
	private static final Scanner sc= new Scanner(System.in);
	//used to take integer input from the user
	public static int inputInteger()
	{
		System.out.println("Please Enter Number");
		int number = sc.nextInt();
		return number;
	}
	//used to ntake the double value from the user
	public static double inputDouble()
	{
		System.out.println("Please Enter Number");
		double number = sc.nextDouble();
		return number;
	}
	//method that return the name of that which is going to occur on a particular date 
	// takes a input year,month,date
	public static int dayOfWeek(int d, int m, int y)
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	//method that is used to convert temperature into celcius and celcius into farhenhite
	public static int temperaturConversion(int tem, char t) {
		int conver;
		if (t == 'c' || t == 'C') 
		{
			conver = (tem * 9 / 5) + 32;
			System.out.println(tem+" degree celcius  =  "+conver+"  farhenhite");
		} 
		else 
		{
			conver = (tem - 32) * 5 / 9;
			System.out.println(tem+" degree farhenhite  =  "+conver+"  celcius");
		} 
		return conver;
	}
	
	
	// this method is used  to compute the square root of a nonnegative number c given in the input using Newton's method:
	public static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) 
		{
			t = (c / t + t) / 2;
		}

		return t;
	}
	// this method is returning  the integer array of binary equivalent of given decimal value
	public static int[] toBinary(int d) {

		String bin = "";
		while (d != 0) 
		{
			bin = (d % 2) + bin;
			d /= 2;
		}
		while (bin.length() % 4 != 0) 
		{
			bin = 0 + bin;
		}
		return stringToIntArray(bin);
	}
	// method is converting string into integer array
	public static int[] stringToIntArray(String bin) 
	{
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}
	// method is converting binary quivalent to decimal value
	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) 
		{
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}
	// this method calculates the monthly payments you would have to make over Y years to pay off a P principal loan amount at R per cent interest compounded monthly
	public static double monthlyPayment(double p, double y, double r)
	{
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
		
	}
	// this method is showing the integer array output to the console
	public static void showArr(int[] arr) {
		// System.out.println("array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	//checks if a number is power of two
	public static boolean powerOf2(int n) {
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
	// returns the reversed integer array of given array
	public static int[] swapNibbles(int[] arr) {
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
	// used to take and validate whether input is c or f
	public static char c_f_Input() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter temp in c or f");
		char t = s.next().charAt(0);
		if (t != 'f' && t != 'F' && t != 'c' && t != 'C')
		{
			System.out.println("enter correct input");
			return c_f_Input();
		}
		else return t;
	}
}
