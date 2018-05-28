package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;

public class Harmonic 
{
		public static double harmonic(int n)
		
		{	double out=0;
				if(n!=0)
			{	
				for(double i=1;i<=n;i++)
				{
			
					out=out+(1/i);	
				}
			}
			else
			System.out.println("invalid value of n");
			return out;		
		}
		public static void main(String args[])
		{
			Utility test=new Utility();
			int number=test.getInteger();
			double res=harmonic(number);
			System.out.println("The nth harmonic number is"+res);
		}
	}


