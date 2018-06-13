package com.bridgelabz.ObjectOriented;

import com.bridgelabz.DataStructurePrograms.MyLinkedList;

public class DeckCardsQueue 
   {
	static String[] SUIT= { "club", "diamond", "heart", "spades" };
	static String[] RANK = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
	static String[][] deck = new String[SUIT.length][RANK.length];

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		deck = DeckCards.cardInitialize(deck, RANK, SUIT);
		deck = DeckCards.shuffleCards(deck, SUIT.length, RANK.length);
		String[] player1 = new String[9];
		String[] player2 = new String[9];
		String[] player3 = new String[9];
		String[] player4 = new String[9];
		MyLinkedList queue1 = new MyLinkedList();
		MyLinkedList queue2 = new MyLinkedList();
		MyLinkedList queue3 = new MyLinkedList();
		MyLinkedList queue4 = new MyLinkedList();
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if (i == 0) 
				{
					player1[i] = SUIT[i]+"-"+RANK[j];
					queue1.add(deck[i][j]);
				
				}
				else if (i == 1) 
				{
					player2[i] = SUIT[i]+"-"+RANK[j];
					queue2.add(deck[i][j]);
					
				} else if (i == 2) 
				{
					player3[i] = SUIT[i]+"-"+RANK[j];
					queue3.add(deck[i][j]);
					
				} else if (i == 3) 
				{
					player4[i] = SUIT[i]+"-"+RANK[j];
					queue4.add(deck[i][j]);
				}
			}
		}
		queue1.list();
		System.out.println();
		queue2.list();
		System.out.println();
		queue3.list();
	    System.out.println();
		queue4.list();
   }
}


