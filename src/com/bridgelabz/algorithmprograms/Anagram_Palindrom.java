package com.bridgelabz.algorithmprograms;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.utility.AlgorithmUtility;
//import com.bridgelabz.utility.FunctionalUtility;

public class Anagram_Palindrom {


	public static void main(String[] args) {
		//	for(int i=1; i < 100; i++)
		Set<Integer> set=new HashSet<>();
		set=AlgorithmUtility.prime1();
		AlgorithmUtility.checkAnagram(set);
	}	
}









