package com.bridgalabz.functionalprograms;

import java.util.Random;

public class FunctionalUtility {
	public	void checkConcate(String s)
	{
		if(s.length()<3)
			System.out.println("enter a name with atleast 3 characters");
		else 
			System.out.println("Hi, "+s+", How are you?");
	}
	public void getCount(int count)
	{   int head=0,tail=0;
	int c=count;
	Random r=new Random();	
	while(count!=0)
	{
		int rn=r.nextInt(2);
		if(rn==0){
			++head;
		}
		else 
		{
			++tail;
		}
		count--;
	}
	System.out.println("perc of Head="+ head*100/c);
	System.out.println("perc of Tail="+ tail*100/c);

	}
	public void getLeaf(int x)
	{
		if(x%4==0 || x%400==0 && x%100==0)
			System.out.println("entered year is a leaf year");
		else
			System.out.println("entered year is not a leaf year");
	}

	public double getHarmonicNum(int n)
	{
		double sum=0.0;
		if(n==1)
			return 1;
		else{
			for(double i=1;i<=n;i++)
			{
				sum=sum+(1/i);

			}
			return sum;
		}

	}
	public void getPrimefactor(int n)
	{   
		int a[]={0};
		int b[]={0};
		int k=0,max=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				a[k]=i;
			    ++k;
			}
		}
		for(int j=0;j<a.length;j++)
		{
			if (a[j] > a[j+1] ) 
				max = a[j]; 

		}

		for(int i=2;i<max/2;i++)

		{
			if(a[i%n]!=0)
			{
				b[k]=a[i];
				System.out.println("b");
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("primeFactors are"+b[i]);
		}
	}
}



