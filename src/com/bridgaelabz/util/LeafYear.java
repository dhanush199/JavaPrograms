package com.bridgaelabz.util; 
import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class LeafYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year");
		int r=sc.nextInt();
		
		
		
		FunctionalUtility fu=new FunctionalUtility();
		fu.getLeaf(r);
		
	}

}
