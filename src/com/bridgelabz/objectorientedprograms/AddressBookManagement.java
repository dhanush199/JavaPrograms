package com.bridgelabz.objectorientedprograms;

package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import com.bridgelabz.util.AddressManager;
import com.bridgelabz.util.ObjectOrientedPrograms;

public class AddressBookManagement{

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Address Book Management System");
		System.out.println("Address book Objective");
		int ch=0;
		do {
		System.out.println("1: Do you want to Create book");
		System.out.println("2: Do you Open book");
		System.out.println("3:Do you want to Save book");
		System.out.println("4:Do you want to close book");
		System.out.println("5:Do you want to Save book as");
		System.out.println("6:Do you want to Exit");
		String originbook="/home/admin1/Tharun/Bridgelabs/programs/JavaPrograms/";
		int choice=ObjectOrientedPrograms.readInteger();
		switch (choice) {
		case 1:
		{
			AddressManager.createBook(originbook);
			break;
		}
		case 2:
		{
			AddressManager.openBook();
			break;
		}
		case 3:
		{
			AddressManager.saveBook();
			break;
		}
		case 4 :
		{
			AddressManager.closeBook();
			break;
		}
		case 5:
		{
			AddressManager.saveAsBook();
		    break;
		}
		case 6:
		System.exit(0);
		default :
			System.out.println("Pls enter the proper option");
	     ch++;
		}}
	while(ch<50);
	
}}