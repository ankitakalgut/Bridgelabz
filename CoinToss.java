package com.bridgelabz.FunctionalProgram;
import java.util.Random;
import com.bridgelabz.Utility.Utility;
	/**
	 * @author Ankita Kalgutkar
	 *
	 * 18-May-2018
	 purpose:Flip pin and print percentage of Heads and Tails  
	 **/
public class CoinToss
{
		public  enum Coin{Heads,Tails};
		public void Flip ()
		{
			Random randomNum = new Random();
			int result;
			result = randomNum.nextInt(2);
				if(result == 0)
				{
				   System.out.println("You flipped Heads!");
				}
				else
				{
				   System.out.println("You flipped Tails!");
				}
		}
		public static void main(String[] args) 
		{
			CoinToss test = new CoinToss();
			int choice;	   
			System.out.println("Welcome to the coin flip game!");
			do
			{
				System.out.println("Enter '1' to Flip Coin or Enter '0' to Quit: ");
				Utility u=new Utility();
				choice = u.getInteger();
				if (choice == 1)
				{
					test.Flip();
				}
				else if (choice > 1)
				{
					System.out.println("Invalid entry - please enter 1 or 0: ");
					choice = u.getInteger();
				}
			}
		while (choice != 0);
		}
}


