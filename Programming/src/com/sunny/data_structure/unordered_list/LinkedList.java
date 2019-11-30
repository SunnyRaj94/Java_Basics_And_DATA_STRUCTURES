package com.sunny.data_structure.unordered_list;

public class LinkedList 
{
	Node head;
	
	// Creates a new list that is empty.
	// It needs no parameters and returns an empty list.
	public LinkedList list()
	{
		return new LinkedList();
	}
	
	
	//adds a new item to the list
	// item is passed as a parameter 
	 public void add(Object obj)
	 {
		 Node node = new Node();
		 node.data=obj;
		 if(head== null)
			 head=node;
		 else
		 {
			 Node insert = head;
			 while(insert.next!=null)
			 {
				 insert = insert.next;
			 }
			 insert.next=node;
		 }
	 }
	 
	 //removes an item from the list
	 //item is passed in the parameter
	 public void remove(Object obj)
	 {
		 Node remove = new Node();
		 remove.data=obj;
		 Node insert=head;
		 Node prev =null;
		 if(head.data.equals(obj)) head =insert.next;
//		 while(insert.data.equals(remove.data)&&insert.data!=null)
//		 {	
//			 prev =insert;
//			 insert =insert.next;
//				 
//		 }
//		 if(insert.next==null) return;
//		 prev.next=insert.next;
//		 
	 }
	 public void removeAtIndex(int index)
	 {
		 if(index==0) head=head.next;
		 else
		 {
			 Node n =head;
			 Node n1=null;
			 for(int i=0;i<index-1;i++)
			 {
				 n=n.next;
			 }
			 n1=n.next;
			 n.next=n1.next;
		 }
	 }
	 
	 
	 //displays all the items present in the list
	 public void display()
	 {
		 Node display=head;
		 while (display!=null)
		 {
			 System.out.println(display.data);
			 display=display.next;
		 }
	 }
	
	//search item in the list
	 public boolean search(Object obj)
	 {
		Node search =new Node();
		search.data=obj;
		Node check =head;
		while(check!=null)
		{
			if(check.data.equals(search.data))
				return true;
			check=check.next;
		}
		return false;
		 
	 }
}
