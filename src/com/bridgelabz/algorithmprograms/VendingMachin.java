import java.util.Scanner;

import com.bridgalabz.util.FunctionalLogic;

//Program to convert temperature from Farenheat to degree celcius


public class VendingMachin {
	public static void main(String[] args) {

		FunctionalLogic<?> a1= new FunctionalLogic<Object>();
		System.out.println("enter the money in Rs");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		int[] notes = { 2000,500,100,50,10,5,2,1};
		System.out.println("the different notes present is");
		a1.calculate(money, notes);


	}

}
