package com.bridgelabz.ObjectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

/************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *Purpose: Write a program to read in Stock Names, Number of Share, Share Price.
 *Print a Stock Report with total value of each Stock and the total value of Stock. 
 *
 *************************************************************************************************/
public class StockReport
{
	static Utility u=new Utility();
	static int sumofStock = 0;
	static int totalStock = 0;

	public static void main(String[] args)throws JsonGenerationException, JsonMappingException, IOException, ParseException 
	{
		StockPortfolio folio = new StockPortfolio();
		ObjectMapper map = new ObjectMapper();
		System.out.println("Enter number of stock");
		int number = u.getInteger();
		Stock stocknew = new Stock();
		for (int i = 0; i < number; i++) 
		{
			stocknew = askUser();
			folio.getStockList().add(stocknew);
		}
		map.writeValue(new File("/home/bridgelabz/stock.jason"),folio);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("/home/bridgelabz/stock.jason"));
		JSONObject jsonObject = (JSONObject) obj;
		System.out.println(jsonObject);
		JSONArray array = (JSONArray) jsonObject.get("stockList");
		for (int i = 0; i < array.size(); i++)
		{
			JSONObject obstock = (JSONObject) (array.get(i));
			sumofStock += ((long) obstock.get("stockNumber")) * ((long) obstock.get("stockPrice"));
			totalStock += (long) obstock.get("stockNumber");
		}
		System.out.println(sumofStock);
		System.out.println(totalStock);
	}
	  	    public static Stock askUser()
	  	    {  	
	  	        Stock stock=new Stock(); 	     
	  	    	System.out.println(" Enter the stock name ");
	  	    	String stockname=u.getString();
	  	    	stock.setStockName(stockname);    	
	  	    	System.out.println(" Enter the number of share ");
	  	    	int noOfShare=u.getInteger();
	  	    	stock.setStockNumber(noOfShare);
	  	    	System.out.println(" Enter the share price ");
	  	    	int  sharePrice=u.getInteger();
	  	    	stock.setStockPrice(sharePrice);
				return stock;	 	    	
	  	    }  	 	  	    	    	
}

	    
	       
	       
	      
	       
	        
	    
		



