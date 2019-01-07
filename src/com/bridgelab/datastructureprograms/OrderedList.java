package com.bridgelab.datastructureprograms;

import java.io.IOException;
import com.bridgelabz.utility.DataStructureUtility;

public class OrderedList {
	static String sortFile="/home/admin1/Desktop/Files/sorted.txt";
	static String fName="/home/admin1/Desktop/Files/example.txt";
	public static void main(String[] args) throws IOException
	{
		DataStructureUtility LinkedList=new DataStructureUtility();
		LinkedList=DataStructureUtility.readFile(LinkedList,fName);
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
				DataStructureUtility.insert(LinkedList,key1);
			}
			int[] fileContent = DataStructureUtility.toIntConv(LinkedList,100);	
			int[] sortedarr=DataStructureUtility.stringSort(fileContent);
			String sortedString[]=DataStructureUtility.intTostring(sortedarr);
			//String[] sarray=new String[sortedarr.length];
			DataStructureUtility.usingFileWriter(LinkedList,sortedString,sortFile);
			break;}
			case 3:	DataStructureUtility.dispFile(sortFile);
			break;
			default:System.out.println("Please enter an valid option");
			break;
			} 
		}
	}
}




