package com.bridgelabz.designpatters.creational;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerialized {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/home/admin1/aaa.ser"));
		System.out.println(SerializedSingleton.getInstance());

		out.writeObject(instanceOne);
		out.close();

		//deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream( "/home/admin1/aaa.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		// will be different for instanceOne and instanceTwo
		System.out.println("instanceOne hashCode="+instanceOne.hashCode());
		System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

	}

}

