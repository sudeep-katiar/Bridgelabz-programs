package com.practice.FileIOConcept;
import java.io.*;
public class FileReaderConcept {
	public static void main(String[]args) throws IOException
	{
		FileReader fr=new FileReader("abc1.txt");
		int i=fr.read();
		while(i!=1)
		{
			System.out.println((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
