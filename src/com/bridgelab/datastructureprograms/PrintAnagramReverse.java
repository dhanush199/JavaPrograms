package com.bridgelab.datastructureprograms;

import java.util.*;
import com.bridgelabz.utility.CustomStack;
import com.bridgelabz.utility.DataStructureUtility;

public class PrintAnagramReverse {
	public static void main(String[]args) {
		List<List<Integer>> outsidelist = new ArrayList<List<Integer>>();
		List<Integer> innerlist= new ArrayList<Integer>();
		Set<Integer> set= new HashSet<Integer>();
		List<Integer> list= new ArrayList<Integer>();
		DataStructureUtility CustomList=new DataStructureUtility();
		CustomStack.arrayStack(1000);
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
		list.addAll(set);
		set=DataStructureUtility.primeAnagram(list);
		System.out.print("prime and Anagram numbers between 0 to 1000 are ");
		System.out.println(set);
		Iterator<Integer> itr=set.iterator(); 
		int mm=0;
		while(itr.hasNext()) {
			String i=itr.next().toString();
			DataStructureUtility.insert(CustomList, i);
			mm++;
		}
		DataStructureUtility.printList(CustomList);
		int[] array=DataStructureUtility.toIntConv(CustomList,mm);
		int[] arrray=DataStructureUtility.stringSort(array);
		for(int kk1=0;kk1<set.size()-1;kk1++)
			CustomStack.push(arrray[kk1]);
		System.out.println("Custom stack is");
		System.out.println("Reversed Palindrom array is :=");
		for(int k=0;k<set.size()-1;k++)
		System.out.println(CustomStack.pop());
	}
}
