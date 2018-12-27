/******************************************************************************
 *  Compilation:  javac -d bin Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to find roots of a quadratic equation
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   23-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.FunctionalUtility;
public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Enter the coefficients of quadratic equation");
		double a=FunctionalUtility.readdouble();
		double b=FunctionalUtility.readdouble();
		double c=FunctionalUtility.readdouble();
		FunctionalUtility f=new FunctionalUtility();
		f.getCoefficients(a,b,c);
	}

}
