package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		FunctionalUtility fu=new FunctionalUtility();
		fu.getPrimefactor(n);
		//for(int i=0;i<m.length;i++)
			//System.out.println("primeFactors are"+m[i]);
		
	}

}
