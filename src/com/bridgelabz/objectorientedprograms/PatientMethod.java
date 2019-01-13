package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;

public class PatientMethod {
	static List<Patient> patientList=new ArrayList<Patient>();
	static Patient patientDetails=null;
	public static void addPatient(){
		patientDetails=new Patient();
		System.out.println("Enter the name of the patient");
		patientDetails.setpName(DataStructureUtility.readString());
		System.out.println("Enter the Mobile Number of the patient");
		patientDetails.setpNum(DataStructureUtility.readLong());
		System.out.println("Enter the ID of the patient");
		patientDetails.setPid(DataStructureUtility.readInteger());
		System.out.println("Enter the Age of the patient");
		patientDetails.setpAge(DataStructureUtility.readInteger());
		System.out.println("is patient want to consult doctor in AM or PM");
		patientDetails.setConsultTime(DataStructureUtility.readString());
		//patientDetails.setDoctor();
		patientList.add(patientDetails);
		System.out.println(patientDetails);
	}

	public static boolean searchPatient(String pName){
		boolean flag=false;
		if(patientList.contains(pName)){
			System.out.println("Patient found");
			flag=true;
		}
		else
			System.out.println("Patient not found");
		return flag;
	}
	public void patientSortByName(){
	    Collections.sort(patientList, (patient1, patient2) -> patient1.getpName().compareTo(patient2.getpName()));
	        System.out.println("Patients are Sorted according to ID");

	    }
//		public void patientSortById(){
//		    Collections.sort(patientList, (patient1, patient2) -> patient1.getPid().compareTo(patient2.getPid()));
//		        System.out.println("Sorted via Zip code");
	//
//		    }
}
