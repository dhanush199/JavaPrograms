package com.bridgelabz.objectorientedprograms;


import java.io.IOException;


import com.bridgelabz.utility.DataStructureUtility;

public class AddressBookApp{

	public static void main(String[] args) throws IOException {
		System.out.println("Main Menu");
		int ch=0;
		do {
		System.out.println("1: Create book");
		System.out.println("2: Open book");
		System.out.println("3: Save book");
		System.out.println("4: Close book");
		System.out.println("5: Save book as");
		System.out.println("6: Exit");
		String originbook="/home/admin1/Dhanush/Bridgelabz/Myprograms/JavaPrograms/";
		int choice=DataStructureUtility.readInteger();
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