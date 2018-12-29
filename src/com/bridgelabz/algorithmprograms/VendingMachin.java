/******************************************************************************
 *  Compilation:  javac -d bin VendingMachin.java
 *  Execution:    java -cp bin com.bridgelabz.util.Algorithmprograms 
 *  
 *  Purpose: Program to count minimum number of notes to be dispatched for the given input
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   27-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class VendingMachin {
	public static void main(String[] args) {
		System.out.println("enter the money in Rs");
		int money=FunctionalUtility.readInteger();
		int[] notes = { 2000,500,100,50,10,5,2,1};
		System.out.println("the different notes present is");
		AlgorithmUtility.calculate(money, notes);
	}

}
