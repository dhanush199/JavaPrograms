/******************************************************************************
 *  Compilation:  javac -d bin To_Binary.java
 *  Execution:    java -cp bin com.bridgelabz.util.Algorithmprograms 
 *  
 *  Purpose: program to implement ticToc game . player 1 is computer and player 2 is user
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   27-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class ToBinary {

	public static void main(String[] args) {
		System.out.println("enter the Value of n");
		int n =FunctionalUtility.readInteger();
		AlgorithmUtility.toBinary(n);
	}
}


