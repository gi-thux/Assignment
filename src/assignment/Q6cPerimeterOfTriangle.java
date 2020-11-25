package assignment;

import java.util.Scanner;

public class Q6cPerimeterOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the base of  triangle");
		int b=input.nextInt();
		System.out.println("enter the height of triangle");
		int h=input.nextInt();
		System.out.println("enter the length of triangle");
		int l=input.nextInt();
		
		double perimeter=b+h+l;
		System.out.println("the perimeter of the triangle is:"+perimeter);
		input.close();
		

}}
