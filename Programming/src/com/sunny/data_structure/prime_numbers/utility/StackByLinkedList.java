package com.sunny.data_structure.prime_numbers.utility;

import com.sunny.data_structure.balanced_paranthesis.Stack;

public class StackByLinkedList 
{
	static Node head;
	class Node
	{
		int data;
		Node next;
	}
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
	public void display()
	{
		Node node = head;
		while(node!=null)
		{
			System.out.println(node.data);
			node =node.next;
		}
	}
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
