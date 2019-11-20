package com.bridgelabz_programs.dataStructure;

import java.io.*;
import java.util.*;
//collection of item where each item holds a relative position with respect to the others
public class UnOrderedList {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		LinkedList<String> list = new LinkedList<String>();
		FileReader fr = new FileReader("/home/admin1/bridgelabz/FileIO/abc1.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		String s ="";
		String[] array;
		//to read from the file
		while ((str = br.readLine()) != null) {
			// System.out.print(str+" ");
			s += str;
		}
		//System.out.println(s);
		// list.display();

		array = s.split("");
		//to add the items to the array
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		list.display();
		
		System.out.println();
		System.out.println("enter the word you want to search from the list");
		Scanner scan=new Scanner(System.in); 
		String s1=scan.nextLine();
		list.search(s1);
		System.out.println(s1);
		boolean bool=list.search(s1);
		
		if(bool)
		{
			list.remove(s1);
		}
		else
		{
			list.add(s1);
		}
		
		list.display();
//		
//		BufferedWriter writer = new BufferedWriter(new FileWriter("/home/admin1/bridgelabz/FileIO/abc1.txt")); 
//		writer.write(s+" ");
//		writer.close();
//		 
	}
}
