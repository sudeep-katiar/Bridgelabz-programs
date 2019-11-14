package com.practice.FileIOConcept;
import java.io.*;
public class PrintWriterDemo {
	public static void main(String[]args) throws Exception
	{
		PrintWriter pw=new PrintWriter("abc3.txt");
		pw.print(2);
		pw.print(6);
		pw.print(4);
		pw.print(8);
		pw.print(9);
		pw.flush();
		pw.close();
	}

}
