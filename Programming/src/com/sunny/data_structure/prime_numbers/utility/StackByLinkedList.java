package com.sunny.data_structure.prime_numbers.utility;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to make our own stack implementation by using list
**/
public class StackByLinkedList 
{
	// node
	static Node head;
	// node class
	class Node
	{
		int data;
		Node next;
	}
	// adds element at the start
	public void addFirst(int item)
	{
		Node node = new Node();
		node.data=item;
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head = node;
		}
	}
	// display the whole list
	public void display()
	{
		Node node = head;
		while(node!=null)
		{
			System.out.println(node.data);
			node =node.next;
		}
	}
	// to display linked list in reversed manner
	public void displayReverse()
	{
		Node node = head;
		int[] reverse= new int[StackByLinkedList.size()];
		int i=0;
		while(node!=null)
		{
			reverse[i]=node.data;
			i++;
			node =node.next;
		}
		for(int j=reverse.length-1;j>=0;j--)
		{
			System.out.println(reverse[j]+"  ");
		}
		
	}
	// return the size
	public static int size()
	{
		int count =0;
		Node node = head;
		while(node!=null)
		{
			count++;
			node =node.next;
		}
		return count;
	}
	// returns the value at it
	public int value(int i) 
	{
		Node node = head;
		Node value =null;
		int k=0;
		while(k!=i)
		{
			value=node;
			node=node.next;
		}
		return value.data;
	}
	// to ckeck if value is present
	public boolean isPresent(int item)
	{
		StackByLinkedList l = new StackByLinkedList();
		for (int i=0;i<StackByLinkedList.size();i++)
		{
			if(l.value(i)==item) return true;
		}
		return false;
	}
	
}
