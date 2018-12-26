
/******************************************************************************
 *  Compilation:  javac -d bin CheckAnagram.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Determines whether the given Strings are anagram or not.
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;
import com.bridgelabz.utility.AlgorithmUtility;



public class CheckAnagram {

	public static void main(String[] args)
	{
		String str1, str2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First String : ");
		str1 = scan.nextLine();
		System.out.print("Enter Second String : ");
		str2 = scan.nextLine();
 		int len1 = str1.length();                          //len1 holds Length of first String
		int len2 = str2.length();                          //len1 holds Length of first String
		AlgorithmUtility fl=new AlgorithmUtility();

		if(len1 == len2)                                   // Check for string length are equal or not
		{
			fl.checkAnagram(len1,str1,str2);

		}
		else
		{
			System.out.print("length of both Strings should be equal");//print if length ar e not equal
		}
	}

}


