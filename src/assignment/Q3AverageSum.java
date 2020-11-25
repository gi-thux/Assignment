package assignment;

import java.util.Scanner;

public class Q3AverageSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a first number");
		int a=input.nextInt();
		System.out.println("enter a second number");	
		int b=input.nextInt();
		double avarage=(a+b)/2;
		System.out.println("the division of first and second number is:"+avarage);
		input.close();
		

}}
