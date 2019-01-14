package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.objectorientedprograms.AddressBookManagement;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class AddressManager { 
	static ObjectMapper objectmapper=new ObjectMapper();
	static File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
	static List<PersonalDetail> persondetails=new ArrayList<PersonalDetail>();
	static AddressBook addressbook = new AddressBook();
	static String originbook="/home/admin1/Dhanush/Bridgelabz/Myprograms/JavaPrograms/";
	
	
	public static void createBook(String originbook) throws IOException {
		//AddressDetails addressBook=null;
		System.out.println("Enter the name of the book in (.json) extention (eg:file.json)");
		String book = DataStructureUtility.readString();
		File file = new File(originbook + book);
		boolean newjason = file.createNewFile();
		if (newjason) {
			System.out.println("Book is succesfully created and add to the file");
		}
			else
			System.out.println("The Name of that book is already exists pls create new book");
	}
	
	
	
	
	public static void openBook() throws IOException {
		System.out.println("Files available are:");
		for (File file : arrayOfFiles) {
			if(file.getName().endsWith(".json"))
				System.out.println(file.getName());
			}
		System.out.println("Choose the address book");
		String book = DataStructureUtility.readString();
		int flag=0;
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (book.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Add Details");
					String string = ObjectOrientedUtility.readFile(filename);
					persondetails = objectmapper.readValue(string, new TypeReference<List<PersonalDetail>>() {
					});
					AddressBook.setpersondetails(persondetails);
					addressBook();
				} else {
					System.out.println("Address Book is empty");
					System.out.println("Add new data onto the Address Book");
					addressBook();
				}
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("File doesnot exist or u have not given extention(.json)");
	}

	public static void saveBook() {
        System.out.println("List of files");
        for (File file : arrayOfFiles) {
            if(file.getName().endsWith(".json"))
                System.out.println(file.getName());
        }
        int flag=0;
        System.out.println("Choose the address book to be saved");
        String ch_book = DataStructureUtility.readString();
        for (File file : arrayOfFiles) {
            String filename = file.getName();
            if (ch_book.equals(filename)) {
                try {
                    String json = objectmapper.writeValueAsString(AddressBook.getpersondetails());
                    ObjectOrientedUtility.writeFile(json, filename);
                    System.out.println("Address book details saved");
                    flag=1;
                } catch (Exception e) {
                    System.out.println("Cannot write to file");
                }
            }
        }
        if(flag==0)
        {
            System.out.println("File doesnot exist or u have not given extention(.json)");
        }
	}
	 public static void closeBook()
	    {
	        addressbook=null;
	    }
	
	 
	 
	 public static void saveAsBook() throws IOException {
	        System.out.println("List of files");
	        for (File file : arrayOfFiles) {
	            if(file.getName().endsWith(".json"))
	                System.out.println(file.getName());
	        }
	        System.out.println("Enter the file name to be saved with extension (eg:file.json)");
	        String book = DataStructureUtility.readString();
	        File file = new File(originbook + book);
	        boolean rs = file.createNewFile();
	        if (rs) {
	            System.out.println("File is created");
	            String json = objectmapper.writeValueAsString(AddressBook.getpersondetails());
	            ObjectOrientedUtility.writeFile(json, book);
	            System.out.println("Address book details saved");
	        } else {
	            System.out.println("File of that name already exists");
	        }
	    }

	
	public static void addressBook() throws IOException {
		System.out.println("Nesaccary requirement of the Book about the person is :");
		System.out.println("1:Add person details");
		System.out.println("2:Edit person details");
		System.out.println("3:Delete person");
		System.out.println("4:Sort the details");
		System.out.println("5:Do you want to go back to main ");
		int choice2=DataStructureUtility.readInteger();
		switch (choice2) {
		case 1:
		{
			AddressBook.personalDetails(persondetails);
			System.out.println("the person details is succesfully added to the book");
			AddressBook.displayTheAddress();
			break;
		}
		case 2:
		{
			AddressBook.editPerson();
			AddressBook.displayTheAddress();
			break;
		}
		case 3:
		{
			AddressBook.deletePerson();
			AddressBook.displayTheAddress();
			break;
		}
		case 4:
		{
			System.out.println("Do You want to Sort the Details based on " );
			System.out.println("1:Sort by Last Name");
			System.out.println("2:Sort by ZipCode");
			int choice=DataStructureUtility.readInteger();
			switch(choice){
			case 1:{
				AddressBook.sortByLastName();
				break;}
			case 2:{
				AddressBook.sortByZipCode();
				break;}
			default :
				System.out.println("Enter the proper choice");}
			break;
		}
		case 5:
			AddressBookManagement.main(null);
			default :
				System.out.println("Enter the proper choice");
}}}
