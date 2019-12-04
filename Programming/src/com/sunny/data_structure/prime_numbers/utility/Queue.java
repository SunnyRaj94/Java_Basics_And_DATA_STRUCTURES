package com.sunny.data_structure.prime_numbers.utility;

public class Queue
{
	public int index;
	int[] storage;
	public Queue()
	{
		index =0;
		storage = new int[1];
	}
	
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
	public void display()
	{
		for(int i=0;i<index;i++)
		{
			System.out.print(storage[i]+"  ");
		}
	}
	public boolean isPresent(int item)
	{
		for (int i=0;i<index;i++)
		{
			if(storage[i]==item) return true;
		}
		return false;
	}

	public int value(int i) 
	{
		return storage[i];
	}
}
