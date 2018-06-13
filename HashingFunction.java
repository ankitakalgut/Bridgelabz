package com.bridgelabz.DataStructurePrograms;

import com.bridgelabz.Utility.Utility;

/**********************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 18-May-2018
 * 
 *purpose:Create a Slot of 10 to store Chain of Numbers that belong to each Slot to 
		  efficiently search  a  number from  a given set of number 
 ************************************************************************************************************/
public class HashingFunction
{
  	Orderedlist[] order=new Orderedlist[11];
  	NodeUtility nu=new NodeUtility();
  	static int[] retArray;
  	public  HashingFunction()
  	{
		retArray = nu.integerFileReader();

		for(int i=0; i<retArray.length; i++)
		{
			int rem = retArray[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new Orderedlist();
				order[rem].addItem(retArray[i]);
			}
			else
			{
				order[rem].addItem(retArray[i]);
            }
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i);
			if(order[i] !=null)
			{
				order[i].display();
			}
		}
	}

    public static void main(String[] args)
    {
      	HashingFunction hs=new HashingFunction();
      	Utility u=new Utility();
      	int search=u.getInteger();
      	Utility.binarysearch(retArray,search,10);
      
    }
}