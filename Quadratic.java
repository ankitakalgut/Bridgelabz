package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;

/***************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *purpose: To find the roots of the equation a*x*x+b*x+c.Since the equation is x*x,hence there are 2 roots.The 2 roots of the equation can be found using the formula.
 *  
 ****************************************************************************************/
public class Quadratic 
{
	public static void main(String args[])
	{   
		Utility test=new Utility();
		double a=test.getDouble();
		double b=test.getDouble();
		double c=test.getDouble();
		double res=Utility.del(a,b,c);
		System.out.println(res);		
	}
}