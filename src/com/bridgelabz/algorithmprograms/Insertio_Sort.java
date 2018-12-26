package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class Insertio_Sort {

	public static void main(String[] args) {

		System.out.println("Enter the length of the array");
		int len=FunctionalUtility.readInteger();
		String[] arr = new String[len];
		for (int i=0; i<len; ++i) { 
			arr[i]=FunctionalUtility.readString();
		}
		arr=FunctionalUtility.sortArray(arr);
		for(int i=0;i<len; ++i)
			System.out.println(arr[i]);

	} 


}


