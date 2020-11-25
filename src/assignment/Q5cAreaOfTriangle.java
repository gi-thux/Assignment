package assignment;

import java.util.Scanner;

public class Q5cAreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length of the triangle");
		int l= input.nextInt();
		System.out.println("enter the breath of the triangle");
		int b= input.nextInt();
		System.out.println("enter the height of the triangle");
		int h= input.nextInt();
		int area=l*b*h;
		System.out.println("the area of the triangle"+ area);
		input.close();
		
	}

}
