package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

/**************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * 
 *purpose:binarySearch  method  for  integer 
		  binarySearch  method  for  String
***************************************************/
class Binarysearch 
{ 
	static int search;
	public static void main(String args[])
	{	
	    Utility test= new Utility();  
	    int n = test.getInteger();
	    Integer array[] = new Integer[n];
	    
	    System.out.println("Enter " + n + " integers");
	    for (int c = 0; c < n; c++)
	    array[c] = test.getInteger();
	    System.out.println("Enter value to find");
	    int search=test.getInteger();
	    //calling the method binaryserach from utility class
	    Utility.binary(array,search,n);	    
	    
	    
	    //Binary search for string
	    String ar[] =new String[n];
	    for (int i = 0; i < n;i++)
	    {
	        ar[i] = test.getString();
	    } 
	    System.out.println("enter the string to find");
         String  x1 = test.getString();
	    Utility.binary(ar,x1,n);
	    

  }
}