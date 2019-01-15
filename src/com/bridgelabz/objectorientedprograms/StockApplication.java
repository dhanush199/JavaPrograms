package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;


import com.bridgelabz.utility.DataStructureUtility;

public class StockApplication {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
		StockPortfolio stockPortfolio=new StockPortfolio();
		Stock s=new Stock();
		boolean run=true;
		while(run==true)
		{
			System.out.println("*****************STOCK APPLICATION******************");
			System.out.println("1.Put Stock\n2.Display\n3.Value of each Stock\n4.Total Stock value\n5.Exit");
			System.out.println("****************************************************");
			int choice=DataStructureUtility.readInteger();
			//String date=s.getFormatedDate( "date");
			//System.out.println(date);
			switch(choice)
			{
			case 1:StockPortfolio.addStock();
			run=true;break;
			case 2:StockPortfolio.displayStock();run=true;break;
			case 3:StockPortfolio.valueOfEachStock();run=true;break;
			case 4:StockPortfolio.totalStockValue();run=true;break;
			case 5:System.exit(0);run=false;break;
			case 6: StockAgency.sell() ;
			break;
			case 7:StockAgency.buy();
			break;
			default:System.out.println("Please select correct choice");run=true;break;
			}
		}
	}
}



