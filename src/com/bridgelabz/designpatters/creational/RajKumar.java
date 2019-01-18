package com.bridgelabz.designpatters.creational;

import java.io.FileNotFoundException;

import com.bridgelabz.objectorientedprograms.Stock;

public class RajKumar {
	
	public static void main(String[] args) throws FileNotFoundException {
		Stock sp=new Stock();
		sp.setDate();
		System.gc();
		sp.getDate();
		sp=null;
		sp.getDate();
		System.gc();
	}
}
