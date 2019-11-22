package com.bridgelabz.QuadraticEquation;

import java.util.Scanner;
import java.lang.Math;

//to find the roots of the quadratic equation as given by the user.
public class Quadratic {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double root1, root2;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the value for a");
		double a = scn.nextDouble();
		System.out.println("enter the value for b");
		double b = scn.nextDouble();
		System.out.println("enter the value for c");
		double c = scn.nextDouble();
		double delta = b * b - 4 * a * c;
		System.out.println("delta value is=" + delta);
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root 1 of X is=" + root1);
			System.out.println("Root 2 of X is=" + root2);
		} else if (delta == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println("Root 1 of X is=" + root1);
			System.out.println("Root 2 of X is=" + root2);
		} else {
			root1 = -b / (2 * a);
			root2 = Math.sqrt(-delta) / (2 * a);
			System.out.println("Root 1 of X is=" + root1);
			System.out.println("Root 2 of X is=" + root2);
		}
	}
}