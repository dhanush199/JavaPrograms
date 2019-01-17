package com.bridgelabz.designpatters.creational;

public class SingletonStaticblockInitialization {
	public static void main(String[] args) {
		System.out.println(StaticBlockInnitializationSingleton.getInstance());
		System.out.println(SingletonLazyInitialized.getInstance());
		System.out.println(SingletonLazyInitialized.getInstance());
	}
}