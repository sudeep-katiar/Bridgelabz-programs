package com.practice.FileIOConcept;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc1.txt");
		fw.write('a');
		fw.write('b');
		fw.write('c');
		fw.write('d');
		fw.write('e');
		fw.flush();
		fw.close();
	}

}
