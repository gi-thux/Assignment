package assignment;


import java.util.Scanner;

public class Q6aPerimeterOfCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of circle ");
		int r=input.nextInt();
		double perimeter=2*(22/7)*r;
		System.out.println("the perimeter of the circle is:"+perimeter);
		input.close();
		

	}
}

