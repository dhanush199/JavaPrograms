/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms str1, str2
 *  
 *  Purpose: Program to implement gambler game
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.FunctionalUtility;

public class Gambler {
	public static void main(String[] args) {
		System.out.println("Enter the player stack");  
		int stack=FunctionalUtility.readInteger();                        //read player stack
		System.out.println("Enter the Goal");
		int goal=FunctionalUtility.readInteger();                        //goal to be reached to decide a player lost or won
		System.out.println("Enter the totalTimes you want to play");
		int totalTimes=FunctionalUtility.readInteger();// total chances given to a player
		int arr[]= FunctionalUtility.getResult( stack,goal,totalTimes);
		System.out.println("win percentage="+arr[1]*100/totalTimes);
		System.out.println("win percentage="+arr[0]*100/totalTimes);

	}

}
