package com.sunny.algorithm;

import java.util.Arrays;
import java.util.Scanner;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to show if a list of work is finished in given deadline or not
**/
public class Task {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of task to be done:");
	int n=s.nextInt();
	int []darr=new int[n];
	int []marr=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("The deadline for "+(i+1)+" "+"task in minutes:");
		darr[i]=s.nextInt();
		System.out.println("The time required for"+(i+1)+" "+"task in minutes:");
		marr[i]=s.nextInt();
	}
	Arrays.sort(darr);
	Arrays.sort(marr);

	int sum=0;
	int sum1=0;
	for(int i=0;i<darr.length;i++)
	{
		sum=sum+darr[i];
	}
	for(int i=0;i<marr.length;i++)
	{
		sum1=sum1+marr[i];
	}
	int diff=sum-sum1;
	if(diff<0)
	{
		System.out.println("The time overshoots by following:"+" "+Math.abs(diff));
	}
	else
		System.out.println("The time completed by"+" "+diff);
	}
	
}
