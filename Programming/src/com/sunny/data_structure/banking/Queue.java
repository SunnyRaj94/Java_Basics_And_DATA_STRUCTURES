package com.sunny.data_structure.banking;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to make our own queue that is first in last out
**/
public class Queue<Integer>
{	
	// index 
		private int index=0;
		// bank starting balance
		int balance =1000;
		// store elements in array
		private int[] arr;
		@SuppressWarnings("unchecked")
		// public constructor
		public Queue()
		{
				arr = new int[10];
		}
		// to add elements into queue
		public void enqueue(int item)
		{
			if (index<10) 
			{
				arr[index] = item;
				balance=balance + arr[index];
				index++;
			}
			else
			{
				int[]new_arr =arr;
				arr= new int[index+10];
				for(int i=0;i<index;i++)
				{
					arr[i]=new_arr[i];
				}
				arr[index]=item;
				balance=balance + arr[index];
				index++;
			}
		}
		// to display the whole queue
		public void display()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println(arr[i]);
			}
		}
		// to remove an element
		public void dequeue()
		{
			balance=balance - arr[0];
			int []new_arr =arr;
			arr= new int[index-1];
			for(int i=1, j=0;i<index;i++)
			{
				arr[j]=new_arr[i];
			}
			
			index--;
		}
		// returns the size of queue
		public int size()
		{
			return index;
		}
		// returns if a queue is empty
		public boolean isEmpty()
		{
			if(index==0) return true;
			else return false;
		}
	

}
