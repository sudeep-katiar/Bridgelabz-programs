package com.bridgelabz_programs.dataStructure;
/*
 * Add the Prime Numbers that are Anagram in the Range of 0 - 1000 
 * in a Queue using the Linked List and Print the Anagrams from the Queue. 
 * Note no Collection Library can be used.
 */
public class PrimeAnagramQueue {
	public static void main(String[] args)
	{
		UtilityDS utility = new UtilityDS();
		QueueLL<String> queue = new QueueLL<String>();
		String[] primeNumbers = utility.prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++)
		{
			for (int j = i + 1; j < primeNumbers.length; j++)
			{
				if (utility.anagram(primeNumbers[i], primeNumbers[j]))
				{
					queue.enqueue(primeNumbers[i]);
					queue.enqueue(primeNumbers[j]);
				}
			}
		}
		queue.display();
	}
}

