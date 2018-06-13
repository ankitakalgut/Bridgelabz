package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Utility.Utility;

/*******************************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *
 *Purpose:Create the Week Object having a list of WeekDay objects each storing the day (i.e  
		  S,M,T,W,Th,..) and the Date 1,2,3..).The WeekDay objects are stored in a Queue  
		  implemented using Linked List.Further maintain also a Week Object in a Queue to  
		  finally display the Calendar 
 ***************************************************************************************************************/
public class CalendarStack 
{
	
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public static void main(String[] args) 
	    {
	        Utility u = new Utility();
	        int m = Integer.parseInt(args[0]);
	        int y = Integer.parseInt(args[1]);
	        MyStack first[][] = new MyStack[6][];
	        for (int i = 0; i < 6; i++) 
	        {
	            first[i] = new MyStack[7];
	            for (int j = 0; j < 7; j++) 
	            {
	                first[i][j] = new MyStack();
	            }
	        }

	        MyStack a[][] = new MyStack[6][];
	        for (int i = 0; i < 6; i++) 
	        {
	            a[i] = new MyStack[7];
	            for (int j = 0; j < 7; j++) 
	            {
	                a[i][j] = new MyStack();
	            }
	        }
	        int d = 1;
	        String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
	                "October", "November", "December" };
	        String[] days = { " S", " M", " T", " W", "Th", " F", " S" };
	        for (int i = 0; i < 6; i++) 
	        {
	            for (int j = 0; j < 7; j++) 
	            {
	                first[i][j].push("  ");
	            }
	        }

	        for (int i = 0; i < 6; i++)
	        {
	            for (int j = 0; j < 7; j++) 
	            {
	                if (Utility.validDate(d, m, y)) 
	                {
	                    j = (int) Utility.dayofweek(m, y, d);
	                    if (d < 10) 
	                    {
	                        first[i][j].pop();
	                        first[i][j].push(" " + d);
	                        d++;
	                    } else 
	                    {
	                        first[i][j].pop();
	                        first[i][j].push("" + d);
	                        d++;
	                    }
	                }
	            }
	        }

	        for (int i = 0; i < 6; i++) 
	        {
	            for (int j = 0; j < 7; j++) 
	            {
	                a[i][j].push(first[i][j].pop());
	            }
	        }

	        System.out.println(months[m] + " " + y);
	        System.out.println();
	        for (int i = 0; i < 7; i++) 
	        {
	            System.out.print(days[i] + "  ");
	        }
	        System.out.println();
	        System.out.println("---------------------");
	        for (int i = 0; i < 6; i++) 
	        {
	            for (int j = 0; j < 7; j++) 
	            {
	                System.out.print(a[i][j].pop() + "  ");
	            }
	            System.out.println();
	        }
	    }
	}


