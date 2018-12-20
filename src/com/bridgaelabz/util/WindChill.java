package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class WindChill {

	public static void main(String[] args) {
		double n=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temparature in Farenheat");
		double t=Math.abs(sc.nextDouble());
		if(t>50) 
		{
			System.out.println("Invalid temparature");
		}
		System.out.println("Enter the temparature in Farenheat");
		 n=Math.abs(sc.nextDouble());
		if(n<120 || n>5)
		{
			FunctionalUtility fu=new FunctionalUtility();
			//double out=
			System.out.println(fu.getTemp(t,n));
		}
		

	}

}
