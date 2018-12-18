package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class CountPercentageHeadTail {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter Number of toss");
		 int toss=sc.nextInt();
		 fu.getCount(toss);
	}

}
