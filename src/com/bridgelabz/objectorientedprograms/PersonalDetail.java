package com.bridgelabz.objectorientedprograms;

public class PersonalDetail {
	private String Firstname;
	private String Lastname;
	private Object Address;
	private long PhoneNumber;

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
	public Object getAddress() {
		return Address;
	}
	public void setAddress(Object address) {
		Address = address;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long string) {
		PhoneNumber =  string;
	}
  
}
