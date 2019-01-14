package com.bridgelabz.objectorientedprograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class ClinicManagement<T> {
	static ObjectMapper objectMapper=new ObjectMapper();
	static List<Patient> list2;
	static List<Doctor> list1;
	static Doctor doctorDetails=new Doctor();
	static Patient patientDetails=null;
	static List<Doctor> doctorList;//=new ArrayList<Doctor>();
	static List<Patient> patientList;//=new ArrayList<Patient>();


	public static List<Patient> addPatient() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException{
		patientDetails=new Patient();
		patientList=new ArrayList<Patient>();
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
		patientList.add(patientDetails);
		list2=displayPatientFile("/home/admin1/ClinicManagement/patientRecords.json");
		patientList.addAll(list2);
		
		System.out.println("Patient has been added succesfully");
		//displayFile("/home/admin1/ClinicManagement/patientRecords.json");
//		displayPatient(patientList);
//		System.out.println("Do you want to save Patient details to the file?   1> Save    2> Cancel");
//		if(DataStructureUtility.readInteger()==1) {
//			list2=displayFile("/home/admin1/ClinicManagement/patientRecords.json");
//			//list2.addAll(patientList);
//			patientList.addAll(list2);
//			saveFile("/home/admin1/ClinicManagement/patientRecords.json",patientList);
//			
//		}
		displayPatient(patientList);
		savePatientFile("/home/admin1/ClinicManagement/patientRecords.json",patientList);
		return patientList;
	}

	public static void addDoctor() throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException{
		doctorDetails=new Doctor();
		doctorList=new ArrayList<Doctor>();
		System.out.println("Enter the name of the doctor");
		doctorDetails.setdName(DataStructureUtility.readString());
		doctorDetails.setdId(doctorList.size()+1);
		System.out.println("Enter the specialization of the doctor");
		doctorDetails.setSpeciality(DataStructureUtility.readString());
		System.out.println("Enter the availability of the doctor AM or PM");
		doctorDetails.setAvailability(DataStructureUtility.readString());
		doctorList.add(doctorDetails);
	//	displayDoctor(doctorList);
	//	System.out.println(doctorList);
		System.out.println(list1);
		list1=displayDoctorFile("/home/admin1/ClinicManagement/DoctorRecords.json");
		System.out.println("List===="+list1);

		displayDoctor(doctorList);
		doctorList.addAll(list1);
		saveDoctorFile("/home/admin1/ClinicManagement/DoctorRecords.json",doctorList);
		displayDoctorFile("/home/admin1/ClinicManagement/DoctorRecords.json");

	}

	public static List<Patient> displayPatientFile(String fName) throws JsonParseException, JsonMappingException, ClassNotFoundException, IOException{

		String file = ObjectOrientedUtility.readFile(fName);
		try {
			list2 = objectMapper.readValue(file, new TypeReference<List<Patient>>() {
			});
			displayPatient(list2);
		} catch (Exception e) {
			System.out.println("file is empty!! first add inputs on to file or select second choice");
			String s[]= {};
			ClinicMangementApp.main(s);
		}
		return list2;
	}
	public static List<Doctor> displayDoctorFile(String fName) throws JsonParseException, JsonMappingException, ClassNotFoundException, IOException{

		String file = ObjectOrientedUtility.readFile(fName);
		try {
			list1 = objectMapper.readValue(file, new TypeReference<List<Patient>>() {
			});
			displayDoctor(list1);
		} catch (Exception e) {
			System.out.println("file is empty!! first add inputs on to file or select second choice");
			String s[]= {};
			ClinicMangementApp.main(s);
		}
		return list1;
	}
	
	public static void savePatientFile(String fName, List<Patient> dList) throws JsonGenerationException, JsonMappingException, IOException{
		String json = objectMapper.writeValueAsString(dList);
		System.out.println(json);
		writeFile(json,fName);
		System.out.println("Doctor patient details has been written to file");
	}
	
	public static <T> T genericWrite(String filePath, Class<?> target) throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(new File(filePath), objectMapper .getTypeFactory().constructCollectionType(List.class, Class.forName(target.getName())));
	}
	public static void saveDoctorFile(String fName, List<Doctor> plist) throws JsonGenerationException, JsonMappingException, IOException{
		String json = objectMapper.writeValueAsString(plist);
		System.out.println(json);
		writeFile(json,fName);
		System.out.println("Doctor patient details has been written to file");
	}
	public static void writeFile(String json,String fName) throws IOException
	{
		FileWriter fw = new FileWriter(fName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json.toString());
		bw.flush();
	}

	/////////////////////////////////////////////////////////////////////////

	public static void displayDoctor(List<Doctor> list2)
	{
		for (Doctor it:list2) {
			System.out.println("Doctor name :" + it.getdName());
			System.out.println("Doctor ID :" + it.getdId());
			System.out.println("Availability :" + it.getAvailability());
			System.out.println("Specialization :" + it.getSpeciality());
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}
	public static void displayPatient(List<Patient> list2)
	{
		for (Patient it:list2) {
			System.out.println("Patient name  :" + it.getpName());
			System.out.println("Patient ID    :" + it.getPid());
			System.out.println("Patient MobNo.:" + it.getpNum());
			//			System.out.println("Patient :" + it.getSpeciality());
			System.out.println();
		}
		System.out.println("---------------------------------------------");
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



	public static List<Doctor> getDoctorList() {
		return doctorList;
	}
	public static void setDoctorList(List<Doctor> doctorList) {
		ClinicManagement.doctorList = doctorList;
	}
//	public static boolean checkAvailabillity(String dName)
//	{
//		//		System.out.println("enter the name of the doctor");
//		//		String dName=DataStructureUtility.readString();
//		if(doctorList.contains(dName)){
//			boolean[] availability=doctorDetails.getIsFull();
//			for(int i=0;i<5;i++){
//				if(availability[i]!=false){
//					//doctorDetails.setIsFull(true);
//					System.out.println("doctor is available");
//					//break;
//					return true;
//
//				}
//				else {
//					System.out.println("Doctor is not avilable(Full)");
//				}
//			}
//		}
//		return false;
//
//	}
	public static void searchDoctor(String name){
		//		System.out.println("Enter the name of the doctor you want to search");
		//		String name=DataStructureUtility.readString();
		if(!doctorList.contains(name)){
			System.out.println("Doctor not found");}
		else{
			System.out.println("Doctor Found");
			System.out.println("press 1> Check Availability  2> Exit");
	//		if( !checkAvailabillity(name)){
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
	//	public void doctorSortByName(){
	//		Collections.sort(doctorList, (doctor1, doctor2) -> doctor1.getdName().compareTo(doctor2.getdName()));
	//		System.out.println("Doctor List has been sorted based on Doctor Names");
	//		System.out.println(doctorList);   
	//	}
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
//}

//}