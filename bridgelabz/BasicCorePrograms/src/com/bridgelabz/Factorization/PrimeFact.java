package com.bridgelabz.Factorization;
import java.util.Scanner;
import java.lang.Math;//importing math class
/*computes the prime factorization
 * of given number using brute force
 */
public class PrimeFact {
	public static void main(String[]args)
	{
		System.out.println("Enter a number: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		//
		while(n%2==0)
        { 
            System.out.print(2 +" ");
            n=n/2;
        }
		for(int i=3; i*i<=n; i+=2)
        {
            while (n%i==0)
            { 
                System.out.print(i + " ");
                n /= i;
            }
        }
		if(n > 2)
            System.out.print(n);
    }
}
