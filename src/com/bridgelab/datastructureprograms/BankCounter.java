/******************************************************************************
 *  Compilation:  javac -d bin BankCounter.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinarySearch n
 *  
 *  Purpose: program to implement a bank counter
 *  @author  Dhanush
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.CustomQueue;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.QueueCustm;

public class BankCounter {
	public static void main(String[] args)
	{
		long money=100000;
		System.out.println("money in cashCounter is "+money);
		System.out.println("Enter Size of Integer Queue ");
		int n = DataStructureUtility.readInteger();
		CustomQueue queue = new CustomQueue(n);        
		char ch;
		QueueCustm q=new QueueCustm();
		do{
			System.out.println("CashCounter tasks");
			System.out.println("1. Add people");
			System.out.println("2. remove");
			int choice = DataStructureUtility.readInteger();
			switch (choice)
			{
			case 1 : 
				money=DataStructureUtility.withdrawOrDeposit(money);
				break;                         
			case 2 : 
				
				
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


