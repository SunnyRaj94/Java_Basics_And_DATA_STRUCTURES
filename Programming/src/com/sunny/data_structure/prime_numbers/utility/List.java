package com.sunny.data_structure.prime_numbers.utility;

public class List 
{
		int index = 0;
		int[] array;
		public void add(int c)
		{
			int i = index+1;
			if (i==0)
			{
				int[] array = new int[i];
				array[index]=c;
				index++;
			}
			else
			{
				int[] replace=new int[i];
				for(int z=0;z<index;z++)
				{
					replace[z]=array[z];
				}
				replace[index]=c;
				array=replace;
				index++;
			}
		}
		public int[] display()
		{
			for (int i=0;i<index;i++)
			{
				System.out.println(array[i]);
			}
			return array;
		}
		public void remove(int item)
		{
			int[] replace = new int[index-1];
			for(int i=0,j=0;i<index-1;j++)
			{
				if(item!=array[j])
				{
					replace[i]=array[j];
					i++;
				}
			}
			index--;
			array = replace;
		}
		public boolean isPresent(int item)
		{
			for (int i=0;i<index;i++)
			{
				if(array[i]==item) return true;
			}
			return false;
		}

}
