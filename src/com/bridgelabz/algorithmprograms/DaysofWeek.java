/******************************************************************************
 *  Compilation:  javac -d bin Days_Week.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to find dayOfWeek 
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.AlgorithmUtility;

public class DaysofWeek {
	public static void main(String[] args) {
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int d0=AlgorithmUtility.predictDate(d,m,y);
		System.out.println("Entered date is "+d+"/"+m+"/"+y);
		System.out.println("day on entered date is "+ days[d0]);	
	}
}

