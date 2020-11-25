package day15;

import java.util.Scanner;

public class Q26ReverseNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter the number to reverse");
		int originalNunber = input.nextInt();
		
	    int reverseNumber = 0;
		System.out.println("original number is" + originalNunber);

		while (originalNunber != 0) {
			int tem = originalNunber % 10; // reminder
			
			 
			reverseNumber = reverseNumber * 10 + tem;
			originalNunber = originalNunber / 10;
		}

		System.out.println("the reverse number is" + reverseNumber);
		
		input.close();
	}
	

}
