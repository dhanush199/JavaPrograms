package com.bridgelabz.designpatters.creational;

public class StaticBlockInnitializationSingleton {

	// Can add extra features like Exception Handling

	private static StaticBlockInnitializationSingleton instance;

	private StaticBlockInnitializationSingleton(){}//can't creat object of this class within other class

	//static block initialization for exception handling
	static{
		try{
			instance = new StaticBlockInnitializationSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockInnitializationSingleton getInstance(){
		return instance;
	}
}


