package com.bridgelabz.objectorientedprograms;

public class Address {
	private String bookName;
	private String state;
	private String street;
	private String city;
	public Address() {
	
		this.bookName = null;
		this.state = null;
		this.street = null;
		this.city = null;
		this.zipCode = 000;
	}
	private int zipCode;

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
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
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	
}
