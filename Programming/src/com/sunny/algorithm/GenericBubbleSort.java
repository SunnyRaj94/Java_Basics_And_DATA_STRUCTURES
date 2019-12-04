package com.sunny.algorithm;

public class GenericBubbleSort <T extends Comparable<T> >
{
	int index;
	T[] array;
	public GenericBubbleSort() 
	{
		index=0;
		array = (T[]) new Comparable[1];
;	}
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
	public void display()
	{
		for (int i=0;i<index;i++)
		{
			System.out.println(array[i]);
		}
	}
	public void bubbleSort()
	{
		T[] arr= array;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
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
		b.add(28);b.add(77);b.add(25);b.add(24);b.add(21);b.add(12);b.add(85);b.add(45);b.add(48);b.add(38);
		b.bubbleSort();
		b.display();
	}

}
