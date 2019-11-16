package com.bridgelabz_programs.dataStructure;

public class PrimeAnagram {
public static void main(String[] args) {
		
		UtilityDS utility = new UtilityDS();
		//	prime numbers array between 0 and 1000
		String[] primeNumbers = utility.prime2DArr();
		
		System.out.println("Anagram and prime numbers are:");
		//	prints prime numbers that are anagrams
		for(int i = 0; i < primeNumbers.length; i++) {
			for(int j = i + 1; j < primeNumbers.length; j++) {
				if(utility.anagram(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}
	}

}
