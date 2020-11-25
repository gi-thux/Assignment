package day10;

import java.util.Scanner;

public class Q21DayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter number to represent the day of the week between 1 to 7");
		int n=input.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("today is sunday");
			break;
			
		case 2:
			System.out.println("Today is monday");
			break;
			
		case 3:
			System.out.println("Today is tuesday");
			break;
			

		case 4:
			System.out.println("Today is Wedneaday");
			break;
			

		case 5:
			System.out.println("Today is Thursday");
			break;
			

		case 6:
			System.out.println("Today is Friday");
			break;
			
		case 7:
			System.out.println("Today is saturday");
			
		break;
		
		default:
			System.out.println("you entered invalid number");
			break;
		}
		
		System.out.println("more code");
		System.out.println("the end of code");
		input.close();
	
	
	}

}
