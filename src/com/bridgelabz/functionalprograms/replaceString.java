/******************************************************************************
 *  Compilation:  javac -d bin replaceString.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to concate name inside a string
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.FunctionalUtility;

public class replaceString {

	public static void main(String[] args) {
		System.out.println("Hi USERNAME,How are you?");
		String s="Hello!! <<Name>>,How are you?";
		 System.out.println("enter a UserName");
		 String s1=FunctionalUtility.readString();
		 s1=FunctionalUtility.checkConcate(s,s1);
		 System.out.println(s1);
		 String ss = "123456789";
		 //String newString = ss.substring(0, 3) + "foobar" + ss.substring(3+3);
		 //System.out.println(newString);
		
	}
	public static String replace(String str,String uname)
    {    if (uname.length() < 3)
            System.out.println("enter string letter which is greater then 3");
        else {
            String message;
            final String REGEX_NAME="<<UserName>>";
            Pattern p = Pattern.compile(REGEX_NAME);
            Matcher m = p.matcher(str);
            message = m.replaceAll(uname);
            return message;}
        return uname;
    }

}
