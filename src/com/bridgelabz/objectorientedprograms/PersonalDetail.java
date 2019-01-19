package com.bridgelabz.objectorientedprograms;

public class PersonalDetail {
	private String Firstname;
	private String Lastname;
	private AddressDetails address;
	private long phoneNumber;

	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public AddressDetails getAddress() {
		return address;
	}
	public void setAddress(AddressDetails address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long string) {
		this.phoneNumber =  string;
	}
  
}
