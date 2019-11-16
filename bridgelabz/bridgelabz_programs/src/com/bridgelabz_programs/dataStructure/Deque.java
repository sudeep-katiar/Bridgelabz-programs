package com.bridgelabz_programs.dataStructure;

import com.bridgelabz_programs.dataStructure.LinkedList.Node;

public class Deque<T> {
	Node<T> front;
	Node<T> rear;
	int count=0;
	class Node<T>
	{
		//constructor
		Node<T> front;
		Node<T> rear;
		Node<T> next=null;
		T data;
		Node(T data)
		{
		this.data = data;
		}
	}
	LinkedList<Character> l;
	
	public Deque()
	{
		l= new LinkedList<Character>();
		front=null;
		rear=null;
		
	}
	
	public void add(T item)
	{
		Node<T> node=new Node<T>(item);
		
		
//		l.add((Character)item);
	}
	

	public void addFront(T item)
	{
		Node<T> node=new Node<T>(item);
		if(rear==null)
		{
			front=node;
			rear=node;
			count++;
		}
		else
		{
			node.next=front;
			front=node;
			count++;
		}
//		l.insertAtFirst((Character) item);
	}
	
	public void addRear(T item)
	{
		Node<T> node=new Node<T>(item);
		if(rear==null)
		{
			front=node;
			rear=node;
			count++;
		}
		else
		{
			rear.next=node;
			rear=node;
			count++;
		}
	}
	

	
	public T removeFront()
	{
		Node<T> temp=front;
		front=front.next;
		count--;
		return temp.data;
		
//		l.removeFirst();
	}
	
	public Node<T> removeRear()
	{
		Node<T> temp=front;
		Node<T> prev=null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		count--;
		return temp;
		
//		l.pop();
	}
	
	public boolean isEmpty()
	{
		if(front==null)
			 return true;
		else
			return false;
	}
	
	public int size()
	{
		return count;
	}
	
	public void display()
	{
		Node<T> temp=front;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[]args)
	{
		Deque<Integer> deque=new Deque<Integer>();
		deque.addRear(10);
		deque.addRear(20);
		deque.addRear(30);
		deque.display();
		deque.size();
		System.out.println();
		int result=deque.size();
		System.out.println(result);
		
		deque.removeFront();
		deque.display();
		System.out.println();
		deque.removeRear();
		deque.display();
		
		
	}
	
}
