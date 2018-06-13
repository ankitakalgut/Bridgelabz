package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Utility.Utility;

/******************************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *
 *purpose:  Create a Program  which creates Banking Cash Counter where people come in to   deposit Cash a
 			and  withdraw  Cash.  Have  an   input   panel   to   add   people to Queue to  either  deposit 
 			or  withdraw  money  and  dequeue   the   people. Maintain the Cash  Balance. 
 ******************************************************************************************************************/
public class CashCounter
{
	public static void main(String args[])
	{ 
		Utility u=new Utility();
		CashCounterLogic q=new CashCounterLogic();
		int ch = 0;
		do
		{ 
		   	System.out.println("Enter 1 to Deposit");
		   	System.out.println("Enter 2 for Withdraw");
		   	System.out.println("Enter 3 for Number of people in the Queue ");
		   	System.out.println("Enter 4 Exit");
		   	System.out.println("Enter your choice: ");
		   	int choice=u.getInteger();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		q.insert(u.getInteger()); 
			   		q.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					int withdrawAmt=u.getInteger();
			   		q.remove();
			   		System.out.println(" Your Available Balance is: "); 
			   		q.display();
			   		break;
			case 3:
					int j=q.getSize();
					System.out.println("The Number of People in Queue is: "+j);			
		   	case 4:
			   		System.exit(0);
		   	default: 
			   		System.out.println("Enter a valid choice");
			   		break;
		   	}
	   	}
		while(ch<5);
	}		
} 

