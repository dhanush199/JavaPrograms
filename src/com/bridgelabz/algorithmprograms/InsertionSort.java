/******************************************************************************
 *  Compilation:  javac -d bin Insertio_Sort.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program for insertion sort
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("Enter the length of the array");
		int len=FunctionalUtility.readInteger();
		String[] arr = new String[len];
		for (int i=0; i<len; ++i) { 
			arr[i]=FunctionalUtility.readString();
		}
		arr=FunctionalUtility.sortArray(arr);
		for(int i=0;i<len; ++i)
			System.out.println(arr[i]);
	} 


}


