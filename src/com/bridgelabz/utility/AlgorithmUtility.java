package com.bridgelabz.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class AlgorithmUtility {

	public void checkAnagram(int len,String str1,String str2)
	{
		int found=0,not_found = 0; // Flag initialization

		for(int i=0; i<len; i++)
		{

			for(int j=0; j<len; j++)
			{
				if(str1.charAt(i) == str2.charAt(j)) //Check for the presence of all the character of str 1 and str 2
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

	///////////////////////////////////////////////////

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

	public static int[] bubbleStringSort(String codes[]) 
	{   
		int[] intarray=new int[codes.length];
		int i=0;
		for(String str:codes){
			intarray[i]=Integer.parseInt(str);
			i++;
			for ( i = 0; i < codes.length-1; i++) 
			{
				for (int j = 0; j < codes.length-i-1; j++) 
					if (intarray[j] > intarray[j+1]) 
					{ 
						// swap arr[j+1] and arr[i] 
						int temp = intarray[j]; 
						intarray[j] = intarray[j+1]; 
						intarray[j+1] = temp; 
					} 
			}




		}
		return intarray;

	}

	public static void merge(int arr[], int beg, int mid, int end)  
	{  

		int l = mid - beg + 1;  
		int r = end - mid;  

		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r];  

		for (int i=0; i<l; ++i)  
			LeftArray[i] = arr[beg + i];  

		for (int j=0; j<r; ++j)  
			RightArray[j] = arr[mid + 1+ j];  
		int i = 0, j = 0;  
		int k = beg;  
		while (i<l&&j<r)  
		{  
			if (LeftArray[i] <= RightArray[j])  
			{  
				arr[k] = LeftArray[i];  
				i++;  
			}  
			else  
			{  
				arr[k] = RightArray[j];  
				j++;  
			}  
			k++;  
		}  
		while (i<l)  
		{  
			arr[k] = LeftArray[i];  
			i++;  
			k++;  
		}  

		while (j<r)  
		{  
			arr[k] = RightArray[j];  
			j++;  
			k++;  
		}  
	}  

	void sort(int arr[], int beg, int end)  
	{  
		if (beg<end)  
		{  
			int mid = (beg+end)/2;  
			sort(arr, beg, mid);  
			sort(arr , mid+1, end);  
			merge(arr, beg, mid, end);  
		}  
	} 
	public static void mergeSort(String array[],int low,int high)
	{
		int n=high-low;
		if(n<=1)
			return;
		int mid=low+n/2;
		mergeSort(array,low,mid);
		mergeSort(array,mid,high);
		String[] temparr=new String[n];
		int i=low,j=mid;
		for(int k=0;k<n;k++)
		{
			if(i==mid)
				temparr[k]=array[j++];
			else if(j==high)
				temparr[k]=array[i++];
			else if(array[j].compareToIgnoreCase(array[i])<0)
				temparr[k]=array[j++];
			else
				temparr[k]=array[i++];
		}

		for(int k=0;k<n;k++)
		{
			array[low +k]=temparr[k];
		}
	}
	public int[] toNibbleBinary(int n) {
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
		return binary;
	}
	public static int swapNibbles(int x) 
	{ 
		System.out.println("first value "+ (x & 0x0F));
		System.out.println("first value "+ (x & 0xF0));

	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	} 
	public static int binarySearch(String [] str,String key)
    {
        //int n=str.length;
        int first  = 0;
        int last   = str.length - 1;
        int middle = (first + last)/2;
    
        while( first <= last )
        {
          if ( str[middle].compareTo(key)<0 )
            first = middle + 1;    
          else if ( str[middle].equalsIgnoreCase(key) )
          {
           return middle;
          }
          else
             last = middle - 1;
    
          middle = (first + last)/2;
       }
     return -1;
    }
	public static String []  sort(String [] str)
    {
        int len=str.length;
        for (int i = 0; i < len; i++){
            for (int j = i+1; j < len; j++) {
                if (str[i].compareTo(str[j])>0) {
                    String temp;
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        return str;
    }

}

