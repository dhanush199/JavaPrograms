package com.bridgelabz.designpatters.creational;

public class Example {
	
	 public static void main(String[] args) 
	    { 
	        //int n = 8; // Number of threads 
	        for (int i=0; i<8; i++) 
	        { 
	    		//System.out.println(ThreadSafeSingleton.getInstance());

	        	MultiThreadingDemo object = new MultiThreadingDemo(); 
	            object.start(); 
	            abc();
	        } 
	    } 
	 public static void abc(){
		 
		 MultiThreadingDemo object = new MultiThreadingDemo();
		 System.out.println("Fram  is  "+object.getContextClassLoader());
	 }
}
