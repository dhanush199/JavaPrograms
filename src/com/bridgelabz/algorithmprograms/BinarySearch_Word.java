package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;


public class BinarySearch_Word {
    public static void main(String[] args) throws FileNotFoundException {
//        AlgorithmUtility algo = new AlgorithmUtility();
        Scanner sc = new Scanner(System.in);
        // Get scanner instance
        String csvFile = "/home/admin1/Desktop/Example.csv";
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
                AlgorithmUtility.sort(tokens);
//                for(int i=0;i<tokens.length;i++) {
//                    System.out.println(tokens[i]);
//                }
                for (String token : tokens) {
                    // Print all tokens
                    System.out.println(token);
                }
                System.out.println("enter the key word which has to be searched ");
                String key = sc.next();
                int i = AlgorithmUtility.binarySearch(tokens, key);
                if (i >= 0) {
                    System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
                } else
                    System.out.println(key + " doesnot exists in the given csv file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}