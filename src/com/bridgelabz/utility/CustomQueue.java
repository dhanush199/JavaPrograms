package com.bridgelabz.utility;
import java.util.NoSuchElementException;

import com.bridgelabz.utility.DataStructureUtility;

public class CustomQueue {
	protected static int Queue[] ;
	protected static int front, rear, size, len;
	/* Constructor */
	public CustomQueue(int n) 
	{
		size = n;
		len = 0;
		Queue = new int[size];
		front = -1;
		rear = -1;
	}    
	/*  Function to check if queue is empty */
	public static boolean isEmpty() 
	{
		return front == -1;
	}    
	/*  Function to check if queue is full */
	public boolean isFull() 
	{
		return front==0 && rear == size -1 ;
	}    
	/*  Function to get the size of the queue */
	public int getSize()
	{
		return len ;
	}    
	/*  Function to check the front element of the queue */
	public int peek() 
	{
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return Queue[front];
	}    
	/*  Function to insert an element to the queue */
	public void insert(int i) 
	{
		if (rear == -1) 
		{
			front = 0;
			rear = 0;
			Queue[rear] = i;
		}
		else if (rear + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if ( rear + 1 < size)
			Queue[++rear] = i;    
		len++ ;    
	}    
	/*  Function to remove front element from the queue */
	public static int remove() 
	{
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else 
		{
			len-- ;
			int ele = Queue[front];
			if ( front == rear) 
			{
				front = -1;
				rear = -1;
			}

			else
				front++;                
			return ele;
		}        
	}
	/*  Function to display the status of the queue */
	public void display()
	{
		System.out.print("\nQueue = ");

		if (len == 0)
		{
			System.out.print("Empty\n");
			return ;
		}
		for (int i = front; i <= rear; i++)
			System.out.print(Queue[i]+" ");
		System.out.println();        
	}
	public static long withdrawOrDeposit(long money) {
		System.out.println("press 1.Deposit | Press 2.WithDraw ");
		int i=DataStructureUtility.readInteger();
		switch(i) {
		case 1: System.out.println("Money in the counter is "+money);
		if(!CustomQueue.isEmpty() && money!=0) {
			System.out.println("enter the amount to be deposited");
			money=money+DataStructureUtility.readLong();
			System.out.println("money in cashCounter is "+money);
			CustomQueue.remove();
			System.out.println(money+"Rs succesfully deposited to your account");
		}
		else
			System.out.println("Quee is Empty: Please add people to the quee");
		break; 
		case 2: System.out.println("Money in the counter is "+money);
		if(!(CustomQueue.isEmpty()) && money>0) {
			System.out.println("enter the amount to be encashed");	
			long cash=DataStructureUtility.readLong();
			if(cash<=money && cash>0) {
				money=money-cash;
				CustomQueue.remove();
				System.out.println(cash+"Rs has been withdrawn from your account");}}
		else
			System.out.println("money is not there in cash counter.Kindly come later");	
		break;    
		default : System.out.println("Wrong Entry \n ");
		break;
		}	
		return money;
	}
}
