package com.bridgelabz.objectorientedprograms;

import java.util.Date;
import com.bridgelabz.utility.ObjectOrientedUtility;
import com.bridgelabz.utility.UserDetails;

public class Regex
{
	public static void main(String args[])
	{
		ObjectOrientedUtility u=new ObjectOrientedUtility();
		UserDetails user=new UserDetails();	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(ObjectOrientedUtility.inputString());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setlName(ObjectOrientedUtility.inputString());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setmobileNo(ObjectOrientedUtility.inputString());
		System.out.println();	
		
		//Setting current date
		user.setdate(u.getFormatedDate(new Date()));
		System.out.println(u.convertString(user,u.getFileText("/home/admin1/Desktop/Regex.txt")));	
	}
}