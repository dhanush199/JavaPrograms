package com.bridgelabz.objectorientedprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.objectorientedprograms.InventoryList;
import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JasonInventory {

	static ObjectMapper objectMapper = new ObjectMapper();
	static List<InventoryList> list2 = new ArrayList<InventoryList>();
	static InventoryList inventoryList = new InventoryList();
	static List<Inventory> liInventories = new ArrayList<Inventory>();

	public static void main(String[] args) throws IOException {
		String str = "/home/admin1/Dhanush/input.json";
		//		ObjectMapper objectMapper = new ObjectMapper();
		//		List<InventoryList> list2 = new ArrayList<InventoryList>();
		//		InventoryList inventoryList = new InventoryList();
		//		List<Inventory> liInventories = new ArrayList<Inventory>();
		String file = "";
		int k = 0;
		do {
			System.out.println("1.Display file\n2.Add to file\n3.Check for price\n4.exit");
			int choice = DataStructureUtility.readInteger();
			switch (choice) 
			{
			case 1:
				file = ObjectOrientedUtility.readFile(str);
				try {
					list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {
					});
					ObjectOrientedUtility.display1(list2);
				} catch (Exception e) {
					System.out.println("file is empty!! first add inputs on to file or select second choice");
				}
				break;
			case 2:addInvent();

			break;
			case 3:
				file = ObjectOrientedUtility.readFile(str);
				list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {});
				ObjectOrientedUtility.price(list2);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("please select valid input");
				break;
			}
			System.out.println("Press 1 to main Menu");
			k=DataStructureUtility.readInteger();
			//z++;
		} while (k==1);
	}
	public static void addInvent() throws IOException{
		int k=0;
		int op = 1;
		while (op==1) 
			do{
				String [] arr= {"","rice","wheat","pulses"};
				System.out.println("Select the inventory name \n 1.rice 2.wheat 3.pulses");
				int option=DataStructureUtility.readInteger();
				int flag = 0;
				{
					for (InventoryList invenList : list2) {
						if (arr[option].equals(invenList.getInventoryName())) {
							liInventories = invenList.getListOfInventories();
							Inventory inventory = ObjectOrientedUtility.getInventories();
							liInventories.add(inventory);
							flag = 1;
						}
					}
					if (flag == 0) {
						Inventory inventory = ObjectOrientedUtility.getInventories();
						liInventories.add(inventory);
						inventoryList = ObjectOrientedUtility.insertInventoryList(arr[option], liInventories);
						list2.add(inventoryList);
					}
					System.out.println("wish to add some more inventorry(1 or 0)");
					op = DataStructureUtility.readInteger();
				}

				System.out.println("Entered elements has been added to list");
				String json = objectMapper.writeValueAsString(list2);
				ObjectOrientedUtility.write(json);
				System.out.println("Inventory list has been written on to file");
				System.out.println("Press 1 to add more inventory rice/wheat/pulses");
				k=DataStructureUtility.readInteger();
			}while(k==1);
		String[] s={};
		main(s);
	}
}




