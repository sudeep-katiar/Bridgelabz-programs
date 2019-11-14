package com.bridgelabz.PrimeNumbers;
//to find prime numbers from 1 to 1000
public class Prime {
	public static void main(String[]args)
	{
		int first=0, last=1000;
		for(int i=2;i<=last;i++)
		{
			int flag=1;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.print(i+" ");
		}
	}

}
