package com.sunny.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
* created by:SunnyRaj
* Date 22/11/2019
* Purpose: this programm is a utility program for algorithm programms
**/
public class AlgorithmUtility {
	static Scanner sc = new Scanner(System.in);
	
	// used to take input string dfrom the user
	public static String inputString() {
		System.out.println("Enter String");
		return sc.nextLine();
	}
	
	// used to take input string dfrom the user
	public static String inputS() {
		System.out.println("Enter String");
		return sc.next();
	}
	
	// used to take input integer from the user
	public static int inputInteger() {
		System.out.println("Please Enter Number");
		return sc.nextInt();

	}
	
	// used to display integer array to the console
	public static void displayArr(int a[]) {
		for(int i=0;i<a.length;i++)      
		{
		     System.out.println(a[i]);		//printing the sorted array
		}
	}
	
	public static String[] inputStringArr() {
		int size = AlgorithmUtility.inputInteger();

//		AlgorithmUtility a = new AlgorithmUtility();

		String arr[] = new String[size];// {"Sunny","Bhumika","Rahul","ajay","vijay"};

		for (int i = 0; i < arr.length; i++) {
			arr[i] = AlgorithmUtility.inputS();
		}
		return arr;
	}

	public static void display(String[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			System.out.print("  " + sorted[i]);
		}
	}

	public static String[] insertionSort(String[] array,int f) 
	{
		String temp="";
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	public static String[] inputFromTxtFile() throws IOException 
	{
		 String data = ""; 
		    String fileName="/home/admin1/SunnyRaj/Programming/lib/file.txt";
			data = new String(Files.readAllBytes(Paths.get(fileName))); 
		    return data.split(" "); 
	}
	
	
	public static boolean findWord(String word) throws IOException 
	{
		String[] sentence=inputFromTxtFile();
		for(int i=0;i<sentence.length;i++)
		{
			for(int j=0;j<sentence[i].length();j++)
			{
				char check[]=sentence[i].toCharArray();
				char w[]=word.toCharArray();
				if(check[j]!=w[j])
					break;
				else
					return true;
			}
		}
		return false;
	}
	public static List<Integer> inputListOfInt()
	{
		ArrayList<Integer> list=new ArrayList();
		System.out.println("Enter some numbers.");

		while (sc.hasNextInt()) 
		{
			int i = sc.nextInt();
			list.add(i);
		}
		return list;
	}
	public static void displayListOfInt(List list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

	public static ArrayList<Integer> bubbleSortListOfInt(ArrayList<Integer> listIntArr) 
	{
		for(int i=0;i<listIntArr.size();i++)
		{
			for(int j=1;j<listIntArr.size();j++)
			{
				 if (listIntArr.get(j-1)> listIntArr.get(j)) 
				 {
		              int  temp = listIntArr.get(j-1);
		              listIntArr.set(j-1, listIntArr.get(j));
		                listIntArr.set(j, temp);
				 }
			}
		}
		return listIntArr;
	}
	
}