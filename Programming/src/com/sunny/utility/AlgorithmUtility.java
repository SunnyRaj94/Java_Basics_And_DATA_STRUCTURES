package com.sunny.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
	// used to take input in string array
	public static String[] inputStringArr() {
		int size = AlgorithmUtility.inputInteger();

		String arr[] = new String[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = AlgorithmUtility.inputS();
		}
		return arr;
	}
	//use to display output of String type array
	public static void display(String[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			System.out.print("  " + sorted[i]);
		}
	}
	// used to return a sorted array of String
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
	// this method is returning a string which is reading from a file
	public static String inputFromTxtmessage() throws Exception
	{
		File obj=new File("/home/admin1/SunnyRaj/Programming/lib/message.txt");
		Scanner scan = new Scanner(obj);String result="";
		while(scan.hasNext())
		{
			result=result+scan.next();
		}
		return result;
	}
	//this method is returning all words in a txt file in a string rtype array
	public static String[] inputFromTxtFile() throws IOException 
	{
		 String data = ""; 
		    String fileName="/home/admin1/SunnyRaj/Programming/lib/file.txt";
			data = new String(Files.readAllBytes(Paths.get(fileName))); 
		    return data.split(" "); 
	}
	
	// this method is returning a boolean value after checking if a word is present in a file
	public static boolean findWord(String word) throws IOException 
	{
		String[] sentence=inputFromTxtFile();
		for(int i=0;i<sentence.length;i++)
		{
			if(sentence[i].compareToIgnoreCase(word)==0)
			{
				return true;
			}
		}
		return false;
	}
	// this method is returning a list of integers by taking input from the user
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
	// this method is used to show output of list of integers to the console
	public static void displayListOfInt(List list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" , ");
		}
	}
	// this method is taking a list of integer and returning that list after bubble sorting
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
	
	// this method checks two strings are anagram or not
	public static boolean isAnagramString(String str1,String str2)
	{
		char[] strone=str1.toCharArray();
		char[] strtwo=str2.toCharArray();
		if(strone.length!=strtwo.length) return false;
		else
		{Arrays.sort(strone);Arrays.sort(strtwo);
		for (int i = 0; i < strone.length; i++) 
        {
			if (strone[i] != strtwo[i]) 
            return false; 
        }
		return true;
		}
	}
	
	//this method checks the input number is prime or not
	public static boolean isPrime(int num) 
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	// this method checks that input number is pallindrome or not
	public static boolean isPalindromeInteger(int n) 
    {
			int temp = n;
			int sum = 0;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			if (sum == n)
			{
				return true;
			}
			return false;
    } 
	// this method is used to predict the guessed number by user
	public static int findGuessedNumber() {

		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = AlgorithmUtility.inputInteger();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}
	//generic method for bubble sorting
	public static <E extends Comparable<E>> E[] bubbleSortGenerics(E[] inputArray) {

        E temp;

        boolean swapped = true;

        for(int j = 1; j < inputArray.length & swapped; j++) {

            swapped = false;

            for(int i = 0; i < inputArray.length - j; i++) {

                if(inputArray[i].compareTo(inputArray[i+1]) > 0) {

                    temp = inputArray[i];

                    inputArray[i] = inputArray[i+1];

                    inputArray[i+1] = temp;

                    swapped = true;

                }

            }

        }
        return inputArray;
    }
	// method for sorting two distinct string arrays into one
	public static void sort(String str[], int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			sort(str, left, middle);
			sort(str, middle + 1, right);

			merge(str, left, middle, right);
		}
	}
	//supportive method for merge sorting
	public static void merge(String[] string, int left, int middle, int right) {
		int numberOne = middle - left + 1;
		int numberTwo = right - middle;

		String left1[] = new String[numberOne];
		String right1[] = new String[numberTwo];

		for (int i = 0; i < numberOne; i++)
			left1[i] = string[left + i];
		for (int i = 0; i < numberTwo; i++)
			right1[i] = string[middle + 1 + i];

		int i = 0, j = 0;
		int k = left;
		while (i < numberOne && j < numberTwo) {
			if (left1[i].compareTo(right1[j]) < 0) {
				string[k] = left1[i];
				i++;
			} else {
				string[k] = right1[j];
				j++;
			}
			k++;
		}
		while (i < numberOne) {
			string[k] = left1[i];
			i++;
			k++;
		}
		while (j < numberTwo) {
			string[k] = right1[j];
			j++;
			k++;
		}
	}
	
	
}
