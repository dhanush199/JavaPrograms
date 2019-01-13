package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Doctor {
	private String dName;
	private int i=0;
	private int dId;
	private String speciality;
    private String availability;
    private String tommarrowAppointmnt;
    private boolean[] isFull={false};
    List<Doctor> doctorInfoList=new ArrayList<Doctor>();
    public String getTommarrowAppointmnt() {
		return tommarrowAppointmnt;
	}
	public List<Doctor> getDoctorInfoList() {
		return doctorInfoList;
	}
	public void setDoctorInfoList(List<Doctor> doctorInfoList) {
		this.doctorInfoList = doctorInfoList;
	}
	public void setTommarrowAppointmnt(String tommarrowAppointmnt) {
		this.tommarrowAppointmnt = tommarrowAppointmnt;
	}
	List<Doctor> dList=new ArrayList<Doctor>();
    Patient patient=new Patient();
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public boolean[] getIsFull() {
		return isFull;
	}
	public void setIsFull(boolean available) {
		isFull[i++]=available;
	}
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getId() {
		return dId;
	}
	public void setId(int id) {
		this.dId = id;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public void setDoctor() {
		this.patient=null;
	}
	public Patient getDoctor() {
		return patient;
	}
}