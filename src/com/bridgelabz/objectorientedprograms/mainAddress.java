package com.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.ObjectOrientedUtility;

public class mainAddress {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		List<PersonDetails> perDetail=new ArrayList<PersonDetails>();
		List<AddressBook> addressBook=new ArrayList<AddressBook>();
		Map<String, List<PersonDetails>> map = new HashMap<String, List<PersonDetails>>();
		//System.out.println("Enter the option");

		while(true) 
		{
				Scanner sc=new Scanner(System.in);
				int key=sc.nextInt();
					switch (key) {
					
					case 1:addressBook=AddressManager.creatBook();
					map.put(AddressBook.getaddresBookname(),perDetail);
					System.out.println(map.entrySet());
					break;
					case 2:map=AddressManager.openBook(map);
					break;
					case 3:map=AddressManager.deletBook(map);
					break;
					case 4:map=AddressManager.saveAs(map,perDetail);
					break;
					case 5:perDetail=AddressBook.addPerson();
					break;
					default:
						break;
					}
			addressBook=AddressManager.creatBook();
			perDetail=AddressBook.addPerson();
			map.put(AddressBook.getaddresBookname(),perDetail);
			System.out.println(map.entrySet());
			map=AddressManager.openBook(map);
			map=AddressManager.deletBook(map);
			map=AddressManager.saveAs(map,perDetail);
			System.out.println("map= " +map.entrySet());
			String str = "/home/admin1/Dhanush/AddressBook.json";
			String file = "";
			file = ObjectOrientedUtility.readFile(str);
			ObjectMapper objectMapper = new ObjectMapper();
			perDetail = objectMapper.readValue(file, new TypeReference<List<PersonDetails>>() {});
					ObjectOrientedUtility.displayFile(perDetail);

		}
	}
}

