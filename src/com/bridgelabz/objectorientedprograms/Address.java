package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.List;

public class Address {
	List<Address> address=new ArrayList<Address>();
	private String state;
	private String street;
	private String city;
	private long zipCode;
	public  List<Address> getAddress() {
		return address;
	}
	public Address() {
		
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	
}
