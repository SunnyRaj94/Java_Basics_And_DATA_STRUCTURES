package com.sunny.algorithm;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sunny.utility.AlgorithmUtility;
import com.sunny.utility.RegxUtility;
import com.sunny.utility.UserDetails;

public class RegxStringFunction {

	public static void main(String[] args) throws Exception 
	{
		String message = AlgorithmUtility.inputFromTxtmessage();
		UserDetails user = new UserDetails();
		System.out.println("Please enter you name");
		user.setfName(AlgorithmUtility.inputS());
		System.out.println("Please Enter your last name");
		user.setlName(AlgorithmUtility.inputS());
		System.out.println("please enter your mob number");
		user.setmobileNo(AlgorithmUtility.inputS());
		System.out.println("please enter a date");
		String inputdate =AlgorithmUtility.inputS();
		SimpleDateFormat dateformat = new SimpleDateFormat(inputdate);
		Date dateinput = dateformat.parse(inputdate);
		String finaldate = dateinput.toString();
		user.setdate(finaldate);
		System.out.println(RegxUtility.convertString(user ,  message ));	
	}

}
