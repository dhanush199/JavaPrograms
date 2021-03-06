package com.bridgelabz.utility;
import java.util.Random;
import java.util.Scanner;

public class FunctionalUtility {
	static Scanner scanner=new Scanner(System.in);
	public static int readInteger() {

		return scanner.nextInt();
	}
	public static double readdouble() {
		return scanner.nextDouble();
	}
	public static String readString() {
		return scanner.next();
	}
	public	static String checkConcate(String s1,String s)
	{
		if(s.length()<3)
			System.out.println("enter a name with atleast 3 characters");
		else 
			s1=s1.replaceAll("<<Name>>", s);
		return s1;
	}
	public static double[] getCount(int count)
	{ 
		// Method to calculate head and tail count in percentage
		double head=0,tail=0;
		double a[]=new double[2];
		Random r=new Random();	
		while(count!=0)
		{
			double rn=r.nextDouble(); //generate a decimal random number between 0 to 1.
			if(rn>=.5){ //if rn>.5 increment head count
				++head;
			}
			else 
			{
				++tail;//if rn<.5 increment head count
			}
			count--;
		}
		a[0]=head;
		a[1]=tail;
		return a;
	}
	public void getLeap(int x) // Function to calculate the leaf year
	{
		if(x%4==0 || x%400==0 && x%100==0)
			System.out.println("entered year is a leap year");
		else
			System.out.println("entered year is not a leap year");
	}
	public double getHarmonicNum(int n) 
	{
		// function to calculate harmonic value of a number
		double sum=0.0;
		if(n==1)   // user input is 1
			return 1;
		else{
			for(double i=1;i<=n;i++)
			{
				sum=sum+(1/i);

			}
			return sum;
		}
	}
	//Gambler

	public static int[] getResult(int s,int g,int t) 
	{
		// function for gambler
		int[]arr=new int[2];
		Random r=new Random();

		while(t!=0)
		{
			int n=r.nextInt(2); // if n==0 then lost & if n==1 player wins
			if(n==0)
			{
				s--;
				arr[0]++;// stores loss count
				t--;
			}
			else
			{
				s++;
				arr[1]++;// stores win count
				t--;
			}
		}
		return arr;
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
	public static void getTriplet(int [] a,int n)
	{ 
		//Method to get triplet number
		boolean flag=false;
		int count=0;

		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println("true");
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
						System.out.println();
						flag=true;
						count++;
					}
				}
			}
		}
		System.out.println("given array has "+count+" pairs of triplet numbers in it");
		if(flag==false){
			System.out.println("givebn array does not have any triplet numbers");
		}
	}
	public double getTemp(double t,double v)
	{
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return w;
	}
	public static void getCoefficients(double a,double b,double c)
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
	public static void getPerm(char ch[],int n)
	{    
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp ;
				displayArray(ch);
			}
		}
	}
	public static void displayArray(char[] a){
		System.out.println(a);
	}
	public static double calDistatce(double a,double b)
	{
		return (Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
	}
	public static String[] sortArray(String str[]) {
		int length=str.length;
		for(int i=1;i<length;i++)
		{
			String key=str[i];
			int j=i-1;
			while(j>=0 && ((str[j].compareTo(key))>0))
			{
				str[j+1]=str[j];
				j=j-1;
			}
			str[j+1]=key;
		}
		return str;
	}
	static long starttime,endtime;
	public static long start()
	{
		starttime= System.currentTimeMillis();

		return(starttime);
	}
	public static long end()
	{
		endtime= System.currentTimeMillis();
		return(endtime);
	}
	public static long elapse(long a,long b) {
		long elaspedtime=  b-a;
		return(elaspedtime);
	}
	public static void primeFactors(int n) {
		while (n % 2 == 0)   // to check that number is divisible by 2
		{
			System.out.print(2 + " ");
			n /= 2;
		}
		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				System.out.print(i + " "); // number to print
				n /= i;
			}
		}
		if (n > 2) {
			System.out.println(n);
		}
	}
	public static void powerOf2(int n1) {
		double k=0;
		for(int i=0;i<=n1;i++) {
			k= Math.pow(2.0,i);
			System.out.println("value="+k);}
	}
}
