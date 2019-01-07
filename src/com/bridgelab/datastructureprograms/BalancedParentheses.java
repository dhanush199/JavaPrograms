/******************************************************************************
 *  Compilation:  javac -d bin BalancedParentheses.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinarySearch n
 *  
 *  Purpose: program to check weather an expression contains balanced Parantheses or not
 *  @author  Dhanush
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.StackCustum;

public class BalancedParentheses {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter an exopression containing ()");
		String exprn=DataStructureUtility.readString();
		char[] chArray = exprn.toCharArray();
		 StackCustum stack=new StackCustum(chArray.length);
		int check=DataStructureUtility.checkBalancedParantheses(chArray);
		if(check==0 && chArray[0]!=')') 
			System.out.println("TRUE= Entered expression has balanced parantheses");
		else
			System.out.println("False= Entered expression does not have balanced paranthesis");	
	}
}
