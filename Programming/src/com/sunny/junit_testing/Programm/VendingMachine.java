package com.sunny.junit_testing.Programm;

import com.sunny.utility.TestingUtility;

public class VendingMachine 
{
	static int[] notes= {1,2,5,10,50,100,500,1000};
	static int totalnotes=0;
	public String change(int amount,int n)
	{
		if (amount==0||n<0)
		return "Thankyou for using our service";
		else
		{ 	int count = 0;
			while(amount>=notes[n])
			{
				amount=amount-notes[n];
				count++;
			}
			System.out.println("you got  "+count+"  "+notes[n]+"rupee notes");
			n--;totalnotes=totalnotes+count;
			return change(amount,n);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome User..We are very happy to help you");
		int n=7;
		System.out.println("Please Enter the amount you want to change");
		int amount =TestingUtility.inputInteger();
		VendingMachine v= new VendingMachine();
		String s=v.change(amount,n);
		System.out.println(s);
		System.out.println("Total number of notes are:  "+totalnotes);
	}
}
