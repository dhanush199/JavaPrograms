/******************************************************************************
 *  Compilation:  javac -d bin Search_timings.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to implement different sorts and calculate timings for each sorts.
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Search_timings {
	public static void main(String args[]) 
	{  
		System.out.println("1.binarySearch method for integer 2.binarySearch method for String 3.insertionSort method for integer 4.insertionSort method for String");  
		System.out.println("select required option");
		int opt=FunctionalUtility.readInteger();
		System.out.println("enter the length of the array ");
		int n= FunctionalUtility.readInteger();
		String arr[] =new String[n];
		if(opt==1||opt==2) {			

			System.out.println("enter the elements of the array ");
			for(int i=0;i<n;i++)
				arr[i]= FunctionalUtility.readString();
			System.out.println("enter the element to be searched ");
			String x= FunctionalUtility.readString();
			long a=FunctionalUtility.start();
			int result = AlgorithmUtility.binarySearch(arr, 0, n-1, x);


			if (result == -1) {
				System.out.println("Element not present");
				long b=FunctionalUtility.end();
				long c=FunctionalUtility.elapse();
				System.out.println("time taken to execute Binary search for integer is "+(c)+ " millisec");
			}
			else
			{
				System.out.println("Element found at index " + result); 
				long b=FunctionalUtility.end();
				long c=FunctionalUtility.elapse();
				System.out.println("time taken to execute Binary search for integer is "+(c)+ " millisec");
			}

		}
		else if(opt==3)
		{
			System.out.println("enter the elements of the array ");
			for(int i=0;i<n;i++)
				arr[i]= FunctionalUtility.readString();
			long t3=System.nanoTime();
			String[] arr1=FunctionalUtility.sortArray(arr);
			System.out.println("insertion sort output is");
			long t4=System.nanoTime();
			for(int i=0;i<n;i++)
				System.out.println(arr1[i]);
			System.out.println("Time taken for insertion sort= "+(t4-t3)+" millisec");

		}

	}

} 


