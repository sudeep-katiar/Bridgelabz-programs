package com.bridgelabz.TwoDArray;

import java.io.PrintWriter;//importing printwriter class
import java.util.Scanner;

/*A library for reading in2D arrays of
 * integers, doubles, or booleans 
 * from standard input and printing them out to standard output.
 */
public class Array2D {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		Scanner u = new Scanner(System.in);
		int m = u.nextInt();// input no. of rows
		System.out.println("Enter number of columns: ");
		int n = u.nextInt();// input no. of columns
		// calling methods
		int[][] a = arrayInt(m, n);
		double[][] b = arrayDouble(m, n);
		String[][] c = arrayBoolean(m, n);
		// calling display method
		display(a, b, c, m, n);
	}

	// method for storing Integer array
	@SuppressWarnings("resource")
	public static int[][] arrayInt(int m, int n) {
		int a[][] = new int[m][n];
		Scanner u = new Scanner(System.in);
		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = u.nextInt();
			}
		}
		return a;
	}

	// method for storing Double array
	@SuppressWarnings("resource")
	public static double[][] arrayDouble(int m, int n) {
		double b[][] = new double[m][n];
		Scanner u = new Scanner(System.in);
		System.out.println();
		System.out.println("Double Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = u.nextDouble();
			}
		}
		return b;
	}

	// method for storing Boolean array
	@SuppressWarnings("resource")
	public static String[][] arrayBoolean(int m, int n) {
		String c[][] = new String[m][n];
		Scanner u = new Scanner(System.in);
		System.out.println();
		System.out.println("Boolean Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = u.nextLine();
			}
		}
		return c;
	}

	// display method
	public static void display(int[][] a, double[][] b, String[][] c, int m, int n) {
		PrintWriter pw = new PrintWriter(System.out, true);// creating object for printwriter to write any type of
															// primitive data

		System.out.println();
		pw.println("2D ARRAY INTEGER");
		// printing integer value
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println("\t");
		}

		System.out.println();
		pw.println("2D ARRAY DOUBLE");
		// printing double value
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + b[i][j] + " ");
			}
			pw.println("\t");
		}

		System.out.println();
		pw.println("2D ARRAY BOOLEAN");
		// printing boolean value
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + c[i][j] + " ");
			}
			pw.println("\t");
		}
	}
}
