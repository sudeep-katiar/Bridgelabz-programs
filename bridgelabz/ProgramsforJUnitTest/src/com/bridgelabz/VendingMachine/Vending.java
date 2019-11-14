package com.bridgelabz.VendingMachine;
import java.util.Scanner;

//fewest notes for the vending machine.
public class Vending {
	//initialization of static variables
	static int note[]= {1000,500,100,50,10,5,2,1};
	static int rem;
	static int change;
	static int n;
	static int i=0;
	static int total=0;
	
	//start of main method
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the amount: Rs");
		n=scn.nextInt();
		Vending.solve(n, note);
		System.out.println("total no. ofchange "+total);
	}

	//start of solve method
	public static int solve(int n, int note[])
	{
		if(n<=0)		//when no money needed to be returned
		{
			System.out.println("No more money needed to be returned");
			return 0;
		}
		else		//logic for money returning in vending machine
			{
				if(n>=note[i])
				{
					change=n/note[i];
					rem=n%note[i];
					n=rem;
					total+=change;
					System.out.println("No. of Rs"+note[i]+" to be returned is "+change);
				}
				i++;
				return solve(n, note);
			}
	}
	
}