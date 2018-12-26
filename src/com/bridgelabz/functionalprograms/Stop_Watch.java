package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class Stop_Watch {

	public static void main(String[] args) {
		long a =FunctionalUtility.start();
		System.out.println(a);
		long b=FunctionalUtility.end();
		System.out.println(b);
		long c=FunctionalUtility.elapse();
		System.out.println(c+" millisec");
		
	}

}


