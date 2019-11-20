package com.bridgelabz_programs.dataStructure;
import com.bridgelabz_programs.dataStructure.MyNode;
public class HashMap<T> {
	@SuppressWarnings("unchecked")
	MyNode<T>[] array = new MyNode[11];
	MyNode<T> next;
	int data;
	
	/* 
	 * Add data
	 */
	@SuppressWarnings("unchecked")
	public void add(int data)
	{
		@SuppressWarnings("rawtypes")
		MyNode<T> new_Node=new MyNode(data);
		int index=data%11;	
		if(array[index]==null)
		{
			array[index]=new_Node;
		}
		else
		{
			MyNode<T> temp=array[index];
			
			while(temp.next!=null)
			{
				temp=temp.next;	
			}
			temp.next=new_Node;
		}
	}
	
	/*
	 * Display the data
	 */
	public void display()
	{
		System.out.println("Remainder "+"values:-");
		for (int i = 0; i < array.length; i++) {
			MyNode<T> temp=array[i];
			if(temp!=null)
			{
				System.out.print(" ["+i+"]      {");
				while(temp!=null)
				{
					System.out.print(temp.data+"  ");
					temp=temp.next;
				}
			}
			System.out.println("}");
		}
	}
	

}
