package com.bridgelabz.utility;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class AlgorithmUtility {

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
	public static double getTempCelcius(double d){
		double celcius= (d-32)*5/9;
		return celcius;
	}
	public static double getTempFaren(double d){
		double faren= (d*9/5)+32;
		return faren;
	}

	public double calPayment(double P,double R,double Y) {
		double n=12*Y;
		double r=R/(12*100);
		return (P*r/1-Math.pow((1+r),-n));
	}
	public double calSqrt(double e,double c) {
		double t=c;
		while(Math.abs(t - c/t) > e*t ) {
			t=((c/t)+t)/2;
			System.out.println("Approximate sqrt is= "+t);
		}
		return t;

	}
	public void toBinary(int n) {
		int i=0;
		int binary[]=new int[100];
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(binary[j]);

		}
	}
	 public void bubbleSort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                } 
	    } 
	 public static void printArray(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i=0; i<n; ++i) 
				System.out.println(arr[i] + " "); 
		} 
	 public void swapNibble(int n) {
			int i=0;
			int binary[]=new int[100];
			while(n>0)
			{
				binary[i]=n%2;
				n=n/2;
				i++;
			}
			
			for(int j=i-1;j>=0;j--)
			{
				System.out.println(binary[j]);

			}

}
}
