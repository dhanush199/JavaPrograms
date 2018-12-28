package com.bridgelabz.algorithmprograms;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class AnagraPalindromFinal {
	public static void mai(String[] args) {
		
		System.out.println("The prime numbers between 0-1000 are");
		int num=FunctionalUtility.readInteger();
        List<String> primeList=new ArrayList<>();//declaration
        primeList=AlgorithmUtility.findPrime1(num);
        Set<String> primeAnagramSet=new HashSet<>();//declaration
        System.out.println("The prime numbers which are anagrams are");
        primeAnagramSet=AlgorithmUtility.findPrime(primeList);//method call
        Set<String> primePalindromeSet=new HashSet<>();//Set declaration
        System.out.println("The prime numbers which are anagram and palindrome are");
        primePalindromeSet=AlgorithmUtility.primePalindrome(primeAnagramSet);//method call
        System.out.println(primePalindromeSet);
	}

}
