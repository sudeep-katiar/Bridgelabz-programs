package com.practice.FileIOConcept;
import java.io.*;
public class FileReaderDemo2 {
	public static void main(String[]args) throws Exception
	{
		File f=new File("abc1.txt");
		FileReader fr=new FileReader(f);
		char []ch=new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.println("ch");
		}
		System.out.println("********");
		FileReader fr1=new FileReader("abc.txt");
		int i=fr1.read();
		while(i!=1)
		{
			System.out.println((char)i);
			i=fr1.read();
		}
	}

}
