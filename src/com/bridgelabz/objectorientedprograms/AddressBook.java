package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;

public class AddressBook {
	static List<PersonDetails> listOfPerson = new ArrayList<PersonDetails>();
	private static String bookname;
	static List<Address> ad=new ArrayList();;
	Address add=new Address();

	static PersonDetails p=new PersonDetails();

	public static List<PersonDetails> addPerson() {
		PersonDetails persondetails = new PersonDetails();
		System.out.println("Enter the first name of the person");
		String firstName = DataStructureUtility.readString();
		persondetails.setFirstName(firstName);
		System.out.println("Enter the last name of the person");
		String lastName = DataStructureUtility.readString();
		persondetails.setLastName(lastName);
		System.out.println("Enter the contact number of the person");
		long mobileNum = DataStructureUtility.readLong();
		persondetails.setPhoneNum(mobileNum);
		Address adress = new Address();
		System.out.println("Enter the zipCode of the person");
		int zipCode = DataStructureUtility.readInteger();
		adress.setZipCode(zipCode);
		System.out.println("Enter the street of the person");
		String streetName = DataStructureUtility.readString();
		adress.setStreet(streetName);
		System.out.println("Enter the state name of the person");
		String stateName = DataStructureUtility.readString();
		adress.setState(stateName);
		System.out.println("Enter the city name of the person");
		String cityName = DataStructureUtility.readString();
		adress.setCity(cityName);
		persondetails.setAddress(adress);
		listOfPerson.add(persondetails);
		return listOfPerson;
	}
	
	public static void deletePerson(List<PersonDetails> persondetails) {
		System.out.println("Enter the first name of the person which needs to be deleted");
		String fname = DataStructureUtility.readString();
		System.out.println("Enter the last name of the person which needs to be deleted");
		String lname = DataStructureUtility.readString();
		int flag = 0;
		for (PersonDetails p : persondetails) {
			if (fname.equals(p.getFirstName()) && (lname.equals(p.getLastName()))) {
				persondetails.remove(p);
				System.out.println("The person is succesfully deleted");
				flag = 1;
			}
			if (flag == 0)
				System.out.println("No person details is present in the book to delete");
		}
	}
	
	public static void sort() {
		System.out.println("please select one option");
		System.out.println("1> sort by last name    2>sort by zipCode");
		int opt = DataStructureUtility.readInteger();
		switch (opt) {
		case 1: // sort by last name
			break;
		case 2:// sort by zipCode
			break;
		default:
			System.out.println("Enter an valid option");
			break;
		}
	}

	public void setaddresBookname(String bookname) {
		this.bookname = bookname;
	}

	public static String getaddresBookname() {
		return bookname;
	}

	public static void editPersonDetails(List<PersonDetails> listOfPerson) {
		System.out.println("Enter the firstname of a person to be edited");
		String fname = DataStructureUtility.readString();
		System.out.println("Enter the lastname of a person to be edited");
		String lname = DataStructureUtility.readString();
		int flag = 0;
		for (PersonDetails p : listOfPerson) {
			if (fname.equals(p.getFirstName()) && (lname.equals(p.getLastName())))
				System.out.println("Do you want to edit ");
			int choice = 1;
			while (choice == 1) {
				System.out.println("Do you want to edit 1:phoneno or 2:Address");
				switch (DataStructureUtility.readInteger()) {
				case 1: {
					System.out.println("Enter the phone number which is to be edited");
					p.setPhoneNum(DataStructureUtility.readLong());
					System.out.println("The phone is succesfully updated");
					break;
				}
				case 2: {
					System.out.println("The Address details you want to edit are ");
					List<PersonDetails> add = AddressBook.addPerson();
					// p.setAddress(add);
					break;
				}
				default:
					System.out.println("Enter the proper first and last name");
					break;
				}
				System.out.println("Do you want to continue editting \t 1:Continue 2:Exit");
				choice = DataStructureUtility.readInteger();
			}
			flag = 1;
		}
		if (flag == 0)
			System.out.println("The first and last name you have entered is not persent in the address book");
	}

	public static void displayTheAddress(List<PersonDetails> listOfPerson) {

		if(!listOfPerson.isEmpty())
		{
			for(PersonDetails p2:listOfPerson) {
				System.out.println("First Name : "+ p2.getFirstName() );
				System.out.println("Last Name :" + p2.getLastName());
				System.out.println("Phone Number :" + p2.getPhoneNum());
				System.out.println("Address datails: ");
				System.out.println(ad);
				for(int g=0;g<listOfPerson.size();g++) {
//				System.out.println("Street Name :" + ad.get(g).getStreet());
//				System.out.println("City Name :" + ad.get(g).getCity());
//				System.out.println("State Name :" + ad.get(g).getState());
//				System.out.println("Zip Code :" + ad.get(g).getZipCode());
					System.out.println("Street Name :" +listOfPerson.get(g).toString());
				System.out.println("______________________________");
		}}
			}
	}
}
