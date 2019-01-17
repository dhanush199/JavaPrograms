package com.bridgelabz.designpatters.creational;

public class EagerInitializedSingleton {
	//global variable
	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

	//private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton(){}

	public static EagerInitializedSingleton getInstance(){
		System.out.println("Inside eagerInnitializer class");
		return INSTANCE;//should be accessible for all classes of the application
	}
	
}



