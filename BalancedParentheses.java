package com.bridgelabz.DataStructurePrograms;
import com.bridgelabz.Utility.Utility;

public class BalancedParentheses
{  	
	public static void main(String[] args) 
	{  
		Utility u=new Utility();
		System.out.println("Enter the expression: ");
		String ex = u.getString();        
	    int len = ex.length();
	    StackLogic stack = new StackLogic(len);
		System.out.println("Match and Mismatch: ");
		for (int i = 0; i <len; i++)
		{    
			char ch = ex.charAt(i);
			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop()+1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
			while (!stack.isEmpty() )
			{    
				System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
			}                          
    }
}

