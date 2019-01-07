package com.bridgelab.datastructureprograms;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.bridgelabz.utility.DataStructureUtility;

public class MyHashMap {

	public static void main(String[] args) throws IOException {

		Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer> list0=new LinkedList<Integer>();
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		LinkedList<Integer> list3=new LinkedList<Integer>();
		LinkedList<Integer> list4=new LinkedList<Integer>();
		LinkedList<Integer> list5=new LinkedList<Integer>();
		LinkedList<Integer> list6=new LinkedList<Integer>();
		LinkedList<Integer> list7=new LinkedList<Integer>();
		LinkedList<Integer> list8=new LinkedList<Integer>();
		LinkedList<Integer> list9=new LinkedList<Integer>();
		LinkedList<Integer> list10=new LinkedList<Integer>();
		DataStructureUtility mylist = new DataStructureUtility();
		char ch = ' ';
		int rem = 0;
		int i = 0;
		String fName="/home/admin1/Desktop/Files/example.txt";
		mylist = DataStructureUtility.readFile(mylist,fName);
		do {
			int size=DataStructureUtility.printList(mylist);
			System.out.println("Enter the key element to be added/deleted");
			int key = DataStructureUtility.readInteger();
			String key1 = String.valueOf(key);
			int k = DataStructureUtility.delete(mylist, key1);
			System.out.println(k);
			if (k == 0)
			{
				DataStructureUtility.insert(mylist, key1);
			}
			int[] intArray = DataStructureUtility.toIntConv(mylist,size);
			for (i = 0; i < intArray.length; i++) 
			{

				rem = intArray[i] % 11;
				//System.out.println(intArray[i]+"is devided by 11 gives remider as "+rem);
				if(rem==0) {
					list0.add(intArray[i]);
					map.put(rem, list0);}
				if(rem==1) {
					list1.add(intArray[i]);
					map.put(rem, list1);}
				if(rem==2) {
					list2.add(intArray[i]);
					map.put(rem, list2);}
				if(rem==3) {
					list3.add(intArray[i]);
					map.put(rem, list3);}
				if(rem==4) {
					list4.add(intArray[i]);
					map.put(rem, list4);}

				if(rem==5) {
					list5.add(intArray[i]);
					map.put(rem, list5);}

				if(rem==6) {
					list6.add(intArray[i]);
					map.put(rem, list6);}
				if(rem==7) {
					list7.add(intArray[i]);
					map.put(rem, list7);}
				if(rem==8) {
					list8.add(intArray[i]);
					map.put(rem, list8);}
				if(rem==9) {
					list9.add(intArray[i]);
					map.put(rem, list9);}
				if(rem==10) {
					list10.add(intArray[i]);
					map.put(rem, list10);}
			}
			for (Integer name: map.keySet())
			{
				String key22 =name.toString();
				String value = map.get(name).toString();  
				System.out.println(key22 + " " + value);  
			} 

			System.out.println(" Do you want to continue (Type y or n) ");
			ch = DataStructureUtility.readString().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}

