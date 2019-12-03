package com.sunny.data_structure.pallindrome_checker;

import java.util.Arrays;
import java.util.Scanner;

public class Pallindrome_Check 
{
	public static String inputString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String you want to check ");
		return sc.next();
	}

	public static void main(String[] args) 
	{
		Dequeue<Character> d = new Dequeue<Character>();
		String check = Pallindrome_Check.inputString();
		char[] element = check.toCharArray();
		for(int i=0;i<element.length;i++)
		{
			d.addRear(element[i]);
		}
		Dequeue<Character>d2 = new Dequeue<Character>();
		char[] res1=d.display(); 
		for(int i=0;i<element.length;i++)
		{
			d2.addFront(element[i]);
		}
		char[] res2 =d2.display();
		if(Arrays.equals(res1, res2)) 
		{
			System.out.println("String is pallindrome");
		}
		else System.out.println("String is not pallindrome");
	}

}
