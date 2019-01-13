package com.bridgelabz.objectorientedprograms;

public class PersonDetails {
	private String firstName;
	private String lastName;
	private long phoneNum;
	Address address=new Address();

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public  Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//private String lastName;

	public String getFirstName() {
		return firstName;
	}



}
