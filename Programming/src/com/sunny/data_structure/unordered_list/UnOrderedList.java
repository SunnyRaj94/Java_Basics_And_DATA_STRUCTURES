package com.sunny.data_structure.unordered_list;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.sunny.data_structure.unordered_list.UnOrderedLinkedList.Node;

public class UnOrderedList {
	
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
	public static void writeTofile(UnOrderedLinkedList list) throws Exception
	{
		Node insert = list.head;
		File file = new File("/home/admin1/SunnyRaj/Programming/lib/UnorderedListOutput.txt");
		FileWriter writer = new FileWriter(file);
		String output="";
		while(insert!=null)
		{
			output = output+" "+insert.data;
			insert=insert.next;
		}
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
		if(list.search("save"))
			list.remove("save");
		else
			list.add("save");
		UnOrderedList.writeTofile(list);
	}

}
