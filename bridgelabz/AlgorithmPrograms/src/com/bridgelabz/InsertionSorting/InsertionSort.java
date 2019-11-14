package com.bridgelabz.InsertionSorting;
import java.util.Scanner;
//insertion sorting
public class InsertionSort {
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no. of string");
		int n=scn.nextInt();
		String[] arr=new String[n];
		String item;
		int j;
		
		for(int i=0; i<n; i++)
		{
			System.out.print("enter the array element: ");
			arr[i]= scn.next();
		}
		for(int i=0; i<arr.length; i++)
		{
			item=arr[i];
			j=1;
		while(j>0 && arr[j-1].compareTo(item)>0)
		{
			arr[j]=arr[j-1];
			j=j-1;
		}
			arr[j]=item;
		}
		System.out.println("After Sorting: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
