package com.bridgelabz.designpatterns.FactoryDesignPattern;


public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		PrototypeDesignPatternEmployees emps = new PrototypeDesignPatternEmployees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		PrototypeDesignPatternEmployees empsNew = (PrototypeDesignPatternEmployees) emps.clone();
		PrototypeDesignPatternEmployees empsNew1 = (PrototypeDesignPatternEmployees) emps.clone();
		java.util.List<String>  list = empsNew.getEmpList();
		list.add("John");
		java.util.List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);

	}

}
