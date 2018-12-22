package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class replaceString {

	public static void main(String[] args) {
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter a name");
		 String s=sc.nextLine();
		 fu.checkConcate(s);
		
	}

}
