package com.bridgelabz.utility;
import java.util.*;
import java.math.BigInteger;

public class AlgorithmUtility <E>{
	/** 
	 * static function to checkAnagram
	 *
	 */
	public static void checkAnagram(String str1,String str2)
	{	
		//Function to check anagram or not
		int found=0,not_found = 0; 	// Flag initialization

		for(int i=0; i<str1.length(); i++)
		{
			for(int j=0; j<str1.length(); j++)
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
	/** 
	 * static function to checkPrime
	 *
	 */
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
	/** 
	 * static function to checkPrime
	 * @param i is used to store index value of array Money
	 * @param total is to get the sum of notes
	 */

	static int i=0;
	static int total=0;
	//static int money;
	public static int calculate(int money,int[]notes)
	{
		//Method to calculate the notes to be dispatched
		int rem;
		if(money==0)
		{
			System.out.println("Total notes="+total);

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
			return (calculate(money, notes));//method recursion
		}
	}
	/** 
	 * static function to convert temperature from farehinite to celcius 
	 *
	 */
	public static double getTempCelcius(double d){
		//Method to convert entered degree temperature to Farenheat
		double celcius= (d-32)*5/9;
		return celcius;
	}
	/** 
	 * static function to convert temperature from celcius to farehinite 
	 */
	public static double getTempFaren(double d){

		double faren= (d*9/5)+32;
		return faren;
	}
	/** 
	 * static function to calculate payment
	 */
	public static double calPayment(double P,double R,double Y) {
		double n=12*Y;
		double r=R/(12*100);
		return (P*r/1-Math.pow((1+r),-n));
	}
	/** 
	 * static function to calculate sqrt of a numjber using newtons method
	 */
	public static double calSqrt(double e,double c) {
		//Method to calculate sqrt of a number using Newtons Method
		double t=c;
		while(Math.abs(t - c/t) > e*t ) {
			t=((c/t)+t)/2;
			System.out.println("Approximate sqrt is= "+t);
		}
		return t;
	}
	/** 
	 * static function to convert decimal number to binary
	 */
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

		for(int j=i+2;j>=0;j--)
		{
			System.out.println(binary[j]);

		}
	}
	/** 
	 * static function to implement bubble sort
	 */
	public static void bubbleSort(int arr[]) 
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
	/** 
	 * static function to printthe array element
	 */
	public static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.println(arr[i] + " "); 
	}  
	/** 
	 * static function to swap the nibbles of a binary number
	 */
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
	/** 
	 * static function to insert the name at a specified locatoion of a gven string
	 */

