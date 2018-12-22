import java.util.Scanner;

import com.bridgalabz.util.FunctionalLogic;

public class Sqrt_Newton {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double c=sc.nextDouble();
		c=Math.abs(c);
		double t=c;
		double epsilon = 1e-15;
		FunctionalLogic<?> fl=new FunctionalLogic<Object>();
		double d=fl.calSqrt(epsilon,c);
		System.out.println("Exact Sqrt of "+c+" is = "+d);


	}

}
