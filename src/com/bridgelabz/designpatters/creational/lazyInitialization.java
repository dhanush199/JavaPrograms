package com.bridgelabz.designpatters.creational;


import com.bridgelabz.objectorientedprograms.AddressBook;

public class lazyInitialization {
	static SingletonLazyInitialized s=new SingletonLazyInitialized();
	static SingletonLazyInitialized s1=new SingletonLazyInitialized();
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println(SingletonLazyInitialized.getInstance());
	

//		
//		System.out.println(s);
//		AddressBook a=(AddressBook) Class.forName("com.bridgelabz.objectorientedprograms.AddressBook").newInstance();
//		System.out.println(a);
//		AddressBook emp2 = AddressBook.class.newInstance();
//		AddressBook emp3 = AddressBook.class.newInstance();

		System.out.println( s);
		System.out.println( s.hashCode());
		System.out.println("..................................................");
		System.out.println(s1.hashCode());
		System.out.println(s1);


	}
	public int hashCode() {
	    int id=0;
		int result = (int) (id ^ (id >>> 32));
	    result = 31 * result + s.hashCode();
	    result = 31 * result + s.hashCode();
	    return result;
	}
}
