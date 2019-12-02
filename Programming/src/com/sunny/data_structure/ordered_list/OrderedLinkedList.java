package com.sunny.data_structure.ordered_list;

public class OrderedLinkedList {
	Node head ;

	class Node {
		Node next;
		int data;
	}

	//returns a new emptylist
	public OrderedLinkedList list()
	{
		return new OrderedLinkedList();
		
	}
	// adds the item at in the list at the highest position
	public void add(int item) {
		Node node = new Node();
		node.data = item;
		if (head == null)
		{
			head = node;
		}
		else 
		{
			if (head.data<item) 
			{
				Node insert = head;
				Node put = null;
				while (insert != null && insert.data <= item) {
					put = insert;
					insert = insert.next;
				}
				if (insert != null) {
					Node value = put.next;
					put.next = node;
					node.next = insert;
				} else {
					Node value = put.next;
					put.next = node;
				} 
			}
			else
			{
				Node new_head = new Node();
				Node exc = head;
				new_head.data=item;
				head = new_head;
				new_head.next=exc;
			}
			
		}
	}

	// displays all the items present in the list
	public void display() {
		Node display = head;
		while (display != null) {
			System.out.println(display.data);
			display = display.next;
		}
	}
	
	//removes an specified item from the list
	public void remove(int item)
	{
		Node node= new Node(); 
		node.data=item;
		Node remove =head;
		Node value=null;
		while(remove.data!=item)
		{
			value=remove;
			remove = remove.next;
		}
		value.next=remove.next;
	}
	//searches for an item in the list and gives boolean true value if present
	public boolean search(int item)
	{
		Node node = head;
		while(node !=null)
		{
			if(node.data==item)
				return true;
			node =node.next;
		}
			return false;
	}

	// returns boolean value if list is empty or not
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
	// returns the size of the linked list
		public int size() {
			Node temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		// gives the index on which item is present in the linked list
		public int index(int item) {
			Node temp = head;
			int count = 0;
			while (item != (temp.data)) {
				count++;
				temp = temp.next;

			}
			return count;
		}
		//removes and returns an item from the last of the list
		public int pop()
		{
			Node temp = head;
			Node poping=null;
			while(temp.next!=null)
			{
				poping=temp;
				temp=temp.next;
			}
			Node value =poping;
			poping.next=null;
			return value.data;
		}
		// removes and returns the item from the given index position
		public int popAtIndex(int index)
		{
			Node temp=head;
			Node remove = null;
			while(index!=0)
			{
				remove = temp;
				temp=temp.next;
				index--;
			}
			Node value=remove;
			remove.next=temp.next;
			return value.data;
		}
}
