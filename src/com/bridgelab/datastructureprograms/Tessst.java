package com.bridgelab.datastructureprograms;

import java.io.IOException;
import java.util.HashMap;
//import java.util.Map;

import com.bridgelabz.utility.DataStructureUtility;

public class Tessst {
	static String sortFile="/home/admin1/Desktop/Test.txt";
	static String fName="/home/admin1/Desktop/abc.txt";
	static String[] content=new String[10000];
	public static void main(String[] args) throws IOException
	{
		HashMap map=new HashMap();
		DataStructureUtility LinkedList=new DataStructureUtility();
		LinkedList=DataStructureUtility.readFile(LinkedList);
		while(true) 
		{
			System.out.println("please select one option");
			System.out.println("1.Display list 2.to search element 3.Display modified File  ");
			int option=DataStructureUtility.readInteger();
			switch(option) {
			case 1:DataStructureUtility.printList(LinkedList);
			break;
			case 2:{System.out.println("Enter the key element to be searched");
			int key=DataStructureUtility.readInteger();
			String key1=String.valueOf(key);
			int k=DataStructureUtility.delete(LinkedList, key1);
			System.out.println(k);
			if(k==0) {
				DataStructureUtility.insert(LinkedList, key1);
			} 
			int[] dataArry=DataStructureUtility.toIntConv( LinkedList);
			int[] keyArray=HashingFunction.devideBy11(LinkedList);
			HashingFunction.keyCompare( keyArray, dataArry);
			for(int i=0;i<keyArray.length;i++) {
				map.put(keyArray[i], content[i]);
			}
			break;
			}
			case 3:	DataStructureUtility.usingFileWriter(LinkedList,content,sortFile);
			DataStructureUtility.dispFile(sortFile);
			break;
			default:System.out.println("Please enter an valid option");
			break;
			} 
		}
	}
}


