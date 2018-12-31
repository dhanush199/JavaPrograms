package com.bridgelab.datastructureprograms;
import java.io.*;
import java.util.Iterator;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.FunctionalUtility; 

public class UnorderedList {
	public static void main(String[] args) throws FileNotFoundException {
		// Get scanner instance
		DataStructureUtility linkedList=new DataStructureUtility();
		//Iterator itr=linkedList.Iterator();
		//Iterator iter = new linkedList.iterator();
		String csvFile = "/home/admin1/Desktop/Files/dhanush.csv";
		BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));
		// Delimiter used in CSV file
		final String DELIMITER = ",";
		try {
			String line = "";
			// fileReader = new BufferedReader(new FileReader(csvFile));
			// Read the file line by line
			while ((line = fileReader.readLine()) != null) {
				// Get all tokens available in line
				String[] tokens = line.split(DELIMITER);
				for (String token : tokens) {
					linkedList.add(token);
					//AlgorithmUtility.sort(tokens);          
				}
				linkedList.traverse();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the element to be searched= ");
		String search=FunctionalUtility.readString();
	}
}
