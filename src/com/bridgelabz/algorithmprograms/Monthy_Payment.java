/******************************************************************************
 *  Compilation:  javac -d bin Monthy_Payment.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program for to get monthly payment
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;

public class Monthy_Payment {

	public static void main(String[] args) {
		String i=args[0];
		String j=args[1];
		String k=args[2];
		double P=Double.parseDouble(i);
		double R=Double.parseDouble(j);
		double Y=Double.parseDouble(k);
		double payment=AlgorithmUtility.calPayment(P,R,Y);
		System.out.println("MontghlyPayment is == "+Math.abs(payment));

	}

}
