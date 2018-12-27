/******************************************************************************
 *  Compilation:  javac -d bin Days_Week.java
 *  Execution:    java -cp bin com.bridgelabz.util.Functionalprograms 
 *  
 *  Purpose: Program to find dayOfWeek 
 *
 *  @author  Dhanush
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

public class Days_Week {

	public static void main(String[] args) {
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int y0=0;
		if(d>0 || d<32) 
			if(m>0 || m<12)
				if(y>000 || y<9999) 
					y0 = y-(14-m)/ 12;
		int	x = y0 + y0/4-y0/100 + y0/400;
		int	m0 = m +12*((14-m)/12)-2;
		int d0 =( (d+ x + ((31*m0)/12)) % 7)-2;
		if(d0>=0 && d0<=7)
			System.out.println(days[d0]);

	}
}

