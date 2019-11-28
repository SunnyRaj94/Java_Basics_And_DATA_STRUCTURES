package com.sunny.utility;

import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegxUtility 
{
	
		BufferedReader br;
		private final static String REGEX_NAME = "<<name>>";
		private final static String REGEX_FULLNAME = "<<full name>> ";
		private final static String REGEX_MOBILE_NO = "xxxxxxxxxx";
		private final static String REGEX_DATE = "12/06/2016";

		//Regex pattern matcher match the string and replace the regex pattern with user details.
		public static String convertString(UserDetails userDetails,String message){
			Pattern p = Pattern.compile(REGEX_NAME);
			Matcher m = p.matcher(message); 
			message = m.replaceAll(userDetails.getfName());

			p = Pattern.compile(REGEX_FULLNAME);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

			p = Pattern.compile(REGEX_MOBILE_NO);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.mobileNo());

			p = Pattern.compile(REGEX_DATE);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.date());

			return message;
		}
}
