package com.sunny.data_structure.calender.utility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to make a queue which uses list internally
**/
public class Queue_List<T> 
{
	// initiallizing list object
	List list ;
	// public constructor
	public Queue_List()
	{
		list= new List();
	}
	// to add data in queue
	public void enqueue(T item)
	{
		list.add(item);
	}
	// to display queue
	public void display()
	{
		list.display();
	}
	// return the size of queue
	public int size()
	{
		return list.size();
	}
}
