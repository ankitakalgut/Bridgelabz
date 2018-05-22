package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

/*******************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * purpose:Bubble sort technique for integers.

 *******************************************************************/
public class BubbleSort
{  
   static int n,i;
   public static void main(String args[])
   {	
	    Utility test=new Utility();
	    //for integers

	   int n=test.getInteger();
	   /*
	    int array[] = new int[n];   
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
        */
       //for string     
       String[] array = new String[n];
       for (int i = 0; i < n;i++)
       {
           array[i] = test.getString();
       } 
     
       Utility.bubble(array);
       for(int i=0; i < n; i++)
       {  
               System.out.print(array[i] + " ");  
       }
       
   }
   
   
}