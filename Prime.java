package com.bridgelabz.FunctionalProgram;
import com.bridgelabz.Utility.Utility;

public class Prime
{

	public static void main(String args[])
	{
		
			Utility test=new Utility();
			int number=test.getInteger();
			int res=Utility.prime(number);
			System.out.println(res);
			
		
	}
}