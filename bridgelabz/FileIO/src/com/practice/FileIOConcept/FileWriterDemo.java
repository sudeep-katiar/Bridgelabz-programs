package com.practice.FileIOConcept;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc2.txt");
		fw.write(83);
		fw.write("udeep\nKumar Katiar");
		fw.write("\n");
		char[] ch1 = { 'c', 'h', 'a', 'n', 'd', 'a', 'n' };
		fw.write(ch1);
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}
