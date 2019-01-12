package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.IOException;

public class SaveAs {
	   

	   public static void main(String[] args)
	   {
		   SaveAs rf = new SaveAs();
	      System.out.println("Java rename files in directory : ");
	      String lastResult = rf.callRename("/home/admin1/Anush", "11.txt", "aa.txt");
	      System.out.println(lastResult);
	   }
}


