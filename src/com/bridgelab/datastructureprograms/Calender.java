package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.DataStructureUtility;

public class Calender {
	public static void main(String[] args) {
		System.out.println("enter month");
		int m = DataStructureUtility.readInteger();
		System.out.println("enter yaer");
		int y = DataStructureUtility.readInteger();
		DataStructureUtility.dispCalender(m, y);
	}
}
