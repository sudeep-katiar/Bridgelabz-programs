package com.bridgelabz_programs.dataStructure;
/*
 * Write a program Calendar.java that takes the month and year as command-line arguments and 
 * prints the Calendar of the month. Store the Calendar in an 2D Array, 
 * the first dimension the week of the month and 
 * the second dimension stores the day of the week.
 */
public class Calender {
public static void main(String[] args) {
		
		UtilityDS util = new UtilityDS();
		System.out.println("Enter month and year");
		int month = util.inputInteger();
		int year = util.inputInteger();
		util.calender(month,year);
		
	}

}
