package com.sunny.data_structure.balanced_paranthesis;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to make our own stack that is first in first out
**/

public class Stack <T>
{
	// index of stack
	private int index=0;
	//for storing data
	private T[] arr;
	@SuppressWarnings("unchecked")
	//public constructor
	public Stack()
	{
			arr = (T[]) new Object[10];
	}
	// push method to add values into stack
	public void push(T item)
	{
		if (index<10) 
		{
			arr[index] = item;
			index++;
		}
		else
		{
			T[] new_arr =arr;
			arr= (T[]) new Object[index+10];
			for(int i=0;i<index;i++)
			{
				arr[i]=new_arr[i];
			}
			arr[index]=item;
			index++;
		}
	}
	// to display the stack
	public void display()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println(arr[i]);
		}
	}
	// to pop the value from end from stack
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
	// to see the last value stored in stack
	public T peek()
	{
		return arr[index-1];
	}
	// to return the size of a stack
	public int size()
	{
		return index;
	}
	// to check if a stack is empty
	public boolean isEmpty()
	{
		if(index==0) return true;
		else return false;
	}
}
