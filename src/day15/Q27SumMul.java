package day15;

import java.util.Scanner;

public class Q27SumMul {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter the number to add and multiply");
		int originalNunber = input.nextInt();
		int sum=0;
		int mul=1;
	
		System.out.println("original number is" + originalNunber);

		while (originalNunber != 0) {
			int tem = originalNunber % 10; // reminder
			
			 sum= sum+tem;
			mul=mul*tem;
			//reverseNumber = reverseNumber * 10 + tem;
		originalNunber = originalNunber / 10;
		}

		System.out.println("the sum of  number is" + sum);
		System.out.println("the multiplication of number is"+mul);
		input.close();
	}

}



