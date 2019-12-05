package com.sunny.data_structure.hashing_function;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to make our own stack 
**/
public class Slot 
{
	// index for stack
	int index = 0;
	// dynamic array
	int[] array;
	// adding elements into array
	public void add(int c)
	{
		int i = index+1;
		if (i==0)
		{
			int[] array = new int[i];
			array[index]=c;
			index++;
		}
		else
		{
			int[] replace=new int[i];
			for(int z=0;z<index;z++)
			{
				replace[z]=array[z];
			}
			replace[index]=c;
			array=replace;
			index++;
		}
	}
	// to display the whole array
	public int[] display()
	{
		for (int i=0;i<index;i++)
		{
			System.out.println(array[i]);
		}
		return array;
	}
	// to remove an element from array
	public void remove(int item)
	{
		int[] replace = new int[index-1];
		for(int i=0,j=0;i<index-1;j++)
		{
			if(item!=array[j])
			{
				replace[i]=array[j];
				i++;
			}
		}
		index--;
		array = replace;
	}
	// to check if a element is present in an array or not
	public boolean isPresent(int item)
	{
		for (int i=0;i<index;i++)
		{
			if(array[i]==item) return true;
		}
		return false;
	}
}
