package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;
/**
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *purpose:For example 100 is to be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal
 *
 */
public class ToDecimal 
{
	public static String nibbles(String out)
	{	
		String s1= out.substring(0, (out.length()/2));
		String s2 =out.substring((out.length()/2));
		System.out.println(s1);
		System.out.println(s2);
		String s3=s2+s1;
		return s3;
	}
	//Convert to convert binary to decimal
	public static int Todecimal(String s3)
	{
		int num1=Integer.parseInt(s3);
		System.out.println(num1);
		int count=0;
	    int out1=0;
		while(num1!=0)
		{
			int rem=num1%10;
			out1=(int) (out1+rem*Math.pow(2,count++));
			num1=num1/10;
		}
		return out1;
	}
	//Code to convert Decimal to Binary
	public static String decToBin(int num)
	{
		String out="";
		while(num!=0)
		{
			int rem=num%2;
			out=rem+out;
			num=num/2;
		}
		//append zeros if length is less than 8 bits
		while(out.length()<8)
		{
			out="0"+out;
		}
		System.out.println("out"+out);
		return out;	
	 }
	public static void main(String args[])
	{
		Utility u=new Utility();
		int num=u.getInteger();
		//calling decimal to binary method
		String res=decToBin(num);
		System.out.println(res);
		//calling the nibble method 
		String res1=nibbles(res);
		System.out.println(res1);
		//calling the binary to decimal method
		int res2=Todecimal(res1);
		System.out.println(res2);	
	}	
}
