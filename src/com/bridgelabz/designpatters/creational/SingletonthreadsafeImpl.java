package com.bridgelabz.designpatters.creational;

public class SingletonthreadsafeImpl {
	public static void main(String[] args) {
		System.out.println(ThreadSafeSingleton.getInstance());
		System.out.println(ThreadSafeSingleton.getInstance());
		System.out.println(ThreadSafeSingleton.getInstance());
		System.out.println(ThreadSafeSingleton.getInstance());
	}
}
