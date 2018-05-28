package com.bridgelabz.FunctionalProgram;
/**********************************************************************************
 * 
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * Purpose:Takes two integer command­line arguments x and y and prints the Euclidean distance from the point   (x,   y)   to   the   origin   (0,   0).   The  
   formulae to calculate distance =sqrt(x*x   +   y*y).
 * 
 **************************************************************************************/
public class Distance 
{
	public static void Euclideandistance(double x,double y)
	{
		double c=(x*x)+(y*y);
		System.out.println(Math.pow(c,0.5));
		
	}
	public static void main(String args[])
	{
		System.out.println(args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		Euclideandistance(Integer.parseInt(args[0]),Integer.parseInt(args[1]));	
	}
}