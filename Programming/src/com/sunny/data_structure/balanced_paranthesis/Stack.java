package com.sunny.data_structure.balanced_paranthesis;

public class Stack <T>
{
	private int index=0;
	private T[] arr;
	@SuppressWarnings("unchecked")
	public Stack()
	{
			arr = (T[]) new Object[10];
	}
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
	public void display()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println(arr[i]);
		}
	}
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
	public T peek()
	{
		return arr[index-1];
	}
	public int size()
	{
		return index;
	}
	public boolean isEmpty()
	{
		if(index==0) return true;
		else return false;
	}
}
