/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to calculate euclidian distatnce
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter (x,y)"); //read co-ordinate values from the user 
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double distance=FunctionalUtility.calDistatce(x,y);
		
		System.out.println("Calculated distance is "+distance +" cm");

	}

}
