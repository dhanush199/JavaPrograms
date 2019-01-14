package com.bridgelabz.objectorientedprograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
	static List<Doctor> list2=new ArrayList<Doctor>();
	static Doctor doctorDetails=new Doctor();
	
	public static void getAppointment(String dName){
		if(DoctorMethod.checkAvailabillity(dName)){
			System.out.println("when do you want to appointment? AM or PM ");
			doctorDetails.setAvailability(DataStructureUtility.readString());
			doctorDetails.setIsFull(true);
			System.out.println("your appointment has been confirmed with doctor"+dName);
		}
		else {
			System.out.println("Sorry!! Doctor is not available for the day@");
			System.out.println("Press 1> Get tommarrows Appointment  2> Quite");
			if(DataStructureUtility.readInteger()==1){
				//getTomarrowAppointment( dName," tomarrow");
			}
		}
	}
	//	public static void getTomarrowAppointment(String dName,String tomarrow){
	//		doctorDetails.setTommarrowAppointmnt(tomarrow);
	//		System.out.println("Your appoinment has been confirmed for tomarrow(* *)... Thank you!!");
	//	}

	//	sort Methods
	//	For doctors

	public static void displayFile() throws FileNotFoundException{
		String str="FileName";
		String file = ObjectOrientedUtility.readFile(str);
		try {
			list2 = objectMapper.readValue(file, new TypeReference<List<Doctor>>() {
			});
			ObjectOrientedUtility.display(list2);
		} catch (Exception e) {
			System.out.println("file is empty!! first add inputs on to file or select second choice");
		}
	}
	public static void saveFile() throws JsonGenerationException, JsonMappingException, IOException{
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
	public static <T> T convertJsonToPOJO(String filePath, Class<?> target) throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(new File(filePath), objectMapper .getTypeFactory().constructCollectionType(List.class, Class.forName(target.getName())));
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