package com.practice.FileIOConcept;

import java.io.PrintWriter;

/*
 * File writing for Hash function file
 */
public class HashingFunctionFile {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("hashing.txt");
		for (int i = 1; i <= 1000; i++) {
			pw.print(i);
			pw.print(" ");
			System.out.print(i);
		}
		pw.flush();
		pw.close();
	}

}
