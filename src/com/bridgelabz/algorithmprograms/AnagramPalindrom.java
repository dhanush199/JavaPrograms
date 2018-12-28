/******************************************************************************
 *  Compilation:  javac -d bin Anagram_Palindrom.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to check whether the prime number present in the given range are palindrom and Anagram
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.utility.AlgorithmUtility;

public class AnagramPalindrom {


	public static void main(String[] args) {
		//	for(int i=1; i < 100; i++)
		Set<Integer> set=new HashSet<>();
		set=AlgorithmUtility.prime1();
		AlgorithmUtility.checkAnagram(set);
	}	
}









