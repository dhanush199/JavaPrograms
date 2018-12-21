package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class replaceString {

	public static void main(String[] args) {
		
		//FunctionalUtility fu=new FunctionalUtility();
		StringBuilder sb=new StringBuilder("Hi  how are you?");
		System.out.println("string="+sb);
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		sb.insert(4, name);
		System.out.println(sb); //" how are you");


		//String s=sc.nextLine();
		// fu.checkConcate(s);
		// TODO Auto-generated m		 

	}

}
