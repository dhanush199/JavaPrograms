/******************************************************************************
 *  Compilation:  javac -d bin String_Permutation.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to get st
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class String_Permutation {

	public static void main(String[] args) {

		String s= "abc";
		int n=s.length();
		char ch[]=new char[n*n];
		ch=s.toCharArray();
		FunctionalUtility f=new FunctionalUtility();
		f.getPerm(ch,n);
		


	}
}
