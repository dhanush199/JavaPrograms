package com.bridgelabz.objectorientedprograms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class AddressManager {
	List<PersonDetails> details = new ArrayList<PersonDetails>();
	//Creat Method//

	public static StringBuffer creat(String fname) {

		boolean flag = false;
		String str=	"/home/admin1/Anush/";
		StringBuffer sb=new StringBuffer(str);
		sb.append(fname);
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
	//Delet method//
	public static void deletBook() {
		System.out.println("Enter the book name you wish to delet followed by .jason");
		String name=DataStructureUtility.readString();
		StringBuffer sb=new StringBuffer("/home/admin1/Anush/");
		sb.append(name);
		File file=new File(sb.toString());
		boolean found=file.delete();
		if(!found){
			System.out.println(name+" book not found");
		}
		else 
			System.out.println("SuccessFully deleted");
	}
	public static void saveBook(List<PersonDetails> listOfPerson,String fname) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println(fname);
		System.out.println(listOfPerson);
		ObjectMapper objectMapper=new ObjectMapper();
		String json = objectMapper.writeValueAsString(listOfPerson);
		AddressManager.write1(json,fname);
		System.out.println("Book saved");
	}
	public static void write1(String json,String fName) throws IOException
	{
		StringBuffer sb=new StringBuffer("/home/admin1/Anush/");
		sb.append(fName);
		FileWriter fw = new FileWriter(sb.toString());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.flush();
	}
	//openBook 
	public static void display1(List<PersonDetails> listOfPerson)
	{
		for (PersonDetails p:listOfPerson ) {
			System.out.println(p.getFirstName());
			System.out.println(p.getLastName());
			System.out.println(p.getPhoneNum());
			Address adr=new Address();
			System.out.println(adr.getCity());
			System.out.println(adr.getState());
		}
	}
	//openBook
	public static void openBook(String str) throws FileNotFoundException 
	{		
		List<PersonDetails> list2=new ArrayList();
		StringBuffer sb=new StringBuffer("/home/admin1/Anush/");
		sb.append(str);
		String file = ObjectOrientedUtility.readFile(sb.toString());
		System.out.println(file);
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			list2 = objectMapper.readValue(file, new TypeReference<List<PersonDetails>>() {
			});
			AddressBook.displayTheAddress(list2);
		} catch (Exception e) {
			System.out.println("file is empty!! first add inputs on to file or select second choice");
		}
	}
	//Save As method
	public static String saveAs(String fromName, String toName)
	{
		String flname="/home/admin1/Anush";
		try
		{
			File fe = new File(flname);
			File allFile[] = fe.listFiles();
			for(int a = 0; a < allFile.length; a++)
			{
				String presentName = (allFile[a].toString().replaceAll(fromName, toName));
				allFile[a].renameTo(new File(presentName));
			}
			return allFile + " files renamed successfully.!!!";
		}
		catch(Exception ae)
		{
			return(ae.getMessage());
		}
	}
	public static boolean closeBook() {
		return false;
	}



}
