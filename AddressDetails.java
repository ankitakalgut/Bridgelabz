package com.bridgelabz.ObjectOriented;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.bridgelabz.Utility.Utility;

public class AddressDetails 
{
     String firstName;
     String lastName;
     String address;
     String city;
     String state;
     String zip;
     String phoneNumber;
     Utility u=new Utility();
    public  AddressDetails(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
    public String getfirstName(String firstName)
    {
    	return this.firstName;
    	
    }

	@SuppressWarnings("unchecked")
	public JSONObject toJsonObject() 
    {
        JSONObject jsonObject = new JSONObject();
       
        jsonObject.put("First Name", firstName);
        jsonObject.put("Last Name", lastName);
        jsonObject.put("Address", address);
        jsonObject.put("City", city);
        jsonObject.put("State", state);
        jsonObject.put("Zip", zip);
        jsonObject.put("Phone Number", phoneNumber);
        
		return jsonObject;
      }	
}


