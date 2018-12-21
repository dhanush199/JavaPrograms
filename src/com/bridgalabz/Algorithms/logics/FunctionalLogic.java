package com.bridgalabz.Algorithms.logics;

import java.math.BigInteger;

import java.util.*;

public class FunctionalLogic <E>{

	public void checkAnagram(int len,String str1,String str2)
	{


		int found=0,not_found = 0;

		for(int i=0; i<len; i++)
		{

			for(int j=0; j<len; j++)
			{
				if(str1.charAt(i) == str2.charAt(j))
				{
					found = 1;
					break;
				}
			}
			if(found == 0)
			{
				not_found = 1;
				break;
			}
		}
		if(not_found== 1)

			System.out.print("Strings are not Anagram to Each Other");
		else

			System.out.print("Strings are Anagram");
	}
	//Prime Numbers
	public boolean checkPrime(long n) 
	{ 
		// Converting long to BigInteger 
		BigInteger b = new BigInteger(String.valueOf(n)); 

		return b.isProbablePrime(1); 
	} 

	public int searchInt(LinkedList l,int size) {
		System.out.println(l);
		Object o=new Object();
		int flag=0;
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1=l;
		System.out.println("enter the element to be searched");
		int search=sc.nextInt();
		Object obj=search;  
		for(int i=0;i<size;i++)
		{ 
			if((l.get(i)).equals(search))
			{ 
				flag=1;
				break;
			}

		}
		return flag;

	}
	static int i=0;
	static int total=0;
	static int money;
	public static   int calculate(int money,int[]notes)
	{
		int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+  "rs Notes are  " +calNotes );
			}
			i++;
			return calculate(money, notes);
		}
	}
}
