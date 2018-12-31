/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class WindChill {
	public static void main(String[] args) {
		double n=0.0;
		System.out.println("Enter the temparature in Farenheat");
		double t=(Double.parseDouble(args[0]));
		if(t>50) 
		{
			System.out.println("Invalid temparature");
		}
		System.out.println("Enter the temparature in Farenheat");
		double t1=(Double.parseDouble(args[1]));
		 n=Math.abs(t1);
		if(n<120 || n>5)
		{
			FunctionalUtility fu=new FunctionalUtility();
			System.out.println(fu.getTemp(t,n));
		}	
	}
}
