/******************************************************************************
 *  Compilation:  javac -d bin Bublesort.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to search a string present in the CSV file
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Bublesort {

	public static void main(String args[]) 
	{ 
		System.out.print("Enter the size of input array");
		System.out.println();
		int n=FunctionalUtility.readInteger();
		int arry[]=new int[n];
		System.out.println("Enter the input array");
		for (int i=0; i<n; ++i) 
			arry[i]=FunctionalUtility.readInteger();
		AlgorithmUtility.bubbleSort(arry); 
		System.out.println("Sorted array"); 
		AlgorithmUtility.printArray(arry);
	} 


}


