package com.bridgelabz_programs.dataStructure;

import java.util.Scanner;

//data structure linked list method
public class LinkedList<T> {
	int count = 0;
	Node<T> head;

	@SuppressWarnings("hiding")
	// Node class
	class Node<T> {
		// constructor
		Node<T> next;
		Node<T> pre;
		T data;

		Node() {
			this.data = data;
			next = null;
			pre = null;
		}
	}

	// Method to add a new node
	public void add(T item) {
		Node<T> node = new Node<T>();
		node.data = item;
		node.next = null;
		// If the Linked List is empty, then make the new node as head
		if (head == null) {
			head = node;
			count++;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node<T> temp = head;
			while (temp.next != null) {
				// Insert the new_node at last node
				temp = temp.next;
			}
			temp.next = node;
			count++;
		}
	}

	// adds an element at the first
	public void insertAtFirst(T item) {
		Node<T> node = new Node<T>();
		node.data = item;
		node.next = null;

		node.next = head;
		head = node;
	}

	// search method
	public boolean search(T item) {
		int count = 0;
		Node<T> temp = head;
		if (temp == null) {
			return false;
		} else {
			while (temp != null) {
				if (item.equals(temp.data)) {
					count++;
					break;
				}
				temp = temp.next;
			}
		}
		if (count > 0)
			return true;
		else
			return false;

	}

	// removes the item from the list
	public void remove(T item) {
		Node<T> temp;
		Node<T> n1 = null;
		if (head == null) {
			System.out.println("remove is impossible");

		}
		if (head.equals(item)) {
			head = head.next;
		} else {
			temp = head;

			while (temp.next.next != null) {
				if (temp.next.data.equals(item)) {
					n1 = temp.next;
					temp.next = n1.next;
					break;
				}
				temp = temp.next;
			}
			if (temp.next.data.equals(item)) {
				temp.next = null;
			}
		}
	}

	// test to see the list is empty or not
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

//			//check the size of the list
	public int size() {
		int size = 0;
		Node<T> temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	// adds element from last to first
	public void addLast(T item) {
		Node<T> node = new Node<T>();
		node.data = item;
		node.pre = null;
		Node<T> temp = head;
		while (temp.pre != null) {
			node.pre = head;
			node = head;
			node.pre = null;
		}

	}

	// adds a new item to the end of the list
	public void append(T item) {
		Node<T> n = new Node<T>();
		n.data = item;
		n.next = null;
		Node<T> temp;
		temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	// returns the position of item from the list
	public int index(T item) {
		Node<T> temp = head;
		int count = 0;
		while (temp.next != null) {
			if (temp.data.equals(item)) {
				return count;
			} else {
				temp = temp.next;
				count++;
			}
		}
		return count;
	}

	// adds a new item to the list at position pos
	public void insert(T item, int pos) {
		Node<T> node = new Node<T>();
		node.data = item;
		node.next = null;
		Node<T> temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
	}

	// removes and returns the last item in the list
	public Node<T> pop() {
		Node<T> temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return temp;
	}

	// removes the first item from the list
	@SuppressWarnings("unused")
	public void removeFirst() {
		if (head.next != null) {
			Node<T> temp = head;
			head = head.next;
			temp = null;
		} else {
			head = null;
			System.out.println("only one data was present");
		}
	}

	// removes and return the item at position pos
	public Node<T> pop(int pos) {
		Node<T> temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		return temp = temp.next.next;
	}

	// for inserting element in appropriate position in the list
	public void insert(T data1) {
		Node<T> n = new Node<T>();
		n.data = data1;
		n.next = null;

		if (head == null) {
			head = n;
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = n;
		}
	}

	// for storing the number in sorted way
	public void serially(T item) {
		Node<T> node = new Node<T>();
		node.data = item;
		Node<T> temp = head;
		int i = (int) item;
		int j = (int) temp.data;
		System.out.println(i);

		if (j > i) {
			node.next = null;

			node.next = head;
			head = node;

		} else {
			while (temp.next != null) {
				j = (int) temp.next.data;
				if (j > i) {
					node.next = temp.next;
					temp.next = node;
					break;
				}
				temp = temp.next;
			}
			j = (int) temp.data;
			if (j > i && temp.next == null) {
				node.next = temp.next;
				temp.next = node;
			} else if (temp.next == null)
				add(item);
		}
	}

	// to display the value
	public String display() {
		Node<T> temp;
		String str = "";
		if (head == null) {
			System.out.println("no items in the linkedlist");
		} else {
			temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;

			}
			/*
			 * if(temp.next==null) { System.out.println(temp.data); }
			 */
			System.out.print(temp.data + " ");
		}
		return str;
	}

	// bubble sort for integer
	public static void bubbleSort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> n = new LinkedList<Integer>();
		n.add(20);
//		n.add(40);
//		n.add(60);
//		n.add(70);
//		n.add(80);
		n.addLast(40);
//		n.removeFirst();
		n.display();
		System.out.println();
		int num = sc.nextInt();
		boolean reult = n.search(num);
		System.out.println(reult);
		if (reult)
			n.remove(num);
		else
			n.serially(num);
		n.display();

	}

}
