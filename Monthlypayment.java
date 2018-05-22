package com.bridgelabz.Algorithmprograms;

/********************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * 
 *purpose:calculate monthlyPayment that reads in three command­line arguments P,Y,and R and calculates the monthly payments you  
  would have to make over Y years to pay off a P principal loan amount at R per cent interest compounded monthly
 *********************************************************/
public class Monthlypayment 
{
	public static void monthpay(double p, double y, double r) 
	{
		double n=12.0*y;
		System.out.println(n);
		double rate=r/(12.0*100.0);
		double res=Math.pow(1+rate,(-n));
		double payment=(p*rate)/1.0-res;
		System.out.println("The monthly payment is="+payment);	
	}
	public static void main(String args[])
	{
		for( int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		monthpay(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
	}
}
