package com.bridgelab.datastructureprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.bridgelabz.utility.DataStructureUtility;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		DataStructureUtility LinkedList=new DataStructureUtility();
		LinkedList=DataStructureUtility.readFile(LinkedList);
		DataStructureUtility.printList(LinkedList);
		String str[]=DataStructureUtility.toStrinConv(LinkedList);
		int abc[]=new int[str.length];
		for(int i=0;i<str.length;i++) {
			if(str[i]==null)
				break;
			else
				abc[i]=Integer.parseInt(str[i]);
		}
		DataStructureUtility.stringSort(abc);
		System.out.println("sorted list is:");
		DataStructureUtility.displayArray(abc);
		String strr[]=new String[abc.length];
		for(int i=0;i<abc.length;i++) {
			strr[i]=String.valueOf(abc[i]);
			DataStructureUtility.insert(LinkedList, strr[i]);
		}
		try {
			String fName="/home/admin1/Desktop/Files/num.txt";
		DataStructureUtility.usingFileWriter(LinkedList,strr,fName);
		DataStructureUtility.dispFile(fName);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
