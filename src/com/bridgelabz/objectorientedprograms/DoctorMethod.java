package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;

public class DoctorMethod {
	static Doctor doctorDetails=null;
	static List<Doctor> doctorList=new ArrayList<Doctor>();

	public static void addDoctor(){
		doctorDetails=new Doctor();
		System.out.println("Enter the name of the doctor");
		doctorDetails.setdName(DataStructureUtility.readString());
		doctorDetails.setdId(doctorList.size()+1);
		System.out.println("Enter the specialization of the doctor");
		doctorDetails.setSpeciality(DataStructureUtility.readString());
		System.out.println("Enter the availability of the doctor AM or PM");
		doctorDetails.setAvailability(DataStructureUtility.readString());
		doctorList.add(doctorDetails);
		System.out.println(doctorList);
	}
	public static List<Doctor> getDoctorList() {
		return doctorList;
	}
	public static void setDoctorList(List<Doctor> doctorList) {
		DoctorMethod.doctorList = doctorList;
	}
	public static boolean checkAvailabillity(String dName)
	{
		//		System.out.println("enter the name of the doctor");
		//		String dName=DataStructureUtility.readString();
		if(doctorList.contains(dName)){
			boolean[] availability=doctorDetails.getIsFull();
			for(int i=0;i<5;i++){
				if(availability[i]!=false){
					doctorDetails.setIsFull(true);
					System.out.println("doctor is available");
					//break;
					return true;

				}
				else {
					System.out.println("Doctor is not avilable(Full)");
				}
			}
		}
		return false;

	}
	public static void searchDoctor(String name){
//		System.out.println("Enter the name of the doctor you want to search");
//		String name=DataStructureUtility.readString();
		if(!doctorList.contains(name)){
			System.out.println("Doctor not found");}
		else{
			System.out.println("Doctor Found");
			System.out.println("press 1> Check Availability  2> Exit");
			if( !checkAvailabillity(name)){
				System.out.println("Doctor not available for the day!!");
				System.out.println("Press 1> Get tommarrows Appointment  2> Quite");
				int opt=DataStructureUtility.readInteger();
				if(opt==1)
					//ClinicManagement.getTomarrowAppointment(name,"tomarrow");
				//else {
					System.out.println(name+" Doctor is available tomarrow");
					System.out.println("press 1> Take Appointment  2> Exit");
					if(DataStructureUtility.readInteger()==1){
						//ClinicManagement.getAppointment(name);
					//}
				
				}
			}
		}
	}
	public void doctorSortByName(){
        Collections.sort(doctorList, (doctor1, doctor2) -> doctor1.getdName().compareTo(doctor2.getdName()));
    	System.out.println("Doctor List has been sorted based on Doctor Names");
    	System.out.println(doctorList);   
    	}
//
//	public void doctorSortByID(){
//	
//		System.out.println("Doctor List has been sorted based on Doctor ID");
//		System.out.println(doctorList);
//
//    }
//	public void doctorSortBySpeciality(){ 
//        Collections.sort(doctorList, (doctor1, doctor2) -> doctor1.getSpeciality().compareTo(doctor2.getSpeciality()));
//    	System.out.println("Doctor List has been sorted based on speciality");
//		System.out.println(doctorList);   
//		}
}
