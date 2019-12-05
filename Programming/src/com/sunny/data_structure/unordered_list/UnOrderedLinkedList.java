package com.sunny.data_structure.unordered_list;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used to make our own unordered linkedlist implementations
**/
public class UnOrderedLinkedList<T> {
	public class Node<T> {
		public Node next;
		public T data;

	}

	Node<T> head;

	// Creates a new list that is empty.
	// It needs no parameters and returns an empty list.
	public UnOrderedLinkedList list() {
		return new UnOrderedLinkedList();
	}

	// adds a new item to the list
	// item is passed as a parameter
	public void add(T obj) {
		Node<T> node = new Node();
		node.data = (T) obj;
		if (head == null)
			head = node;
		else {
			Node insert = head;
			while (insert.next != null) {
				insert = insert.next;
			}
			insert.next = node;
		}
	}

	// removes an item from the list
	// item is passed in the parameter
	public void remove(T data) {
		Node<T> temp = head, prev = null;

		if (temp.data.equals(data)) {
			head = temp.next;
			return;
		}

		while (temp != null && !temp.data.equals(data)) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;

	}

	// search item in the list
	public boolean search(Object obj) {
		Node search = new Node();
		search.data = obj;
		Node check = head;
		while (check != null) {
			if (check.data.equals(search.data))
				return true;
			check = check.next;
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
		Node<T> temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	// append or add an item at the last of a list
	public void append(Object obj) {
		Node<T> node = new Node();
		node.data = (T) obj;
		if (head == null)
			head = node;
		else {
			Node insert = head;
			while (insert.next != null) {
				insert = insert.next;
			}
			insert.next = node;
		}
	}
	// removes element at the passed index
	public void removeAtIndex(int index) {
		if (index == 0)
			head = head.next;
		else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
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

	// gives the index on which item is present in the linked list
	public int index(T item) {
		Node<T> temp = head;
		int count = 0;
		while (item != (temp.data)) {
			count++;
			temp = temp.next;

		}
		return count;
	}

	// inserts element at given position
	//take data and index position as parameter
	public void insert(T data, int position) {

		Node<T> new_data = new Node<T>();
		new_data.data = data;
		Node<T> temp = head;

		while (position > 1) {
			temp = temp.next;
			position--;
		}
		new_data.next = temp.next;
		temp.next = new_data;
	}
	
	
	//removes and returns an item from the last of the list
	public T pop()
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
		return (T) value.data;
	}
	// removes and returns the item from the given index position
	public T popAtIndex(int index)
	{
		Node temp=head;
		Node remove = null;
		if(index==0)
		{
			head=temp.next;
			return (T) temp.data;
		}
		else {
			while (index != 0) {
				remove = temp;
				temp = temp.next;
				index--;
			}
			Node value = remove;
			remove.next = temp.next;
			return (T) value.data;
		}
	}
}
