package com.sunny.data_structure.banking;

import java.util.Scanner;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is shows a banking counter which lets users to deposit and withdraw amount
**/

public class BankingCashCounter 
{
	static Scanner sc = new Scanner(System.in);
	// to take input
	public static int inputAmount()
	{
		System.out.println("Enter amount you want to withdraw or deposit");
		return sc.nextInt();
	}

	public static void main(String[] args) 
	{
		Queue q = new Queue<Integer>();
		int sum =1000;
		System.out.println("Enter 0 to withdraw");
		System.out.println("Enter  1 to deposit");
		System.out.println("Enter 2 to stop process");
		int choice = sc.nextInt();
		while(choice!=2)
		{
			switch (choice)
			{
			case 0:
				if(q.balance==1000)
					System.out.println("Withdrawal cannnot happen at this stage");
				else
					q.dequeue();
				break;
			case 1:
				q.enqueue(BankingCashCounter.inputAmount());
				break;
			case 2:
				System.out.println("Thankyou!!!");
				break;
			}
			System.out.println("Enter 0 to withdraw");
			System.out.println("Enter  1 to deposit");
			System.out.println("Enter 2 to stop process");
			choice = BankingCashCounter.inputAmount();
		}
		if(q.balance==sum)
		{
			System.out.println("balanced");
		}
		else System.out.println("not balanced");
	}

}
