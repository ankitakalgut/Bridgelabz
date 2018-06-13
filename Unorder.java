package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Utility.Utility;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*******************************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * 
 *purpose: Read the Text from a file, split it into words and arrange it as Linked List. 
		   Take a user input to search a Word in the List.If the Word is not found then add it 
           to the list, and if it found then remove the word from the List. In the end save the list into a file 
 *******************************************************************************************************************/

public class Unorder<T extends Comparable<T>> 
{
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws FileNotFoundException
	{
		String filePath="/home/bridgelabz/K.txt" ;
		Utility u=new Utility();		
	    Link link=new Link();
		@SuppressWarnings("unused")
		FileReader filereader=null;
		@SuppressWarnings("unused")
		BufferedReader bufferreader=null;
		String word=null;
		FileReader fileReader=new FileReader(filePath);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		try 
		{
			while((word=bufferReader.readLine())!=null)
			{
				String[] str=word.split(",");
				for(int i=0;i<str.length;i++)
				{
					link.add(str[i]);
				}
			}
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
		}
		System.out.println("The contents of the list are");
		System.out.println();
		//display the contents of the list
		link.display();
		System.out.println();
		System.out.println("Enter the word you want to search in the file");
		String searchWord=u.getString();
		if(link.search(searchWord))
		{
			System.out.println("Word found:The found word is deleted from the list");
			link.remove(searchWord);
			System.out.println("The contents of the list after deletion are");
			link.display();
		}
		else
		{
			System.out.println();
			System.out.println("word not found is addded to the list");
			System.out.println();
			link.addLast(searchWord);
			link.display();
		}
	    //save modified list to the file
	    PrintWriter writer = new PrintWriter("/home/bridgelabz/K.txt");
		 for(int i=0;i<link.getCount();i++) 
		 {
			 writer.print((Comparable) link.getNth(i)+",");
		 }
		writer.close();   		
	}

}