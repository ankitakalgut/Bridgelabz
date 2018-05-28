package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;
public class Power
{
		public static void main(String args[])
		{ 		
			for(int i=0;i<args.length;i++)
			{   
				System.out.println(args[i]);
				int pwr=Integer.parseInt(args[i]);
				Utility.power(pwr);
			}
		}
}
