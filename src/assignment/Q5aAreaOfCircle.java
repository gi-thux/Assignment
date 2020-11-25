package assignment;

import java.util.Scanner;

public class Q5aAreaOfCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int r=input.nextInt();
		double area=(22/7)*(r*r);
		System.out.println("the area of the circle  is:"+area);
		input.close();
		
	}
}
