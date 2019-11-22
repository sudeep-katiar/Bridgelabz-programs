package com.bridgelabz_programs.dataStructure;

public class DoublyLinkedList {
	class Node {
		@SuppressWarnings("unused")
		private int data;
		public Node previous;
		public Node next;

		public Node(int data) {
			previous = null;
			this.data = data;
			next = null;
		}

		public Node(Node previous, int data, Node next) {
			this.previous = previous;
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private int size;

	public DoublyLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFront(int data) {
		if (head == null) {
			head = new Node(null, data, null);
		} else {
			Node node = new Node(null, data, head);
			head.previous = node;
			head = node;
		}
	}

	public void print() {
		Node node = head;
		while (node != null) {

		}
	}

}
