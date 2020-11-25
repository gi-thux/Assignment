package assignment;

import java.util.Scanner;

public class Q14RelateIntiger {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter a number a");
	int a= input.nextInt();
	System.out.println("enter a  number b");
	int b= input.nextInt();
	
	if(a==b) {System.out.println("number a is equal to  number b");}
	else if (a>b) {System.out.println("number a is greater than b");}
	else {System.out.println("b is greater than a");
	}
input.close();
}
}


