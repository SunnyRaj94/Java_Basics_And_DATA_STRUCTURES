package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to find permutation of any given string
**/
public class StringPermutation 
{	
	//storing it in a static variable
	static String strmain=AlgorithmUtility.inputString();
	//used to find permutation of any given string
	public static String combinations(int n,int len,String str)
	{
		if(n==len) return "Completed";
		else
		{
			String trail=str;
			int t=str.length()-1;
			while(t!=0)
			{	
				String res=""+trail.charAt(0);
				char temp =trail.charAt(1);
				for(int i=2;i<=trail.length()-1;i++)
					{
						res=res+trail.charAt(i);
					}
				res=res+temp;
				System.out.println(res);
				t--;
				trail=res;
			}
			String exac=strmain;
			char ch[] = exac.toCharArray();
	        char av=exac.charAt(0);
	        String sxy="";
	        for(int x=1;x<ch.length;x++)
	        {
	        	sxy = sxy+ch[x];
	        }
	        sxy=sxy+av;
	        n++;
	        strmain=sxy;
			return combinations(n, sxy.length(), sxy);
			
			//return "Still left";
		}
	}
	
	public static void main(String[] args) 
	{
		String str = strmain;
		int length =str.length();
		int n=0;
		System.out.println(StringPermutation.combinations(n, length, str));
	}
}
