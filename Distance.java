package com.bridgelabz.FunctionalProgram;

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