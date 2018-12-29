/******************************************************************************
 *  Compilation:  javac -d bin Power2.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Program to find whether the given year is a leaf year or not
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.FunctionalUtility;

public class Power2 {
	public static void main(String[] args) {
	int n1=Integer.parseInt(args[0]);
	FunctionalUtility.powerOf2(n1);
	}
}
