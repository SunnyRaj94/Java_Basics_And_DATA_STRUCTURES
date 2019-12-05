package com.sunny.data_structure.calender.utility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to make our own stack structure
**/
public class Stack <T>
{
	// initializing index
	private int index=0;
	// array to store dynamic data
	private T[] arr;
	@SuppressWarnings("unchecked")
	//public constructor
	public Stack()
	{
			arr = (T[]) new Object[1];
	}
	// adding element into stack
	public void push(T item)
	{
		if (index==0) 
		{
			arr[index] = item;
			index++;
		}
		else
		{
			T[] new_arr =arr;
			arr= (T[]) new Object[index+1];
			for(int i=0;i<index;i++)
			{
				arr[i]=new_arr[i];
			}
			arr[index]=item;
			index++;
		}
	}
	// to display the elements
	public void display()
	{
		for(int i=0;i<index;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}//to pop the elements from stack
	public void pop()
	{
		T[] new_arr =arr;
		T item = arr[index-1];
		arr= (T[]) new Object[index-1];
		for(int i=0;i<index-1;i++)
		{
			arr[i]=new_arr[i];
		}
		index--;
	}
	// to see the last elements stored
	public T peek()
	{
		return arr[index-1];
	}
	// returns the size of array
	public int size()
	{
		return index;
	}
	// returns the stack is empty or not
	public boolean isEmpty()
	{
		if(index==0) return true;
		else return false;
	}
}
