package com.sunny.functional;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to input a 2d array and output through print writer
**/
public class Array2d 
{
	public static void output(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				Utility.output(arr[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to 2d array programm");
		System.out.println("Enter number of rows");
		int r = Utility.inputInteger();
		System.out.println("Enter number of columns");
		int c = Utility.inputInteger();
		int [][] arr = new int[r][c];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=Utility.inputInteger();
			}
		}
		Array2d.output(arr);
		System.out.println("Thank you");

	}

}
