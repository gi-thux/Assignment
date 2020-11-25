package day32;

import java.util.Scanner;

public class Q38Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string to check if its palindrome");
		String abc=input.next();
		//String p= new String(abc);
		
		StringBuilder a= new StringBuilder(abc);
		a.reverse();
		//String ab=a.toString();
		//System.out.println(a);
		
		
		  if(a.toString().equals(abc)) { System.out.println("it is a palindrome String"); } else{
		  System.out.println("it is not a palindrome String");
			  }
		 
input.close();
	}

}
