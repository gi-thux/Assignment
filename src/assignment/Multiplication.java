package assignment;


import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a first number");
		int a=input.nextInt();
		System.out.println("enter a second number");	
		int b=input.nextInt();
		 float multiplication=a*b;
		System.out.println("the multiplication of "+a+" and "+b+" is="+ multiplication);
		input.close();
		
	}

}
