package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
public class WriteTofileWithJason {
	public static void main(String[] args) throws IOException {
		String address=null;
		JsonFactory jsonFactory = new JsonFactory(); 
		FileOutputStream file = new FileOutputStream(new File(""
				+ "/home/admin1/Dhanush/example.json"));
		JsonGenerator jsonGen = jsonFactory.createJsonGenerator(file, JsonEncoding.UTF8);
		//Address address = new Address("Dhananjaypur", "Varanasi", "UP");
		Inventory person = new Inventory();
		jsonGen.setCodec(new ObjectMapper());
		jsonGen.writeObject(person);
		System.out.println("Done");
	}
} 