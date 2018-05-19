package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;

public class Quadratic 
{

	public static void main(String args[])
	{   Utility test=new Utility();
		double a=test.getDouble();
		double b=test.getDouble();
		double c=test.getDouble();
		double res=Utility.del(a,b,c);
		System.out.println(res);
		
		
		
	}
}