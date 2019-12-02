package com.sunny.data_structure.banking;

import java.util.Scanner;

public class BankingCashCounter 
{
	static Scanner sc = new Scanner(System.in);
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
		int choice = BankingCashCounter.inputAmount();
		while(choice!=2)
		{
			switch (choice)
			{
			case 0:
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
