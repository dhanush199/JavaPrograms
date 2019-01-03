package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.CustomQueue;
import com.bridgelabz.utility.DataStructureUtility;

public class BankCounter {
	public static void main(String[] args)
	{
		long money=1000000;
		System.out.println("money in cashCounter is "+money);
		System.out.println("Enter Size of Integer Queue ");
		int n = DataStructureUtility.readInteger();
		CustomQueue queue = new CustomQueue(n);        
		char ch;
		do{
			System.out.println("CashCounter tasks");
			System.out.println("1. Add people");
			System.out.println("2. remove");
			System.out.println("3. peek");
			System.out.println("4. check empty");
			System.out.println("5. check full");
			System.out.println("6. size of quee");
			int choice = DataStructureUtility.readInteger();
			switch (choice)
			{
			case 1 : 
				System.out.println("Enter integer element to insert");
				try
				{
					queue.insert(DataStructureUtility.readInteger() );
				}
				catch(Exception e)
				{
					System.out.println("Error : " +e.getMessage());
				}  
				money=CustomQueue.withdrawOrDeposit(money);
				break;                         
			case 2 : 
				try
				{
					System.out.println("Removed Element = "+CustomQueue.remove());
				}
				catch(Exception e)
				{
					System.out.println("Error : " +e.getMessage());
				}
				break;                         
			case 3 : 
				try
				{
					System.out.println("Peek Element = "+queue.peek());
				}
				catch(Exception e)
				{
					System.out.println("Error : "+e.getMessage());
				}
				break;                            
			case 4 : 
				System.out.println("Empty status = "+CustomQueue.isEmpty());
				break;                
			case 5 : 
				System.out.println("Full status = "+queue.isFull());
				break;                          
			case 6 : 
				System.out.println("Size = "+queue.getSize());
				break;      
			default : System.out.println("Wrong Entry \n ");
			break;
			}
			queue.display();            
			System.out.println(" Do you want to continue (Type y or n) ");
			ch = DataStructureUtility.readString().charAt(0);
		} while (ch == 'Y'|| ch == 'y');                                                        
	}    
}


