package com.bridgelabz_programs.dataStructure;

//parentheses must appear in a balanced fashion.

public class BalancedParanthesis {
	public static void main(String[]args) throws Exception
	{
		StackArray<String> list = new StackArray<String>();
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";	//given string
		
		//search for every paranthesis
		for (int i = 0; i < str.length(); i++) {
			char item = str.charAt(i);
			if (item == '(')
			{
				//System.out.println("in");
				list.push(item);
			}
			else if (item == ')')
			{
				//System.out.println("out");
				list.pop();
			}
		}
		
		if(list.isEmpty()==true)
		{
			System.out.println("Balanced Paranthesis");
		}
		else
		{
			System.out.println("Unbalanced Paranthesis");
		}
	}
}
