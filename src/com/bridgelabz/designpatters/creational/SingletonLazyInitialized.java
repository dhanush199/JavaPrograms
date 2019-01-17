package com.bridgelabz.designpatters.creational;

public class SingletonLazyInitialized {

	private static SingletonLazyInitialized instance;

	SingletonLazyInitialized(){}

	// this will not provide any thread safety
	public static Object getInstance(){
		if(instance == null){
			instance = new SingletonLazyInitialized();
		}
		return instance;
	}
}

