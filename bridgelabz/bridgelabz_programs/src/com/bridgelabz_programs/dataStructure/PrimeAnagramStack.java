package com.bridgelabz_programs.dataStructure;
/*
 * Add the Prime Numbers that are Anagram in the Range of 0 - 1000 
 * in a Stack using the Linked List and Print the Anagrams in the Reverse Order. 
 * Note no Collection Library can be used.
 */
public class PrimeAnagramStack {
	public static void main(String[] args) {
		UtilityDS utility = new UtilityDS();
		Stack<String> myStack = new Stack<>();
		String[] primeNumbers = utility.prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				if (utility.anagram(primeNumbers[i], primeNumbers[j])) {
					myStack.push(primeNumbers[i]);
					myStack.push(primeNumbers[j]);
				}
			}
		}
		
		String numbers = myStack.display();
		System.out.println("Anagrams in Reverse Ordeer :");
		for(int i=numbers.length()-1;i>0;i--) {
			System.out.print(numbers.charAt(i));
		}
	}

}
