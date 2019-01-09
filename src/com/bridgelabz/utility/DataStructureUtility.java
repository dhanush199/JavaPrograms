
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import com.bridgelabz.utility.StackCustum;
import com.bridgelabz.utility.SinglyLinkedListImpl.Node;
import com.bridgelabz.objectorientedprograms.Inventory;
import com.bridgelabz.objectorientedprograms.InventoryList;
import com.bridgelabz.utility.QueueCustm;




public class DataStructureUtility {
	Node head; // head of list
	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static int stackSize= 100;
	static StackCustum myStack=new StackCustum(stackSize);
	static class Node {

		String data;
		Node next;

		// Constructor
		Node(String token)
		{
			data = token;
			next = null;
		}
	}
	public static int day(int month, int i, int year)
	{
		int y = year - (14 - month) / 12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (i + x + (31*m)/12) % 7;
		return d;
	}

	public static boolean isLeapYear(int year)
	{
		if  (((year % 4 == 0) && (year % 100 != 0))||year % 400 == 0) return true;
		else return false;
	}
	public static DataStructureUtility insert(DataStructureUtility list, String str)
	{
		// Create a new node with given data
		//com.bridgelabz.utility.SinglyLinkedListImpl.Node new_node = new Node(str);
		Node new_node = new Node(str);
		//new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	public static int printList(DataStructureUtility list)
	{
		int size=0;
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			if(currNode.data!=null)
				System.out.println(currNode.data + " ");
			//	size++;
			currNode = currNode.next;
		}
		return size;
	}
	//	public static int delete(SinglyLinkedListImpl list,String key)
	//	{
	//		int flag=0;
	//		Node currNode = list.head;		
	//		while(currNode != null)
	//		{
	//			if(currNode.data!=null)
	//			{
	//				if((currNode.data).compareToIgnoreCase(key)==0) {
	//					currNode.data=null;	
	//					System.out.println("entered "+key+" found and deleted");
	//					flag=1;		
	//				}
	//			}
	//			currNode = currNode.next;
	//		}
	//
	//		return flag;			
	//	}
	public static void usingFileWriter(DataStructureUtility list,String[] fileContent,String path) throws IOException
	{
		//String[] fileContent = DataStructureUtility.toStrinConv(list);
		FileWriter fileWriter = new FileWriter(path);	
		for(String s:fileContent)
		{
			if(s!=null) {
				fileWriter.write(s);
				fileWriter.write(" ");
			}
		}
		fileWriter.close();
	}
	public static String[] toStrinConv(DataStructureUtility list)
	{
		//SinglyLinkedListImpl list1=new SinglyLinkedListImpl();
		Node currNode = list.head;
		int i=0;
		String[] str =new String[1000000];
		while (currNode != null) {
			if(currNode.data!=null)
				str[i]=currNode.data ;
			i++;
			currNode = currNode.next;
		}
		return str;
	}
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
	public static void dispFile( String fname)
	{
		String line = null;
		try
		{
			FileReader fileReader = new FileReader(fname);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file named '" + fname + "'");
		}
	}
	//static SinglyLinkedListImpl<String> list=new SinglyLinkedListImpl();

