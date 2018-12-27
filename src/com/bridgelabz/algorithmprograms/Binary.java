/******************************************************************************
 *  Compilation:  javac -d bin Binary.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: program to convert decimal number to binary
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter a number>0");
        int num=FunctionalUtility.readInteger();
        AlgorithmUtility.toBinary(num);

	}

}
