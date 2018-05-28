package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;
/*********************************************************************************************************
* @author Ankita Kalgutkar
*
* 18-May-2018	
* purpose:*  Simulates a gambler who  start  with $stake and place fair $1  bets  until he/she goes broke(i.e. has no money)  
  or reach $goal. Keeps track of the number   of times he/she wins   and   the   number   of   bets   he/she   makes.   Run  
  the experiment N times,averages the results, and prints them out.
*
*******************************************************************************************************/
	public class Gambler 
	{
		public static void main(String[] args) 
		{	
			Utility u=new Utility();
			System.out.println("Enter Stake value: ");
			int $Stake=u.getInteger();
			System.out.println("Enter Goal value: ");
			int $Goal=u.getInteger();
			System.out.println("Enter number of times: ");
			int noOfTimes=u.getInteger();
			int bets = 0;     
			int wins = 0;       
			// repeat number of times
			for (int i=0; i< noOfTimes; i++) 
			{
				int cash = $Stake;
		            
				while (cash > 0 && cash < $Goal)
				{
					bets++;
		        
					if (Math.random() < 0.5) 
						cash++;   
					else                     
						cash--;     
				}
		            if (cash == $Goal) 
		            	wins++;     // to find no. of wins   
			}
			System.out.println();
			System.out.println(wins + "wins of" + noOfTimes);
			System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
			System.out.println("Avg  bets= " + 1.0 * bets / noOfTimes);
		}
	}

