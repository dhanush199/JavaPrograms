
package com.bridgelabz.algorithmprograms;

import java.util.*;
import com.bridgelabz.utility.FunctionalUtility;

public class Example 
{
	public static void main(String[] args)
	{
		int temp=0;
		System.out.println("Enter the array length");
		int size=FunctionalUtility.readInteger();
		int k=0;//size of Array
		System.out.println("select any one of the following option");
		int select=FunctionalUtility.readInteger();
		LinkedList<Comparable> l=new LinkedList<Comparable>();	
		int flag=0,i;
		switch(select) 
		{
		case 1: System.out.println("Enter the"+size+" array Elements");
		 k=FunctionalUtility.readInteger();
		System.out.println("enter the element to be searched");
		int search=FunctionalUtility.readInteger();			
		for(i=0;i<size;i++)
		{
			int m=FunctionalUtility.readInteger();
			l.add(i,m);
		}
		System.out.println(l);
		break;
		
		case 2: System.out.println("Enter the"+size+" array Elements");

		for(i=0;i<size;i++)
		{
			double d=FunctionalUtility.readdouble();
			l.add(d);
		}
		break;
		case 3: System.out.print("Enter the"+size+" array Elements");

		for(i=0;i<size;i++)
		{
			String m=FunctionalUtility.readString();
			l.add(i,m);
		}
		System.out.println(l);
		System.out.println("enter the element to be searched");
		String d=FunctionalUtility.readString();
		for(i=0;i<l.size();i++)
		{ 
			if((l.get(i)).equals(d))
			{ 
				temp=1;
				break;
			}
		}


		break;

		default:System.out.println("eneter a valid input");
		break;


		}
		if(temp==1)
			System.out.println("entered element is present in the array");
		else
			System.out.println("entered element is not present in the array");
	}

}
