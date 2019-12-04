package com.sunny.data_structure.calender.utility;

public class Queue_Stack<T> 
{
	Stack list ;
	public Queue_Stack()
	{
		list= new Stack();
	}
	public void enqueue(T item)
	{
		list.push(item);
	}
	public void display()
	{
		list.display();
	}
	public int size()
	{
		return list.size();
	}
}
