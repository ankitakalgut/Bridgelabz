package com.bridgelabz.FunctionalProgram;
	import com.bridgelabz.Utility.Utility;

	public class SumOfThree
	{
		public static int findDistinctTriplets(int b[],int length)//method 1
		{
			System.out.println();
			int i,j,k,count=0;
			for(i=0;i<length;i++)
			{
				for(j=i+1;j<length;j++)
				{
					for(k=j+1;k<length;k++)
					{
						// printing distinct triples 
						if (b[i] + b[j] + b[k] == 0)
						{
							System.out.println(b[i] + " " + b[j] + " " + b[k]);
							count++;
						}
					}
				}
			}
			// return number of distinct triplets 
			return count;
		}
		
		public static void main(String[] args)
		{
			Utility u1=new Utility();
			System.out.println();
			//enter the array size
			System.out.print("Enter Size of Array :");
			int size=u1.getInteger();
			int arr[]=new int [size];//create array & read values one by one
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("Enter "+(i+1)+" Value :");
				arr[i]=u1.getInteger();
			}
			SumOfThree t1=new SumOfThree();
			int sum=t1.findDistinctTriplets(arr,size);//pass the arguments to method 1
			System.out.println("No.of Tripltes :"+sum);
			System.out.println();
		}
	}

