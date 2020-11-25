package day15;

import java.util.Scanner;

public class Q30Fibonaccy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
		int a= input.nextInt();
		System.out.println("enter the second number");
		int b= input.nextInt();
		System.out.println("enter the nth number to find the fibonacy series");
		int c= input.nextInt();
		for (int i=1;i<=c;i++) {
			
			int f= a+b;
			a=b;
			b=f;
		
			
		System.out.println("the fibonacy series is"+f);
		}
input.close();
}
}