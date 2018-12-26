package com.bridgelabz.algorithmprograms;

//import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;



public class SwapNibbles {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("enter the Value of n");
		int x =FunctionalUtility.readInteger();
		int c=AlgorithmUtility.swapNibbles(x);
		System.out.println(c);
		int[] d=AlgorithmUtility.toNibbleBinary(c);
		for(int j=7;j>=0;j--)
		{
			System.out.println(d[j]);
		}

		for (int i = 1; i < c; i++) {

			if (Math.pow(2, i) == c)
				flag =1;
			
		}
		if(flag==1)
			System.out.println("number is power of 2");

		else 
			System.out.println("number is not a power of 2");



	}


}






