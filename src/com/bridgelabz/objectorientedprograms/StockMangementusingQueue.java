package com.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.QueueLinkedList;

public class StockMangementusingQueue {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String s=null;
		System.out.println("Select the option");
		System.out.println("1.Buy share\n2.Sell\n");
		QueueLinkedList queue=new QueueLinkedList();
		List<Stock> list=new ArrayList<Stock>();
		int opt=DataStructureUtility.readInteger();
		do 
		{
			switch (opt) 
			{
			case 1:
				System.out.println("Enter the fileName");
				StringBuffer sb1=new StringBuffer("/home/admin1/StockManagement/");
				String ss1=DataStructureUtility.readString();
				sb1.append(ss1);
				list=StockPortfolio.displayStock1(sb1.toString());
				for(Stock stock:list) {
					queue.enqueue(stock.getDate());
					queue.enqueue(stock.getStockName());

					
				}
				StockAgency.displayQueue(sb1.toString(),queue);
				
				//queue.display();

				break;

			default:
				break;
			}
			System.out.println("Do you want to continue? Y/N");
			s=DataStructureUtility.readString();
		}while(s.compareToIgnoreCase("y")==0);
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
	
}







