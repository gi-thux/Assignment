package assignment;

import java.util.Scanner;

public class Q10aFormula {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of u");
		float u=input.nextFloat();
		System.out.println("enter the value of t");
		float t=input.nextFloat();
		System.out.println("enter the value of a");
		float a=input.nextFloat();
		double s= u*t+0.5*a*t*t;
		
		System.out.println(s);
		input.close();
		
	}

}
