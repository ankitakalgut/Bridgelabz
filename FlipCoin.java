package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;
/***********************************************************************************************
 * 
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * Purpose:Flip Coin and print percentage of Heads and Tails 
 * 
 ************************************************************************************************/
public class FlipCoin
{
	static int head=0;
	static int tail=0;
	public static double flips(int flip)
	{	
		for(int i=0;i<flip;i++)
		{
			if(Math.random()>0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		}
		System.out.println("percentage of heads= "+(head*100)/flip+"%");
		System.out.println();
		System.out.println("percentage of tails= "+(tail*100)/flip+"%");
		return 1.0;		
	}
	 public static void main(String args[])
	 {
		Utility t=new Utility();
		int flip=t.getInteger();
		flips(flip);	
	 }
}
