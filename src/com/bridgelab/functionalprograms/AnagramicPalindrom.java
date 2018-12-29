/******************************************************************************
 *  Compilation:  javac -d bin PalindromePrime.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinarySearch n
 *  
 *  Purpose: Searching the integer value by using Binary search
 *  @author  Dhanush
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprograms;
import com.bridgelabz.utility.AlgorithmUtility;

public class AnagramicPalindrom {
	public static void main(String[] args) {
		System.out.println("The Prime Nos between 0 to 1000 which are also the  Pallindrome");
		AlgorithmUtility.primePallindrome();
		System.out.println();
		System.out.println("The Numbers which are Prime, Pallindrome and Anagrams :");
		AlgorithmUtility.primeAnagrams();
	}
}