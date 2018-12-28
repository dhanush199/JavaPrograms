/******************************************************************************
 *  Compilation:  javac -d bin Triplet.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to find the triplet numbers
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class Triplet {

	public static void main(String[] args) {
		System.out.println("Enter the Array size");
		int num=FunctionalUtility.readInteger();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=FunctionalUtility.readInteger();
		}
		int n=a.length;
		FunctionalUtility.getTriplet(a,n);
	}

}
