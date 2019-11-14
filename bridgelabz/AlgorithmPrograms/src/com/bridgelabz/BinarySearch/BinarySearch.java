package com.bridgelabz.BinarySearch;
import java.util.Scanner;
import java.util.Arrays;
//binary search of given words
public class BinarySearch {
	public static void main(String[]args)
	{
		   Scanner scn = new Scanner(System.in);
		   System.out.println("Enter number of words you wish to input: ");
		   int n=scn.nextInt();
		   String[] words= new String[n];
		   
		   System.out.println("Enter the words");
		   for (int i = 0; i <words.length; i++)
		   {
		       System.out.print("WORD " + (i+1)  + ": ");
		       words[i] = scn.next();
		   }
		   	//to sory the words using bubble sort
		  for(int j=0;j<words.length;j++) {
			   for(int k=0;k<words.length-1-j;k++) {
				   if(words[j].compareTo(words[j+1])>0) {
					   String temp = words[j];
					   words[j] = words[j+1];
					   words[j+1] = temp;
				   }
			   }
		   }
		  //to print the words serially
		   for(int m=0;m<words.length;m++) {
			   System.out.print(words[m]+" ");
		   }

		   System.out.println("enter the word you want to search for");
		   String word=scn.next();
		   //Arrays.sort(words);
		   //int index= Arrays.binarySearch(words,word);
		   int li=0, hi=n-1, mi=0;
		   
		   //for searching the word from the given words
		   while(li<=hi)
		   {
			   mi=(li+hi)/2;
			   if(words[mi].equals(word))
			   {
				   System.out.println(word+ " is word no.="+ (mi+1));
				   break;
			   }
			   else if((words[mi].compareTo(word))<0)
			   {
				   li=mi+1;
			   }
			   else {
				   hi=mi;
			   }
		   }
		   System.out.println(word+ " is word no.="+ (mi+1));
	}
}
