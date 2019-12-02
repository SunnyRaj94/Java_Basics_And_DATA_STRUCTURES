package com.sunny.data_structure.ordered_list;

public class OrderedList {

	public static void main(String[] args) 
	{
		OrderedLinkedList list = new OrderedLinkedList();
		list.add(22);list.add(24);list.add(33);list.add(45);list.add(32);list.add(23);list.add(7);
		list.display();
		System.out.println("removing");
		list.remove(45);
		list.display();;

	}

}
