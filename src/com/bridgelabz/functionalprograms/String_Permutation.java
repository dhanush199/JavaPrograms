package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class String_Permutation {

	public static void main(String[] args) {

		String s= "abcd";
		int n=s.length();
		char ch[]=new char[n*n];
		ch=s.toCharArray();
		//char[] a=new char[1000000]
		FunctionalUtility f=new FunctionalUtility();
		//a=ch;
		f.getPerm(ch,n);
		//do {
			//f.getPerm(ch,n);
		//} while(a!=ch);


	}
}
