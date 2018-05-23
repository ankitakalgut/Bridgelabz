package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

/**
 * @author Ankita Kalgutkar
 *
 * 23-May-2018
 *Purpose:Write a static function sqrt to compute the square root of a nonnegative number c  
 *given in the input using Newton's method
 *
 */
public class Sqrt 
{	
	public static void sqrt(double c)
	{
		double epsilon = 1e-15; 
		double t=c; 
		 while (Math.abs(t - c/t) > epsilon*t) 
		 {
	            t = (c/t + t) / 2.0;
	     }
	        // estimated value of square root of c
	        System.out.println(t);
	}
	public static void main(String args[])
	{
		Utility u=new Utility();
		double c=u.getDouble();
        sqrt(c);
	}
}
