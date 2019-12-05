package com.sunny.algorithm;

import java.util.Scanner;

/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to take any parameter and give sorted output using bubbleSort and insertion sort
**/

public class GenericBubbleSort <T extends Comparable<T> >
{
	int index;
	T[] array;
	public GenericBubbleSort() 
	{
		index=0;
		array = (T[]) new Comparable[1];
;	}
	//addingb any type of data into this
	public void add( T c)
	{
		int i = index+1;
		if (index==0)
		{
			array[index]=c;
			index++;
		}
		else
		{
			T[] replace=(T[]) new Comparable[i];
			for(int z=0;z<index;z++)
			{
				replace[z]=array[z];
			}
			replace[index]=c;
			array=replace;
			index++;
		}
	}
	// to display the stored array
	public void display()
	{
		for (int i=0;i<index;i++)
		{
			System.out.println(array[i]);
		}
	}
	//generic sorting algo method to do bubble sorting
	public void bubbleSort()
	{
		T[] arr= array;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					T temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		array =arr;
	}
	public static void main(String[] args)
	{
		GenericBubbleSort b = new GenericBubbleSort();
		Scanner s = new Scanner(System.in);
		int ask=0;
		System.out.println("Start adding values");
		//System.out.println("Enter 0 to add more values");
		//System.out.println("Enter 1 to stop");
		while(ask!=1)
		{
			if (ask>0) ask=1;
			switch(ask)
			{
			case 0:
			{
				System.out.println("Enter value");
				int value = s.nextInt();
				b.add(value);
				System.out.println("Enter 0 to add more values");
				System.out.println("Enter 1 to stop");
				ask =s.nextInt();
				break;
			}
			case 1:
			{
				break;
			}
				
			}
		}
		System.out.println("Sorted array is");
		//b.add(28);b.add(77);b.add(25);b.add(24);b.add(21);b.add(12);b.add(85);b.add(45);b.add(48);b.add(38);
		b.bubbleSort();
		b.display();
	}

}
