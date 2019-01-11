package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.bridgelabz.utility.DataStructureUtility;

public class AddressManager {
	List<PersonDetails> details = new ArrayList<PersonDetails>();
	public static List<AddressBook> creatBook() {
		AddressBook addressBook = new AddressBook();
		System.out.println("Enter the book name");
		String bookName=DataStructureUtility.readString();
		addressBook.setaddresBookname(bookName);
		List<AddressBook> list2 = new ArrayList<AddressBook>();
		list2.add(addressBook);
		return list2;
	}
	public static Map<String, List<PersonDetails>> openBook(Map<String, List<PersonDetails>> map){
		System.out.println("Enter the book name which you want to open");
		String str1=DataStructureUtility.readString();	
		List<PersonDetails> defaultValue=new LinkedList<PersonDetails>();
		if(map.containsKey(str1)) {
			System.out.println(map.getOrDefault(str1, defaultValue));
		}
		else
			System.out.println(str1+" Book not found");
		return map;
	}
	public static void saveBook() {
		//writeToFile();
	}
	public static Map<String, List<PersonDetails>> saveAs(Map<String, List<PersonDetails>> map, List<PersonDetails> perDetail) {
		System.out.println("Enter the old name of the book");
		String oldName=DataStructureUtility.readString();
		System.out.println("Enter the new name");
		String newName=DataStructureUtility.readString();
		if(map.containsKey(oldName)) {
		map.replace(newName,perDetail);
		assert (oldName == null);}
		else
			System.out.println(oldName+" Book Not found");
		return map;
	}
	public static void closeBook() {
		//closeFile();
	}
	public static Map<String, List<PersonDetails>> deletBook(Map<String, List<PersonDetails>> map) {
		System.out.println("Enter the book name you wish to delet");
		String name=DataStructureUtility.readString();
		if(map.containsKey(name)){
			map.remove(name);
		}
		else 
			System.out.println(name+" book not found");
		return map;
	}
}
