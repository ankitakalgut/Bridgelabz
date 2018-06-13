package com.bridgelabz.ObjectOriented;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.DataStructurePrograms.Link;
import com.bridgelabz.DataStructurePrograms.Queue1;
import com.bridgelabz.Utility.Utility;

public class AddressBook 
{
    Utility u=new Utility(); 

    void addAPerson() 
    {
        System.out.print("Enter first and last name: ");
        String firstName = u.getString();
        String lastName =u.getString();
       
        System.out.print("Enter complete address: ");
        String address = u.getString();
       
        System.out.print("Enter city, state and zip: ");
        String city = u.getString();
        String state = u.getString();
        String zip = u.getString();
       
        System.out.println("Enter phone number: ");
        String phoneNo = u.getString();
       
        AddressDetails person = new AddressDetails(firstName, lastName, address, city, state, zip, phoneNo);
        JSONObject jsonObject = person.toJsonObject();
        writeBook(jsonObject);       
    }

   
   // Edit a persons information 
    @SuppressWarnings("unchecked")
	void edit(JSONObject jsonObject, JSONArray bookArray, int i)
    {
        System.out.println("What do you want to edit?");
        System.out.println("1. Address");
        System.out.println("2. PhoneNumber");
       
        int choice = u.getInteger();
        switch (choice)
        {
        case 1:
            System.out.print("Enter address: ");
       
            String address = u.getString();
            System.out.print("Enter city, state and zip: ");
            String city = u.getString();
            String state = u.getString();
            String zip = u.getString(); 
            jsonObject.put("Address", address);
            jsonObject.put("City", city);
            jsonObject.put("State", state);
            jsonObject.put("Zip", zip);
            break;

        case 2:
            System.out.println("Enter phone number: ");
            String phoneNumber = u.getString();
            jsonObject.put("Phone Number", phoneNumber);
            break;
        }
       
        bookArray.remove(i);
        bookArray.add(i, jsonObject);
       
        printWriter(bookArray);
        System.out.println("Contact updated successfully");
    }

    // Deletes a person's information
    void delete(JSONArray bookArray, int i) 
    {
        bookArray.remove(i);
       
        printWriter(bookArray);
        System.out.println("Contact deleted successfully");
    }

    //Displays person's record 
    void search(JSONObject jsonObject) 
    {
        System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
        System.out.println("Address:\n" + jsonObject.get("Address"));
        System.out.print(jsonObject.get("City") + ", ");
        System.out.print(jsonObject.get("State") + " - ");
        System.out.println(jsonObject.get("Zip"));
        System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
    }

   // Updates Address book
    @SuppressWarnings("unchecked")
	void writeBook(JSONObject jsonObject) 
    {
        JSONParser parser = new JSONParser();
        JSONArray bookArray = null;

        File file = new File("/home/bridgelabz/Address.jason");
        if (!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) 
            {
                e.printStackTrace();
            }
            bookArray = new JSONArray();
        } 
        else
        {
            try
            {
                bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/Address.jason"));
            } catch (IOException | ParseException e) 
            {
                e.printStackTrace();
            }
        }
        bookArray.add(jsonObject);
        printWriter(bookArray);
        System.out.println("Contact added successfully");
    }

    // Reads json file and adds information to json array 
    void Part(int choice) 
    {
        JSONParser parser = new JSONParser();
        String firstName = u.getString();
        String lastName = u.getString();
        JSONArray bookArray = null;

        try 
        {
            bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/Address.jason"));
        } catch (IOException | ParseException e)
        {
            ((Throwable) e).printStackTrace();
        }

        Iterator iterator = bookArray.iterator();
        int i = 0;
        boolean b = false;
        outer:
        while (iterator.hasNext())
        {
            JSONObject jsonObject = (JSONObject) iterator.next();
            if (jsonObject.get("First Name").equals(firstName) && jsonObject.get("Last Name").equals(lastName)) 
            {
                b = true;
                switch (choice) 
                {
                case 2:
                    edit(jsonObject, bookArray, i);
                    break outer;
                case 3:
                    delete(bookArray, i);
                    break outer;
                case 4:
                    search(jsonObject);
                    break outer;
                }
            }
            i++;
        }
        if(!b)
        {
            System.out.println("Person not found...");
        }
    }

   //Writes all the data to a file 
    void printWriter(JSONArray bookArray) 
    {
        try 
        {
            PrintWriter printWriter = new PrintWriter("/home/bridgelabz/Address.jason");
            printWriter.write(bookArray.toJSONString());
            printWriter.close();
        } catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
  static String[] sortbyname() throws FileNotFoundException, IOException, ParseException 
   {  
	   int i;
	  
	   Queue1 q=new Queue1();
	   JSONParser parser = new JSONParser();
       JSONArray bookArray = null;
       bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/Address.jason"));
       String[] b=new String[bookArray.size()];
       Iterator iterator = bookArray.iterator();
       for(i=0;i<bookArray.size();i++)
          {
    	    JSONObject jsonObject = (JSONObject) iterator.next();
             String a=(String) jsonObject.get("First Name");      
             b[i]=a;              
           }
	return b;           
   }
   //sort by zip
   static String[] sortbyzip() throws FileNotFoundException, IOException, ParseException 
   {  
	   int i;  
	   JSONParser parser = new JSONParser();
       JSONArray bookArray = null;
       bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/Address.jason"));
       String[] c=new String[bookArray.size()];
       Iterator iterator = bookArray.iterator();
       for(i=0;i<bookArray.size();i++)
          {
    	     JSONObject jsonObject = (JSONObject) iterator.next();
             String k= (String) jsonObject.get("Zip");      
             c[i]=k;           
           }
	return c;      
   }

}
    
   
  
