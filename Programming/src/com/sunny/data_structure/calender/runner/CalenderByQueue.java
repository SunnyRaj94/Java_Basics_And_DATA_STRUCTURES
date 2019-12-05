package com.sunny.data_structure.calender.runner;

import com.sunny.data_structure.calender.utility.Queue_List;
import com.sunny.data_structure.calender.utility.Utility;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to display the months calander by using queue
**/
public class CalenderByQueue 
{
	// initiallizing utility class
	Utility u= new Utility();
	// making a 2d queue
	Queue_List[] queue = new Queue_List[7];
	// public constructor
	public CalenderByQueue()
	{
		for(int i=0;i<7;i++)
		{
			queue[i]=new Queue_List();
		}
		queue[0].enqueue("Su");queue[0].enqueue("Mo");queue[0].enqueue("Tu");queue[0].enqueue("We");
		queue[0].enqueue("Th");queue[0].enqueue("Fr");queue[0].enqueue("Sa");
		
	}
	// addidng elements to the calender
	public void playCalender()
	{
		int year=u.inputYear();
		int month= u.inputMonth();
		//int date= u.inputDate(month, year);
		int res =u.dayOfWeek(1, month, year);
		int value = 1;
		int maxval = u.value(month-1);
		for(int i= 0;i<res;i++)
		{
			queue[1].enqueue("  ");
		}
		for(int i= res;i<7;i++)
		{
			queue[1].enqueue(value++);
		}
		for(int i=2;i<7;i++)
		{
			for(int j =0;j<7&&value<=maxval;j++)
			{
				queue[i].enqueue(value++);
			}
		}
	}
	// displaying the calender
	public void displayCalender()
	{
		for(int i=0;i<7;i++)
		{
			queue[i].display();
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		CalenderByQueue c = new CalenderByQueue();
		c.playCalender();
		c.displayCalender();
	}

}
