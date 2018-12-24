package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;

public class Monthy_Payment {

	public static void main(String[] args) {
		String i=args[0];
		String j=args[1];
		String k=args[2];
		double P=Double.parseDouble(i);
		double R=Double.parseDouble(j);
		double Y=Double.parseDouble(k);
		AlgorithmUtility fl=new AlgorithmUtility();
		double payment=fl.calPayment(P,R,Y);
		System.out.println("MontghlyPayment is == "+Math.abs(payment));

	}

}
