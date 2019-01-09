package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.objectorientedprograms.InventoryList;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class Json {
	public static void main(String[] args) throws IOException {
		Inventory it=new Inventory();
		String str="/home/admin1/Dhanush/example.json";
		String file=ObjectOrientedUtility.readFile(str);
		System.out.println(file);
		int opt;
		List<InventoryList> list22 = new ArrayList<InventoryList>();

		list22=ObjectOrientedUtility.readFromFile( file);
		System.out.println(list22);
		ObjectMapper objectMapper=new ObjectMapper();
		InventoryList inventoryList = new InventoryList();
		Inventory inventory = new Inventory();
//		List<Map<String, List<Inventory>>> list2 = objectMapper.readValue(file, new TypeReference<List<Map<String,List<Inventory>>>>(){});
//		System.out.println(list2);
		do{ 
			System.out.println("1>Rice    2>Wheat    3>Pulse ");  
			int optn=DataStructureUtility.readInteger();
			ObjectOrientedUtility.getUserInput(optn);
			//			List<InventoryList>listInput=ObjectOrientedUtility.readFromFile(file);
			//			List<Inventory> liInventories = new ArrayList<Inventory>();
			//			liInventories.add(inventory);
			//			inventoryList.setListOfInventories(liInventories);
			//			list22.add(inventoryList);
			System.out.println("do you want to continue? Pres 1.Continue    2.Exit");
			opt=DataStructureUtility.readInteger();
		}while(opt==1);

		//		for(Map<String, List<Inventory>> li:list2)
		//		{
		//			Map<String, List<Inventory>> list11 = li;
		//			Map<String, List<Inventory>> list1 = li;
		//
		//			for (Entry<String, List<Inventory>> entry : list1.entrySet()) {
		//				List<Inventory> list12 = entry.getValue();
		//				for(int i=0;i<list12.size();i++)
		//				{
		//					Inventory it = list12.get(i);
		//					System.out.println("name :"+it.getName());
		//					System.out.println("weight :"+it.getWeight());
		//					System.out.println("price :"+it.getPrice()+"\n");
		//				}
		//			}
		//
		//
		//		}

	}

}


