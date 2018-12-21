package com.bridgaelabz.util;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first string");
		String s1=sc.nextLine();
		System.out.println("Enter a second string");
		String s2=sc.nextLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		s1= s1.toUpperCase();
		s2= s2.toUpperCase();
		char[] letters = s1.toCharArray();
		char[] letters1= s2.toCharArray();
		

		for (char ch : letters) {
			sb.append((byte) ch);
		}
		for (char ch1 : letters1) {
			sb1.append((byte) ch1);
		}
		if((sb.toString()).equals(sb1.toString()))
			System.out.println("Entered strings are anagrams");
		else
			System.out.println("Entered strings are not anagrams"); 
	}
}
