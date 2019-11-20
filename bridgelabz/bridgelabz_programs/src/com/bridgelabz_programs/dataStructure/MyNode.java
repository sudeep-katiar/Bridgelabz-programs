package com.bridgelabz_programs.dataStructure;

public class MyNode<T> {
	public MyNode<T> head;
	private MyNode<T> front;
	private MyNode<T> rear;
	public MyNode<T> next;
	public T data;

	/*
	 * constructor
	 */
	public MyNode(T data)
	{
		this.data=data;//Intialized the data
		this.front=null;
		this.rear=null;
	}

	public MyNode<T> getFront() {
		return front;
	}

	public void setFront(MyNode<T> front) {
		this.front = front;
	}

	public MyNode<T> getRear() {
		return rear;
	}

	public void setRear(MyNode<T> rear) {
		this.rear = rear;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
