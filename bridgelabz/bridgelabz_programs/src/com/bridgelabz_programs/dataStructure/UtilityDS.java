package com.bridgelabz_programs.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UtilityDS {
	public static String[] prime2DArr()
	{
		int array[][] = new int [10][100];
		int prime[][] = new int [10][100];
		int temp = 1;
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				array [i][j] = temp;
				temp++;
			}
		}
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
//				System.out.print(array[i][j]+" ");
				if(checkingPrime(array[i][j]))
				{
					prime[i][j] = array[i][j];
				}
				else
				{
					prime[i][j]=0;
				}
			}
		}
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(prime[i][j]!=0)
				{
					System.out.print(prime [i][j]+" ");
				}
			}
			System.out.println();
		}
		return null;
	}

	private static boolean checkingPrime(int num) {

		int count=0;
		for (int i = 2; i <=num/2; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean anagram(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
				
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	
	Scanner scanner;
	Random random;
	
	static String message = "Hello <<name>>, We have your full name as <<full name>> in our system."
			+ "Your contact number is 91-XXXXXXXXXX. Please, let us know in case of any clarification."
			+ "Thank you BridgeLabz 01/01/2016.";
	
	public UtilityDS() {
		scanner = new Scanner(System.in);
		random = new Random();

	}

	/**
	 * Takes input with the user via Scanner for String
	 * 
	 * @return INPUT STRING
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for StringLine
	 * 
	 * @return INPUT STRING LINE
	 */
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for Integer
	 * 
	 * @return INPUT INTEGER
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Double
	 * 
	 * @return INPUT DOUBLE
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Boolean
	 * 
	 * @return INPUT BOOLEAN
	 */
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	/*
	 * Function to find power of 2
	 * @param type number
	 * 
	 * @return integer
	 * 
	 * */
	public int[] power(int n) {
		int[] array = new int[n+1];
		for(int i=0;i<=n;i++){
			//System.out.println("2 * "+i+" = "+ Math.pow(2,i));
			int value = (int)Math.pow(2, i);
			System.out.println(value);
			array[i] = value;
		}
		return array;
	}
	/*
	 * Function to compute 1/1 + 1/2 + 1/3 + ... + 1/N
	 * @param type number 
	 * 
	 * @return float
	 * 
	 * */
	
	public float harmonicNumber(int n) {
		float result = 0f;
		for(int i=1; i<=n; i++){
			//Calculating Nth Harmonic value
			result = result+(float)1/i;
		}
		return result;
	}
	/*String permutation*/
	public void permutation(String str,int i,int j)
	{
		if(i==j)
		{
			System.out.println(str);
		}
		else
		{
			for (int k = i; k <=j; k++)
			{
				str=swap(str,i,k);
				permutation(str, i+1, j);
			}
		}
	}
	public static String swap(String str,int i,int j)
	{
		char temp;
		char ch[]=str.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}
	
	/*
	 * @param data - Take integer type data
	 * @return - list of data
	 * 
	 * */
	public ArrayList<String> getGeneratedCoupon(int n) {
		int count = 0;
		String temp="";
		ArrayList<String> as = new ArrayList<>();
		while(count<n) {
			String alphaNumericCoupon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			StringBuilder sb = new StringBuilder();
			//String sb = "";
			Random random = new Random();
			
			for(int i=0;i<n;i++) {
				sb.append(alphaNumericCoupon.charAt(random.nextInt(alphaNumericCoupon.length())));
				//sb+= alphaNumericCoupon.charAt(random.nextInt(alphaNumericCoupon.length()));
			}
			count++;
			//System.out.println(sb);
			temp = sb.toString();
			as.add(temp);
		}
		
		return as;
	}
	/*
	 * function to perform binary search
	 * @param type string
	 * @return boolean
	 * 
	 * */
	public static boolean binarySearch(String[] arr,String name) {
		int max = arr.length-1;
		int low = 0;
		int mid = 0;
		
		while(low<=max) {
			mid = (low+max)/2;
			if(name.equals(arr[mid]))
				return true;
			if(name.compareTo(arr[mid])>0) {
				low = mid+1;
			}
			else
				max = mid-1;
		}
		return false;
	}
	
	/*
	 * function to perform bubble sort
	 * @param type string array
	 * @return string array
	 * 
	 * */
	public String[] bubbleSort(String[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	/*
	 * function to perform insertion sort
	 * @param type string array
	 * @return string array
	 * 
	 * */
	public String[] insertionSort(String[] arr) {
		String temp;
		int j;
		for(int i = 1;i<arr.length;i++) {
			temp = arr[i];
			j = i;
			
			while(j>0 && arr[j-1].compareTo(temp)>0) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
		return arr;
	}
	
	/*
	 * function to divide the array
	 * @param type array
	 * @return array
	 * 
	 * */
	public int[] mergeSort(int[] array) {
		if(array.length <=1)
			return array;
		
		int midPoint = array.length/2;
		int[] left = new int[midPoint];
		int[] right;
		
		if(array.length%2 == 0) {
			right = new int[midPoint];
		}
		else
			right = new int[midPoint+1];
		
		for(int i=0;i<midPoint;i++) {
			left[i] = array[i];
		}
		
		for(int i=0;i<right.length;i++) {
			right[i] = array[midPoint+i];
		}
		
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = merge(left,right);
		
		return result;
	}
	
	/*
	 * function to merge two array
	 * @param type array
	 * @return array
	 * 
	 * */
	private int[] merge(int[] left, int[] right) {
		
		int[] result = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length || j < right.length) {
			if (i < left.length && j < right.length) {
				if (left[i] < right[j]) {
					result[k] = left[i];
					k++;
					i++;
				} else {
					result[k] = right[j];
					k++;
					j++;
				}
			} else if (i < left.length) {
				result[k] = left[i];
				k++;
				i++;
			} else if (j < right.length) {
				result[k] = right[j];
				k++;
				j++;
			}
		}
		return result;
	}
	
	
	/**
	 * Prints calendar of a month taking month and year as input
	 * 
	 * @param month
	 * @param year
	 */
	public  void calender(int month, int year) {
		int year1; 
		int month1, x, day = 1, day1;
		year1 = year - (14 - month) / 12;
		x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
		month1 = month + 12 * ((14 - month) / 12) - 2;
		day1 = (day + x + (31 * month1) / 12) % 7;
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthDay = 0;
		for (int i = 0; i < monthDays.length; i++) {
			if (i == month - 1) {
				monthDay = monthDays[i];
			}
		}
		int[][] totalDays = new int[6][7];
		boolean leap = leapYear(year);
		if (leap && month == 1) {
			monthDay = 29;
		}
		int z = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalDays[i][j] = -1;
				} else if (z <= monthDay) {
					totalDays[i][j] = z;
					z++;
				} else {
					totalDays[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.print(monthName[i] + " " + year);
			}
		}
		System.out.println();
		String[] dayName = { "S", "M", "T", "W", "T", "F", "S" };
		for (int i = 0; i < 7; i++) {
			System.out.print(dayName[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (totalDays[i][j] != -1) {
					if (totalDays[i][j] < 10)
						System.out.print(totalDays[i][j] + "  ");
					else
						System.out.print(totalDays[i][j] + " ");
				} else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Finding if a year is Leap Year or not
	 * 
	 * @param year
	 * @return true if year is leap and false if year is not leap year
	 */
	public boolean leapYear(int year) {
		if (year % 100 != 0 && year % 4 == 0) {
			return true;
		} else if (year % 100 == 0 && year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculating calendar in 2D array
	 * 
	 * @param month
	 * @param year
	 * @return total number of days in the entered month and year
	 */
	public int[][] calenderQueue(int month, int year) {
		int year1, month1, x, day = 1, day1;
		year1 = year - (14 - month) / 12;
		x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
		month1 = month + 12 * ((14 - month) / 12) - 2;
		day1 = (day + x + (31 * month1) / 12) % 7;
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthDay = 0;
		for (int i = 0; i < monthDays.length; i++) {
			if (i == month - 1) {
				monthDay = monthDays[i];
			}
		}
		int[][] totalDays = new int[6][7];
		boolean leap = leapYear(year);
		if (leap && month == 1) {
			monthDay = 29;
		}
		int z = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalDays[i][j] = -1;
				} else if (z <= monthDay) {
					totalDays[i][j] = z;
					z++;
				} else {
					totalDays[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.print(monthName[i] + " " + year);
			}
		}
		System.out.println();
		return totalDays;

	}
	
	//For Primenumbers in 2D array
		public void prime2DArray() {
			int array[][]=new int[10][100];
			int prime[][]=new int[10][100];
			int temp=1;
			for (int i = 0; i< 10; i++) {
				for (int j = 0; j < 100; j++) {
					array[i][j]=temp;
					temp++;
				}
			}
			for (int i = 0; i <10; i++) {
				for (int j = 0; j < 100; j++) {
					if(checkPrime(array[i][j]))
					{
						prime[i][j]=array[i][j];
					}
					else
					{
						prime[i][j]=-1;
					}
				}
			}
			for (int i = 0; i < 10; i++) {
				for (int j = 1; j < 100; j++) {
					if(prime[i][j]!=-1)
					{
						System.out.print(prime[i][j]+" ");
					}
				}
				System.out.println("\n");
			}
		}
		
		/*
		 * Check prime
		 */
		public boolean checkPrime(int number)
		{
			int count=0;
			for (int i = 2; i <=number/2; i++) {
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		/*
		 * To check the given number is pallindrome or not
		 * 
		 */
		public static boolean checkForPalindrome(int n) {
			
			int temp = n;
			int rem = 0;
			int sum =0;
			
			while(n>0) {
				rem = n%10;
				sum = (sum*10)+rem;
				n = n/10;
			}
			if(temp == sum) {
				return true;
			}
			return false;
		}
		public static void primeAnagram2DArray(int[] prime) {
			for (int i = 0; i < prime.length; i++) {
				System.out.println(i);
			}
		}

		public static int numberOfBinarySearchTree(double totalNodes) {
			double n=factorial(2*totalNodes);
			double d=(factorial(totalNodes+1))*(factorial(totalNodes));
			double differentTree=n/d;
			return (int) differentTree;
		}
		/*
		 * Calculating the factorial of the given number
		 * 
		 * @param i
		 * @return factorial of the given number
		 */
		public static int factorial(double i)
		{
			int fact=1;
			while(i>0)
			{
				fact=(int) (fact*i);
				i--;
			}
			return fact;
		}
		
		/**
		 * @param range- up to which prime numbers are to be found
		 * @returns string array of prime numbers in  a given range
		 */
		public String[] prime(int range) {
			String[] array = new String[1000];
			int position = 0;
			for(int i = 2; i <= range; i++) {
				boolean isPrime = true;
				for(int j = 2; j <= i / 2; j++) {
					if((i % j) == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					array[position] = String.valueOf(i);
					position++;
				}
			}
			String[] returnArray = new String[position];
			for(int k = 0; k < position; k++) {
				returnArray[k] = array[k];
			}
			return returnArray;
		}
		
		
	
	public static void PrimeAnagram()
	{
		
	}

}
