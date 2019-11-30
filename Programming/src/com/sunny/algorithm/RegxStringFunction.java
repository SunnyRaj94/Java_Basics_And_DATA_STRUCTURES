package com.sunny.algorithm;

import com.sunny.utility.AlgorithmUtility;
import com.sunny.utility.RegxUtility;
import com.sunny.utility.UserDetails;
/*
* created by:SunnyRaj
* Date 24/11/2019
* Purpose: this programm is used to replace and print name full name contack number and date in a stored text file by taking those values from the user
**/
public class RegxStringFunction {

	public static void main(String[] args) throws Exception 
	{
		// taking input from a text file and saving it in string
		String message = AlgorithmUtility.inputFromTxtmessage();
		//setting up user detail class with required fields
		UserDetails user = new UserDetails();
		System.out.println("Please enter you name");
		//setting up the value of first name of user
		user.setfName(AlgorithmUtility.inputS());
		System.out.println("Please Enter your last name");
		//setting up the last name of user
		user.setlName(AlgorithmUtility.inputS());
		//setting up the mobile number of user
		System.out.println("please enter your mob number");
		user.setmobileNo(AlgorithmUtility.inputS());
		System.out.println("please enter a date");
		//asking and setting up fo the date
		String inputdate =AlgorithmUtility.inputS();
		user.setdate(inputdate);
		//replacing the values
		System.out.println(RegxUtility.convertString(user ,  message ));	
	}

}
