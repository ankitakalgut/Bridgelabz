package com.bridgelabz.ObjectOriented;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/********************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 2-Jun-2018
 * 
 * Purpose:Create a JSON file having Inventory Details for Rice,Pulses and Wheats with properties name, weight,price   per   kg.  
   Create the JSON from Inventory bject and output the JSON String 
 *********************************************************************************************************/
public class InventoryData
{
  static int sumRice=0;
  static int sumTotalRice=0;
  static int sumWheat=0;
  static int sumTotalWheat=0;
  static int sumPulses=0;
  static int sumTotalPulses=0;
  
  public static void main(String[] args) throws ParseException
  {	
	  JSONParser parser=new JSONParser();
	  try {
			Object obj = parser.parse(new FileReader("/home/bridgelabz/InventoryDetails.json"));
			JSONObject object=(JSONObject)obj;
			JSONArray rice = (JSONArray)object.get("Rice");
			for (int i = 0; i < rice.size(); i++) 
			{
				JSONObject objrice = (JSONObject) (rice.get(i));
				sumRice += (Integer.parseInt(objrice.get("weight").toString()))
						* (Integer.parseInt(objrice.get("price").toString()));
				sumTotalRice += (Integer.parseInt(objrice.get("weight").toString()));
			}
			System.out.println(rice);
			System.out.println("Total weight of all Rice: "+sumRice);
			System.out.println("Total sumof all Rice: "+sumTotalRice);
			System.out.println();
				
			JSONArray wheat = (JSONArray) object.get("Wheat");
			for (int i = 0; i < wheat.size(); i++) 
			{
				JSONObject objwheat = (JSONObject) (wheat.get(i));
				sumWheat += (Integer.parseInt(objwheat.get("weight").toString()))
					     * (Integer.parseInt(objwheat.get("price").toString()));
				sumTotalWheat += (Integer.parseInt(objwheat.get("weight").toString()));
			}
			System.out.println(wheat);
			System.out.println("Total weight of all Wheat: "+sumWheat);
			System.out.println("Total sum of all Wheat: "+sumTotalWheat);
			System.out.println();
			
			JSONArray pulses = (JSONArray) object.get("Pulses");	
			for (int i = 0; i < pulses.size(); i++) 
			{
				JSONObject objpulse = (JSONObject) (pulses.get(i));
				sumPulses += (Integer.parseInt(objpulse.get("weight").toString()))
						  * (Integer.parseInt(objpulse.get("price").toString()));
				sumTotalPulses += (Integer.parseInt(objpulse.get("weight").toString()));
			}
			System.out.println(pulses);
			System.out.println("Total weight of all Pulses: "+sumPulses);
			System.out.println("Total sum of all Pulse: "+sumTotalPulses);
			int Total_Inventory=sumTotalRice+sumTotalWheat+	sumTotalPulses;
			System.out.println();
			System.out.println("the total inventory is :"+Total_Inventory);
	  } 
	   catch (IOException | org.json.simple.parser.ParseException e) 
	   {
				e.printStackTrace();
	   }
   }
  
}
	 
