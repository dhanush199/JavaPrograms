/******************************************************************************
 *  Compilation:  javac -d bin CountPercentageHeadTail.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Program to count percentage of heads and tails when a coin tossed numToss times.
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class CountPercentageHeadTail {
	public static void main(String[] args) {
		System.out.println("enter Number of toss");
		int numToss=FunctionalUtility.readInteger(); //read number of tosses
		double[]b=FunctionalUtility.getCount(numToss);
		System.out.println("perc of Head="+ b[0]*100/numToss);//print the percentage head
		System.out.println("perc of Tail="+ b[1]*100/numToss);//print the percentage Tail
	}
}
