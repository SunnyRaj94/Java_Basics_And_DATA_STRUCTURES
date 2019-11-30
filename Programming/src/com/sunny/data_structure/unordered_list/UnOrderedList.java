package com.sunny.data_structure.unordered_list;

public class UnOrderedList {

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(12);
		list.add(23.0);
		list.add(44);
		list.add(88);
		list.display();
		System.out.println("Removing Sunny");
		list.remove(44);
		//list.removeAtIndex(2);
		list.display();
//		System.out.println("Searching Sunny");
//		System.out.println(list.search("Sunny"));
	}

}
