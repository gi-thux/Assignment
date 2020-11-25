package day10;

import java.util.Scanner;

public class Q22Table {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Emter a number to multiply");
		int a= input.nextInt();
		
		for (int i=1; i<=10; i++) {
		int multiplication = a*i;
		
		
		System.out.println("the multiplication of given  number is: "+a+"*"+i+"="+multiplication);
	
input.close();
}
}}