	public	void checkConcate(String s,String username)
	{
		if(s.length()<3)
			System.out.println("enter a name with atleast 3 characters");
		else 
			System.out.println("Hi, "+s+", How are you?");
	}
	/** 
	 * static function to calculate percentage of head and tail in a given count
	 */
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
	/** 
	 * static function to check weather the entered year is leaf year or not
	 */
	public void getLeap(int x)
	{
		if(x%4==0 || x%400==0 && x%100==0)
			System.out.println("entered year is a leap year");
		else
			System.out.println("entered year is not a leap year");
	}
	/** 
	 * static function to calculate haremoinic number
	 */
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
	/**
	 * static function to coupon
	 *
	 * @param stake the amount that is at stake
	 * @param goal*(g) the amount to be obtained
	 * @param no_of_times(t) the number of times gambled
	 */
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
	/**
	 * static function to assign distinct values fo0r a given set of coupens
	 */
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
	/**
	 * static function to check whether the array contains triplet number or not
	 */

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
	/**
	 * static function to calculate the temparature  
	 */
	public double getTemp(double t,double v)
	{
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return w;
	}
	/**
	 * static function to get the co-efficiemnts of a quadratic equation
	 */
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
	/**
	 *  function to idsplay permutation of a string
	 */
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
	/**
	 * static function to implementg bubble sort
	 */
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
	/**
	 * static function to implementg merge sort
	 */
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
	/**
	 * static function to implementg merge sort
	 */


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
	/**
	 * static function to implementg bubble sort
	 */
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
				temparr[k]=
				array[i++];
		}

		for(int k=0;k<n;k++)
		{
			array[low +k]=temparr[k];
		}
	}
	/**
	 * static function to convert decimal to binary
	 */
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
	/**
	 * static function to swap binary number nibbles
	 */

	public static int swapNibbles(int x) 
	{ 
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	} 
	/**
	 * static function to implementg binary search
	 */
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
	/**
	 * static function to insertion sort
	 */
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
	/**
	 * static function to guess the number
	 *@param range is used to restric the user number
	 */
	static int range,count,lower,upper,middle;
	//private static int[] arr;
	public  static int findNumber(int lower,int upper,int middle,int count,String input1,int n)
	{
		System.out.println("Is your number:"+middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input1=FunctionalUtility.readString();
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
				input1=FunctionalUtility.readString();
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
	/**
	 * static function to implement binary search
	 */
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
	/**
	 * static function to implement binary search
	 */
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
	/**
	 * static function to get prime numbers withing the given range
	 */
	public static void prime(int range)
	{

		for(int i=1; i <= range; i++){

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
	/**
	 * static function to get prime numbers withing the given range
	 */
	//static int[] l=new int[100];
	//static int k;
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
		return set;
	}
	/**
	 * static function to implement binary search
	 */
	static int player = 0;
	static int[][] B = new int[3][3];
	static boolean isEmpty = true;

	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				B[i][j] = -100;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}
	/**
	 * static function to implement binary search
	 */
	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < B.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < B[i].length; j++) {
				if (B[i][j] == 0) {
					count++;
					System.out.print(" o |");
				} else if (B[i][j] == 1) {
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
	/**
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
			System.out.println("enter value of x and y by space");
			i = FunctionalUtility.readInteger();;
			j = FunctionalUtility.readInteger();
		}
		if (B[i][j] == -10) {
			if (player % 2 == 0) {
				B[i][j] = 0;
			} else {
				B[i][j] = 1;
				System.out.println("Coumputer Choosing " + i + " " + j);
			}
		} else
			putVal();

	}

	public static boolean win() {
		return ((   B[0][0] + B[0][1] + B[0][2] == player * 3)
				|| (B[1][0] + B[1][1] + B[1][2] == player * 3)
				|| (B[2][0] + B[2][1] + B[2][2] == player * 3)
				|| (B[0][0] + B[1][0] + B[2][0] == player * 3)
				|| (B[0][1] + B[1][1] + B[2][1] == player * 3)
				|| (B[0][2] + B[1][2] + B[2][2] == player * 3)
				|| (B[0][0] + B[1][1] + B[2][2] == player * 3)
				|| (B[2][0] + B[1][1] + B[0][2] == player * 3));
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
	/**
	 * static function to check anagram or not
	 */
	public static void checkAnagram12(Set<Integer> set)
	{
		//int found=0,not_found = 0; // Flag initialization
		//	int arr[]=new int[set.size()];
		String[] sc=new String[set.size()];
		String k;
		Iterator iter = set.iterator();
		ArrayList<String> arrlist=new ArrayList<String>();

		//	int m=0;
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

	/**
	 * static function to check anagram or not
	 */

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

			palindromString(arrlist);

		}


	}
	/**
	 * static function to Check given array contains palindrom string or not
	 */
	public static void palindromString(ArrayList<String> arrlist) {
		String rev = null;

		//int length = arrlist.size();
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
	/*public static Set<String> primeAnagram(List<String> primeList)
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
	}*/
	/**
	 * static function to given set contains numbers which are prime as well as palindrom oir not
	 */
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
	/**
	 * static function to reverse a number
	 */

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
	/*public static List<String> findPrime(int num)
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
	}*/
	/**
	 * static function to find prime numbers
	 */

	public static List<String> findPrime1(int num) {
		int flag=1;
		int i;
		List<String> arr=new ArrayList<>();
		//    int count=0;
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
	public static boolean isAnagram(String word, String anagram) {
		boolean isAnagram = false;
		if (word != null && anagram != null && word.length() == anagram.length()) {
			char[] arr = word.toCharArray();
			StringBuilder temp = new StringBuilder(anagram);
			//int wordLength = FunctionalUtility.readInteger();
			for (char ch : arr) {
				int index = temp.indexOf("" + ch);
				if (index != -1) {
					temp.deleteCharAt(index);
				}
			}
			isAnagram = temp.toString().isEmpty();
		}
		return isAnagram;
	}
	//Program to print the pallindrome numbers
	/**
	 *
	 *
	 * @param n the integer which to check for pallindrome
	 * @return true if its pallindrome or false if its not
	 */
	public static boolean Pallindrome(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
	/**
	 * to check the values are anagrams or not
	 *
	 * @param n1 input number1
	 * @param n2 input number2
	 * @return
	 */
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}
	public static void primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && Pallindrome(j))
				System.out.print(j + " ");
		}
	}
	/**
	 * Function to check if num is anagram or not
	 */
	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
	}
	/**
	 * Function to count the value in given integer be place
	 *
	 * @param n the integer value to count
	 * @return the integer array for the count value
	 */
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}
	public static int predictDate(int d,int m, int y){
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 +y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;  
        return d0;
    }
}








