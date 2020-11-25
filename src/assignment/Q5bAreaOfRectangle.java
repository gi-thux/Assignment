package assignment;


import java.util.Scanner;

public class Q5bAreaOfRectangle {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("enter the base of triangle");
			int b=input.nextInt();
			System.out.println("enter the height of triangle");
			int h=input.nextInt();
			double area=(b*h)/2;
			System.out.println("the area of the triangle  is:"+area);
			input.close();
			
		}
	}


