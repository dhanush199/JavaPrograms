package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

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
		double rn=r.nextDouble();
		if(rn>.5){
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
	public void getLeap(int x)
	{
		if(x%4==0 || x%400==0 && x%100==0)
			System.out.println("entered year is a leap year");
		else
			System.out.println("entered year is not a leap year");
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

	}/*
	public void getPrimefactor(long n)
	{   
		int a[]=new int[1000];
		int b[]=new int[1000];
		int k=0;

		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				a[k++]=i;
			}
		}
		for(int j=0;j<a.length;j++)
		{
			int large=a[0];
			if (a[j] > large ) 
				large = a[j]; 

		}

		for(int i =2;i< large/2;i++)

		{

			if(i%n==0)
			{
				b[++k]=a[i];

			}
		}
		for(int i=0;a[i]!= 0;i++)
		{
			System.out.println("primeFactors are"+b[i]);
		}
	}
	 */

	//Gambler

	public void getResult(int s,int g,int t)
	{
		int win =0,loss=0,j=t;
		Random r=new Random();

		while(g-->0 && t-->0)
		{
			int n=r.nextInt(2);
			if(n==0)
			{
				s--;
				loss++;
			}
			else
			{
				win++;
				s++;
			}

		}
		System.out.println("Number of win="+win);
		System.out.println("Number of loss="+loss);
		System.out.println("win percentage="+win*100/j);
		System.out.println("win percentage="+loss*100/j);
		System.out.println("remaining stack"+s);
		System.out.println("remaining chances="+t);
		System.out.println("remaining goals"+g);

	}



	//Coupen

	public int getCoupenNumber(int n){
		boolean[] isCollected = new boolean[n];  
		int count = 0;                           
		int distinct = 0;   
		Random r=new Random();
		while (distinct < n) {
			int value =r.nextInt(n);// (int) (Math.random() * n);  
			count++;                                 
			if (isCollected[value]==false)  {
				distinct++;
				System.out.println(distinct);
				isCollected[value] = true;
			}
		}


		return count;
	}


	public void getTriplet(int [] a,int n)
	{ 
		boolean flag=false;

		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{

				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println("true");
						flag=true;
					}

				}
			}
		}

		if(flag==false){
			System.out.println("false");
		}
	}
	public double getTemp(double t,double v)
	{

		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return w;
	}
	public void getCoefficients(double a,double b,double c)
	{
		double d= b*b - 4*a*c;
		System.out.println("value of delta=" +d);
		if(d==0) 
		{
			System.out.println("Roots are equal and root1=root2 "+(-b/2*a));
		}
		else //if(d<0)
		{
			System.out.println("roots are equal root1="+ (-b + (Math.sqrt(Math.abs(d))/(2*a))));
			System.out.println("root2="+ (-b - (Math.sqrt(Math.abs(d))/(2*a))));
		}



	}
	public void getPerm(char ch[],int n)

	{    

		for(int j=0;j<n;j++)
		//for(int j=0;j<n*n;j++)
		{
			char temp=ch[j];
			ch[j]=ch[j+1];
			ch[j+1]=temp ;
			System.out.println(ch);
		}


	}

/////////////////////////////////////
public void checkAnagram(String s1,String s2)
{
	
	
	}

}

