package com.sunny.utility;

import java.util.Comparator;

public class Student implements Comparator<Student> 
{
	public String name;
	public int age;
	public String schoolName;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	public Student(String name, int age, String schoolName) {
		super();
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}
	@Override
	public int compare(Student o1, Student o2) {

      return o1.name.compareTo(o2.name);
	}
}
