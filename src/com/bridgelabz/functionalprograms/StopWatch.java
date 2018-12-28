/******************************************************************************
 *  Compilation:  javac -d bin Stop_Watch.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to concate name inside a string
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class StopWatch {

	public static void main(String[] args) {
		long a =FunctionalUtility.start();
		System.out.println(a);
		long b=FunctionalUtility.end();
		System.out.println(b);
		long c=FunctionalUtility.elapse();
		System.out.println(c+" millisec");
		
	}

}


