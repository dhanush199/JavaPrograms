package com.bridgelab.datastructureprograms;

import java.io.IOException;
import com.bridgelabz.utility.DataStructureUtility;

public class UnorderdList 
{
	static String fName="/home/admin1/Desktop/Files/example.txt";
	public static void main(String[] args) throws IOException
	{
		DataStructureUtility LinkedList=new DataStructureUtility();
		LinkedList=DataStructureUtility.readFile(LinkedList);
		DataStructureUtility.printList(LinkedList);
		while(true) 
		{
			System.out.println("please select one option");
			System.out.println("1.Display list 2.to search element 3.Display modified File  ");
			int option=DataStructureUtility.readInteger();
			switch(option) {
			case 1:DataStructureUtility.printList(LinkedList);
			break;
			case 2:System.out.println("Enter the key element to be searched");
			String key=DataStructureUtility.readString();
			int k=DataStructureUtility.delete(LinkedList, key);
			System.out.println(k);
			if(k==0) {
				DataStructureUtility.insert(LinkedList, key);
			}
			String[] fileContent = DataStructureUtility.toStrinConv(LinkedList);
			DataStructureUtility.usingFileWriter(LinkedList,fileContent,fName);
			break;
			case 3:	DataStructureUtility.dispFile(fName);
			break;
			default:System.out.println("Please enter an valid option");
			break;
			} 
		}
	}
}

