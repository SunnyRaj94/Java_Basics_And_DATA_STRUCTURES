package com.sunny.data_structure.prime_numbers.utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to make our own queue impliment
**/
public class Queue
{
	// index
	public int index;
	// to store dynamically element
	int[] storage;
	public Queue()
	{
		index =0;
		storage = new int[1];
	}
	// to add elements into queue
	public void enqueue(int item)
	{
		if(index==0)
		{
			storage[index]=item;
			index++;
		}
		else
		{
			int[] temp = new int[index+1];
			for(int i=0;i<index;i++)
			{
				temp[i]=storage[i];
			}
			temp[index]=item;
			storage = temp;
			index++;
		}
	}
	// to display queue
	public void display()
	{
		for(int i=0;i<index;i++)
		{
			System.out.print(storage[i]+"  ");
		}
	}
	// to check if an element is present 
	public boolean isPresent(int item)
	{
		for (int i=0;i<index;i++)
		{
			if(storage[i]==item) return true;
		}
		return false;
	}
	// to return value at index
	public int value(int i) 
	{
		return storage[i];
	}
}
