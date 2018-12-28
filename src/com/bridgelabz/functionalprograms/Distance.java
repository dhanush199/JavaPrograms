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

import com.bridgelabz.utility.FunctionalUtility;

public class Distance {

	public static void main(String[] args) {
		System.out.println("enter (x,y)"); //read co-ordinate values from the user 
		double x=FunctionalUtility.readdouble();
		double y=FunctionalUtility.readdouble();
		double distance=FunctionalUtility.calDistatce(x,y);
		
		System.out.println("Calculated distance is "+distance +" cm");

	}

}
