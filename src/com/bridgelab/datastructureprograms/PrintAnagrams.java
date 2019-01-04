package com.bridgelab.datastructureprograms;

import java.util.*;

import com.bridgelabz.utility.DataStructureUtility;

public class PrintAnagrams {
	public static void main(String[]args) {
		List<List<Integer>> outsidelist = new ArrayList<List<Integer>>();
		List<Integer> innerlist= new ArrayList<Integer>();
		Set<Integer> set= new HashSet<Integer>();
		List<Integer> list1= new ArrayList<Integer>();
		List<Integer> list= new ArrayList<Integer>();
		int m=0;
		int n=100;
		for(int i=1;i<=10;i++)
		{
			innerlist= DataStructureUtility.primeNumbers(m,n);
			outsidelist.add(innerlist);
			m+=100;
			n+=100;
			set.addAll(innerlist);
		}
		System.out.print("Prime numbers between 0 to 1000 are ");
		System.out.println(set);
		//System.out.println(set.size());
		list.addAll(set);
		set=DataStructureUtility.primeAnagram(list);
		System.out.print("prime and Anagram numbers between 0 to 1000 are ");
		System.out.println(set);
		list1.addAll(set);
		//System.out.println("Total prime come Anagram numbers are "+set.size());
		//DataStructureUtility.setCompareList(outsidelist,list1);
		for (int i = 0; i < list1.size(); i++) 
		{
			if(list.contains(list1.get(i)));
			list.remove(list1.get(i));
		}
		System.out.print("prime Numbers which are not anagrams are ");
		System.out.println(list);
		//System.out.println(list.size());
	}
}
