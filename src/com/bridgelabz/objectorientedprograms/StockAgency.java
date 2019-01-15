package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class StockAgency {
	static List<Stock> liOfStock = new ArrayList<Stock>();
	static Set<Stock> set = new HashSet<Stock>();

	static List<Stock> tempList =new ArrayList<Stock>();
	static final String str = "/home/admin1/StockManagement/stock.json";
	static Stock s=null;
	static int index=-1;
	@SuppressWarnings("unlikely-arg-type")
	public static void buy() throws JsonGenerationException, JsonMappingException, IOException {
		Stock s=new Stock();

		String string = ObjectOrientedUtility.readFile(str);
		System.out.println(string);
		try {
			liOfStock= ObjectOrientedUtility.convertJsonToPOJO(str, Stock.class);
			System.out.println("File is not empty!");
			System.out.println(liOfStock);
			System.out.println("Adding data.....");
		} catch (Exception e) {
			System.out.println("File is empty!");
			System.out.println("Please Add data.....");
		}

		StockPortfolio.displayStock();
		System.out.println("Enter the name of the Stoke  which you want to Buy");
		String s1=DataStructureUtility.readString();
		s.setStockName(s1);
		int flag=checkStockName(s1);
		if(flag==0)System.out.println("Stoke name not found");
		else {
			System.out.println("Enter the amount of share you whish to buy");
			s=liOfStock.get(index);
			//tempList.add(s);
			double share=DataStructureUtility.readInteger();
			if(s.getNumberOfShare()>share && share>0) {
				System.out.println("Present shares=="+s.getNumberOfShare());
				double temp=s.getNumberOfShare();
				share=s.getNumberOfShare()-share;
				s.setNumberOfShare(share);
				System.out.println("share=="+s.getNumberOfShare());
				s.setNumberOfShare(share);
				//System.out.println("Share price is equals to"+s.getSharePrice());
				tempList.add(s);
				String json = ObjectOrientedUtility.userWriteValueAsString(tempList);
				ObjectOrientedUtility.writeFile(json, "/home/admin1/StockManagement/personStock.json");
				System.out.println("Written successfully");
				s.setNumberOfShare(temp-share);
				liOfStock.add(s);
				set.addAll(liOfStock);
				String json1 = ObjectOrientedUtility.userWriteValueAsString(set);
				ObjectOrientedUtility.writeFile(json1, "/home/admin1/StockManagement/stock.json");
				System.out.println("Written successfully");
			}
			else
				System.out.println("Please enter a stock less than "+s.getNumberOfShare());
		}
	}
	public static int checkStockName(String s1) {
		index=-1;
		for(Stock ss:liOfStock) {
			++index;
			if(ss.getStockName().equals(s1)) {
				System.out.println("found");

				break;
			}}

		if(index<0)System.out.println("Stoke name not found");
		return index;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void sell() throws JsonGenerationException, JsonMappingException, IOException {
		Stock s=new Stock();
		tempList=new ArrayList<Stock>();
		try {
			liOfStock= ObjectOrientedUtility.convertJsonToPOJO("/home/admin1/StockManagement/stock.json", Stock.class);
			tempList = ObjectOrientedUtility.convertJsonToPOJO("/home/admin1/StockManagement/personStock.json", Stock.class);

			System.out.println("File is not empty!");
			System.out.println(liOfStock);
			System.out.println("Adding data.....");
		} catch (Exception e) {
			System.out.println("File is empty!");
			System.out.println("Please Add data.....");
		}

		StockPortfolio.displayStock();
		System.out.println("Enter the name of the Stoke  which you want to Sell");
		String s1=DataStructureUtility.readString();

		int flag=checkStockName(s1);
		if(flag<0)System.out.println("Stoke name not found");
		else { 
			
			double shareInCompany=liOfStock.get(flag).getNumberOfShare();
			liOfStock.remove(flag);
			StockPortfolio.displayStock();
		System.out.println("Enter the amount of share you wish to sell");
		s=tempList.get(0);
		double share1=DataStructureUtility.readInteger();
		if(s.getNumberOfShare()>share1 && share1>0) {
			System.out.println("Present shares=="+s.getNumberOfShare());
			s.getNumberOfShare();
			liOfStock.remove(s);
		 	double share=s.getNumberOfShare()-share1;
			System.out.println("share=="+s.getNumberOfShare());
			s.setNumberOfShare(share);
			tempList.clear();
			tempList.add(s);
			String json = ObjectOrientedUtility.userWriteValueAsString(tempList);
			ObjectOrientedUtility.writeFile(json, "/home/admin1/StockManagement/personStock.json");
			System.out.println("Written successfully");
			s.setNumberOfShare(shareInCompany+share1);
			System.out.println("Company Share = "+s.getNumberOfShare());
			liOfStock.add(s);
			String json1 = ObjectOrientedUtility.userWriteValueAsString(liOfStock);
			ObjectOrientedUtility.writeFile(json1, "/home/admin1/StockManagement/stock.json");
			System.out.println("Written successfully");
		}
		else
			System.out.println("Please enter a stock less than "+s.getNumberOfShare());
	}
		}

	public static void save() {

	}
	public static void printStock() {

	}
}
