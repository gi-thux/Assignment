package assignment;

import java.util.Scanner;

public class Q12DisplayNameAgeNationality {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		System.out.println("enter the name");
		String name=input.next();
		System.out.println("enter the nationality");
		String nationality=input.next();
		System.out.println("enter the age");
		int age=input.nextInt();
		
		System.out.println("the name is "+ name);
		System.out.println("the nationality is "+ nationality);
		System.out.println("the age is "+ age);
		
		
		input.close();
		}
	
}
