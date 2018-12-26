package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

import java.util.Scanner;


public class Sqrt_Newton {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		double c=FunctionalUtility.readdouble();
		c=Math.abs(c);
		double t=c;
		double epsilon = 1e-15;
		System.out.println("Exact Sqrt of "+c+" is = "+AlgorithmUtility.calSqrt(epsilon,c));


	}

}
