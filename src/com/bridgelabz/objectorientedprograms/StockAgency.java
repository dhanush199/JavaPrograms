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
	static List<Stock> liOfStocks = new ArrayList<Stock>();
	static Set<Stock> set = new HashSet<Stock>();
	//static Transactions transactions=new Transactions()
	static List<Stock> tempList =new ArrayList<Stock>();
	static final String str = "/home/admin1/StockManagement/ss.json";
	static Stock stock=null;
	static int index=-1;
	static StackLinkedList<String> stack=new StackLinkedList<String>();
	static QueueLinkedList<String> queue=new QueueLinkedList<String>();
	static SinglyLinkedListImpl<String> linkedList=new SinglyLinkedListImpl<String>();	
	public static void buy() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
		Stock s=new Stock();
		liOfStocks = new ArrayList<Stock>();
		String fileArray[]=listFilesInsideDirectory();
		String accName=searchFile(fileArray);
		liOfStocks=StockPortfolio.displayStock1("/home/admin1/StockManagement/ss.json");	
		System.out.println("Enter the name of the stock which you want to Buy");
		String s1=DataStructureUtility.readString();
		s.setStockName(s1);
		int flag=checkStockName(s1);
		System.out.println(flag);
		updateShare(flag, accName);

	}
	public static void updateShare(int flag,String accName) throws JsonGenerationException, JsonMappingException, ClassNotFoundException, IOException {
		
		if(flag<0) {
			System.out.println("Stoke name not found");
			StockApplication.main(null);
		}
		else {
			System.out.println("Enter the amount of share you wish to buy");
			stock=liOfStocks.get(index);
			stock.setDate();
			double share=DataStructureUtility.readInteger();
			if(stock.getNumberOfShare()>share && share>0) {
				double tempshare=stock.getNumberOfShare()-share;
				stock.setTransaction("added");
				queue.enqueue(stock.getDate());
				stack.push(stock.getTransaction());
				linkedList.add(stock.getStockName());
				stock.setNumberOfShare(share);
				System.out.println("share=="+stock.getNumberOfShare());
				tempList.add(stock);
				String json = ObjectOrientedUtility.userWriteValueAsString(tempList);
				System.out.println(json);
				StringBuffer sb=new StringBuffer("/home/admin1/StockManagement/");
				sb.append(accName);
				ObjectOrientedUtility.writeFile(json, sb.toString());
				System.out.println("Written successfully");				
				stock.setNumberOfShare(tempshare);				
				liOfStocks.add(stock);
				set.clear();
				set.addAll(liOfStocks);
				String json1 = ObjectOrientedUtility.userWriteValueAsString(set);
				ObjectOrientedUtility.writeFile(json1,"/home/admin1/StockManagement/ss.json");
				System.out.println("Written successfully");
			}
			else
				System.out.println("Please enter a stock less than "+stock.getNumberOfShare());
		}
		
	}
	public static int checkStockName(String s1) {
		index=-1;
		for(Stock ss:liOfStocks)
		{
			++index;
			if(ss.getStockName().equals(s1)) {
				System.out.println("found");
				break;
			}
		}
		return index;
	}

	public static void sell() throws JsonGenerationException, JsonMappingException, IOException {
		Stock stock=new Stock();
		tempList=new ArrayList<Stock>();
		liOfStocks=StockPortfolio.displayStock1("/home/admin1/StockManagement/ss.json");	
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
			double shareInCompany=liOfStocks.get(flag).getNumberOfShare();
			liOfStocks.remove(flag);
			System.out.println("Flag === "+flag);
			//liOfStocks.remove(flag);
			//StockPortfolio.displayStock();
			System.out.println("Enter the amount of share you wish to sell");
			double share1=DataStructureUtility.readInteger();
			stock=tempList.get(0);
			if(stock.getNumberOfShare()>=share1 && share1>0) {
				double share=stock.getNumberOfShare()-share1;
				stock.setNumberOfShare(share);
				stock.setDate();
				stock.setTransaction("sold");
				queue.enqueue(stock.getDate());
				stack.push(stock.getTransaction());
				linkedList.add(stock.getStockName());
				tempList.clear();
				tempList.add(stock);
				String json = ObjectOrientedUtility.userWriteValueAsString(tempList);
				StringBuffer sb11=new StringBuffer("/home/admin1/StockManagement//");
				sb11.append(accName);
				ObjectOrientedUtility.writeFile(json,sb11.toString());
				System.out.println("Written successfully");
				stock.setNumberOfShare(shareInCompany+share1);
				liOfStocks.add(stock);
				set.clear();
				set.addAll(liOfStocks);
				String json1 = ObjectOrientedUtility.userWriteValueAsString(set);
				ObjectOrientedUtility.writeFile(json1,"/home/admin1/StockManagement/ss.json");
				System.out.println("Written successfully");
			}
			else
				System.out.println("Please enter a stock less than "+stock.getNumberOfShare());
		}
	}

	public static void save() {
		System.out.println("File successfully  saved");
	}
	public static void printStock() throws FileNotFoundException {
		try{
			System.out.println("Share details of the company");
			liOfStocks=StockPortfolio.displayStock1("/home/admin1/StockManagement/ss.json");
			System.out.println("........................................");
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
		boolean isFileCreated=false;

		try {
			isFileCreated = stockFile.createNewFile();

		} catch (IOException ioe) {
			System.out.println("Error while Creating File in Java" + ioe);
		}

		System.out.println("stock file" + stockFile.getPath() + " created ");
		return ffname;
	}

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
		int accFound=0;
		for(String s:strings) {
			if(s.compareToIgnoreCase(str)==0) {
				System.out.println("Account found");
				accFound=1;
				break;
			}	}
			if(accFound==0) {
				System.out.println("Account not found!! Please creat account for further transactions");
				str=creatAccount();
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
	public static void displayQueue(String fName,QueueLinkedList<Stock> q1) throws FileNotFoundException {
		try {
			for(int i=0;i<q1.size;i++) {
			//System.out.print("Share Name  := " );
			System.out.println("Last Transaction Time/Date  : "+ q1.dequeue()+"  Share name  : "+q1.dequeue());
			System.out.println("-------------------------------------------------------");
		}}
		catch(Exception e) {
			System.out.println();
		}
	}
}








