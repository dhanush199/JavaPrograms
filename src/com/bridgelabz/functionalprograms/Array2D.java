/******************************************************************************
 *  Compilation:  javac -d bin Array2D.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Program to read and to print 2D array.
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;


public class Array2D {

	public static void main(String[] args) {

		//E[][] intArray = new int[100][100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row required");
		int row=sc.nextInt();//read number of Row
		System.out.println("Enter the number of column required");
		int col=sc.nextInt();//read number of Column
		System.out.println("select array type 1.  2.Integer Boolean 3.Double 4.String");
		int selection =sc.nextInt(); //read array type
		while(true){
			switch(selection){
			case 1: System.out.println("Enter "+(row*col)+"enteger numbers"); //To read/print Character array
			Character [][] charArra=new Character[row][col];

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					charArra[i][j]=sc.next().charAt(0) ;//read array elements

				}
			}
		//	fu.display(charArra,m,n);
			break;
			case 2: System.out.println("Enter "+(row*col)+"enteger numbers");//To read/print integer array
			Integer [][] intArra=new Integer[row][col];

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					intArra[i][j]=sc.nextInt() ;//read array elements

				}
			}
		//	fu.display(intArra,m,n);
			break;
			case 3: System.out.println("Enter "+(row*col)+"enteger numbers");
			Double [][] doubleArr=new Double[row][col];

			for(int i=0;i<col;i++)
			{
				for(int j=0;j<col;j++)
				{
					doubleArr[i][j]=sc.nextDouble() ;//read array elements

				}
			}
		//	fu.display(doubleArr,m,n);
			break;
			case 4: System.out.println("Enter "+(row*col)+"enteger numbers");//To read/print string array
			String [][] stringArr=new String[row][col];

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					stringArr[i][j]=sc.nextLine() ;//read array elements

				}
			}
		//	fu.display(stringArr,m,n);
			break; 
			default: System.out.println("Please enter a valid input"); 
				break;
			}
		}

		
	}
}

