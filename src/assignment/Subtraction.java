package assignment;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a first number");
		int a=input.nextInt();
		System.out.println("enter a second number");	
		int b=input.nextInt();
		int sum=a-b;
		System.out.println("the sum of first and second number is:"+sum);
		input.close();
		
	}
}