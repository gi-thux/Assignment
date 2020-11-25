package day32;

import java.util.Scanner;

public class Q40ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the name");
		String abc = input.next();
	
		char [] arr=abc.toCharArray();
		for (int i = arr.length-1; i>=0; i--) {
			
		System.out.print(arr[i]);
		}
		input.close();
	}
}
