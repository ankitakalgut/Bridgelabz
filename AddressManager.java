package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import com.bridgelabz.Utility.Utility;

public class AddressManager 
{

  static AddressBook addressBook=new AddressBook();
  public static void createaddressBook() throws FileNotFoundException, IOException, ParseException
  {
	  System.out.println("Enter c to create address Book");
	  Utility u=new Utility();
	  String create=u.getString();
	  if(create.equals("c"))
	  {
		  System.out.print("New Address Book created");
		  System.out.println();
		  askUser();
		 
	  } 
	  else
	  {
		  System.out.print("Address book not created ....");
		  
	  }
  }
 
  public void saveaddressBook()
  {
	Utility u=new Utility();
	  System.out.println("Do yo wish to save the address book?");
	  String s=u.getString();
	  if(s=="yes")
	  {
		  System.out.println("File saved");;
	  }
  }
  
  @SuppressWarnings("static-access")
  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException 
  {
      AddressBook addressBook = new AddressBook();
      createaddressBook();
    
  }
    
  @SuppressWarnings("static-access")
static void askUser() throws FileNotFoundException, IOException, ParseException 
  {   
	  Utility u=new Utility();
      System.out.println("Select an Choice to start..");
      System.out.println("1. Add a person");
      System.out.println("2. Edit");
      System.out.println("3. Delete a person");
      System.out.println("4. Search a person");
      System.out.println("5. sort by name");
      System.out.println("6. sort by zip");
      System.out.println("7. Quit");
     
      int choice = u.getInteger();
      switch(choice)
      {
      case 1:
    	  addressBook.addAPerson();
          System.out.println("\n");
          askUser();
          break;
      case 2:
          System.out.print("Enter first and last name of the person to edit the contact: ");
          addressBook.Part(choice);
          System.out.println("\n");
          askUser();
          break;
      case 3:
          System.out.print("Enter first and last name of the person to delete the contact: ");
          addressBook.Part(choice);
          System.out.println("\n");
          askUser();
          break;
      case 4:
          System.out.print("Enter first and last name of the person to search the person: ");
          addressBook.Part(choice);
          System.out.println("\n");
          askUser();
          break;
      case 5:
    	  String [] p=addressBook.sortbyname(); 
    	  Utility.bubble_sort(p);
    	  askUser();
    	  break;
      case 6:
    	  String [] k=addressBook.sortbyzip();
  	      Utility.bubble_sort(k);
  	      askUser();
    	  break;
      case 7:System.exit(0);
      break;	 
      default:
          break;
      }
   }
}
