package com.bridgaelabz.util;

import java.math.BigInteger;
import java.util.Scanner;

import com.bridgalabz.Algorithms.logics.FunctionalLogic;

public class PrimeNum {

	public static void main(String[] args) {
		FunctionalLogic fl=new FunctionalLogic();
		System.out.println("Enter a range");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(long i=1;i<=k;i++) {
			boolean t= fl.checkPrime(i) ;
			if(t==true)
			{
				System.out.println(i);
			}
		}
	}

}
