package com.sunny.functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility 
{
	public static int inputInteger()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		return n ;
		
	}
	public static double inputDouble()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double n = sc.nextDouble();
		return n ;
		
	}
	
	public static void outputInt(int n)
	{
		PrintWriter p = new PrintWriter(System.out);
		p.write(n+" ");
		p.flush();
	}
	public static void outputDouble(double n)
	{
		PrintWriter p = new PrintWriter(System.out);
		p.print(n+" ");
		p.flush();
	}
	public static void outputBoolean(boolean n)
	{
		PrintWriter p = new PrintWriter(System.out);
		p.print(n+" ");
		p.flush();
	}
	public static boolean inputBool() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter true or false");
		boolean n = sc.nextBoolean();
		return n ;
	}

}
