package com.bridgelabz.Gambling;

import java.util.Scanner;

/*Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
* Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results,
* and prints them out.
*/
public class Gambler {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count = 0, win = 0, loose = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. of times:");
		int n = scn.nextInt();
		System.out.println("Enter the $stack:");
		int s = scn.nextInt();
		System.out.println("Enter the $goal:");
		int g = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			if (s > 0 && s < g) {
				if (Math.random() < 0.5) {
					win++;// total no. of wins
					s += 1;// increment in stack
					count++;
				} else {
					loose++;// total no. of loose
					s -= 1;// decrement in stack
					count--;
				}
			} else if (s >= g) {
				System.out.println("reached the goal after " + i + "th no. of gamble");
				break;
			} else {
				System.out.println("out of stack after " + i + "th no. of gamble");
				break;
			}
		}
		System.out.println("no. of wins:" + win);
		System.out.println("Percentage of games won = " + 100.0 * win / n);
		System.out.println("Percentage of games lose = " + 100.0 * loose / n);
		System.out.println("Avg # bets= " + 1.0 * count / n);
	}
}