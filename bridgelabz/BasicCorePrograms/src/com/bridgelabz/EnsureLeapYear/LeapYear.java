package com.bridgelabz.EnsureLeapYear;

import java.util.Scanner;//importing Scanner class
/*Java program to check 
for a leap year*/
public class LeapYear {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        String n=String.valueOf(year);
        int flag = 0;
        //the length must be of 4 digits.
        if(n.length()==4)
        {
        	 // If a year is multiple of 400,  
            // then it is a leap year
        if(year % 400 == 0)
        {
            flag = 1;
        }
     // Else If a year is multiple of 100, 
        // then it is not a leap year
        else if (year % 100 == 0)
        {
            flag = 0;
        }
     // Else If a year is multiple of 4, 
        // then it is a leap year
        else if(year % 4 == 0)
        {
            flag = 1;
        }
        else
        {
            flag = 0;
        }
        //if flag value is 1 then leap year
        //if flag value is 0 then not a leap year
        if(flag==1)
        {
            System.out.println(year+" is a Leap Year");
        }
        else
        {
            System.out.println(year+" is not a Leap Year");
        }
        }
        //else wrong input
      else
        {
        	System.out.println("wrong input");
        }
	}

}
