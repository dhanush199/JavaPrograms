package com.bridgelabz.utility;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class AlgorithmUtility <E>{

	public static void checkAnagram(int len,String str1,String str2)
	{	
		//Function to check anagram or not
		int found=0,not_found = 0; 	// Flag initialization

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
	public static boolean checkPrime(long n) 
	{ 
		//Function to check Prime or not

		BigInteger b = new BigInteger(String.valueOf(n));		// Converting long to BigInteger 
		return(b.isProbablePrime(1));
	} 

	public int searchInt(LinkedList l,int size) {
		//method to search the element entered
		System.out.println(l);
		int flag=0;
		LinkedList l1=new LinkedList();
		l1=l;
		System.out.println("enter the element to be searched");
		int search=FunctionalUtility.readInteger();
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
		//Method to calculate the notes to be dispatched
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
			return calculate(money, notes);//method recursion
		}
	}
	public static double getTempCelcius(double d){
		//Method to convert entered degree temperature to Farenheat
		double celcius= (d-32)*5/9;
		return celcius;
	}
	public static double getTempFaren(double d){
		//Method to convert entered Farenheat temperature to degree  

		double faren= (d*9/5)+32;
		return faren;
	}

	public static double calPayment(double P,double R,double Y) {
		//Method to calculate monthyPayment  
		double n=12*Y;
		double r=R/(12*100);
		return (P*r/1-Math.pow((1+r),-n));
	}
	public static double calSqrt(double e,double c) {
		//Method to calculate sqrt of a number using Newtons Method
		double t=c;
		while(Math.abs(t - c/t) > e*t ) {
			t=((c/t)+t)/2;
			System.out.println("Approximate sqrt is= "+t);
		}
		return t;

	}
	public static void toBinary(int n) {
		//Method to convert Decimal number to binary
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

	}
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
	public static int[] toNibbleBinary(int n) {
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
	static int range,count,lower,upper,middle;
	private static int[] arr;

	public  static int findNumber(int lower,int upper,int middle,int count,String input1,int n)
	{
		Scanner rc=new Scanner(System.in);
		System.out.println("Is your number:"+middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input1=rc.nextLine();
		do
		{
			if (input1.equals("high"))
			{
				lower= middle;
				count++;
			}
			else if (input1.equals("yes"))
			{
				System.out.println("The number you thought was: "+middle);
				int no=count+1;
				System.out.println("It takes "+no+" times to find your exact number");
				break;
			}

			else if(input1.equals("low"))
			{
				upper=middle;
				count++;
			}
			if(count<n)
			{
				middle=(lower+ upper+1)/2;
				System.out.println("Is your number "+middle+":");
				input1=rc.nextLine();
			}
		}
		while(lower<=upper);
		if (count>n)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.exit(0);
		}
		return middle;
	}

	public static int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 

			// If the element is present at the 
			// middle itself 
			if (arr[mid] == x) 
				return mid; 

			// If element is smaller than mid, then 
			// it can only be present in left subarray 
			if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x); 

			// Else the element can only be present 
			// in right subarray 
			return binarySearch(arr, mid + 1, r, x); 
		} 

		// We reach here when element is not present 
		// in array 

		return -1; 

	} 

	public static int binarySearch(String arr[], int l, int r, String x) 
	{ 

		if (r >= l) { 
			int mid = l + (r - l) / 2; 

			// If the element is present at the 
			// middle itself 
			if (arr[mid].compareTo(x)==0)
				return mid; 

			// If element is smaller than mid, then 
			// it can only be present in left subarray 
			if (arr[mid].compareTo(x)>0) 
				return binarySearch(arr, l, mid - 1, x); 

			// Else the element can only be present 
			// in right subarray 
			return binarySearch(arr, mid + 1, r, x); 
		} 

		// We reach here when element is not present 
		// in array 

		return -1; 

	} 
	public static void prime(int range)
	{

		for(int i=1; i < 100; i++){

			int flag = 1;

			for(int j=2;j<i;j++){

				if(i % j == 0){
					flag = 0;
					break;

				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}


	}
	static int[] l=new int[100];
	static int k;
	public static Set<Integer>  prime1()
	{

		Set<Integer> set=new HashSet<>();
		int flag = 1;
		for(int i=1; i< 100; i++) {
			flag =1;
			for(int j=2;j<i;j++)
			{
				if(i%j == 0){
					flag=0;
					break;
				}
			}

			if(flag==1) {
				System.out.println("Prime Number" +i);
				set.add(i);
			}
		}

		//System.out.println(set);
		int len=set.size();
		return set;

	}
	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;

	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -10;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}

	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o |");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x |");
				} else
					System.out.print("   |");
			}
			System.out.println("|");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}
	/*
	 * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
	 * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
	 */

	public static void putVal() {
		int i;
		int j;
		if (player % 2 == 1) {
			i = (int) (Math.random() * 10) % 3;
			j = (int) (Math.random() * 10) % 3;
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("enter value of x and y by space");
			i = s.nextInt();
			j = s.nextInt();
		}
		if (BOARD[i][j] == -10) {
			if (player % 2 == 0) {
				BOARD[i][j] = 0;
			} else {
				BOARD[i][j] = 1;
				System.out.println("Coumputer Choosing " + i + " " + j);
			}
		} else
			putVal();

	}

	public static boolean win() {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	}

	public static void play() {
		initBoard();
		while (isEmpty) {
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			System.out.println("Computers turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Computer won");
				return;
			}
			player = 0;
		}
	}

	public static void checkAnagram12(Set<Integer> set)
	{
		int found=0,not_found = 0; // Flag initialization
		int arr[]=new int[set.size()];
		String[] sc=new String[set.size()];
		String k;
		Iterator iter = set.iterator();
		ArrayList<String> arrlist=new ArrayList<String>();

		int m=0;
		while(iter.hasNext()) {
			//for(Integer n:set)
			//{
			k=Integer.toString((int)iter.next());
			//sc[m]=k;
			//m++;
			arrlist.add(k);


		}
		System.out.println(arrlist);
		palindromString(arrlist);
		//	for(int n=-0;n<sc.length;n++)
		//	System.out.println(sc[n]);

		if(arrlist.isEmpty())
			for(int i=0;i<arrlist.size();i++) {
				String s1=arrlist.get(i);
				String s2=arrlist.get(i+1);
				checkAnagram1(sc[i].length(),s1,s2,arrlist);
			}
	}



	public static void checkAnagram1(int len,String str1,String str2,ArrayList<String> arrlist)
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
		if(not_found== 0) 
		{
			//for(int i=0;i<len-1;i++) {
			//int arry;
			palindromString(arrlist);
			//arry=Integer.parseInt(str1) ;
			//	System.out.println("Anagram numbers are: ");
			//System.out.println(arry);
			//String s=arry.t);
			//}
		}


	}
	public static void palindromString(ArrayList<String> arrlist) {
		String rev = null;
		//String strr=arry.toString();
		int length = arrlist.size();
		String s=null;
		for ( int i = 0; i<arrlist.size(); i++ )
		{
			s=arrlist.get(i);
			for ( int j = s.length(); j >= 0; j-- ) 
			{
				rev+=(s.charAt(j));
				if ( arrlist.contains(rev))
					System.out.println("the numbers which are palindrom = "+Integer.parseInt(rev));
			}
		}

	}
	public static Set<String> primeAnagram(List<String> primeList)
	{   



		Set<String> primeAnagramSet=new HashSet<>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.anagrams(primeList.get(i), primeList.get(j)))
				{
					//                    primeAnagramList.add(Integer.toString(i));
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i)+"    "+primeList.get(j) );
				}
			}
		}

		return primeAnagramSet;
	}


	public static Set<String> primePalindrome(Set<String> primeAnagramSet)
	{
		Iterator iter = primeAnagramSet.iterator();
		Set<String> resultSet=new HashSet<>();

		String a;
		while (iter.hasNext())
		{
			a=(String) iter.next();
			int a1=Integer.parseInt(a);
			int lk=reverse(a1);

			if(primeAnagramSet.contains(Integer.toString(lk)))

			{
				String b=Integer.toString(lk);
				resultSet.add(b);
			}


		}
		return resultSet;
	}


	public static int reverse(int n)
	{

		int reverse=0;
		while(n!=0)
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		return reverse;
	}

	public static List<String> findPrime(int num)
	{
		int flag=1;
		int i;
		List<String> arr=new ArrayList<>();
		int count=0;

		for( i=2;i<=num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				arr.add(String.valueOf(i));
			}
		}
		System.out.println(arr);
		return arr;
	}
	
}







