/******************************************************************************
 *  Compilation:  javac -d bin Factors.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Program to find the factors of a number n.
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class Factors {

	public static void main(String[] args) {
		FunctionalUtility f1=new FunctionalUtility();
		System.out.println("Number to find the prime factor");
		int n=FunctionalUtility.readInteger();
		f1.primeFactors(n);
	}

}

