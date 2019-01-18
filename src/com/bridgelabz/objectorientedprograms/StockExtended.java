package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;

public class StockExtended {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
	//	StockPortfolio stockPortfolio=new StockPortfolio();
	//	Stock s=new Stock();
		boolean run=true;
		while(run==true)
		{
			System.out.println("*****************STOCK Management APPLICATION******************");
			System.out.println("1.Put Stock\n2.Display\n3.Exit");
			System.out.println("****************************************************");
			int choice=DataStructureUtility.readInteger();
			//String date=s.getFormatedDate( "date");
			//System.out.println(date);
			switch(choice)
			{
			case 1:StockPortfolio.addStock();
			run=true;break;
			case 2:StockPortfolio.displayStock();
			System.out.println("1> Buy Share\n   2> Sell share\n3> Save\n 4> Print 5> Display transaction history");
			System.out.println("\n");
			switch (DataStructureUtility.readInteger()) {
			case 1:StockAgency.buy();
			break;
			case 2:StockAgency.sell();
			break;
			case 3:StockAgency.save();
			break;
			case 4:StockAgency.printStock();
			break;
			case 5:System.out.println("Enter the fileName");
			StringBuffer sb1=new StringBuffer("/home/admin1/StockManagement/");
			String ss1=DataStructureUtility.readString();
			sb1.append(ss1);
				StockAgency.displayStackQueueLinkedList(sb1.toString());
			break;
			default:System.out.println("Please enter the valid option");
			break;
			}
			run=true;break;
			case 3:
			case 4:System.exit(0);run=false;break;
			default:System.out.println("Please select correct choice");break;
			}
		}}

}
