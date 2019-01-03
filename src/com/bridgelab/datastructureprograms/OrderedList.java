package com.bridgelab.datastructureprograms;

import java.io.IOException;

import com.bridgelabz.utility.DataStructureUtility;

public class OrderedList {
	static String sortFile="/home/admin1/Desktop/Files/sorted.txt";
	static String fName="/home/admin1/Desktop/Files/num.txt";
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
			case 2:{System.out.println("Enter the key element to be searched");
			int key=DataStructureUtility.readInteger();
			String key1=String.valueOf(key);
			int k=DataStructureUtility.delete(LinkedList, key1);
			System.out.println(k);
			if(k==0) {
				DataStructureUtility.insert(LinkedList, key1);
			}
			int[] fileContent = DataStructureUtility.toIntConv(LinkedList);	
			String[] fileContent1 = DataStructureUtility.toStrinConv(LinkedList);
			int[] arr=DataStructureUtility.stringSort(fileContent);
			String[] sarray=new String[arr.length];
			//int[] arry = DataStructureUtility.toIntConv(LinkedList);
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					 sarray[i]=String.valueOf(arr[i]);
					i++;
				}
			}
			DataStructureUtility.usingFileWriter(LinkedList,sarray,sortFile);
			//DataStructureUtility.writeIntFile(fName,arr);
			break;}
			case 3:	DataStructureUtility.dispFile(sortFile);
			break;
			default:System.out.println("Please enter an valid option");
			break;
			} 
		}
	}

}




