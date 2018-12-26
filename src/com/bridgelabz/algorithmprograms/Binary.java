package com.bridgelabz.algorithmprograms;


import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter a number>0");
        int num=FunctionalUtility.readInteger();
        AlgorithmUtility algorithmUtility=new AlgorithmUtility();
        algorithmUtility.toBinary(num);

	}

}
