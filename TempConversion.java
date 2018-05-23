package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

/************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *purpose:Given the temperature in fahrenheit  as input outputs the temperature in Celsius or viceversa using the  
formula 
*************************************************/
public class TempConversion 
{
	public static void main(String args[])
	{  
		Utility test=new Utility();
	    double celcius=test.getDouble();
	    double fahrenheit=test.getDouble(); 
	    System.out.println("Enter the temperature in Celcius:"+celcius);
	    System.out.println("Enter the temperature in Farhrenheit:"+fahrenheit);
	    Utility.temperature(celcius,fahrenheit);
	    System.out.println("fahrenheit"+Utility.celciustofahrenheit);
		System.out.println("celcius"+Utility.fahrenheittocelcius);	   
	}
}
