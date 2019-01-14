package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;

public class AddressBook {
	//static List<PersonDetails> listOfPerson =new ArrayList<PersonDetails>();
	private static String bookname;
	static List<PersonDetails> listOfPerson;
	//static List<Address> ad=new ArrayList();;
	static Address add=new Address();
	static PersonDetails persondetails=null;
	public static void dispOptions(List<PersonDetails> listOfPerson) throws JsonGenerationException, JsonMappingException, IOException {
		int opt=0;
		String[] args= {null};
		// AddressManager.openBook();

		do{
			System.out.println("Enter option");
			System.out.println("-----------------------------------");
			System.out.println("1> Add Person");
			System.out.println("2> Edit Person");
			System.out.println("3> Delet Person");
			System.out.println("4> Sort Book");
			//System.out.println("5> Save Changes ");
			System.out.println("5> goto main Menu");
			System.out.println("-----------------------------------");
			opt=DataStructureUtility.readInteger();
			switch (opt) {
			case 1:addPerson();
			AddressManager.display1();
			break;
			case 2: displayTheAddress(listOfPerson);
			editPersonDetails(listOfPerson);
			break;
			case 3:deletePerson(listOfPerson);
			break;
			case 4: sort(listOfPerson);
			break;
			//		case 6:AddressManager.saveBook(listOfPerson, Address.getFileName());
			//		break;
			case 5:AddressBookApplication.main(args);
			break;

			default:System.out.println("Enter the valid option");
			break;
			}
			System.out.println("> 1 Continue   2 > Main Menu");
			opt=DataStructureUtility.readInteger();
		}while(opt==1);
	}

	public static void addPerson() throws JsonGenerationException, JsonMappingException, IOException {
		//listOfPerson = new ArrayList<PersonDetails>();
		//PersonDetails persondetails = new PersonDetails();
		listOfPerson =new ArrayList<PersonDetails>();
		persondetails=new PersonDetails();
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
		displayTheAddress( listOfPerson);
		AddressManager.saveBook(listOfPerson,Address.getFileName());
		//return listOfPerson;
	}

	public static void deletePerson(List<PersonDetails> listOfPerson) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println(listOfPerson);
		listOfPerson=AddressManager.openBook(Address.getFileName());
		System.out.println(listOfPerson);
		System.out.println("Enter the first name of the person which needs to be deleted");
		String fname = DataStructureUtility.readString();
		System.out.println("Enter the last name of the person which needs to be deleted");
		String lname = DataStructureUtility.readString();
		int flag = 0;
		for (PersonDetails p : listOfPerson) {
			if (fname.equals(p.getFirstName()) && (lname.equals(p.getLastName()))) {
				listOfPerson.remove(p);
				System.out.println("The person is succesfully deleted");
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("404 Error(Person not found)");
		System.out.println("1 > Save Changes   2> Cancel");
		switch (DataStructureUtility.readInteger()) {
		case 1:AddressManager.saveBook(listOfPerson,Address.getFileName());
		System.out.println("Address Book updated Successfully");
		break;
		case 2:String str[]= {};
		AddressBookApplication.main(str);
		break;
		default:System.out.println("Please select valid option");
		break;
		}

	}

	public static void sort(List<PersonDetails> listOfPerson2) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("1> sort by last name ");
		System.out.println("2> sort by zipCode");
		System.out.println("please select one option");
		int opt = DataStructureUtility.readInteger();
		switch (opt) {
		case 1: AddressManager.sortByLastName(listOfPerson2);
		AddressManager.saveBook(listOfPerson2, Address.getFileName());
		break;
		case 2:AddressManager.sortByZipCode(listOfPerson);
		AddressManager.saveBook(listOfPerson, Address.getFileName());

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

	public static List<PersonDetails> editPersonDetails(List<PersonDetails> listOfPerson) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter the firstname of a person to be edited");
		String fname = DataStructureUtility.readString();
		System.out.println("Enter the lastname of a person to be edited");
		String lname = DataStructureUtility.readString();
		int flag = 0;
		//displayTheAddress(listOfPerson);
		for (PersonDetails p : listOfPerson)
		{
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
					AddressBook.addPerson();
					p.setAddress(add);
					break;
				}
				default:
					System.out.println("Enter the proper first and last name");
					break;
				}

				System.out.println("1> Edit More   2> goto Above options");
				choice=DataStructureUtility.readInteger();
				if(choice==1)
					editPersonDetails( listOfPerson);
				else
					dispOptions(listOfPerson);
			}
			flag = 1;
		}
		if (flag == 0)
			System.out.println("The first and last name you have entered is not persent in the address book");
		return listOfPerson;
	}

	public static void displayTheAddress(List<PersonDetails> listOfPerson) {
		if(!listOfPerson.isEmpty())
		{
			for(PersonDetails p2:listOfPerson) {
				System.out.println("First Name : "+ p2.getFirstName() );
				System.out.println("Last Name :" + p2.getLastName());
				System.out.println("Phone Number :" + p2.getPhoneNum());
				System.out.println("Address datails: ");
				Address ad=new Address();
				System.out.println("Street Name :" + p2.getAddress().getStreet());
				System.out.println("City Name :" + p2.getAddress().getCity());
				System.out.println("State Name :" + p2.getAddress().getState());
				System.out.println("Zip Code :" + p2.getAddress().getZipCode());
				System.out.println("Street Name :" +p2.getAddress().toString());
				System.out.println("______________________________");
			}
		}
	}
}
