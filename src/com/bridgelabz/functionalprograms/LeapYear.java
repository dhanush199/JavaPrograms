package com.bridgelabz.functionalprograms; 
import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year");
		int r=sc.nextInt();
		FunctionalUtility fu=new FunctionalUtility();
		fu.getLeap(r);

	}

}
