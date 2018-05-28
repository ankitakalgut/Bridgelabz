package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;
/*****************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * purpose:To replace the username with the given name.
 * 
 *****************************************************************************/
public class ReplaceName
{
	public static void main(String args[])
	{
		Utility test=new Utility();
		String name=test.getString();
		String template="Hello <<UserName>>,How are you?";
		if(name.length()>=3)
		{
			String res=template.replace("<<UserName>>",name);
			
			System.out.println(res);
			return;
		}
		System.out.println("Invalid name required min three characters");			
	}
}
