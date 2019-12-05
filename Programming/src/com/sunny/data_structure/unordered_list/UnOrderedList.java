package com.sunny.data_structure.unordered_list;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.sunny.data_structure.unordered_list.UnOrderedLinkedList.Node;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is used Read the Text from a file, split it into words and arrange it as Linked List. 
* Take a user input to search a Word in the List. If the Word is not found then add it to the list, and if it found 
* then remove the word from the List. In the end save the list into a file
**/
public class UnOrderedList {
	
	// takes input from the file
	public static String inputFromFile() throws Exception
	{
		String fileText ="";
		File file = new File("/home/admin1/SunnyRaj/Programming/lib/UnorderedListInput.txt");
		Scanner s = new Scanner(file);
		while (s.hasNextLine())
		{
			fileText=s.nextLine();
		}
		return fileText;
	}
	// writes out put to the file
	public static void writeTofile(UnOrderedLinkedList list) throws Exception
	{
		Node insert = list.head;
		File file = new File("/home/admin1/SunnyRaj/Programming/lib/UnorderedListInput.txt");
		FileWriter writer = new FileWriter(file);
		String output="";
		while(insert!=null)
		{
			output = output+" "+insert.data;
			insert=insert.next;
		}
		writer.write("");
		writer.flush();
		writer.write(output);
		writer.flush();
	}

	public static void main(String[] args) throws Exception
	{
		UnOrderedLinkedList list = new UnOrderedLinkedList();
		String file_text=UnOrderedList.inputFromFile();
		String[] result=file_text.split(" ", -2);
		for(int i=0;i<result.length;i++)
		{
			list.add(result[i]);
		}
		System.out.println("Enter the word you want to search");
		Scanner s = new Scanner(System.in);
		String search =s.next();
		s.close();
		if(list.search(search))
			list.remove(search);
		else
			list.add(search);
		UnOrderedList.writeTofile(list);
	}

}
