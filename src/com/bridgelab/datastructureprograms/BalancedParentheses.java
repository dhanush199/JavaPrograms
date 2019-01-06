package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.CustomStack;
import com.bridgelabz.utility.DataStructureUtility;

public class BalancedParentheses {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter an exopression containing ()");
		String exprn=DataStructureUtility.readString();
		char[] chArray = exprn.toCharArray();
		CustomStack.arrayStack(chArray.length);	
		int check=DataStructureUtility.checkBalancedParantheses(chArray);
		if(check==0 && chArray[0]!=')') 
			System.out.println("TRUE= Entered expression has balanced parantheses");
		else
			System.out.println("False= Entered expression does not have balanced paranthesis");	
	}
}
