/******************************************************************************
 *  Compilation:  javac -d bin AnagramicPalindrom.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinarySearch n
 *  
 *  Purpose: To print the numbers which are prime as well as anagram in the range 0-1000 using Queue
 *  @author  Dhanush
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.AlgorithmUtility;

public class AnagramicPalindrom {
	public static void main(String[] args) throws Exception {
		System.out.println("The Prime Nos between 0 to 1000 which are also the  Pallindrome");
		AlgorithmUtility.primePallindrome();
		System.out.println();
		System.out.println("The Numbers which are Prime, Pallindrome and Anagrams :");
		AlgorithmUtility.primeAnagrams();
	}
}