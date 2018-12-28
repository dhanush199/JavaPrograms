/******************************************************************************
 *  Compilation:  javac -d bin Coupen.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Program to assign distinct values for a given number of coupens
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class Coupen {

	public static void main(String[] args) {
		System.out.println("Enter total number of coupens");
		int n=FunctionalUtility.readInteger();
		FunctionalUtility fu=new FunctionalUtility();		
		System.out.println("total distinct number required are="+ fu.getCoupenNumber(n));
		
	}
}

