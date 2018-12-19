package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class Triplet {

	public static void main(String[] args) {
		System.out.println("Enter the Array size");
		Scanner sc=new Scanner(System.in);
		FunctionalUtility fu=new FunctionalUtility();
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
       int n=a.length;
		fu.getTriplet(a,n);
		//if(cont==0)
		//	System.out.println("entered array is has triplet numbers");
		//else
		//	System.out.println("entered array is not has any triplet numbers");
	}

}
