package com.bridgelabz.functionalprograms;

import java.math.BigInteger;
import java.util.Scanner;

//import com.bridgalabz.util.FunctionalLogic;
import com.bridgelabz.utility.FunctionalUtility;

public class PrimeNum {

	public static void main(String[] args) {
		FunctionalUtility fl=new FunctionalUtility();
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
