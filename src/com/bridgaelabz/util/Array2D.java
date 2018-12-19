package com.bridgaelabz.util;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int m=3,n=2;
		System.out.println ("Enter array"+m*n+" elements");
		int[][] intArray = new int[100][100];
       
	Scanner sc=new Scanner(System.in);

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{

				intArray[i][j]=sc.nextInt();;

			}
		}
		PrintWriter out1=new PrintWriter(System.out,true);
		for(int i=0;i<m;i++)
		{

			for(int j=0;j<n;j++)
			{

				out1.print(intArray[i][j]+" ");
			}

			out1.println();
		}
	}
}


