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

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class CountPercentageHeadTail {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter Number of toss");
		 int numToss=sc.nextInt(); //read number of tosses
		 fu.getCount(numToss);
	}

}
