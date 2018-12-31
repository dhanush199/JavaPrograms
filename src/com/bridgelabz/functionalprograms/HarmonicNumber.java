/******************************************************************************
 *  Compilation:  javac -d bin HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Program to calculate harmonic sum of a number
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.FunctionalUtility;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n=FunctionalUtility.readInteger();
		FunctionalUtility functionalUtilityu= new FunctionalUtility();
		double m= functionalUtilityu.getHarmonicNum(n); // store harmonic value returned by the function
		System.out.println("Harmonic value is"+m);
	}

}
