package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;

public class AddressBookApplication {
	static List<PersonDetails> listOfPerson=new ArrayList<PersonDetails> ();
   //static String name1=null;
	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		String name1=null;
		while(true)
		{
			System.out.println("1> Create Book");
			System.out.println("2> Open Book");
			System.out.println("3> Save Book");
			System.out.println("4> Save As( rename book )");
			System.out.println("5> Delet Book( will delet all records");
			System.out.println("6> closeBook");
			System.out.println("-----------------------------------");
			System.out.println("select the option");
			int opt=DataStructureUtility.readInteger();
			switch (opt) {
			case 1:System.out.println("Enter the name for the new Address Book");
			 name1=DataStructureUtility.readString();		
			AddressManager.creat(name1);	
			System.out.println("Please select option");
			//				System.out.println("Enter the book name followed by .json: ");
			//				String name=DataStructureUtility.readString();
			break;
			case 2:
				{ File dir = new File("D:/AddressBook/");
			      String[] children = dir.list();
			      
			      if (children == null) {
			         System.out.println( "Either dir does not exist or is not a directory");
			      } else { 
			         for (int i = 0; i< children.length; i++) {
			            String filename = children[i];
			            System.out.println(filename);
			         }
			      }
					System.out.println("Enter the book name you wish to open followed by .json");
				String str1=DataStructureUtility.readString();
				listOfPerson=AddressManager.openBook(str1);
				AddressBook.displayTheAddress(listOfPerson);
				AddressBook.dispOptions(listOfPerson);
				break;}
			case 3:AddressManager.saveBook(listOfPerson,name1);
			//listOfPerson=AddressBook.addPerson();
			break;
			case 4:System.out.println("Enter the name of the book which you wish to rename followed by .json");
			String fromName=DataStructureUtility.readString();
			System.out.println("Enter the new name of the AddressBook");
			String newName=DataStructureUtility.readString();
			String str=AddressManager.saveAs(fromName,newName);
			System.out.println(str);
				//AddressBook.editPersonDetails(listOfPerson);
			break;
			case 5: AddressManager.deletBook();
			break;
			case 6:String s[]= {};
			System.out.println(" File closed successfully");
			Address.setFileName(null);
				main(s);
			break;			
//			case 6: 
//				//AddressBook.displayTheAddress(listOfPerson);
			default:System.out.println("Enter the valid option");
			break;
			}
		}
	}
}
