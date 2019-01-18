package com.bridgelabz.designpatters.creational;

public class SingletonEnum {

	public static void main(String[] args) {
		EnumSingleton.doSomething();
		System.out.println(EnumSingleton.INSTANCE);
	}
}
