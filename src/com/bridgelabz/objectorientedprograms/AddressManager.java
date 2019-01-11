package com.bridgelabz.objectorientedprograms;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.bridgelabz.utility.DataStructureUtility;

public class AddressManager {
	List<PersonDetails> details = new ArrayList<PersonDetails>();
	public static StringBuffer creat() {
		System.out.println("Enter the book name followed by .json: ");
		String name=DataStructureUtility.readString();
		boolean flag = false;
		String str=	"D://Bridgelabs/";
		StringBuffer sb=new StringBuffer(str);
		sb.append(name);
		// create File object
		File stockFile = new File(sb.toString());

		try {
			flag = stockFile.createNewFile();
		} catch (IOException ioe) {
			System.out.println("Error while Creating File in Java" + ioe);
		}

		System.out.println("stock file" + stockFile.getPath() + " created ");


		if(!flag)
			System.out.println("Book name already exists");

		else 
			System.out.println("SuccessFully created");
		return sb;
	}

	public static void deletBook() {
		System.out.println("Enter the book name you wish to delet followed by .jason");
		String name=DataStructureUtility.readString();
		StringBuffer sb=new StringBuffer("D://Bridgelabs/");
		sb.append(name);
		File file=new File(name);
		boolean found=file.delete();
		if(!found){
			System.out.println(name+" book not found");

		}
		else 
			System.out.println("SuccessFully deleted");
	}
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

}
