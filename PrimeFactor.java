package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;
/*********************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *
 *Purpose:Computes the prime factorization of N using brute force. 
 *
 **********************************************************************************/
public class PrimeFactor
{
	public static void main(String args[])
	{
			Utility test=new Utility();
			int number=test.getInteger();
			//call the method prime in utility class
			Utility.prime(number);	
	}
}