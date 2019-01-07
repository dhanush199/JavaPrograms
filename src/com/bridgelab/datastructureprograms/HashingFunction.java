/******************************************************************************
 *  Compilation:  javac -d bin HashingFunction.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinarySearch n
 *  
 *  Purpose: 
 *  @author  Dhanush
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import com.bridgelabz.utility.DataStructureUtility;

public class HashingFunction {

	public static void main(String[] args) throws IOException {
		Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer> ds0 = null;
		for (int i = 0; i < 10; i++) {
			ds0 = new LinkedList<Integer>();
			map.put(i, ds0);
		}
		
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

				if(intArray[i]!=0)
				{
					rem = intArray[i] % 11;
					System.out.println(intArray[i]+"is devided by 11 gives remider as "+rem);
					ds0.add(intArray[i]);
					map.put(rem, ds0);
					}
			}


			for (Integer name: map.keySet())
			{
				String key22 =name.toString();
				String value = map.get(name).toString();  
				System.out.println(key22 + " " + value);  
			} 

			for (int ii = 0; ii < 10; ii++) {

				System.out.println(map.put(ii, ds0));
			}
			System.out.println(" Do you want to continue (Type y or n) ");
			ch = DataStructureUtility.readString().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}

}
