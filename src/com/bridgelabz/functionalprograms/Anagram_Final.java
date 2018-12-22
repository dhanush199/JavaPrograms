package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgalabz.util.FunctionalLogic;

public class Anagram_Final {

	public static void main(String[] args)
	{
		String str1, str2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First String : ");
		str1 = scan.nextLine();
		System.out.print("Enter Second String : ");
		str2 = scan.nextLine();
 		int len1 = str1.length();
		int len2 = str2.length();
		FunctionalLogic fl=new FunctionalLogic();

		if(len1 == len2)
		{
			fl.checkAnagram(len1,str1,str2);

		}
		else
		{
			System.out.print("length of both Strings should be equal");
		}
	}

}


