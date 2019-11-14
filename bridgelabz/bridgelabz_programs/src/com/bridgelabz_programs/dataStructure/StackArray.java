package com.bridgelabz_programs.dataStructure;
//adding and removing of item from top by using stack array method
public class StackArray<T> {
	char stack[] = new char [500];
	int top = 0;
	//adds an element to the top of the stack
	public void push(char item)
	{
		stack[top] = item;
		top ++;
	}
	//removes the top element from the stack
	public char pop()
	{
		char item;
		top --;
		item = stack[top];
		stack[top] = 0;
		return item;
	}
	//returns the top item from the stack but does not remove it
	public char peek()
	{
		char item;
		item = stack[top-1];
		return item;
	}
	//test to see the stack is empty
	public boolean isEmpty()
	{
		return top <= 0;
	}
	//returns the number of items in the stack
	public int size()
	{
		return top;
	}
}
