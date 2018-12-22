package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

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
