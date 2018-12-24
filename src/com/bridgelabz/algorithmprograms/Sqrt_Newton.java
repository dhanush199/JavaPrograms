package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import java.util.Scanner;


public class Sqrt_Newton {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double c=sc.nextDouble();
		c=Math.abs(c);
		double t=c;
		double epsilon = 1e-15;
		AlgorithmUtility fl=new AlgorithmUtility();
		double d=fl.calSqrt(epsilon,c);
		System.out.println("Exact Sqrt of "+c+" is = "+d);


	}

}
