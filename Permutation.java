package com.bridgelabz.FunctionalProgram;

import com.bridgelabz.Utility.Utility;
/**
 * @author Ankita Kalgutkar
 *
 * 19-May-2018
purpose: Recursive function to generate all permutations of a String
 */
class Permutation
{
    private static void permutation(char[] ch, int currentIndex)
    {
        if (currentIndex == ch.length - 1) 
        {
            System.out.println(String.valueOf(ch));
        }
        for (int i = currentIndex; i < ch.length; i++)
        {
            Utility.swap(ch, currentIndex, i);
            permutation(ch, currentIndex + 1);
            Utility.swap(ch, currentIndex, i);
        }
    }
    // To generate permutation of all String
    public static void main(String[] args)
    {
       Utility test=new Utility();
       String s=test.getString();
       permutation(s.toCharArray(), 0);
    }
}