package assignment;

import java.util.Scanner;

public class Q16OddEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int n= input.nextInt();
		
		if (n%2==0) {System.out.println("the number "+n+" is even");}
		else{System.out.println("the given number "+n+" is odd");}
		input.close();
	}

}


