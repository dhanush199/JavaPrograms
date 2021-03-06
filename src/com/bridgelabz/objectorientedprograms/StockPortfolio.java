package com.bridgelabz.objectorientedprograms;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class StockPortfolio {
	static List<Stock> liOfStock = new ArrayList<Stock>();
	static Stock stock = null;
	static final String str = "/home/admin1/StockManagement/ss.json";
	
	public static void addStock() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
		liOfStock.clear();
		String string = ObjectOrientedUtility.readFile(str);
		System.out.println(string);
		try {
			liOfStock= ObjectOrientedUtility.convertJsonToPOJO(str, Stock.class);
			System.out.println("File is not empty!");
			System.out.println("Adding data.....");
		} catch (Exception e) {
			System.out.println("File is empty!");
			System.out.println("Adding data.....");
		}
		stock = new Stock();
		System.out.println("Enter the stock name");
		stock.setStockName(DataStructureUtility.readString());
		System.out.println("Enter total number of shares");
		stock.setNumberOfShare(DataStructureUtility.readInteger());
		System.out.println("Enter price per share");
		stock.setSharePrice(DataStructureUtility.readdouble());
		liOfStock.add(stock);
		System.out.println("Stock added successfully!!!");
		String json = ObjectOrientedUtility.userWriteValueAsString(liOfStock);
		ObjectOrientedUtility.writeFile(json, str);
	}

	public static void displayStock() throws FileNotFoundException {
		//String string = ObjectOrientedUtility.readFile(str);
		try {
			liOfStock = ObjectOrientedUtility.convertJsonToPOJO("/home/admin1/StockManagement/ps.json", Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (Stock stock : liOfStock) {
			System.out.println("Stock Name                  : " + stock.getStockName());
			System.out.println("Total number of Stock           : " + stock.getNumberOfShare());
			System.out.println("Share Price                 : " + stock.getSharePrice());
			System.out.println("Last Transaction Time/Date  : " + stock.getDate());
			System.out.println("Last Transaction status     : " + stock.getTransaction());
			System.out.println("-------------------------------------------------------");
		}
	}

	public static List<Stock> displayStock1(String fName) throws FileNotFoundException {
		//String ss = ObjectOrientedUtility.readFile(fName);
		StringBuffer sbb=new StringBuffer("/home/admin1/StockManagement//");
		sbb.append(fName);
		//System.out.println(ss);
		try {
			liOfStock = ObjectOrientedUtility.convertJsonToPOJO(sbb.toString(),  Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (Stock stock : liOfStock) {
			System.out.println("Stock Name                  : " + stock.getStockName());
			System.out.println("Total number of Stock       : " + stock.getNumberOfShare());
			System.out.println("Share Price                 : " + stock.getSharePrice());
			System.out.println("Last Transaction Time/Date  : " + stock.getDate());
			System.out.println("Last Transaction status     : " + stock.getTransaction());
			System.out.println("-------------------------------------------------------");
		}
		return liOfStock;
	}

	public static void valueOfEachStock() throws FileNotFoundException {
		String string = ObjectOrientedUtility.readFile(str);
		try {
			liOfStock = ObjectOrientedUtility.convertJsonToPOJO(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (Stock stock : liOfStock) {
			System.out.println("Stock Name               : " + stock.getStockName());
			System.out.println("Value of this stock is   :" + stock.getNumberOfShare() * stock.getSharePrice());
			System.out.println("------------------------------------------------------");
		}
	}

	public static void totalStockValue() throws FileNotFoundException {
		String string = ObjectOrientedUtility.readFile(str);
		try {
			liOfStock = ObjectOrientedUtility.convertJsonToPOJO(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		double sum = 0;
		for (Stock stock : liOfStock) {
			sum += (stock.getNumberOfShare() * stock.getSharePrice());
		}
		System.out.println("Total value of stock is :" + sum + "\n");
	}
}


