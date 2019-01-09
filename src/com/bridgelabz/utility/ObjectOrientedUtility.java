package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.objectorientedprograms.Inventory;
import com.bridgelabz.objectorientedprograms.InventoryList;


public class ObjectOrientedUtility {
	static Scanner sc=new Scanner(System.in);


	BufferedReader br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "12/06/2016";

	//constructor to initialize bufferedReader
	public ObjectOrientedUtility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	//Regex pattern matcher match the string and replace the regex pattern with user details.
	public String convertString(UserDetails userDetails,String message){
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.date());

		return message;
	}
	public String getFileText(String fileName){
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		}
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}
	public void writeToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write(data); 
		writer.flush();
		writer.close();
	}
	public String getFormatedDate(java.util.Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}
	public java.util.Date printDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException pe){
			return null;
		}
	}
	public static String inputString() {
		return sc.next();
	}
	public static String readFile( String fName) 
	{
		//System.out.println("Enter the path of the file");
		String csvFile =fName;
		//String csvFile="/home/admin1/Desktop/Files/example.txt";
		String line = "";
		String name="";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
		{
			while ((line = br.readLine()) != null) 
			{
				name=line;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}
	public void writeToFile(List<InventoryList> list1) throws JsonGenerationException, JsonMappingException, IOException {	       
		ObjectMapper objectMapper = new ObjectMapper();     
		String json = objectMapper.writeValueAsString(list1);
		FileWriter fileWriter = new FileWriter("/home/admin1/Dhanush/output.jason");
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
		bufferWriter.write(json);
		bufferWriter.flush();
	}
	public static List<InventoryList> readFromFile(String file) throws JsonGenerationException, JsonMappingException, IOException {	  
		ObjectMapper objectMapper=new ObjectMapper();
		List<InventoryList> list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>(){});

		for(int i=0;i<list2.size();i++)
		{
			InventoryList it = list2.get(i);
			System.out.println("name :"+it.getInventoryName());
			System.out.println("name :"+it.getListOfInventories().get(0).getName());
			System.out.println("name :"+it.getListOfInventories().get(0).getPrice());
		}
		return list2;
	}
	public static void getUserInput(int optn) {
		Inventory inventory = new Inventory();
		InventoryList inventoryList = new InventoryList();
		String strr[]= {"", "rice","wheat","pulse"};
		inventoryList.setInventoryName(strr[optn]);
		System.out.println("Enter the name of rice");
		String rice=DataStructureUtility.readString();
		inventoryList.setInventoryName(rice);
		System.out.println("Enter the price per Kg");
		double price=DataStructureUtility.readdouble();
		inventory.setPrice(price);
		System.out.println("Enter the the required qty ");
		double qty=DataStructureUtility.readdouble();
		inventory.setWeight(qty);
		
	}
}


