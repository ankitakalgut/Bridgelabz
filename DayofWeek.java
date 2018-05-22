package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

/***************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * 
 *purpose:date as input and prints the day of the week that date falls on.
 ****************************************************************/

public class DayofWeek 
{
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		String[] month1= {"jan","feb","mar","april","may","june","july","aug","sep","oct","nov","dec"};
		Utility.dayofweek(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));	
	}	
}


