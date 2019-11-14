package com.bridgelabz.Power;
import java.util.*;

//This program takes a command-line argument N and 
//prints a table of the powers of 2 that are less than or equal to 2^N.
public class Pow {
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a value between 0 to 31");
		int n=scn.nextInt();
		if(0<=n && n<31)
		{
			for(int i=0;i<n+1;i++)
			{
			System.out.println("2 to the power "+i+" is"+Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("not inside given range");
		}
	}
}