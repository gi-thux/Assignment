package assignment;

import java.util.Scanner;

public class Q7VolumeOfCylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of cylinder ");
		int r=input.nextInt();
		System.out.println("enter the height of cylinder");
		int h=input.nextInt();
		
		double volume=3.142*(r*r)*h;
		System.out.println("the volume of the rectangle is:"+volume);
		input.close();
		

}}
