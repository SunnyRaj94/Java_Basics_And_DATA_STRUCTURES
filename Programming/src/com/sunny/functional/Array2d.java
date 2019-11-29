package com.sunny.functional;

import com.sunny.utility.FunctionalUtility;

/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to input a 2d array and output through print writer
**/
public class Array2d 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to 2d array programm");
		System.out.println("Enter 1 for integer array");
		System.out.println("Enter 2 for double array");
		System.out.println("Enter 3 for boolean array");
		int input =FunctionalUtility.inputInteger();
		System.out.println("Enter number of rows");
		int r = FunctionalUtility.inputInteger();
		System.out.println("Enter number of columns");
		int c = FunctionalUtility.inputInteger();
		// switch cases for letting user to decide which array he wants to enter
		switch(input)
			{
		// case to deal with integer type array
		case 1:
			int [][] arr = new int[r][c];
			// taking input
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					arr[i][j]=FunctionalUtility.inputInteger();
				}
			}
			//displaying that input to the console
			FunctionalUtility.outputIntArr(arr);
			System.out.println("Thank you");
			break;
			// case to deal with double type array
		case 2:
			double [][] arrd = new double[r][c];
			// taking input
			for(int i=0;i<arrd.length;i++)
			{
				for(int j=0;j<arrd[0].length;j++)
				{
					arrd[i][j]=FunctionalUtility.inputDouble();
				}
			}
			// displaying thatb input to the console
			FunctionalUtility.outputDoubleArr(arrd);
			System.out.println("Thank you");
			break;
		case 3:
			//case to deal with boolean type array
			boolean [][] arrb = new boolean[r][c];
			for(int i=0;i<arrb.length;i++)
			{
				for(int j=0;j<arrb[0].length;j++)
				{
					arrb[i][j]=FunctionalUtility.inputBool();
				}
			}
			//showing that array to the output
			FunctionalUtility.outputBoolArr(arrb);
			System.out.println("Thank you");
			break;
		
			}

	}

}
