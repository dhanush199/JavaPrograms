package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.bridgelabz.utility.DataStructureUtility;

public class AddressManager {
	List<PersonDetails> details = new ArrayList<PersonDetails>();


	public static void saveBook() {
		//writeToFile();
	}
	public static void display(List<PersonDetails> listOfPerson)
	{
		for (PersonDetails p:listOfPerson ) {
			System.out.println(p.getFirstName());
			System.out.println(p.getLastName());
			System.out.println(p.getPhoneNum());
			Address adr=new Address();
			System.out.println(adr.getBookName());
			System.out.println(adr.getCity());
			System.out.println(adr.getState());
		}
	}
	public static List<PersonDetails> saveAs(List<PersonDetails> listOfPerson) {
		System.out.println("Enter the old name of the book");
		String oldName=DataStructureUtility.readString();
		System.out.println("Enter the new name");
		String newName=DataStructureUtility.readString();
		if(listOfPerson.contains(oldName)) {
			Address ad=new Address();
			//listOfPerson.ssetBookName(newName);
		}
		else
			System.out.println(oldName+" Book Not found");
		return listOfPerson;
	}
	public static void closeBook() {
		//closeFile();
	}
	public static List<PersonDetails> deletBook(List<PersonDetails> listOfPerson) {
		System.out.println("Enter the book name you wish to delet");
		String name=DataStructureUtility.readString();
		if(listOfPerson.contains(name)){
			listOfPerson.remove(name);
		}
		else 
			System.out.println(name+" book not found");
		return listOfPerson;
	}
}
