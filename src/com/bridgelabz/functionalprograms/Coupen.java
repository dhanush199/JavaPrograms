package com.bridgelabz.functionalprograms;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Coupen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of coupens");
		int n=sc.nextInt();
		FunctionalUtility fu=new FunctionalUtility();		
		System.out.println("total distinct number required are="+ fu.getCoupenNumber(n));
		
	}
}

