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

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Gambler {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the player stack");  
    int stack=sc.nextInt();                        //read player stack
    System.out.println("Enter the Goal");
    int goal=sc.nextInt();                        //goal to be reached to decide a player lost or won
    System.out.println("Enter the totalTimes you want to play");
    int totalTimes=sc.nextInt();  // total chances given to a player
    FunctionalUtility fu=new FunctionalUtility();
     fu.getResult( stack,goal,totalTimes);

    // TODO Auto-generated method stub

	}

}
