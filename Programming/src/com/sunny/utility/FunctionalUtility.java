package com.sunny.utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this is a utilty class i made for common ocurring things programms
**/
import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalUtility 
{	
	private static final Scanner sc= new Scanner(System.in);
	private static final PrintWriter p = new PrintWriter(System.out);
	//to get string input from the user
	public static String inputString() {
		System.out.println("Enter String");
		return sc.next();
	}
	//to get int or integer input from the user
	public static int inputInteger()
	{
		System.out.println("Enter number");
		int n = sc.nextInt();
		return n ;
		
	}
	//to get double value input from the user
	public static double inputDouble()
	{
		System.out.println("Enter number");
		double n = sc.nextDouble();
		return n ;
		
	}
	//to get double value input from the user
	public static boolean inputBool() 
	{
		System.out.println("Enter true or false");
		boolean n = sc.nextBoolean();
		return n ;
	}
	//to give output by using printwriter
	public static void outputInt(int n)
	{
		p.write(n+" ");
		p.flush();
	}
	//to give output by using printwriter
	public static void outputDouble(double n)
	{
		p.print(n+" ");
		p.flush();
	}
	//to give output by using printwriter
	public static void outputBoolean(boolean n)
	{
		p.print(n+" ");
		p.flush();
	}
	//to give output of double array
	public static void outputDoubleArr(double [][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				FunctionalUtility.outputDouble(arr[i][j]);
			}
			System.out.println("");
		}
	}
	//to give output of boolean array
	public static void outputBoolArr(boolean [][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				FunctionalUtility.outputBoolean(arr[i][j]);
			}
			System.out.println("");
		}
	}
	//to give output of integer array
	public static void outputIntArr(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				FunctionalUtility.outputInt(arr[i][j]);
			}
			System.out.println("");
		}
	}
	public static int findDistinctTriplets(int b[],int length)//method 1
	{
		System.out.println();
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
					if (b[i] + b[j] + b[k] == 0)
					{
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		// return number of distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
		return count;
	}
}
