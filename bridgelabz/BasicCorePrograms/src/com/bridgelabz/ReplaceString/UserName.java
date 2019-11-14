package com.bridgelabz.ReplaceString;
import java.util.*;
import java.util.Scanner;
//this program replace "UserName" with proper user name.
public class UserName {
	public static void main(String[]args) {
		System.out.println("Enter a name");
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		if(s1.length()>=3) 
		{
		String un="Hello username, How are you?";
		String r1=un.replace("username", s1);
		System.out.println(r1);
		System.out.println("replace "+s1+" with a proper name");
		String s2=scn.nextLine();
		String r2=un.replace("username", s2);
		System.out.println(r2);
		}
		else {
			System.out.println("minimun character is 3");
		}
	}

}
