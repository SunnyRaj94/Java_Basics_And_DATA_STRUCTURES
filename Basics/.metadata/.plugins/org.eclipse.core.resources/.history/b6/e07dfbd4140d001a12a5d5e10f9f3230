package com.sunny.basiccoreprograms;

import java.util.Scanner;

public class Username 
{
	public static void main(String[] args) 
	{
		Username u = new Username();
		String name = u.input();
		System.out.println("Hello "+name+" , How are you?");
		
		
	}

	private String input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the username");
		String username = sc.next();
		if(username.length()<3)
		{
			System.out.println("Username must be of greater than 3 digits");
			return input();
		}
		else
			return username;	
		}

}
