package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.List;

public class Appointment {

	private String dName;
	private List<Patient> listOfPatients=new ArrayList<Patient>();
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public List<Patient> getListOfPatients() {
		return listOfPatients;
	}
	public void setListOfPatients(List<Patient> listOfPatients) {
		this.listOfPatients = listOfPatients;
	}
	
}

