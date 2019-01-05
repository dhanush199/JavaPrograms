package com.bridgelabz.utility;

import java.util.NoSuchElementException;

public class CustomStack {
	protected static int arr[];
	protected static int top;
	protected static int size;
	protected static int len;
//	public CustomStack(int i) {
//		size=i;
//		// TODO Auto-generated constructor stub
//	}
	/*  Constructor for arrayStack */
	public static void arrayStack(int n)
	{
		size = n;
		len = 0;
		arr = new int[size];
		top = -1;
	}
	/*  Function to check if stack is empty */ 
	public static boolean isEmpty()
	{
		return top == -1;
	}
	/*  Function to check if stack is full */
	public static boolean isFull()
	{
		return top == size -1 ;        
	}
	/*  Function to get the size of the stack */
	public static int getSize()
	{
		return len ;
	}
	/*  Function to check the top element of the stack */
	public static int peek()
	{
		if( isEmpty() )
			throw new NoSuchElementException("Underflow Exception");
		return arr[top];
	}
	/*  Function to add an element to the stack */
	public static void push(int i)
	{
		if(top + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		if(top + 1 < size )
			arr[++top] = i;
		len++ ;
	}
	/*  Function to delete an element from the stack */
	public static int pop()
	{
		if( isEmpty() )

			throw new NoSuchElementException("Underflow Exception");
		len-- ;
		return arr[top--]; 
	}    
	public static void display()
	{
		System.out.print("\nStack = ");
		if (len == 0)
		{
			System.out.print("Empty\n");
			return ;
		}
		for (int i = top; i >= 0; i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}  

}
