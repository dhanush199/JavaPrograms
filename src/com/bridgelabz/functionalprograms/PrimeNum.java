package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class PrimeNum {
	public static void main(String[] args) {
		System.out.println("Enter a range");
		int range=FunctionalUtility.readInteger();
		AlgorithmUtility.prime(range);
	}	

}




