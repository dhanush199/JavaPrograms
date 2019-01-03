package com.bridgelabz.utility;

//import java.io.BufferedReader;

public class CustomDqueue <E>{

	public E data;
	CustomDqueue<E>next;
	CustomDqueue<E>pre;
	CustomDqueue<E> front;
	CustomDqueue<E> rear;
	int size=0;

	public CustomDqueue(E val)
	{
		this.data=val;
		this.next=null;
		this.pre=null;
	}

	public void addFront(E c)
	{
		if(front==null)
		{
			front.data=c;
			rear=front;
		}
		else
		{
			CustomDqueue<E>tNode=null;
			tNode.data=c;
			tNode.next=front;
			front.pre=tNode;
			front=tNode;
		}
		size++;
	}


	public void addRear(E c)
	{
		if(front==null)
		{
			CustomDqueue<E>tNode=new CustomDqueue<E>(c);
			front=tNode;
			rear=front;
		}
		else
		{
			CustomDqueue<E>tNode=new CustomDqueue<>(c);
			rear.next=tNode;
			tNode.pre=rear;
			rear=tNode;
		}
		size++;
	}


	public E removeFront()
	{
		E val=null;
		if(front==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			val=front.data;
			front=front.next;
		}
		size--;
		return val;
	}


	public E removeRear()
	{
		E val=null;
		if(front==null)
		{
			System.out.println("No element to delete");
		}
		else
		{
			val=rear.data;
			rear=rear.pre;
			rear.next=null;
		}
		size--;
		return val;
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
		return size;

	}
}
