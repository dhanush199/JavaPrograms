package com.bridgaelabz.util;

import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgalabz.functionalprograms.FunctionalUtility;

public class Array2D {

	public static void main(String[] args) {

		//E[][] intArray = new int[100][100];
		Scanner sc=new Scanner(System.in);
		FunctionalUtility fu=new FunctionalUtility();
		System.out.println("Enter the number of row required");
		int m=sc.nextInt();//read number of Row
		System.out.println("Enter the number of column required");
		int n=sc.nextInt();//read number of Column
		//Integer[][] intArray=new Integer[m][n];
		System.out.println("select array type 1.  2.Integer Boolean 3.Double 4.String");
		int selection =sc.nextInt();
		while(true){
			switch(selection){
			case 1: System.out.println("Enter "+(m*n)+"enteger numbers");
			Character [][] charArra=new Character[m][n];

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					charArra[i][j]=sc.next().charAt(0) ;//read array elements

				}
			}
			fu.display(charArra,m,n);
			break;
			case 2: System.out.println("Enter "+(m*n)+"enteger numbers");
			Integer [][] intArra=new Integer[m][n];

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					intArra[i][j]=sc.nextInt() ;//read array elements

				}
			}
			fu.display(intArra,m,n);
			break;
			case 3: System.out.println("Enter "+(m*n)+"enteger numbers");
			Double [][] doubleArr=new Double[m][n];

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					doubleArr[i][j]=sc.nextDouble() ;//read array elements

				}
			}
			fu.display(doubleArr,m,n);
			break;
			case 4: System.out.println("Enter "+(m*n)+"enteger numbers");
			String [][] stringArr=new String[m][n];

			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					stringArr[i][j]=sc.nextLine() ;//read array elements

				}
			}
			fu.display(stringArr,m,n);
			break;
			default: System.out.println("Please enter a valid input"); 
				break;
			}
		}

		
	}
}


