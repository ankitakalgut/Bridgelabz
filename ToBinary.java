package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

public class ToBinary
{
	public static String decToBin(int num)
	{
		String out="";
		while(num!=0)
		{
			int rem=num%2;
			out=rem+out;
			num=num/2;
		}
		return out;	
	 }
	public static void main(String args[])
	{
		Utility u=new Utility();
		int num=u.getInteger();
		String res=decToBin(num);
		System.out.println(res);
	}
}