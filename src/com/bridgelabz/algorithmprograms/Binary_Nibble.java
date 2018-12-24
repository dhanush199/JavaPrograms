package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class Binary_Nibble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nuber");
		int num=sc.nextInt();
		System.out.println("Equivalent binary number is "+num);
		System.out.println(AlgorithmUtility.swapNibbles(num));

	}

}
