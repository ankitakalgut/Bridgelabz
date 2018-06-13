package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Utility.Utility;

/**************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *Purpose:program that takes the month and year as command­line  
		  arguments  and  prints the Calendar of the month. Store the  Calendar 
		  in an 2D Array,the first dimension the week of the month and the second 
		  dimension stores the day of the week.
 *******************************************************************************************/    
public class Calender 
{
    static int MONTH = 0, YEAR = 0;

    public static void main(String[] args) 
    {
        Utility u=new Utility();
        System.out.println("Enter the month");
        MONTH = u.getInteger();
        if (MONTH < 1 || MONTH > 12) 
        {
            System.out.println("invalid month");
            System.exit(0);
        }
        System.out.println("Enter the year");
        YEAR = u.getInteger();
        if (YEAR < 1582) {
            System.out.println("invalid year");
            System.exit(0);
        }
        int day = 1;
        String[][] string = new String[6][7];
        String[] months = { "", "January", "february", "march", "april", "may", "june", "july", "august", "september",
                			"october", "november", "december" };
        String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                string[i][j] = "  ";
            }
        }
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                if (Utility.validDate(day, MONTH, YEAR)) 
                {
                    j = Utility.dayofweek(MONTH, YEAR, day);
                    if (day < 10) {
                        string[i][j] = " " + day++;
                    } else {
                        string[i][j] = "" + day++;
                    }
                }
            }
        }
        System.out.println(months[MONTH] + " " + YEAR);
        System.out.println("");
        for (int i = 0; i < 7; i++) 
        {
            System.out.print(days[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                System.out.print(string[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

