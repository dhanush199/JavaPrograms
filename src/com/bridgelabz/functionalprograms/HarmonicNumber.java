package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n=scanner.nextInt();
		FunctionalUtility functionalUtilityu= new FunctionalUtility();
		double m= functionalUtilityu.getHarmonicNum(n);
		System.out.println("Harmonic value is"+m);
	}

}
