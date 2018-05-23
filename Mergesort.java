package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

public class Mergesort 
{
    public  int[] array;
    public  int[] tempMergArr;
    public  int length;
 
    public static void main(String a[])
    {
    	Utility test=new Utility();
    	int n=test.getInteger();
        int[] inputArr=new int[n];
        for(int p=0;p<n;p++)
        {
        	inputArr[p]=test.getInteger();
        }
        test.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    } 
  
     }

