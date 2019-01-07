package com.bridgelab.datastructureprograms;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.bridgelabz.utility.DataStructureUtility;

public class HashTry {

	public static void main(String[] args) throws IOException {
		Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer>[] vertex = new LinkedList[5];
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
					vertex[0].add(intArray[i]);
					map.put(rem, vertex[0]);}
				if(rem==1) {
					vertex[1].add(intArray[i]);
					map.put(rem, vertex[1]);}
				if(rem==2) {
					vertex[2].add(intArray[i]);
					map.put(rem, vertex[2]);}
				if(rem==3) {
					vertex[3].add(intArray[i]);
					map.put(rem, vertex[3]);}
				if(rem==4) {
					vertex[4].add(intArray[i]);
					map.put(rem, vertex[4]);}

				if(rem==5) {
					vertex[5].add(intArray[i]);
					map.put(rem, vertex[5]);}

				if(rem==6) {
					vertex[6].add(intArray[i]);
					map.put(rem, vertex[6]);}
				if(rem==7) {
					vertex[7].add(intArray[i]);
					map.put(rem, vertex[7]);}
				if(rem==8) {
					vertex[8].add(intArray[i]);
					map.put(rem, vertex[8]);}
				if(rem==9) {
					vertex[9].add(intArray[i]);
					map.put(rem, vertex[9]);}
				if(rem==10) {
					vertex[10].add(intArray[i]);
					map.put(rem, vertex[10]);}
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