	public static DataStructureUtility readFile(DataStructureUtility linkedList,String fName) 
	{
		//System.out.println("Enter the path of the file");
		String csvFile =fName;
		//String csvFile="/home/admin1/Desktop/Files/example.txt";
		String line = " ";
		String name[]=new String[1000];
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
		{
			while ((line = br.readLine()) != null) 
			{
				name = line.split(" ");
				for(int i=0;i<name.length;i++){
					String name1=name[i];
					DataStructureUtility.insert(linkedList,name1);	
				
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(linkedList);
		return linkedList;
	}
	public static int[] stringSort(int[] myArray) {
		for(int i = 0; i<myArray.length-1; i++) {
			for (int j = i+1; j<myArray.length-1; j++) {
				if(myArray[i]!=0 && myArray[j]!=0 ) {
					if(myArray[i]>myArray[j]){
						int temp = myArray[i];
						myArray[i] = myArray[j];
						myArray[j] = temp;
					}
				}
			}
		}
		return myArray;
	}
	public static void displayArray(int[] str) {
		for(int i=0;i<str.length;i++)
			if(str[i]!=0)
				System.out.println(str[i]);
	}
	public static <T extends Comparable<T>> void dispGeneric(T str[]) { 

		for(int i=0;i<str.length;i++)
			if(str[i].compareTo(null)==0)
				System.out.println(str[i]);
	}
	public static int[] toIntConv(SinglyLinkedListImpl list)
	{
		int kz=0; 
		com.bridgelabz.utility.SinglyLinkedListImpl.Node currNode = list.head;
		int i=0;
		int[] str =new int[1000];
		while (currNode != null) {
			if(currNode.value!=null)	{
				String value1= currNode.value.toString();
				kz=Integer.parseInt(value1);
				str[i]=kz;
				i++;

			}
			currNode = currNode.nextRef;
		}
		return str;
	}
	public static void writeIntFile(String fName,int[] a) throws IOException {
		Writer wr = new FileWriter("fName");
		for(int i=0;i<a.length;i++)
			wr.write(a[i]);
		wr.close();
	}
	public static int checkBalancedParantheses(char[]chArray) throws Exception {
		int push=0;
		for(int i=0;i<chArray.length;i++) {
			if(chArray[i]=='('  && !(StackCustum.isStackFull())) {
				myStack.push(chArray[i]);
				push++;
			}
			else if(chArray[i]==')' && !(StackCustum.isStackEmpty())) {
				int l=myStack.pop()+1;
				push--;
			}	
		}

		System.out.println(push);
		return push;
	}
	public static long readLong() {
		return scanner.nextLong();
	}
	public static List<Integer> primeNumbers(int m,int n) {
		List<Integer> lst=new ArrayList<Integer>();
		int temp;

		//swapping of bounds if the given lower bound is greater than upper bound
		if(m>n) {
			temp=m;
			m=n;
			n=temp;}
		int flag=1;
		//try all the possible values from lower bound to upper bound
		//if the number has the factor then it must be checked within lower bound
		for(int i=m;i<=n;i++){
			for(int j=2;j<i;j++){
				//If the number is divisible by any of the number then
				//initializing flag to zero and break
				//else flag is initialized to one
				if(i%j==0){
					flag=0;
					break;}
				else
					flag=1;}
			//If the number is prime which is indicated by the flag,
			//then adds the number into an ArrayList.
			if(flag==1)
				lst.add(i);}
		return lst;
		}
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return primeAnagram;
	}
	static int[][] calender = new int[5][7];
	static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static void initCal() {
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = -100;
			}
		}
	}
	static void display(int m) {
		System.out.println("        Sun    Mon     Tue     Wed     Thu     Fri     Sat");
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				if (calender[i][j] < 0 || calender[i][j] > month[m - 1]) {
					System.out.print("\t ");
				} else if (calender[i][j] > 0) {
					System.out.print("\t" + calender[i][j] + " ");
				}
			}
			System.out.println("\t");
		}
	}

	static void putCalender(int d) {
		int d1 = 1;
		for (int i = d; i < calender[0].length; i++) {
			// System.out.print(d1);
			calender[0][i] = d1++;
		}
		for (int i = 1; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = d1++;
			}
		}

	}

	public static void dispCalender(int m, int y) {
		int d = dayOfWeek(m, y);
		initCal();
		putCalender(d);
		display(m);
	}

	static int dayOfWeek(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	public static int[] toIntConv(DataStructureUtility list,int size)
	{
		int kz=0; 
		Node currNode = list.head;
		int i=0;
		int[] intArray =new int[30];
		while (currNode != null) 
		{
			if(currNode.data!=null)	
			{
				kz=Integer.parseInt(currNode.data);
				//System.out.println("data is = "+currNode.data);
				intArray[i]=kz;
				i++;

			}
			currNode = currNode.next;
		}
		return intArray;
	}
	public static String[] intTostring(int[] abc) {
		String strarray[]=new String[abc.length];
		int l=0;
		for(int i=0;i<abc.length;i++) {
			if(abc[i]!=0) {
				String str=String.valueOf(abc[i]);
				strarray[l]=str;
				l++;
			}}
		return strarray;
	}
	public static Set<Integer> primeAnagram1(List<Integer> primeList)
	{   
		Set<Integer> primeAnagramSet=new HashSet<Integer>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(DataStructureUtility.anagramOfString(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j))))
				{

					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
				}
			}
		}
		return primeAnagramSet;

	}


	public static int checkPrime(int n){  
		int i,m=0,flag=0;      
		m=n/2;      
		for(i=2;i<=m;i++){      
			if(n%i==0){      
				flag=1;      
				break;      
			}      
		}      
		return flag;  
	}
	public static boolean anagramOfString(String s1, String s2) {

		boolean status = false;

		if (s1.length() != s2.length()) {

			//System.out.println("Enter both the strings of same size");
		} else {
			char[] stng1 = s1.toLowerCase().toCharArray();
			char[] stng2 = s2.toLowerCase().toCharArray();
			// sorting the array
			// Arrays.sort(string1);
			for (int i = 0; i < (stng1.length - 1); i++) {
				for (int j = i + 1; j > 0; j--) {
					if (stng1[j] < stng1[j - 1]) {
						char temp = stng1[j - 1];
						stng1[j - 1] = stng1[j];
						stng1[j] = temp;
					}
				}
			}

			// Arrays.sort(string2);
			for (int i = 0; i < (stng2.length - 1); i++) {
				for (int j = i + 1; j > 0; j--) {
					if (stng2[j] < stng2[j - 1]) {
						char temp = stng2[j - 1];
						stng2[j - 1] = stng2[j];
						stng2[j] = temp;
					}
				}
			}
			status = Arrays.equals(stng1, stng2);
		}
		return status;

	}
	static QueueCustm q=new QueueCustm();

	public static long withdrawOrDeposit(long money) {
		System.out.println("press 1.Deposit | Press 2.WithDraw ");
		int i=DataStructureUtility.readInteger();
		switch(i) {
		case 1: System.out.println("Money in the counter is "+money);
		if((q.isQueueEmpty()) && money!=0) {
			System.out.println("enter the amount to be deposited");
			long cash=DataStructureUtility.readLong();
			money=money+cash;
			System.out.println("money in cashCounter is "+money);
			System.out.println(cash+"Rs succesfully deposited to your account");
		}
		else
			System.out.println("Quee is Empty: Please add people to the quee");
		break; 
		case 2: System.out.println("Money in the counter is "+money);
		if((q.isQueueEmpty()) && money>0) {
			System.out.println("enter the amount to be encashed");	
			long cash=DataStructureUtility.readLong();
			if(cash<=money && cash>0) {
				money=money-cash;
				System.out.println(cash+"Rs has been withdrawn from your account");}}
		else
			System.out.println("money is not there in cash counter.Kindly come later");	
		break;    
		default : System.out.println("Wrong Entry \n ");
		break;
		}	
		return money;
	}
	public static int delete(DataStructureUtility list,String key)
	{
		int flag=0;
		Node currNode = list.head;		
		while(currNode != null)
		{
			if(currNode.data!=null)
			{
				String value2=currNode.data.toString();
				if(value2.compareToIgnoreCase(key)==0) {
					currNode.data=null;	
					System.out.println("entered "+key+" found and deleted");
					flag=1;		
				}
			}
			currNode = currNode.next;
		}

		return flag;			
	}
	public static int deletKey(String key){
		SinglyLinkedListImpl listt=new SinglyLinkedListImpl();
		listt.tmp = listt.head;
		int flag=0;
		while(true){
			if(listt.tmp == null){
				break;
			}
			if(listt.tmp.getValue()==key)
			{	
				listt.add(0);
				System.out.println(key+" has been found and deleted");
				flag=1;
			}
			listt.tmp = listt.tmp.getNextRef();
		}
		return flag;
	}
	SinglyLinkedListImpl s=new SinglyLinkedListImpl();
	public void traverse(){

		s.tmp = s.head;
		while(true){
			if(s.tmp == null){
				break;
			}
			System.out.println(s.tmp.getValue());
			s.tmp = s.tmp.getNextRef();
		}
	}
	public static List<Integer> findPrime(int low,int high) {
		int flag = 1;
		int i;
		List<Integer> arr = new ArrayList<>();
		for (i = low; i < high; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			if (flag == 1) {
				arr.add(i);
			}
		}
		return arr;
	}
	public static Stack<Integer> primeAnagram2(List<Integer> primeList) {
		//      Set<Integer> primeAnagram = new HashSet<>();
		Stack<Integer> stack=new Stack<Integer>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					stack.push(primeList.get(i));
					stack.push(primeList.get(j));
				}
			}
		}
		return stack;
	}
	public static QueueLinkedList primeAnagramA(List<Integer> primeList) {
		QueueLinkedList primeAnagram = new QueueLinkedList();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.enqueue(primeList.get(i));
					primeAnagram.enqueue(primeList.get(j));
				}
			}
		}
		return primeAnagram;
	}



}


