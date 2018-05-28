package com.bridgelabz.FunctionalProgram;

import java.util.Random;

import com.bridgelabz.Utility.Utility;

/**********************************************************************************************************
* @author Ankita Kalgutkar
*
* 18-May-2018
*purpose: Given N distinct Coupon Numbers,how many random numbers do you need to generate distinct coupon number
*/
public class CouponNumber 
{
	public static void main(String[] args) 
	{	Utility u=new Utility();
		int n=u.getInteger();
		int a=0;
		int count=0;
		while(a<n)
		{
			char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
			int max=1000000;
			StringBuffer sb=new StringBuffer();
			int random=(int)(Math.random()*max);
			while (random>0)
			{
				sb.append(chars[random % chars.length]);
				random /= chars.length;
				count++;
			}	
			String couponCode=sb.toString();
			a++;
			System.out.println("Coupon Code: "+couponCode);	
			}
			System.out.println("total random number needed  to  have all distinct numbers"+count);
		}
	}
