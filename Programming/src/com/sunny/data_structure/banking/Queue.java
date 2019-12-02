package com.sunny.data_structure.banking;

public class Queue<Integer>
{
		private int index=0;
		int balance =1000;
		private int[] arr;
		@SuppressWarnings("unchecked")
		public Queue()
		{
				arr = new int[10];
		}
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
		public void display()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println(arr[i]);
			}
		}
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
