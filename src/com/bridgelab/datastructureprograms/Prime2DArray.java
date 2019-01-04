package com.bridgelab.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;

public class Prime2DArray {
	public static void main(String[] args) {
		List<List<Integer>> outsidelist = new ArrayList<List<Integer>>();
        List<Integer> innerlist= new ArrayList<Integer>();
        System.out.println("prime number of the range 0 to 1000");
        int m=0;
        int n=100;
        for(int i=1;i<=10;i++)
        {
        innerlist= DataStructureUtility.primeNumbers(m,n);
        outsidelist
        .add(innerlist);
        System.out.print("prime no between "+ m +" and "+  n);
        System.out.print(" ");
        System.out.println(innerlist);
        m+=100;
        n+=100;
        }
	}
}
