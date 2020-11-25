package assignment;

import java.util.Scanner;

public class Q19TriangleType {

	
		

		
			public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		System.out.println("enter first side of a triangle ");
		int a = input.nextInt();
		System.out.println("enter second side of a triangle ");
		int b = input.nextInt();
		System.out.println("enter third side of a triangle ");
		int c = input.nextInt();

		if (a==b && a==c) {System.out.println("it is a equilateral triangle");}
		else if (a==b && a!=c) {System.out.println("it is a isoceles triangle");}
		else {System.out.println("it is a scalen triangle");}
		input.close();
		
			
	}

}
