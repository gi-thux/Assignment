package assignment;

import java.util.Scanner;

public class Q10cFormula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of a");
		float a=input.nextFloat();
		System.out.println("enter the value of b");
		float b=input.nextFloat();
		System.out.println("enter the value of c");
		float c=input.nextFloat();
		double x= (-b+(Math.sqrt(b*b-4*a*c)))/2*a ;
		
		System.out.println(x);
		input.close();
		

	}
}
