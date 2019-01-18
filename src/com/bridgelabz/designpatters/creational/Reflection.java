package com.bridgelabz.designpatters.creational;

import java.lang.reflect.Constructor;

public class Reflection {

	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		EagerInitializedSingleton instanceThree = null;
		//BillPughSingleton bps=new BillPughSingleton();// asks for accessible
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				instanceThree = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());// Different value
		System.out.println(instanceTwo.hashCode());// Different value
		System.out.println(instanceThree.hashCode());// Different value
	}
}


