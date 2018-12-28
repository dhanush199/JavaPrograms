package com.bridgelabz.functionalprograms;

import java.util.ArrayList;

public class ReferenceTest {

	public static void main(String[] args) {
		  char ch = 'a'; 
		  
	        // Autoboxing- primitive to Character object conversion 
	        Character a = ch; 
	        System.out.println(a);
	  
	        ArrayList<Character> arrayList = new ArrayList<Character>(); 
	  
	        // Autoboxing because ArrayList stores only objects 
	        arrayList.add(a); 
	  
	        // printing the values from object 
	        System.out.println(arrayList.get(0)); 
		
		
	}

}
