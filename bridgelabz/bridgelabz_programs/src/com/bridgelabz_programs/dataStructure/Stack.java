package com.bridgelabz_programs.dataStructure;
/*
*linked list implement methods 
**/
public class Stack<T>
{
	Node<T> head;
	int count=0;
	
	class Node<T>
	{
		Node<T> head;
		public T data;
		public Stack<T>.Node<T> next=null;
		
	}

	/**
	 * Constructor creates an object of MyLinkedList and
	 * initializes linked list 
	 */
	public Stack() {
		head = null;
	}
	

	/**
	 * @param data - element to be added into the list
	 * 
	 */
	public void push(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next=head;
		head=node;
		count++;
	}
	
	public void pop(){
		if(head==null)
		{
			System.out.println("Stack UnderFlow");
			return;
		}
		Node<T> temp=head;
		head=temp.next;
		temp=null;
		count--;
	}
	
	public T peek(){
		if(head==null)
		{
			System.out.println("no data present");
		}
			T temp=head.data;
			return temp;
	}
	
	public boolean isEmpty(){
		return count == 0 ? true : false;
	}
	
	public int size(){
		return count;
	}
	
	public String display() {
		Node<T> node = head;
		String temp="";
		
		while (node.next != null) {
			temp += node.data+" ";
			node = node.next;
		}
		temp += node.data;
		return temp;
	}

}
