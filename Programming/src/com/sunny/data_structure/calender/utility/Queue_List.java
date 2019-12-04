package com.sunny.data_structure.calender.utility;

public class Queue_List<T> 
{
	List list ;
	public Queue_List()
	{
		list= new List();
	}
	public void enqueue(T item)
	{
		list.add(item);
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
