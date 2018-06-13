package com.bridgelabz.ObjectOriented;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgelabz.Utility.Utility;

/*******************************************************************************************************
 * @author Ankita Kalgutkar
 *  18-May-2018
 * purpose : Read in the following message: Hello <<name>>, We have your full name
 * as <<full name>> in our system. your contact number is 91­xxxxxxxxxx.
 * Please,let us know in case of any clarification Thank you BridgeLabz
 * 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with
 * proper value.
 * 
 ********************************************************************************************************/
public class RegularExpression
{
	static String message = "Hello <<name>>, We have your full name as <<fullname>> in our"
			+ " system. your contact number is 91­xxxxxxxxxx."
			+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	static String name = "", fullname = "", number = "", date = "";

	public static void main(String[] args) 
	{	
		//calling the userdetails method
		userDetails();

		/* Regex patterns */
		String regex = "<<name>>";
		String regex_fullname = "<<fullname>>";
		String regex_number = "xxxxxxxxxx";
		String regex_date = "01/01/2016";

		RegularExpression re = new RegularExpression();
		message = re.replaceName(message, regex, name);
		message = re.replaceName(message, regex_fullname, fullname);
		message= re.replaceName(message, regex_number, number);
		message= re.replaceName(message, regex_date, date);
		System.out.println(message);
	}

	public String replaceName(String value, String regex, String replace) 
	{
		Pattern pat = Pattern.compile(regex);
		Matcher match = pat.matcher(value);
		return value = match.replaceAll(replace);
	}

	public static void userDetails() 
	{ 
		Utility u=new Utility();
		System.out.println("Enter your name");
		name =u.getString();
		System.out.println("Enter your fullname");
		fullname = u.getString();
		System.out.println("Enter your number");
		number = u.getString();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		Date datenew = new Date();
		date = (String) dateFormat.format(datenew);
	}
}