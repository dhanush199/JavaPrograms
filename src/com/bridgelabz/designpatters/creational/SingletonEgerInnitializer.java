package com.bridgelabz.designpatters.creational;

public class SingletonEgerInnitializer {
	
	public static void main(String[] args) {
		System.out.println(EagerInitializedSingleton.getInstance());
		System.out.println(EagerInitializedSingleton.getInstance());
		System.out.println(EagerInitializedSingleton.getInstance().hashCode());
		System.out.println(EagerInitializedSingleton.getInstance().hashCode());

	}
}
