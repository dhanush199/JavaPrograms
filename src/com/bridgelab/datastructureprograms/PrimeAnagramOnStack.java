package com.bridgelab.datastructureprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.bridgelabz.utility.DataStructureUtility;

public class PrimeAnagramOnStack {

	public static void main(String[] args) {
	    Stack<Integer> stack=new Stack<Integer>();
	    List<Integer> list2 = new ArrayList<Integer>();
	    list2 = DataStructureUtility.findPrime(0,1000); //finding prime
	    stack=DataStructureUtility.primeAnagram2(list2); //finding anagram
	    System.out.println(stack.size()+" is the size of the stack");
	    System.out.println("Printing the elements in reverse order using pop function of stack");
	    while(!stack.isEmpty())
	    {
	        System.out.println(stack.pop()+" "+stack.pop());
	    }
	}
}
