package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
purpose:calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a 
Change.
 */
public class VendingMachine
{
  	static int i=0;
  	static int totalsum=0;
  	static int[]notes = {1000,500,100,50,10,5,2,1};
  	static int amount;
  	//method to calculate the notes
  	public static  int calculate(int amount,int[]notes )
  	{
        int rem;
		if(amount==0)
		{
			return -1 ;
		}
		else
		{
			if(amount>=notes[i])
			{
				int calNotes =amount/notes[i];
				rem = amount%notes[i];
				amount =rem;
				totalsum += calNotes;
				System.out.println(notes[i]+" Notes = " +calNotes);
			}
			i++;
			return calculate(amount, notes);
		}
	}
	public static void main(String[] args)
	{
        Utility test=new Utility();
		System.out.print("Enter the Amount:");
		amount =test.getInteger();
		VendingMachine.calculate(amount,notes);
		System.out.println("Total Number of Notes are :"+totalsum);
	}
}