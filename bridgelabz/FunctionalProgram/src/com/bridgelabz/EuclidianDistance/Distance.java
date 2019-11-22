package com.bridgelabz.EuclidianDistance;

import java.util.Scanner;
import java.lang.Math;

//print the Euclidean distance from the given points to the origin.
public class Distance {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the value for X-axis");
		int x = scn.nextInt();
		System.out.println("enter the value for Y-axis");
		int y = scn.nextInt();
		System.out.println("The Euclidean distance is: " + (Math.sqrt((Math.pow(x, x)) + (Math.pow(y, y)))));
	}

}
