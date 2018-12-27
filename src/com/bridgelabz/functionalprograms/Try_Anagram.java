/******************************************************************************
 *  Compilation:  javac -d bin Try_Anagram.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to find whether the given string is Anagram or not
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

public class Try_Anagram {
	public static void main(String args[]){  
		int r,sum=0;    
		int a[]=new int[10];
		int b[]=new int[10];
		for(int i=0;i<10;i++) {  
			a[i]=i;
		}
		int k=0;
		for(int j=2;j<10;j++) 
		{  
			int n=a[j];
			
			while(n>0){  
				System.out.println(n);
				r=n%10;  
				sum=(sum*10)+r;  
				n=n/10; 
			}    
			if(a[j]==sum)    
			{ 
				b[k]=sum;
				System.out.println(b[k]);
				k++;
			}

		}  
	}  
}

