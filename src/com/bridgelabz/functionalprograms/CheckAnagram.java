
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
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class CheckAnagram {
	public static void main(String[] args)
	{
		String str1, str2;
		System.out.print("Enter First String : ");
		str1 = FunctionalUtility.readString();
		System.out.print("Enter Second String : ");
		str2 = FunctionalUtility.readString();
		int len1 = str1.length();                          //len1 holds Length of first String
		int len2 = str2.length();
		str2=str2.toUpperCase(); 
		str1=str1.toUpperCase(); 
		//len1 holds Length of first String
		if(len1 == len2)                                   // Check for string length are equal or not
		{
			boolean a=AlgorithmUtility.isAnagram(str2,str1);
			if(!a){
				System.out.print("Strings are not Anagram to Each Other");
			}
			else
				System.out.print("Strings are Anagram");
		}
		else
		{
			System.out.print("length of both Strings should be equal");//print if length ar e not equal
		}
	}
}





