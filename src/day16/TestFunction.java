package day16;

import java.util.Scanner;

public class TestFunction {

	public static void main(String[] args) {

		Q28Function obj = new Q28Function();
		Scanner input = new Scanner(System.in);
		String decision = "";

		do {
			System.out.println("enter your choice:factorial|isPrimeNumber|nthprime|allprime|seriessum");
			String choice = input.next();
			switch (choice) {
			case "factorial":
				System.out.println("enter a number to find Factorial");
				int n = input.nextInt();
				int f = obj.findFactorial(n);
				System.out.println("factorial of" + n + "is" + f);
				break;
			case "isPrimeNumber":
				System.out.println("enter number to find prime");
				 n = input.nextInt();
				boolean isPrime = obj.isPrimeNumber(n);
				if (isPrime) {
					System.out.println(n + "is  prime number");
				} else {
					System.out.println(n + " is not a prime number");
				}

				break;

			case "nthprime":
				System.out.println("enter number to find nth prime");
				n = input.nextInt();
				obj.firstNthPrime(n);
				break;
			case "allprime":
				System.out.println("enter start number to find all prime");
				int  start = input.nextInt();
				System.out.println("enter end number to find all prime");
				int end = input.nextInt();
				obj.allPrimeBetween(start, end);

				break;
			case "seriessum":
				System.out.println("enter number to find sum of series");
				n = input.nextInt();
				int sum= obj.printSerieSum(n);
				System.out.println("nth series sum is" + sum);
				break;
			default:
				break;
			}
			System.out.println("do you want to continue");
			decision = input.next();
		} while (decision.equalsIgnoreCase("yes"));
		System.out.println("happy coding!!!!! tata......");
		input.close();

	}
}
