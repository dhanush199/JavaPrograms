package com.bridgelabz.objectorientedprograms;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.DataStructureUtility;



public class ClinicManagementApp {



	String originfile="/home/admin1/Tharun/Bridgelabs/programs/JavaPrograms/";
	static List<Doctor> doctorlist1=new ArrayList<Doctor>();
	static List<Patient> patientlist1=new ArrayList<Patient>();
	static Patient patient=new Patient();
	static Doctor doctor =new Doctor();
	static ObjectMapper objectmapper=new ObjectMapper();
	static int ch=0;
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("-----Welcome to Clinical Management------");
		System.out.println("Do you want Details of ");
		do {
			System.out.println("1: Add Doctor");
			System.out.println("2: Add Patient");
			System.out.println("3: Take Appointment");
			System.out.println("4: Search Doctor");
			System.out.println("5: Search patient");
			System.out.println("6: Famous doctor");
			System.out.println("7: Famous Specialist");
			System.out.println("8: Exit from the clinic");
			int choice=DataStructureUtility.readInteger();
			switch (choice)
			{
			case 1:{
				ClinicManagement.addDoctor();
				break;
			}
			case 2:
			{
				ClinicManagement.addPatient();
				break;
			}
			case 3:
			{

				ClinicManagement.takeAppointment();   
				break;
			}
			case 4:
			{
				ClinicManagement.searchDoctor();
				break;
			}
			case 5:
			{
				ClinicManagement.searchpatient();
				break;

			}
			case 6:
			{
				ClinicManagement.famousDoctor();
				break;
			}
			case 7:
			{
				ClinicManagement.famousSpecialist();
			}
			case 8:
			{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Pls Enter the correct choice");
				break;}
			ch++;
		}
		while(ch<100);
	}
}




