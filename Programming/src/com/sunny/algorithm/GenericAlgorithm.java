package com.sunny.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.sunny.utility.AlgorithmUtility;
import com.sunny.utility.Student;

public class GenericAlgorithm {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(new Student("abc", 41, "mmmmmmm"));
		list.add(new Student("vsjsc", 41, "mmmmmmm"));
		list.add(new Student("skjgwdsabc", 41, "mmmmmmm"));
		list.add(new Student("akjhhhbc", 41, "mmmmmmm"));
		list.add(new Student("abxcjjc", 41, "mmmmmmm"));
		list.add(new Student("abqaac", 41, "mmmmmmm"));
		list.add(new Student("abcqsqs", 41, "mmmmmmm"));
		list.add(new Student("abc1e", 41, "mmmmmmm"));
		list.add(new Student("abcdwd", 41, "mmmmmmm"));
		//String [] student = {"sunny","babloo","hhhhaha","hgduwg"};
		Integer[] student = {12,77,44,55,66,22,33};
		Integer result[]=AlgorithmUtility.bubbleSortGenerics(student);
		for(Integer i: result) {

            System.out.print(" " + i);

        }
		class NameComparator implements Comparator{  
			public int compare(Object o1,Object o2){  
			Student s1=(Student)o1;  
			Student s2=(Student)o2;  
			  
			return s1.name.compareTo(s2.name);  
			}  
			}  
		System.out.println();
		Collections.sort(list,new NameComparator());
		Iterator itr = list.listIterator();
		while(itr.hasNext())
		{
			Student st = (Student) itr.next();
			System.out.println(st+" ");
		}
		
	}

}
