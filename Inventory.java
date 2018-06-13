package com.bridgelabz.ObjectOriented;

import java.util.ArrayList;

public class Inventory 
{
	ArrayList<Product> riceList = new ArrayList<Product>();
	ArrayList<Product> wheatList = new ArrayList<Product>();
	ArrayList<Product> pulsesList = new ArrayList<Product>();
		
	public ArrayList<Product> getRiceList()
	{
		return riceList;
	}
		
	public void setRiceList(ArrayList<Product> riceList)
	{
		this.riceList = riceList;
	}
		
	public ArrayList<Product> getWheatList() 
	{
		return wheatList;
	}
		
	public void setWheatList(ArrayList<Product> wheatList) 
	{
		this.wheatList = wheatList;
	}
		
	public ArrayList<Product> getPulsesList() 
	{
		return pulsesList;
	}
		
	public void setPulsesList(ArrayList<Product> pulsesList) 
	{
		this.pulsesList = pulsesList;
	}
}


