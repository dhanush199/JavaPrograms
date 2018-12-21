package com.bridgaelabz.util;

import java.util.Scanner;

import com.bridgalabz.Algorithms.logics.FunctionalLogic;

public class Anagram_Final {

	public static void main(String[] args)
	{
		String str1, str2;
		int len1, len2;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter First String : ");
		str1 = scan.nextLine();
		System.out.print("Enter Second String : ");
		str2 = scan.nextLine();

		len1 = str1.length();
		len2 = str2.length();
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


