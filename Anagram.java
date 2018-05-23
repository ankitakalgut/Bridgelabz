package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.Utility.Utility;

import java.util.Arrays;
/**
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
purpose: One string is an anagram of another if the second is simply a 
rearrangement of the first. For example, 'heart' and 'earth' are anagrams... 
 */
public class Anagram 
{
	public static void main(String args[])
	{
		Utility test=new Utility();
		String s1=test.getString();
		String s2=test.getString();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);//sort string1 
		Arrays.sort(ch2);//sort string2
		boolean res=Arrays.equals(ch1,ch2);
		if(res)
		{
			System.out.println("The two Strings are anagram");
		}
		else
		System.out.println("The two Strings are not anagram");	
	}	
}
