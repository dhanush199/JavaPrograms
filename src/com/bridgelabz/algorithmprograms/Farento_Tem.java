/******************************************************************************
 *  Compilation:  javac -d bin Farento_Tem.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to convert temparature from farenheat to degree celcius and vice versa
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

import java.util.Scanner;

public class Farento_Tem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1. to covert temparature from celcius to faren   Press 2.o covert temparature from  faren to celcius ");
		int key=FunctionalUtility.readInteger();
		AlgorithmUtility fl=new AlgorithmUtility();
		switch (key) {
		case 1:System.out.println("Enter the temparature in Celcius");
		double d=sc.nextDouble();
		double far=fl.getTempFaren(d);
		System.out.println("Converted temparature in Faren is= "+far+" 'F");
		break;
		case 2:	System.out.println("Enter the temparature in farenheat");
		d=sc.nextDouble();
		double temp=fl.getTempCelcius(d);
		System.out.println("Converted temparature in degree celcius is= "+temp+ " 'C");
		break;
		default:System.out.println("Invalid selection");
		break;
		}

	}

}
