package com.bridgelabz.FunctionalProgram;

import java.io.PrintWriter;

import com.bridgelabz.Utility.Utility;
/**
 * @author Ankita Kalgutkar
 *purpose:
 * 18-May-2018
 */
public class Array2D 
{	
	public static void main(String[] args)
	{
		Utility test=new Utility(); 
		System.out.println();	    
		System.out.println("Enter the number of rows: ");
		int m = test.getInteger();
		System.out.println("Enter the number of cols: ");
		int n = test.getInteger(); 
		int [][] a  =arrayInt(m,n);
		double [][] b  =arrayDouble(m,n);
		String [][] c  =arrayBoolean(m,n);	        
		display(a,b,c,m,n);		        
	}
	public static int[][] arrayInt(int m,int n)
	{
		int a[][]=new int[m][n];
		Utility test=new Utility();    
		System.out.println();
		System.out.println("Integer Array");
		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				a[i][j] = test.getInteger();
			}   
		}
		return a;
	}	
	public static double[][] arrayDouble(int m,int n)
	{
		double b[][]=new double[m][n];
		Utility u=new Utility();    
		System.out.println();
		System.out.println("Double Array");
		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				b[i][j] = u.getDouble();
			}   
		}
		return b;
	}
	public static String[][] arrayBoolean(int m,int n)
	{
		String c[][]=new String[m][n];
		Utility u=new Utility();    
		System.out.println();
		System.out.println("Boolean Array");
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
				{
					c[i][j] = u.getString();
				}   
			}
		return c;
		}
	//display method
	public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		System.out.println();
		pw.println("2D ARRAY INTEGER");
		
		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
	        {
				pw.print("\t"+a[i][j]+" ");
	        } 
	     pw.println("\t");
	    }
		//display double array
		System.out.println();
		pw.println("2D ARRAY DOUBLE");
			
		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
		    {
				pw.print("\t"+b[i][j]+" ");
		    } 
		pw.println("\t");
		}		 
		//display boolean array
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");
				
		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				pw.print("\t"+c[i][j]+" ");
			} 
		pw.println("\t");
		}
	}
}