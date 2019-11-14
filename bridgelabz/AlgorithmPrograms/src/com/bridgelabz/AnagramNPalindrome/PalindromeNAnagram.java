package com.bridgelabz.AnagramNPalindrome;
//to find the palindrome and anagram of the prime numbers from 1 to 1000
public class PalindromeNAnagram {
	public static void main(String[]args)
	{
		prime(1000);
		
	}
		//find prime numbers from 1 to 1000
	public static void prime(int last)
		{
			int i;
			for(i=2;i<=last;i++)
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
				{
					palindrome(i);
				}
			}
		}
	//to find the palindrome
	public static void palindrome(int n)
	{
		int remainder, reversedint=0, originalint;
		originalint=n;
		while(n!=0)
		{
			remainder=n%10;
			reversedint=reversedint*10+remainder;
			n=n/10;
		}
		if(originalint==reversedint)
		{
			System.out.print(originalint+" ");
		}
	}
}
