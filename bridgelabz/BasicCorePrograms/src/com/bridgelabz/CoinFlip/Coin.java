package com.bridgelabz.CoinFlip;
import java.util.Scanner;//importing Scanner class
/*
   Coin tossing class to simulate the flip of a coin 
   with two sides; Heads and Tails.*/
public class Coin {
	
		public static void main(String[]args) {
			System.out.println("enter the no. of times to flip the coin"); 
			int count=0, counth=0,countt=0; //Initialization.
			Scanner flip=new Scanner(System.in); //Creating Object for Scanner class.
			int num=flip.nextInt();
			//checking for the no. of flips greater than zero or not
			if(num>0)
			{
			while(count<=num)
			{
				//probability for head or tail.
				if(Math.random()<0.5)
				{
					countt+=1;
				}
				else
				{
					counth+=1;
				}
				count+=1;
			}
			double t=((double)countt/num)*100;
			double h=((double)counth/num)*100;
			//Percentage for head and tail.
			System.out.println("Heads flip percentage= "+h+"%");
			System.out.println("Tails flip percentage= "+t+"%");
			}
			else
			{
				System.out.println("invalid data entered");
			}
		}

	}