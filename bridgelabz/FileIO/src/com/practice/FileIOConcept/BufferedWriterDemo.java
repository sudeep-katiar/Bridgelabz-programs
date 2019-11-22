package com.practice.FileIOConcept;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1 = { 'a', 'b', 'c', 'd' };
		bw.write(ch1);
		bw.newLine();
		bw.write("Sudeep");
		bw.newLine();
		bw.write("Kumar Katiar");
		bw.flush();
		bw.close();
	}

}
