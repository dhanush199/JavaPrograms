package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coefficients of quadratic equation");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		FunctionalUtility f=new FunctionalUtility();
		f.getCoefficients(a,b,c);
	}

}
