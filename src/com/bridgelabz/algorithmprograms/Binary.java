package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number>0");
        int num=sc.nextInt();
        AlgorithmUtility algorithmUtility=new AlgorithmUtility();
        algorithmUtility.toBinary(num);

	}

}
