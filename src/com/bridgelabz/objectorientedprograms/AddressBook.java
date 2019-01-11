package com.bridgelabz.objectorientedprograms;

import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;

public class AddressBook {
	private static String bookname;
	

	public static void deletPerson() {
		System.out.println("Enter the name of the person whom you wish to delet");
		String name=DataStructureUtility.readString();
		//delet from file
	}
	public static void sort() {
		System.out.println("please select one option");
		System.out.println("1> sort by last name    2>sort by zipCode");
		int opt=DataStructureUtility.readInteger();
		switch(opt) {
		case 1: //sort by last name
			break;
		case 2://sort by zipCode
			break;
		default:System.out.println("Enter an valid option");
		break;
		}
	}
	//	public List<PersonDetails> getListOfPerson() {
	//		return personDetail;
	//	}
	//	public void setListOfInventories(List<PersonDetails> personDetails) {
	//		this.personDetail = personDetails;
	//	}
	public void setaddresBookname(String bookname) {
		this.bookname = bookname;
	}
	public static  String getaddresBookname() {
		return bookname;
	}
	//	public List<PersonDetails> getaddresBookname(List<PersonDetails> getAddressBookName) {
	//		return personDetail;
	//	}

}
