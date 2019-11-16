package com.bridgelabz_programs.dataStructure;
import java.util.Scanner;
public class PalindromeChecker {
	public static void main(String[] args) {
		Deque<Character> d= new Deque<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word=sc.nextLine();
		char wordarr[]=word.toCharArray();
		String str = "";
		for(int i=0;i<wordarr.length;i++)
		{
			d.addFront(wordarr[i]);
		}
		//d.display();
		/*int flag=0;
		d.size();
		while(d.size()>1)
		{
			Deque<Character>.Node<Character> front=d.removeFront();
			//<Character>.Node<Character> rear=d.removeRear();
			
			if(front!=rear)
			{
				flag=0;
			}
			if(flag==1)
			{
				System.out.println("the word is palindrome");
			}
			else
			{
				System.out.println("the word is not palindrome");
			}
		}*/
		for(int i=0;i<wordarr.length;i++)
		{
			str+=d.removeFront();
		}
		if(word.equals(str)) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String is not Pallindrome");
		}
	}
}
