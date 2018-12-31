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
		System.out.println("Enter a number to start the stopwatch");
		int a1=FunctionalUtility.readInteger();
		long a =FunctionalUtility.start();
		System.out.println("Start time is = "+a);			
		int num=1;		
		do {
			 System.out.println("Enter a ZERO to stop the watch");
			 num=FunctionalUtility.readInteger();
		}while(num!=0);
		long b=FunctionalUtility.end();
		System.out.println("End time is = "+b);
		long c=FunctionalUtility.elapse(a,b);
		System.out.println("difference B/W start and end time is "+c+" millisec");
	}
}


