package com.bridgelabz.StimulateStopWatch;

import java.util.Scanner;

//stop watch program for measuring the time that elapses between the start and end clicks.

public class StopWatch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double dif;
		Scanner scn = new Scanner(System.in);

		// to start the timer

		System.out.println("Start the stop watch:");
		double start = scn.nextDouble();
		start = System.currentTimeMillis();

		// to stop the timer

		System.out.println("Stop the stop watch:");
		double stop = scn.nextDouble();
		stop = System.currentTimeMillis();

		if (stop == 0) {
			double now = System.currentTimeMillis();
			dif = now - start;
		} else {
			dif = stop - start;
		}
		// in microseconds
		System.out.println("elapsed time is: " + dif + "ms");
		// in milliseconds
		double mils = dif % 1000;
		System.out.println("elapsed time is: " + mils + "msecs");
		dif = (dif - mils) / 1000;
		// in seconds
		double secs = dif % 60;
		System.out.println("elapsed time is: " + secs + "secs");
		dif = (dif - secs) / 60;
		// in minutes
		double minutes = dif % 60;
		System.out.println("elapsed time is: " + minutes + "min");
	}
}
