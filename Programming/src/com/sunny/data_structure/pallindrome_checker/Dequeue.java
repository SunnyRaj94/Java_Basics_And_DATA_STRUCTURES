package com.sunny.data_structure.pallindrome_checker;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is a standardised programm which helps user to add and remove items as their needs
**/
public class Dequeue<Character>
{
	int index=0;
	char[] array;
	public Dequeue()
	{
		
	}
	// adds char element at the last index
	public void addRear(char c)
	{
		int i = index+1;
		if (i==0)
		{
			char[] array = new char[i];
			array[index]=c;
			index++;
		}
		else
		{
			char[] replace=new char[i];
			for(int z=0;z<index;z++)
			{
				replace[z]=array[z];
			}
			replace[index]=c;
			array=replace;
			index++;
		}
	}
	// displays and returns the elements present 
	public char[] display()
	{
		for (int i=0;i<index;i++)
		{
			System.out.println(array[i]);
		}
		return array;
	}
	//adds element as the front 
	public void addFront(char c)
	{

		int i = index+1;
		if (i==0)
		{
			char[] array = new char[i];
			array[index]=c;
			index++;
		}
		else
		{
			char[] replace=new char[i];
			replace[0]=c;
			for(int z=0,k=1;z<index;z++,k++)
			{
				replace[k]=array[z];
			}
			array=replace;
			index++;
		}
	}
	//returns the size of array
	public int size()
	{
		return index;
		
	}
	//removes the element from the first
	public void removeFront()
	{
		if(index==0)
		{
			System.out.println("Array is already empty");
		}
		else if(index==1)
		{
			array = new char[0];
			index--;
			System.out.println("Array is empty now");
		}
		else
		{
			char[] replace = new char[index-1];
			for(int x=0,y=1;y<index;x++,y++)
			{
				replace[x]=array[y];
			}
			array=replace;
			index--;
		}
	}
	//removes element from the last
	public void removeRear()
	{
		if(index==0)
		{
			System.out.println("Array is already empty");
		}
		else if(index==1)
		{
			array = new char[0];
			index--;
			System.out.println("Array is empty now");
		}
		else
		{
			char[] replace = new char[index-1];
			for(int x=0;x<index-1;x++)
			{
				replace[x]=array[x];
			}
			array=replace;
			index--;
		}
	}
	//returns if que is empty 
	public boolean isEmpty()
	{
		if(index==0) return true;
		else return false;
	}
}
