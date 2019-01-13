package com.bridgelabz.objectorientedprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class ClinicManagement {
	static ObjectMapper objectMapper=new ObjectMapper();
	static List<Patient> patientList=new ArrayList<Patient>();
	static List<Doctor> doctorList=new ArrayList<Doctor>();
	static Doctor doctorDetails=new Doctor();
	static Patient patientDetails=new Patient();
	public static void main(String[] args){
		//	while(true){
		addDoctor();
		//	}
	}
	public static void addDoctor(){

		System.out.println("Enter the name of the doctor");
		doctorDetails.setdName(DataStructureUtility.readString());
		System.out.println("Enter the ID of the doctor");
		doctorDetails.setdId(DataStructureUtility.readInteger());
		System.out.println("Enter the specialization of the doctor");
		doctorDetails.setSpeciality(DataStructureUtility.readString());
		System.out.println("Enter the availability of the doctor AM or PM");
		doctorDetails.setAvailability(DataStructureUtility.readString());
		doctorList.add(doctorDetails);
		//System.out.println(doctorList);
	}
	public static void addPatient(){
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
		patientDetails.setDoctor();
		patientList.add(patientDetails);
		//System.out.println(doctorList);
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
					System.out.println("doctor is allocated");
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
	public void searchDoctor(){
		System.out.println("Enter the name of the doctor you want to search");
		String name=DataStructureUtility.readString();
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
					getAppoint(name,"tomarrow");

				else if(opt==2)
					break;

				else {
					System.out.println(name+" Doctor is available for the day@");
					System.out.println("press 1> Take Appointment  2> Exit");
					if(DataStructureUtility.readInteger()==1){
						getAppointment(name);
					}
					else
					{
						break;
					}

				}

			}

		}
	}
	public static void getAppointment(String dName){
		if(checkAvailabillity(dName)){
			System.out.println("when do you want to appointment? AM or PM ");
			doctorDetails.setAvailability(DataStructureUtility.readString());
			doctorDetails.setIsFull(true);
			System.out.println("your appointment has been confirmed with doctor"+dName);
		}
		else {
			System.out.println("Sorry!! Doctor is not available for the day@");
			System.out.println("Press 1> Get tommarrows Appointment  2> Quite");
			if(DataStructureUtility.readInteger()==1){
				getTomarrowAppointment( dName," tomarrow");
			}
		}
	}
	public static void getTomarrowAppointment(String dName,String tomarrow){
		doctorDetails.setTommarrowAppointmnt(tomarrow);
		System.out.println("Your appoinment has been confirmed for tomarrow(* *)... Thank you!!");
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
	//sort Methods
	//For doctors
	public void doctorSortByName(){
	doctorList.sort(doctorDetails.getdName());
	System.out.println("Doctor List has been sorted based on Doctor Names");
	System.out.println(doctorList);
	}
	public void doctorSortByID(){
		doctorList.sort(doctorDetails.getId());
		System.out.println("Doctor List has been sorted based on Doctor ID");
		System.out.println(doctorList);
		}
	public void doctorSortBySpeciality(){
		doctorList.sort(doctorDetails.getSpeciality());
		System.out.println("Doctor List has been sorted based on speciality");
		System.out.println(doctorList);
		}
	public void doctorSortByAvailability(){
		doctorList.sort(doctorDetails.getAvailability());
		System.out.println("Doctor List has been sorted based on speciality");
		System.out.println(doctorList);
		}
	public void patientSortByName(){
		patientList.sort(patientDetails.getpName());
		System.out.println("Patient List has been sorted based on Patient Names");
		System.out.println(patientList);
		}
	public static void displayFile(){
		String str="FileName";
	String file = ObjectOrientedUtility.readFile(str);
	Object ob=(Object)file;
	try {
		list2 = objectMapper.readValue(ob, new TypeReference<List<Doctor>>() {
		});
		ObjectOrientedUtility.display(list2);
	} catch (Exception e) {
		System.out.println("file is empty!! first add inputs on to file or select second choice");
	}
	}
	public static void saveFile(){
		String json = objectMapper.writeValueAsString(list2);
		Object ob=(Object)json;
		writeFile(ob);
		System.out.println("Doctor patient details has been written to file");
	}
	public static void writeFile(Object json) throws IOException
	{
		FileWriter fw = new FileWriter("/home/admin1/Dhanush/");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json.toString());
		bw.flush();
	}
}