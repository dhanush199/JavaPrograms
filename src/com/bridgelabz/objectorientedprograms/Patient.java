package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Patient {
	private String pName;
	private int pAge;
	private int pid;
	private long pNum;
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public List<Patient> getdList() {
		return dList;
	}
	public void setdList(List<Patient> dList) {
		this.dList = dList;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	Doctor doctor=new Doctor();
	List<Patient> dList=new ArrayList<Patient>();
	private String consultTime;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getpNum() {
		return pNum;
	}
	public void setpNum(long pNum) {
		this.pNum = pNum;
	}
	//	public String getSpeciality() {
	//		return speciality;
	//	}
	//	public void setSpeciality(String speciality) {
	//		this.speciality = speciality;
	//	}
	//	public String getAvailability() {
	//		return availability;
	//	}
	//	public void setAvailability(String availability) {
	//		this.availability = availability;
	//	}
	public void setDoctor() {
		this.doctor=doctor;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setConsultTime(String readString) {
		this.consultTime=readString;
		
	}
	public String getConsultTime(String readString) {
		return consultTime;
		
	}
}