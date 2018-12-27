/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
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

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a year");
		int r=FunctionalUtility.readInteger();
		FunctionalUtility fu=new FunctionalUtility();
		fu.getLeap(r);

	}

}
