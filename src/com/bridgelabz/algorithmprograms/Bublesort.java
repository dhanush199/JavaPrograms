package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;
import java.util.Scanner;

public class Bublesort {

	public static void main(String args[]) 
	{ 
		FunctionalUtility fl = new FunctionalUtility(); 
		//int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
		System.out.print("Enter the size of input array");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int arry[]=new int[n];
		System.out.println("Enter the input array");
		for (int i=0; i<n; ++i) 
			arry[i]=sc.nextInt();
        AlgorithmUtility algorithmUtility=new AlgorithmUtility();

		algorithmUtility.bubbleSort(arry); 
		System.out.println("Sorted array"); 
		algorithmUtility.printArray(arry);
	} 

	
}


