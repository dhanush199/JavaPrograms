package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.DataStructureUtility;

public class ClinicMangementApp {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, ClassNotFoundException, IOException{
	ClinicManagement patientDetails=new ClinicManagement();
		//ObjectOrientedUtility.convertJsonToPOJO("/home/admin1/Dhanush/Bridgelabz/Myprograms/JavaPrograms/", null);
	ClinicManagement doctorMethods=new ClinicManagement();
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
			case 1:ClinicManagement.addDoctor();

			break;
			case 2:ClinicManagement.addPatient();

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
//			case 1:	displayDoctor(DoctorMethod.getDoctorList());
//
//			break;
//			case 2:displayPatient(PatientMethod.patientList);
//
//			break;

			default:System.out.println("please enter valid option");
			break;
			}


			break;

			default:
				break;
			}
			System.out.println("enter the name of the doctor whom you want to search");
			String dName=DataStructureUtility.readString();
			//ClinicManagement.checkAvailabillity(dName);
			ClinicManagement.searchDoctor(dName);
//			getAppointment(dName );
//			displayDoctor(DoctorMethod.getDoctorList());
		}
	}

}
