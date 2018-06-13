package com.bridgelabz.DataStructurePrograms;
import com.bridgelabz.Utility.Utility;

class BinarySearchtree
{
	public static void main(String[] args) 
	{
	        Utility u = new Utility();
	        System.out.println("enter node");
	        int node = u.getInteger();
	        System.out.println("no of binary trees possible are:");
	        int trees = (int) Math.pow(2, node) - node;
	        System.out.println(trees);
	}
}