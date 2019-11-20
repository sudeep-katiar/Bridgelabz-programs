package com.bridgelabz_programs.dataStructure;

import java.io.IOException;
/*
*Create a Slot of 10 to store Chain of Numbers that belong to each Slot 
*to efficiently search a number from a given set of number
**/
public class HashingFunction {
	public static void main(String[] args) throws IOException {
		HashMap<Integer> hash=new HashMap<Integer>();
		for (int i = 0; i <100; i++) {
			hash.add(i);
		}
		hash.display();
	}

}
