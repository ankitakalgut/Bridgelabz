package com.bridgelabz.FunctionalProgram;
/**
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
purpose:To Given the temperature and the wind speed v (in miles per hour),the National   Weather   Service   defines   the   effective   temperature   (the   wind   chill)   to  
be. 
 **/
public class Windchill 
{
		public static double windchill(int a,int b)
		{		
			if(a<=50&&b<=120&&b>3)
				{
					double w=35.47+0.6215*a+(0.4275*a-35.75)*Math.pow(b,0.16);
					System.out.println(w);
				}
				else 	
				System.out.println("invalid");
				return 1.0;
		}
		public static void main(String args[])
		{
		  	for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		  	//To convert array of string to integer value. 
			windchill(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		}
}

