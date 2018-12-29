package com.bridgelab.trails;

public class Conversions {
	public static void main(String[] args) {
		try {
			String s="Dhanuash";
			int c = Integer.parseInt(s);
			System.out.println(c);
			String c1=String.valueOf(Integer.parseInt(s));
			System.out.println(c1);	
		}
		catch(NumberFormatException e) {
			e.getMessage();
			System.out.println("Number formate error");
		}
		finally {
			System.out.println("Number formate error");
		}
	}
}
