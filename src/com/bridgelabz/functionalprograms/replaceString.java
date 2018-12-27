/******************************************************************************
 *  Compilation:  javac -d bin replaceString.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to concate name inside a string
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class replaceString {

	public static void main(String[] args) {
		FunctionalUtility fu=new FunctionalUtility();
		 System.out.println("enter a name");
		 String s=FunctionalUtility.readString();
		 fu.checkConcate(s);
		
	}

}
