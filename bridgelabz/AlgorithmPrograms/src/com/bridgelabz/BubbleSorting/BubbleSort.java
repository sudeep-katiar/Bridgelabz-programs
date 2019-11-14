package com.bridgelabz.BubbleSorting;
import java.util.Scanner;
//bubblesort
public class BubbleSort {
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no. of string");
		int n=scn.nextInt();
		String[] arr=new String[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("enter the array element: ");
			arr[i]= scn.next();
		}
		for(int j=0;j<arr.length;j++) {
			   for(int k=0;k<arr.length-1-j;k++) {
				   if(arr[j].compareTo(arr[j+1])>0) 
				   {
					   String temp = arr[j]; 
					   arr[j] = arr[j+1];
					   arr[j+1] = temp;
				   }
			   }
		   }
		for(int i=0; i<arr.length; i++)
		{
		System.out.print(arr[i]+" ");
		}
	}

}
