package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Gambler {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the player stack");  
    int stack=sc.nextInt();
    System.out.println("Enter the Goal");
    int goal=sc.nextInt();
    System.out.println("Enter the totalTimes you want to play");
    int totalTimes=sc.nextInt();
    FunctionalUtility fu=new FunctionalUtility();
     fu.getResult( stack,goal,totalTimes);

    // TODO Auto-generated method stub

	}

}
