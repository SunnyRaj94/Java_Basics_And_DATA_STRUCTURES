package com.sunny.logical;

import java.util.Arrays;

import com.sunny.utility.LogicalUtility;

public class Coupon 
{
	/*public static int random(int n)
	{	
		char[] elements= "0123456789".toCharArray();
		int coupon=0;
		for(int i=0;i<n;i++)
		{
			int random=elements[(int) (Math.random()*10)];
			coupon=coupon+(random*10+random);
		}
		return coupon;
	}
	public static void main(String[] args) 
	{
		System.out.println("ENTER THE RANDOM COUPON SIZE YOU WANT TO MAKE");
		int size =LogicalUtility.inputInteger();
		int stack[]=new int[100000];
		int k=0;
		int random=0;
		for (int j =0;j<stack.length;j++)
				{
					if(Arrays.binarySearch(stack, Coupon.random(size))>0)
						break;
					else
						{
						stack[k++]=Coupon.random(size);
						System.out.println(Coupon.random(size));
						random++;
						}
		}
		System.out.println("There are total   "+random+"   random numbers");
	}
	*/

	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}
}