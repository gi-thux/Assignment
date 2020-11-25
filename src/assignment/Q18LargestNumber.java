package assignment;

import java.util.Scanner;

public class Q18LargestNumber {


	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.println("enter a number a ");
int a = input.nextInt();
System.out.println("enter a number b ");
int b = input.nextInt();
System.out.println("enter a number c ");
int c = input.nextInt();


  if(a>b && a>c) {System.out.println("a is greatest number");} else if (b>a &&
  b>c) {System.out.println("b is greatest number");} else
  {System.out.println("c is greatest number"); } input.close();
 



	}

}


