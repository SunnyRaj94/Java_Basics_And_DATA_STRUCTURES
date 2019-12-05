package com.sunny.data_structure.ordered_list;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is written to  Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position

**/
public class OrderedList {
	// to read input from file
	public static OrderedLinkedList inputFromFile() throws Exception
	{
		OrderedLinkedList intlist = new OrderedLinkedList();
		File file = new File("/home/admin1/SunnyRaj/Programming/lib/OrderedListInput.txt");
		Scanner s = new Scanner(file);
		while (s.hasNextInt())
		{
			intlist.add(s.nextInt());
		}
		return intlist;
	}
	// to write into the file
	public static void writeToFile(OrderedLinkedList list) throws Exception
	{
		File file = new File("/home/admin1/SunnyRaj/Programming/lib/OrderedListInput.txt");
		FileWriter writer = new FileWriter(file);
		writer.write(" "); writer.flush();
		String str = "";
		int l = list.size();
		//System.out.println(l);list.display();
		while(l!=0)
		{
			str=str+list.pop()+" ";
			l--;
		}
		System.out.println(str);
		writer.write(str);
		writer.flush();
	}
	public static void main(String[] args) throws Exception 
	{
		OrderedLinkedList input = OrderedList.inputFromFile();
		System.out.println("Enter the value you want to search");
		Scanner s = new Scanner(System.in);
		int ele=s.nextInt();
		if(input.search(ele))
		{
			input.remove(ele);
		}
		else input.add(ele);
		OrderedList.writeToFile(input);
//		OrderedLinkedList input = new OrderedLinkedList();
//		input.add(23);//input.add(45);//input.add(33);//input.add(22);
//		input.display();
//		System.out.println("pop");
//		input.pop();
//		input.display();
	}

}
