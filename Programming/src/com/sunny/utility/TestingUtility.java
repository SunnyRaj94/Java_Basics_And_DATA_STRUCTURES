package com.sunny.utility;

import java.util.Scanner;

public class TestingUtility
{
	public static int inputInteger()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number = sc.nextInt();
		return number;
	}
	public static double inputDouble()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		double number = sc.nextDouble();
		return number;
	}
	public static int dayOfWeek(int d, int m, int y)
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
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
	public static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) 
		{
			t = (c / t + t) / 2;
		}

		return t;
	}
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
	static int[] stringToIntArray(String bin) 
	{
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}
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
	public static double monthlyPayment(double p, double y, double r)
	{
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
		
	}
}
