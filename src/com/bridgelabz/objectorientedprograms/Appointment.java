package com.bridgelabz.objectorientedprograms;

public class Appointment {

	private String availability;
	private boolean[] isAvail= {false};
	int i=0;
	boolean flag=false;

	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public void setIsAvail(boolean avail) {
		isAvail[i++]=avail;
	}
	public boolean getIsAvail() {
		for(int j=0;j<5;j++) {
			if(!isAvail[j]) {
				flag=true;
			}
		}
		return false;
	}
}
