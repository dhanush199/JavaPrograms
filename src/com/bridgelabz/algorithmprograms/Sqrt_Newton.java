/******************************************************************************
 *  Compilation:  javac -d bin Sqrt_Newton.java
 *  Execution:    java -cp bin com.bridgelabz.util.Algorithmprograms 
 *  
 *  Purpose: Program to calculate sqrt of a number using Newtons approximate method
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;



public class Sqrt_Newton {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		double c=FunctionalUtility.readdouble();
		c=Math.abs(c);
		double epsilon = 1e-15;
		System.out.println("Exact Sqrt of "+c+" is = "+AlgorithmUtility.calSqrt(epsilon,c));


	}

}
