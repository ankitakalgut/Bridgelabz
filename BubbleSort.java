package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

/*********************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * purpose:Bubble sort technique for integers and strings.

 ************************************************************************************************/
public class BubbleSort
{  
    static int n,i;
    public static void main(String args[])
    {	
	    Utility test=new Utility();
	    int n=test.getInteger();
	    Integer array[] = new Integer [n];   
        for(int i = 0; i < n; i++)
        {
            array[i] = test.getInteger();
        }
	    Utility.bubble(array);
	    System.out.println("Array After Bubble Sort");  
        for(int i=0; i < array.length; i++)
        {  
            System.out.print(array[i] + " ");  
        }  
       //for string     
       String[] array1 = new String[n];
       System.out.println();
       for (int i = 0; i < n;i++)
       {
           array1[i] = test.getString();
       } 
       Utility.bubble(array1);
       for(int i=0; i < n; i++)
       {  
           System.out.print(array1[i] + " ");  
       }   
    }    
}