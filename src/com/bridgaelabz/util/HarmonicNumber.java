package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n=sc.nextInt();
		FunctionalUtility fu= new FunctionalUtility();
		double m= fu.getHarmonicNum(n);
		System.out.println("Harmonic value is"+m);
	}

}
