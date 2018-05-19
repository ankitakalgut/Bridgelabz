package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;

public class Leapyear
{

	public static void main(String args[])
	{	
		Utility test=new Utility();
		int year=test.getInteger();
		System.out.println("number of digits is="+Utility.numberofdigits(year));
		int result= Utility.leap(year);
		System.out.println(result);
	}

	
}
