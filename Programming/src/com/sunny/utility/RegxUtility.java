package com.sunny.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* created by:SunnyRaj
* Date 25/11/2019
* Purpose: this programm is a utility class for regsstringfunction class
**/

public class RegxUtility 
{
	
		private final static String REGEX_NAME = "<<name>>";
		private final static String REGEX_FULLNAME = "<<fullname>>";
		private final static String REGEX_MOBILE_NO = "xxxxxxxxxx";
		private final static String REGEX_DATE = "01/01/2016";

		//Regex pattern matcher match the string and replace the regex pattern with user details.
		public static String convertString(UserDetails userDetails,String message){
			Pattern p = Pattern.compile(REGEX_NAME);
			Matcher m = p.matcher(message); 
			String message1 = m.replaceAll(userDetails.getfName());

			p = Pattern.compile(REGEX_FULLNAME);
			m = p.matcher(message1); 
			String message2 = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

			p = Pattern.compile(REGEX_MOBILE_NO);
			m = p.matcher(message2); 
			String message3 = m.replaceAll(userDetails.mobileNo());

			p = Pattern.compile(REGEX_DATE);
			m = p.matcher(message3); 
			String message4 = m.replaceAll(userDetails.date());
			return message4;
		}
}
