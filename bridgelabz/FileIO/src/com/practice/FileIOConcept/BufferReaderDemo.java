package com.practice.FileIOConcept;

import java.io.*;

public class BufferReaderDemo {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("abc2.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

}
