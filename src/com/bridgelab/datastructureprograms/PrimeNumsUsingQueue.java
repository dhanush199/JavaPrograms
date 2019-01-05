package com.bridgelab.datastructureprograms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import com.bridgelabz.utility.CustomQueue;
import com.bridgelabz.utility.DataStructureUtility;

public class PrimeNumsUsingQueue {
	public static void main(String[] args)
	{
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		CustomQueue q=new CustomQueue(1000);
		for(int i=0;i<1000;i++) {
			int flag=DataStructureUtility.checkPrime(i);
			if(flag==0)
				list1.add(i);
		}
		set=DataStructureUtility.primeAnagram1(list1);
		System.out.println("prime anagrams in Stack in reverse order:");
		System.out.println(set);
		java.util.Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			q.insert(itr.next());
		}
		q.display();
	}        
}


