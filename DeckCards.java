package com.bridgelabz.ObjectOriented;

/*******************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 *
 *Purpose:initialize deck of cards having suit ("Clubs","Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5",   
 *		  "6","7","8", "9", "10", "Jack",   "Queen",   "King",   "Ace").   Shuffle   the   cards   using   Random   method  
 *		   and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players  
		   using 2D Array..
 ********************************************************************************************************/
public class DeckCards
{
	static String[] SUIT = { "club", "diamond", "heart", "spades" };
	static String[] RANK = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
	static String[][] deck = new String[SUIT.length][RANK.length];
	public static String[][] shuffleCards(String[][] deck, int suitsize,int ranksize) 
	{
		for (int i = 0; i < suitsize; i++) 
		{
			for(int j=0;j<ranksize;j++) 
			{
			 int random=(int) (Math.random()*suitsize);
			 int random1=(int) (Math.random()*ranksize);
			String temp = deck[random][random1];
			deck[random][random1] = deck[i][j];
			deck[i][j] = temp;

		   }
		}
				return deck;
	}
	public static void printCards(String[][] deck) 
	{
		for (int i = 0; i < 4; i++) 
		{
			System.out.println("** Person " + (i + 1) + " **");
			for (int j = 0; j < 9; j++) 
			{
				System.out.print(deck[i][j]+"\t");
			}
			System.out.println();
		}
    }
	
	public static String[][] cardInitialize(String[][] deck, String[] RANK, String[] SUIT) 
	{
		for (int i = 0; i < SUIT.length; i++) 
		{
			for (int j = 0; j < RANK.length; j++) 
			{
				deck[i][j]= SUIT[i]+"-"+RANK[j]+"  ";
			}

		}
		return deck;
	}

		public static void main(String[] args) 
		{
			deck = cardInitialize(deck, RANK, SUIT);
			deck = shuffleCards(deck, SUIT.length, RANK.length);
			printCards(deck);
		}
	}

