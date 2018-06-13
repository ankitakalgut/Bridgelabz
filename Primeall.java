package com.bridgelabz.DataStructurePrograms;
import java.util.Arrays;

public class Primeall 
{
	    public static void twoDprime() 
	    {
	        int[][] array = new int[10][25];
	        int low = 0;
	        int high = 100;
	        while (high < 1000) {
	            for (int row = 0; row < 10; row++) {
	                PrimeLinked<Integer> linkedList = findPrime(low, high);
	                int count = 0;
	                for (int i = 0; i < linkedList.getCount(); i++) {
	                    array[row][count] = linkedList.getNth(i);
	                    count++;
	                }
	                low = low + 100;
	                high = high + 100;
	            }
	        }
	        // printing array
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 22; j++) {
	                if (array[i][j] == 0) {
	                    continue;
	                }
	                System.out.print(array[i][j] + "\t");

	            }
	            System.out.println();
	        }
	   }
	    //to find prime numbers
	    public static PrimeLinked<Integer> findPrime(int low,int high){
	        PrimeLinked<Integer> linkedList = new PrimeLinked<Integer>();
	        for (int num = low; num <= high; num++) {
	            int count = 0;
	            for (int i = 2; i <= num; i++) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            if (count == 1) {
	                linkedList.add(num);
	            }
	        }
	        return linkedList;
	         }
	    public static void primeAnagrams() {
	        int[][] array = new int[10][100];
	        int[][] nonAnagram = new int[10][100];
	        PrimeLinked<Integer> linkedList = new PrimeLinked<>();
	        PrimeLinked<Integer> linkedList1 = new PrimeLinked<>();
	        int low = 0;
	        int high = 100;

	        while (high < 1000) {
	            for (int row = 0; row < 10; row++) {
	                linkedList = findPrime(low, high);
	                linkedList1 = isAnagramRange(linkedList);
	                int count = 0;
	                int count1 = 0;

	                // stores anagram in the prime range into array[]
	                for (int i = 0; i < linkedList1.getCount(); i++) {
	                    array[row][count] = linkedList1.getNth(i);
	                    count++;
	                }

	                // compares anagram list and prime list to remove common terms from primelist
	                for (int i = 0; i < linkedList.getCount(); i++) {
	                    for (int j = 0; j < linkedList1.getCount(); j++)
	                        if (linkedList.getNth(i) == linkedList1.getNth(j)) {
	                            linkedList.remove(linkedList.getNth(i));
	                        }
	                }
	                // stores modified list that contains non anagrams into non-anagram[]
	                for (int i = 0; i < linkedList.getCount(); i++) {
	                    nonAnagram[row][count1] = linkedList.getNth(i);
	                    count1++;
	                }
	                low = low + 100;
	                high = high + 100;
	            }
	            System.out.println();
	        }
	        System.out.println("---------------------------------");
	        System.out.println("2D ANAGRAM ARRAY");
	        // printing anagram array
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 100; j++) {
	                if (array[i][j] == 0) {
	                    continue;
	                }
	                System.out.print(array[i][j] + "\t");

	            }
	            System.out.println();
	        }
	        System.out.println("---------------------------------");
	        System.out.println("2D NON  ANAGRAM ARRAY");
	        // print non-anagram array
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 100; j++) {
	                if (nonAnagram[i][j] == 0) {
	                    continue;
	                }
	                System.out.print(nonAnagram[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	     public static PrimeLinked<Integer> isAnagramRange(PrimeLinked<Integer> linkedList) {
	    	 PrimeLinked<Integer> linkedList2 = new PrimeLinked<Integer>();
	        for (int i = 0; i < linkedList.getCount() - 1; i++) {
	            for (int j = i + 1; j < linkedList.getCount(); j++) {
	                String s1 = Integer.toString(linkedList.getNth(i));
	                String s2 = Integer.toString(linkedList.getNth(j));

	                if (anag(s1, s2)) {
	                    linkedList2.add(linkedList.getNth(i));
	                    linkedList2.add(linkedList.getNth(j));
	                }
	            }
	        }
	        return linkedList2;
	    }
	     public static boolean anag(String s1,String s2)
	 	{	
	 		
	 		char ch1[]=s1.toCharArray();
	 	    char ch2[]=s2.toCharArray();
	 		Arrays.sort(ch1);//sort string1 
	 		Arrays.sort(ch2);//sort string2
	 		boolean res=Arrays.equals(ch1,ch2);
	 		if(res)
	 		{
	 			return true;
	 		}
	 		else
	 		return false;
	 	}
	     public static void main(String[] args) {
	         System.out.println(" prime numbers in two D array");
	            twoDprime();
	            primeAnagrams();
	     }
}
