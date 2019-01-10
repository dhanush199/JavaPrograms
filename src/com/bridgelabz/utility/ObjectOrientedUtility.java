package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
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

	public static void writeToFile(List<InventoryList> list1 ) throws JsonGenerationException, JsonMappingException, IOException {	       
		ObjectMapper objectMapper = new ObjectMapper(); 
		List<InventoryList> inventoryList=new LinkedList<InventoryList>();
		inventoryList.addAll(list1);
		String json = objectMapper.writeValueAsString(inventoryList);
		ObjectOrientedUtility ob=new ObjectOrientedUtility();
		//		String json = objectMapper.writeValueAsString(ob.toString());
		FileWriter fileWriter = new FileWriter("/home/admin1/Dhanush/output.json");
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
			System.out.println("price :"+it.getListOfInventories().get(0).getPrice());
			System.out.println("weight :"+it.getListOfInventories().get(0).getWeight());
			System.out.println("=======================================");
		}
		return list2;
	}
	public static Inventory getUserInput(int optn) {
		List<Inventory> listOfInventories = new ArrayList<Inventory>();
		Inventory inventory = new Inventory();		
		InventoryList inventoryList = new InventoryList();
		String strr[]= {"", "rice","wheat","pulse"};
		inventoryList.setInventoryName(strr[optn]);
		System.out.println("Enter the name of "+strr[optn]);
		String name=DataStructureUtility.readString();
		inventory.setName(name);
		System.out.println("Enter the price per Kg");
		double price=DataStructureUtility.readdouble();
		inventory.setPrice(price);
		System.out.println("Enter the the required qty ");
		double weight=DataStructureUtility.readdouble();
		inventory.setWeight(weight);

		return inventory;
	}
	public static double calPrice(double perKg,double Kg) {
		return perKg*Kg;
	}
	public static String readFile(String str) throws FileNotFoundException {
		FileReader f = new FileReader(str);
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		try {
			String word="";
			while ((word = read.readLine()) != null) {
				line = word;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}
	public static void write(String json) throws IOException
	{
		FileWriter fw = new FileWriter("/home/admin1/Dhanush/input.json");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.flush();
	}
	public static InventoryList insertInventoryList(String inventoryName,List<Inventory> listOfInventories)
	{
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName(inventoryName);
		inventoryList.setListOfInventories(listOfInventories);
		return inventoryList;
	}
	static List<Inventory> liInventories = new ArrayList<Inventory>();
	public static List<Inventory> insertInventory(String name,float weight,double price)
	{
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		liInventories.add(inventory);
		return liInventories;
	}
	public static void display(List<InventoryList> list2)
	{
		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				System.out.println("price :" + it.getListOfInventories().get(j).getPrice());
				System.out.println("weight :" + it.getListOfInventories().get(j).getWeight());
				System.out.println();
			}
			System.out.println("---------------------------------------------");
		}
	}
	public static Inventory getInventories()
	{
		Inventory inventory = new Inventory();
		System.out.println("Enter name of inventory");
		inventory.setName(DataStructureUtility.readString());
		System.out.println("Enter weight of inventory in kilograms");
		inventory.setWeight(DataStructureUtility.readdouble());
		System.out.println("Enter price of inventory in rupees");
		inventory.setPrice(DataStructureUtility.readdouble());
		return inventory;
	}
	public static void price(List<InventoryList> list2)
	{

		for (int i = 0; i < list2.size(); i++) {
			InventoryList it = list2.get(i);
			System.out.println("Inventory name :" + it.getInventoryName());
			for (int j = 0; j < it.getListOfInventories().size(); j++) {
				System.out.println("name :" + it.getListOfInventories().get(j).getName());
				double sum=it.getListOfInventories().get(j).getPrice()*it.getListOfInventories().get(j).getWeight();
				System.out.println("total price to be given is :"+sum);
			}
			System.out.println("---------------------------------------------");
		}
	}
}


