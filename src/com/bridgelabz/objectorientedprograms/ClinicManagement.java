package com.bridgelabz.objectorientedprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.ObjectOrientedUtility;

public class ClinicManagement {
	static ObjectMapper objectMapper=new ObjectMapper();

	public static void main(String[] args){
		PatientMethod patientDetails=new PatientMethod();
		DoctorMethod doctorMethods=new DoctorMethod();
		while(true){
			System.out.println("1 > Add Doctor/Patient");
			System.out.println("2 > search Doctor/Patient");
			System.out.println("3 > Display Doctor/Patient");
			System.out.println("select option");
			int opt=DataStructureUtility.readInteger();

			switch (opt) {
			case 1:System.out.println("select required option");
			System.out.println("1> Add Doctor ");
			System.out.println("1> Add Patient ");
			int key=DataStructureUtility.readInteger();
			switch (key) {
			case 1:DoctorMethod.addDoctor();

			break;
			case 2:PatientMethod.addPatient();

			break;

			default:System.out.println("please enter valid option");
			break;
			}



			break;
			case 2:

//			switch () {
//			case 1:	
//
//				break;
//			case 2:
//
//				break;
//
//			default:System.out.println("please enter valid option");
//				break;
//			}
//			break;
			case 3:System.out.println("select required option");
			System.out.println("1 > Display Doctor List");
		System.out.println("2> Display Patient List");
		int value=DataStructureUtility.readInteger();

		switch (value) {
		case 1:	displayDoctor(DoctorMethod.getDoctorList());

			break;
		case 2:displayPatient(PatientMethod.patientList);

			break;

		default:System.out.println("please enter valid option");
			break;
		}
		

				break;

			default:
				break;
			}
		

			System.out.println("enter the name of the doctor whom you want to search");
			String dName=DataStructureUtility.readString();
			DoctorMethod.checkAvailabillity(dName);
			DoctorMethod.searchDoctor(dName);
			//	getAppointment(dName );
			displayDoctor(DoctorMethod.getDoctorList());
		}
	}
	//	public static void getAppointment(String dName){
	//		if(DoctorMethod.checkAvailabillity(dName)){
	//			System.out.println("when do you want to appointment? AM or PM ");
	//			doctorDetails.setAvailability(DataStructureUtility.readString());
	//			doctorDetails.setIsFull(true);
	//			System.out.println("your appointment has been confirmed with doctor"+dName);
	//		}
	//		else {
	//			System.out.println("Sorry!! Doctor is not available for the day@");
	//			System.out.println("Press 1> Get tommarrows Appointment  2> Quite");
	//			if(DataStructureUtility.readInteger()==1){
	//				getTomarrowAppointment( dName," tomarrow");
	//			}
	//		}
	//	}
	//	public static void getTomarrowAppointment(String dName,String tomarrow){
	//		doctorDetails.setTommarrowAppointmnt(tomarrow);
	//		System.out.println("Your appoinment has been confirmed for tomarrow(* *)... Thank you!!");
	//	}

	//sort Methods
	//For doctors

	//	public static void displayFile(){
	//		String str="FileName";
	//	String file = ObjectOrientedUtility.readFile(str);
	//	Object ob=(Object)file;
	//	try {
	//		list2 = objectMapper.readValue(ob, new TypeReference<List<Doctor>>() {
	//		});
	//		ObjectOrientedUtility.display(list2);
	//	} catch (Exception e) {
	//		System.out.println("file is empty!! first add inputs on to file or select second choice");
	//	}
	//	}
	//	public static void saveFile(){
	//		String json = objectMapper.writeValueAsString(list2);
	//		Object ob=(Object)json;
	//		writeFile(ob);
	//		System.out.println("Doctor patient details has been written to file");
	//	}
	public static void writeFile(Object json) throws IOException
	{
		FileWriter fw = new FileWriter("/home/admin1/Dhanush/");
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
}

//}