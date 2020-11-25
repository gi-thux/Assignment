package assignment;

import java.util.Scanner;

public class Q6bPerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the width of rectangle ");
		int b=input.nextInt();
		System.out.println("enter the length of length");
		int l=input.nextInt();
		
		double perimeter=2*(l+b);
		System.out.println("the perimeter of the rectangle is:"+perimeter);
		input.close();
		

}}
	


