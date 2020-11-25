package assignment;

import java.util.Scanner;
public class Q10bFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of a");
		float a=input.nextFloat();
		System.out.println("enter the value of b");
		float b=input.nextFloat();
		System.out.println("enter the value of c");
		float c=input.nextFloat();
		double s= (a+b+c)/2;
		
		System.out.println(s);
		input.close();
		
	}

}
