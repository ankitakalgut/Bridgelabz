package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

/**
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
purpose:Insertion sort for array of integers and strings
 */
public class Insertionsort
{
	public static void main(String args[])
	{
		Utility test=new Utility();
		int n=test.getInteger();
		//Declaring integer of string
		Integer ar[]=new Integer [n];
		for(int i=0;i<n;i++) 
		{
			ar[i]=test.getInteger();
		}
	Utility.insertion(ar);
		System.out.println("Array After Insertion Sort");  
	    for(int i=0; i < n ;i++)
	    {  
	       System.out.print(ar[i] + " ");  
	    }
	    //Declaring array of string
	    String array[]=new String[n];
	    for(int i=0;i<n;i++)
	    {
	        array[i]=test.getString();
	    }
	    //method
	    Utility.insertion(array);
	    System.out.println("Array after Insertion sort");
	    for(int i=0; i < n; i++)
	    {     // Now merge both sides
	         System.out.print(array[i] + " ");  
	     }
	}
}

