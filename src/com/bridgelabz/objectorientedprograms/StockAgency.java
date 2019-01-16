package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;
import com.bridgelabz.utility.QueueLinkedList;
import com.bridgelabz.utility.SinglyLinkedListImpl;
import com.bridgelabz.utility.StackLinkedList;

public class StockAgency {
	static List<Stock> liOfStock = new ArrayList<Stock>();
	static Set<Stock> set = new HashSet<Stock>();
	//static Transactions transactions=new Transactions();
	static List<Stock> tempList =new ArrayList<Stock>();
	static final String str = "/home/admin1/StockManagement/ss.json";
	static Stock s=null;
	static int index=-1;
	static StackLinkedList<String> stack=new StackLinkedList<String>();
	static QueueLinkedList<String> queue=new QueueLinkedList<String>();
	static SinglyLinkedListImpl<String> linkedList=new SinglyLinkedListImpl<String>();	
	@SuppressWarnings("unlikely-arg-type")
	public static void buy() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
		Stock s=new Stock();
		liOfStock = new ArrayList<Stock>();
		String fileArray[]=listFilesInsideDirectory();
		String accName=searchFile(fileArray);
		liOfStock=StockPortfolio.displayStock1("/home/admin1/StockManagement/ss.json");	
		System.out.println("Enter the name of the stock which you want to Buy");
		String s1=DataStructureUtility.readString();
		s.setStockName(s1);
		int flag=checkStockName(s1);
		System.out.println(flag);
		if(flag<0) {
			System.out.println("Stoke name not found");
			String[] str1= {};
			StockApplication.main(str1);
		}
		else {
			System.out.println("Enter the amount of share you wish to buy");
			//System.out.println(flag);
			s=liOfStock.get(index);
			s.setDate();
			//tempList.add(s);
			double share=DataStructureUtility.readInteger();
			if(s.getNumberOfShare()>share && share>0) {
				System.out.println("Present share=="+s.getNumberOfShare());
				double temp=s.getNumberOfShare();
				share=s.getNumberOfShare()-share;
				s.setTransaction("added");
				queue.enqueue(s.getDate());
				stack.push(s.getTransaction());
				linkedList.add(s.getStockName());
				s.setNumberOfShare(share);
				System.out.println("share=="+s.getNumberOfShare());
				//s.setTransaction("daswd");
				tempList.add(s);
				String json = ObjectOrientedUtility.userWriteValueAsString(tempList);
				ObjectOrientedUtility.writeFile(json, accName);
				System.out.println("Written successfully");				
				s.setNumberOfShare(temp-share);				
				liOfStock.add(s);

				set.addAll(liOfStock);
				String json1 = ObjectOrientedUtility.userWriteValueAsString(set);
				ObjectOrientedUtility.writeFile(json1, "/home/admin1/StockManagement/ss.json");
				System.out.println("Written successfully");
			}
			else
				System.out.println("Please enter a stock less than "+s.getNumberOfShare());
		}
	}
	public static int checkStockName(String s1) {
		index=-1;
		for(Stock ss:liOfStock)
		{
			++index;
			if(ss.getStockName().equals(s1)) {
				System.out.println("found");
				break;
			}
		}
		return index;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void sell() throws JsonGenerationException, JsonMappingException, IOException {
		Stock s=new Stock();
		tempList=new ArrayList<Stock>();
		liOfStock=StockPortfolio.displayStock1("/home/admin1/StockManagement/ss.json");	
		String fileArray[]=listFilesInsideDirectory();
		String accName=searchFile(fileArray);
		tempList=StockPortfolio.displayStock1(accName);
		System.out.println("Enter the name of the Stoke which you want to Sell");
		String s1=DataStructureUtility.readString();
		int flag=0;
		flag=checkStockName(s1);
		System.out.println(flag);
		if(flag<0)System.out.println("Stoke name not found");
		else {
			double shareInCompany=liOfStock.get(flag).getNumberOfShare();
			//liOfStock.remove(flag);
			StockPortfolio.displayStock();
			System.out.println("Enter the amount of share you wish to sell");
			s=tempList.get(0);
			double share1=DataStructureUtility.readInteger();
			if(s.getNumberOfShare()>share1 && share1>0) {
				System.out.println("Present shares=="+s.getNumberOfShare());
				///s.getNumberOfShare();
				//liOfStock.remove(s);
				double share=s.getNumberOfShare()-share1;
				System.out.println("share=="+s.getNumberOfShare());
				s.setNumberOfShare(share);
				s.setDate();
				s.setTransaction("sold");
				queue.enqueue(s.getDate());
				stack.push(s.getTransaction());
				linkedList.add(s.getStockName());
				tempList.clear();
				tempList.add(s);
				String json = ObjectOrientedUtility.userWriteValueAsString(tempList);
				ObjectOrientedUtility.writeFile(json, "/home/admin1/StockManagement/ps.json");
				System.out.println("Written successfully");
				s.setNumberOfShare(shareInCompany+share1);
				System.out.println("Company Share = "+s.getNumberOfShare());
				liOfStock.add(s);
				String json1 = ObjectOrientedUtility.userWriteValueAsString(liOfStock);
				ObjectOrientedUtility.writeFile(json1, "/home/admin1/StockManagement/ss.json");
				System.out.println("Written successfully");
			}
			else
				System.out.println("Please enter a stock less than "+s.getNumberOfShare());
		}
	}

	public static void save() {
		System.out.println("File successfully saved");

	}
	public static void printStock() throws FileNotFoundException {
		try{
			System.out.println("Share details of the company");
			liOfStock=StockPortfolio.displayStock1("/home/admin1/StockManagement/ss.json");	
			System.out.println("///////////////////////////////////////");
			System.out.println("Shares details of the person");
			tempList=StockPortfolio.displayStock1("/home/admin1/StockManagement/ps.json");
			System.out.println("Stack/Queue elements are");

		}
		catch(FileNotFoundException e){
			System.out.println("Please enter the valid file name/path");
		}
	}
	public static String creatAccount() {
		System.out.println("Enter the account name");
		StringBuffer sb=new StringBuffer("/home/admin1/StockManagement/");
		String ffname=DataStructureUtility.readString();
		sb.append(ffname);
		File stockFile = new File(sb.toString());
		boolean flag=false;

		try {
			flag = stockFile.createNewFile();

		} catch (IOException ioe) {
			System.out.println("Error while Creating File in Java" + ioe);
		}

		System.out.println("stock file" + stockFile.getPath() + " created ");
		return ffname;
	}
	//	public static void findFileInsideDirectory(String name,File file)
	//	{
	//		File[] list = file.listFiles();
	//		if(list!=null)
	//			for (File fil : list)
	//			{
	//				if (fil.isDirectory())
	//				{
	//					findFileInsideDirectory(name,fil);
	//				}
	//				else if (name.equalsIgnoreCase(fil.getName()))
	//				{
	//					System.out.println(fil.getParentFile());
	//				}
	//			}
	//	}
	public static String[] listFilesInsideDirectory()
	{
		File dir = new File("/home/admin1/StockManagement//");
		String[] children = dir.list();

		if (children == null) {
			System.out.println("does not exist or is not a directory");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
		return children;
	}
	public static String searchFile(String[] strings) {
		System.out.println("Enter your account name");
		String str=DataStructureUtility.readString();
		for(String s:strings) {
			if(s.compareToIgnoreCase(str)==0) {
				System.out.println("Account found");
				break;
			}
			else {
				str=creatAccount();
				break;
			}
		}
		return str;
	}

	public static void displayStackQueueLinkedList(String fName) throws FileNotFoundException {
		try {
			System.out.print("Share Name  := " );
			linkedList.traverse();
			System.out.println("Last Transaction Time/Date  : "+ queue.dequeue());
			System.out.println("Last Transaction status     : " + stack.pop());

			System.out.println("-------------------------------------------------------");
		}
		catch(Exception e) {
			System.out.println("No transaction innitiated yet");
		}
	}
}








