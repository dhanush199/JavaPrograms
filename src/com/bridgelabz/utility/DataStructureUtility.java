
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class DataStructureUtility {
	Node head; // head of list
	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
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
	public static DataStructureUtility insert(DataStructureUtility list, String str)
	{
		// Create a new node with given data
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
	public static void printList(DataStructureUtility list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			if(currNode.data!=null)
				System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	public static int delete(DataStructureUtility list,String key)
	{
		int flag=0;
		Node currNode = list.head;		
		while(currNode != null)
		{
			if(currNode.data!=null)
			{
				if((currNode.data).compareToIgnoreCase(key)==0) {
					currNode.data=null;	
					System.out.println("entered "+key+" found and deleted");
					flag=1;		
				}
			}
			currNode = currNode.next;
		}

		return flag;			
	}
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
	public static DataStructureUtility readFile(DataStructureUtility list) 
	{
		System.out.println("Enter the path of the file");
		String csvFile = readString();
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
					insert(list, name1);				
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
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
	public static int[] toIntConv(DataStructureUtility list)
	{
		int kz=0; 
		Node currNode = list.head;
		int i=0;
		int[] str =new int[1000];
		while (currNode != null) {
			if(currNode.data!=null)	{
				kz=Integer.parseInt(currNode.data);
				str[i]=kz;
				i++;

			}
			currNode = currNode.next;
		}
		return str;
	}
	public static void writeIntFile(String fName,int[] a) throws IOException {
		Writer wr = new FileWriter("fName");
		for(int i=0;i<a.length;i++)
			wr.write(a[i]);
		wr.close();
	}
	public static int checkBalancedParantheses(char[]chArray) {
		int push=0;
		for(int i=0;i<chArray.length;i++) {
			if(chArray[i]=='('  && !(CustomStack.isFull())) {
				CustomStack.push(chArray[i]);
				push++;
			}
			else if(chArray[i]==')' && !(CustomStack.isEmpty())) {
				int l=CustomStack.pop()+1;
				push--;
			}	
		}
		CustomStack.display();	
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
		return lst;}
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
				calender[i][j] = -1000;
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
		int[] str =new int[size];
		while (currNode != null) {
			if(currNode.data!=null)	{
				kz=Integer.parseInt(currNode.data);
				str[i]=kz;
				i++;

			}
			currNode = currNode.next;
		}
		return str;
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

}
