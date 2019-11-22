package com.bridgelabz_programs.dataStructure;

public class Stack<T> {
	Node<T> head;
	int count = 0;

	@SuppressWarnings("hiding")
	class Node<T> {
		public T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	/**
	 * Constructor creates an object of MyLinkedList and initializes linked list
	 */
	public Stack() {
		this.head = null;
	}

	/**
	 * element to be added into the list
	 * 
	 */
	public void push(T data) {
		Node<T> node = new Node<T>(data);
		node.next = head;
		head = node;
		count++;
	}

	/*
	 * to pop the data
	 */
	public void pop() {
		if (head == null) {
			System.out.println("Stack UnderFlow");
			return;
		}
		Node<T> temp = head;
		head = temp.next;
		temp = null;
		count--;
	}

	/*
	 * peek the data
	 */
	public T peek() {
		if (head == null) {
			System.out.println("no data present");
		}
		T temp = head.data;
		return temp;
	}

	public boolean isEmpty() {
		return count == 0 ? true : false;
	}

	public int size() {
		return count;
	}

	public String display() {
		Node<T> node = head;
		String temp = "";

		while (node.next != null) {
			temp += node.data + " ";
			node = node.next;
		}
		temp += node.data;
		return temp;
	}

}
