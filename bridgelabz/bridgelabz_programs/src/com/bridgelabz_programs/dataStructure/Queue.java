package com.bridgelabz_programs.dataStructure;

////an ordered collection of items which are added at one end called the rear
//and removed from the other end called the front
public class Queue<T> {
	int queue[] = new int[99999999];
	int size;
	int front;
	int rear;

	// adds a new element to the rear of the queue
	public void enqueue(T data) {
		queue[rear] = (int) data;
		rear = rear + 1;
		size++;
	}

	// removes the front item from the queue
	@SuppressWarnings("unused")
	public int dequeue() {
		int data = queue[front];
		front = front + 1;
		size--;
		return front;
	}

	// test whether the queue is empty or not
	public boolean isEmpty() {
		return size == 0;
	}

	// returns the number of items in the queue
	public int size() {
		return size;
	}

	// test whether the queue is full or not
	public boolean isFull() {
		return size == 5;
	}

	public static void main(String[] args) {

	}

//	public void display() {
//		int node = this.front;
//		while(node!=0) {
//			System.out.println("Data :");
//		}
//	}

}
