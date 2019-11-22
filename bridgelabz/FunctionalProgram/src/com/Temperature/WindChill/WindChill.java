package com.Temperature.WindChill;

import java.util.Scanner;

//to find the wind chill from the given temperature and wind speed.
public class WindChill {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahreheit: ");
		double t = scn.nextDouble();
		System.out.println("Enter the wind speed: ");
		double v = scn.nextDouble();
		if (t > 50 || v > 120 || v < 3)
			System.out.println("invalid");
		double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16));
		System.out.println("The wind chill is: " + w);
	}

}
