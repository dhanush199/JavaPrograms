package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;

public class Main {
	static List<PersonDetails> listOfPerson=new ArrayList<PersonDetails> ();
	
	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		
		//PersonDetails persondetails=new PersonDetails();
		while(true){
			System.out.println("1> Create Book");
			System.out.println("2> Save As( rename book )");
			System.out.println("3> Delet Book( will delet all records");
			System.out.println("4> Open Book");
			System.out.println("5> Save Book");
			System.out.println("select the option");
			int opt=DataStructureUtility.readInteger();
			switch (opt) {
			case 1:
				System.out.println("Enter the book name followed by .json: ");
				String name=DataStructureUtility.readString();
				AddressManager.creat(name);
				System.out.println("1> Add Person");
				System.out.println("2> Edit Person");
				System.out.println("3> Delet Person");
				System.out.println("4> Sort Book");
				System.out.println("Please select option");
				switch (DataStructureUtility.readInteger()) {
				case 1:listOfPerson=AddressBook.addPerson();
				AddressManager.saveBook(listOfPerson, name);
				break;
				case 2:AddressBook.editPersonDetails(listOfPerson);
				break;
				case 3:AddressBook.deletePerson(listOfPerson);
				break;
				case 4:System.out.println("1> Sort by lastname   2> Sort by ZipCode ");
				break;

				default:System.out.println("Please enter the valid option");
				break;
				}
				break;
			case 2:System.out.println("Enter the name of the book which you wish to rename followed by .json");
			String fromName=DataStructureUtility.readString();
			System.out.println("Enter the new name of the AddressBook");
			String newName=DataStructureUtility.readString();
			String str=AddressManager.saveAs(fromName,newName);
			System.out.println(str);
			break;
			case 3: AddressManager.deletBook();
			break;
			case 4: 
				System.out.println("Enter the book name you wish to open followed by .jason");
				String str1=DataStructureUtility.readString();
				AddressManager.openBook(str1);
				break;
			case 5: System.out.println("Enter the Book Name");
			AddressManager.saveBook(listOfPerson,DataStructureUtility.readString());
			break;
			case 6: AddressBook.displayTheAddress(listOfPerson);
			break;
			default:System.out.println("Enter the valid option");
			break;
			}
		}
	}
}
