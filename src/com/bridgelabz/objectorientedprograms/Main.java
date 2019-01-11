package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;

public class Main {
	public static void main(String args[]) {
	List<PersonDetails> listOfPerson=new ArrayList<PersonDetails> ();
		PersonDetails persondetails=new PersonDetails();
		System.out.println("Enter the first name of the person");
		String firstName=DataStructureUtility.readString();
		persondetails.setFirstName(firstName);
		System.out.println("Enter the last name of the person");
		String lastName=DataStructureUtility.readString();
		persondetails.setLastName(lastName);
		System.out.println("Enter the contact number of the person");
		long mobileNum=DataStructureUtility.readLong();
		persondetails.setPhoneNum(mobileNum);
		Address adress=new Address();
		System.out.println("Enter the zipCode of the person");
		int zipCode=DataStructureUtility.readInteger();
		adress.setZipCode(zipCode);
		System.out.println("Enter the street of the person");
		String streetName=DataStructureUtility.readString();
		adress.setStreet(streetName);
		System.out.println("Enter the state name of the person");
		String stateName=DataStructureUtility.readString();
		adress.setState(stateName);
		System.out.println("Enter the city name of the person");
		String cityName=DataStructureUtility.readString();
		adress.setCity(cityName);
		System.out.println("Enter the book name");
		String bookName=DataStructureUtility.readString();
		//PersonDetails pDetails=new PersonDetails();
		persondetails.setAddress(adress);
		listOfPerson.add(persondetails);
		Main.display(listOfPerson);
		System.out.println(listOfPerson);
		
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
}
