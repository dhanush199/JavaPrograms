package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

import java.io.*;

public class BinarySearch_Sort {
	AlgorithmUtility algorithmUtility=new AlgorithmUtility();

	String [] codes = new String[100];
	int i = 0;
	private Scanner readCodes;
	public void openCodesFile() {
		try {
			readCodes = new Scanner(new File("/home/admin1/Desktop/Files/example.txt"));
		} catch (Exception e) {
			System.out.println("Could not locate the data file!");
		}
	}
	public void readCodesFile() {
		while(readCodes.hasNext()) {
			codes[i] = readCodes.nextLine();
			i++;
			System.out.println(codes[i]);
		}
		//algorithmUtility.bubbleStringSort(codes);
		int a[]=AlgorithmUtility.bubbleStringSort(codes);
		System.out.println(a);
	}
	public void closeCodesFile() {
		readCodes.close();
	}
}

