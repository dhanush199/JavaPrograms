package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Your_Number {

	public static void main(String[] args) {
		System.out.println("Enter any Number:");
		int n=FunctionalUtility.readInteger();
		int range=(int)(Math.pow(2,n));          //range calculation for the number
		System.out.println("Take number between '0' to "+(range-1));
		int count=0;
		String input1 = null;
		int lower=0;
		int upper=range;
		int middle=(lower+upper/2);
		AlgorithmUtility.findNumber(lower,upper,middle,count,input1,n);
	}

}

