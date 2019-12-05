package com.sunny.data_structure.hashing_function;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to store the divisible elements by 11
**/
import java.util.Scanner;

public class Hashing_function 
{
	// a 2d slot array
	static Slot slot[] = new Slot[11];
	// public constructor
	public Hashing_function() {
		for (int i = 0; i < slot.length; i++) {
			slot[i] = new Slot();
		}
	}
	// putting value into array
	void put(int n) 
	{
		slot[n % 11].add(n);
	}
	//search if that value is present in that array
	boolean search(int n) {
		return slot[n % 11].isPresent(n);
	}
	public static void main(String[] args) 
	{
		Hashing_function h = new Hashing_function();
		System.out.println("sout no of elements to add");
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 0; i < n; i++)
		{
			int temp = s.nextInt();
			slot[temp%11].add(temp);
		}

		int search=s.nextInt();
		int result =search%11;
		if(slot[result].isPresent(search))
		{
			slot[result].remove(search);
			System.out.println(search+"   Element is present");
			System.out.println("After removal of element status of slot is:");
			slot[result].remove(search);
			slot[result].display();
		}
		else
		{
			System.out.println("Element was not present in any slot");
			System.out.println("Adding element to the slot");
			slot[result].add(search);
			System.out.println("Status of slot after adding");
			slot[result].display();
		}

	}

}
